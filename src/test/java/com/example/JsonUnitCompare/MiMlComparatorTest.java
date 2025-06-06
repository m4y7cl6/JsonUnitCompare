package com.example.JsonUnitCompare;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MiMlComparatorTest {
    String file1Path = "D:\\下載\\UAT-20250606102600-可售座位限額.xlsx";
    String file2Path = "D:\\下載\\PROD-20250606102600-可售座位限額.xlsx";
    @Test
    public void testZDifferences() throws Exception {
        List<String> diffs = XlsxComparator.MiMlCompareByTrainDateCar(file1Path, file2Path);
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
