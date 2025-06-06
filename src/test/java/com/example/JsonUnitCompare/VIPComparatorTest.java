package com.example.JsonUnitCompare;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VIPComparatorTest {
    String file1Path = "D:\\下載\\UAT-20250605171311-保留座位(VIP).xlsx";
    String file2Path = "D:\\下載\\PROD-20250605171311-保留座位(VIP).xlsx";
    @Test
    public void testSortedCsvDifferences() throws Exception {

        List<String> diffs = XlsxComparator.compareByTrainDateCar(file1Path, file2Path);

        diffs.forEach(System.out::println);
        assertFalse(diffs.isEmpty(), "偵測到座位、數量或缺少資料的差異");
        assertTrue(
                diffs.stream().anyMatch(line ->
                        line.contains("<無資料>") || line.contains("[數量差異]") || line.contains("[座位差異]")
                ),
                "包含實際的差異資訊"
        );
    }
}
