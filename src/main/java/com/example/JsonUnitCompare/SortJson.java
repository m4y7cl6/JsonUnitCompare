package com.example.JsonUnitCompare;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortJson {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static JsonNode sortJson(JsonNode node) throws Exception {
        if (node.isObject()) {
            var fields = node.fields();
            while (fields.hasNext()) {
                var entry = fields.next();
                ((ObjectNode) node).set(entry.getKey(), sortJson(entry.getValue()));
            }
            return node;
        } else if (node.isArray()) {
            List<JsonNode> sortedList = new ArrayList<>();
            for (JsonNode element : node) {
                sortedList.add(sortJson(element));
            }

            // 如果元素是物件且包含特定欄位，進行有意義排序
            if (!sortedList.isEmpty() && sortedList.get(0).isObject()) {
                JsonNode first = sortedList.get(0);

                Comparator<JsonNode> comparator = null;
                if (first.has("code")) {
                    comparator = Comparator.comparing(o -> o.get("code").asText());
                } else if (first.has("farePlanCode")) {
                    comparator = Comparator.comparing(o -> o.get("farePlanCode").asText());
                } else if (first.has("departureStationCode") && first.has("arrivalStationCode")) {
                    comparator = Comparator.comparing(
                            o -> o.get("departureStationCode").asText() + "_" + o.get("arrivalStationCode").asText()
                    );
                }

                if (comparator != null) {
                    sortedList.sort(comparator);
                } else {
                    // fallback: compare as JSON strings
                    sortedList.sort(Comparator.comparing(JsonNode::toString));
                }
            } else {
                sortedList.sort(Comparator.comparing(JsonNode::toString));
            }

            ArrayNode resultArray = mapper.createArrayNode();
            resultArray.addAll(sortedList);
            return resultArray;
        } else {
            return node;
        }
    }

}
