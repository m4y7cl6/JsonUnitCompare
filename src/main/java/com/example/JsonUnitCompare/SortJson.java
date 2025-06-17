package com.example.JsonUnitCompare;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.*;

public class SortJson {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static JsonNode sortJson(JsonNode node) throws Exception {
        if (node.isObject()) {
            return sortObjectNode((ObjectNode) node); // <-- 使用新的欄位排序方法
        } else if (node.isArray()) {
            List<JsonNode> sortedList = new ArrayList<>();
            for (JsonNode element : node) {
                sortedList.add(sortJson(element)); // 遞迴處理每個元素
            }

            if (!sortedList.isEmpty() && sortedList.get(0).isObject()) {
                JsonNode first = sortedList.get(0);
                Comparator<JsonNode> comparator = null;

                if (first.has("code")) {
                    comparator = Comparator.comparing(o -> o.get("code").asText());
                } else if (first.has("id") && first.has("projectCode")) {
                    comparator = Comparator.comparing(o -> o.get("id").asText() + "_" + o.get("projectCode").asText());
                } else if (first.has("name")) {
                    comparator = Comparator.comparing(o -> o.get("name").asText());
                } else if (first.has("dayOfDepartureRange")) {
                    comparator = Comparator.comparingInt(o -> o.get("dayOfDepartureRange").get("from").asInt());
                } else if (first.has("dayOfDepartureFrom")) {
                    comparator = Comparator.comparingInt(o -> o.get("dayOfDepartureFrom").asInt());
                } else if (first.has("farePlanCode")) {
                    comparator = Comparator.comparing(o -> o.get("farePlanCode").asText());
                } else if (first.has("departureStationCode") && first.has("arrivalStationCode")) {
                    comparator = Comparator.comparing(
                            o -> o.get("departureStationCode").asText() + "_" + o.get("arrivalStationCode").asText());
                } else if (first.has("fareGroupCode")) {
                    comparator = Comparator.comparing(o -> o.get("fareGroupCode").asText());
                }

                if (comparator != null) {
                    sortedList.sort(comparator);
                } else {
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

    private static ObjectNode sortObjectNode(ObjectNode node) throws Exception {
        List<String> fieldNames = new ArrayList<>();
        node.fieldNames().forEachRemaining(fieldNames::add);
        Collections.sort(fieldNames); // 依照欄位名稱排序

        ObjectNode sortedNode = mapper.createObjectNode();
        for (String field : fieldNames) {
            sortedNode.set(field, sortJson(node.get(field))); // 遞迴處理每個欄位值
        }
        return sortedNode;
    }
}
