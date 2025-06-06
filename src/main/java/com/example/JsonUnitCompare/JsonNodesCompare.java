package com.example.JsonUnitCompare;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.*;

public class JsonNodesCompare {
    public static List<String> compareJsonNodes(JsonNode node1, JsonNode node2, String path) {
        List<String> diffs = new ArrayList<>();

        if (node1 == null && node2 != null) {
            diffs.add(path + ": only in JSON2 → " + node2.toString());
        } else if (node1 != null && node2 == null) {
            diffs.add(path + ": only in JSON1 → " + node1.toString());
        } else if (node1.isObject() && node2.isObject()) {
            Iterator<String> fieldNames = node1.fieldNames();
            Set<String> allFields = new HashSet<>();
            node1.fieldNames().forEachRemaining(allFields::add);
            node2.fieldNames().forEachRemaining(allFields::add);

            for (String field : allFields) {
                diffs.addAll(compareJsonNodes(
                        node1.get(field), node2.get(field), path + "." + field
                ));
            }
        } else if (node1.isArray() && node2.isArray()) {
            int max = Math.max(node1.size(), node2.size());
            for (int i = 0; i < max; i++) {
                diffs.addAll(compareJsonNodes(
                        node1.get(i), node2.get(i), path + "[" + i + "]"
                ));
            }
        } else if (!Objects.equals(node1, node2)) {
            diffs.add(path + ": value differs → JSON1 = " + node1 + ", JSON2 = " + node2);
        }

        return diffs;
    }
}
