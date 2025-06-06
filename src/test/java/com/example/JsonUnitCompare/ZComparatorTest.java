package com.example.JsonUnitCompare;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ZComparatorTest {
    String file1Path = "D:\\下載\\UAT-20250606085921-列車長保留座位.xlsx";
    String file2Path = "D:\\下載\\PROD-20250606085921-列車長保留座位.xlsx";
    @Test
    public void testZDifferences() throws Exception {
        List<String> diffs = XlsxComparator.ZCompareByTrainDateCar(file1Path, file2Path);
        diffs.forEach(System.out::println);

        assertTrue(diffs.isEmpty(), "");
        if (!diffs.isEmpty()) {
            assertTrue(
                    diffs.stream().anyMatch(line ->
                            line.contains("<無資料>") || line.contains("差異]")
                    ),
                    "包含實際的差異資訊"
            );
        }
    }
}
