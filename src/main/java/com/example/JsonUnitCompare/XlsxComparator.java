package com.example.JsonUnitCompare;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsxComparator {

    public static List<String> VIPCompareByTrainDateCar(String file1Path, String file2Path) throws IOException {
        Map<String, String[]> map1 = VIPBuildKeyedRowMapFromXlsx(Paths.get(file1Path));
        Map<String, String[]> map2 = VIPBuildKeyedRowMapFromXlsx(Paths.get(file2Path));

        String file1Name = Paths.get(file1Path).getFileName().toString().split("-")[0];;
        String file2Name = Paths.get(file2Path).getFileName().toString().split("-")[0];

        List<String> differences = new ArrayList<>();
        Set<String> allKeys = new HashSet<>();
        allKeys.addAll(map1.keySet());
        allKeys.addAll(map2.keySet());

        List<String> sortedKeys = new ArrayList<>(allKeys);
        Collections.sort(sortedKeys);

        for (String key : sortedKeys) {
            String[] val1 = map1.get(key);
            String[] val2 = map2.get(key);

            String[] parts = key.split("_");
            String header = "差異 - 車次: " + parts[0] + ", 日期: " + parts[1] + ", 車廂: " + parts[2];

            if (val1 == null) {
                differences.add(header);
                differences.add("  "+file1Name+": <無資料>");
                differences.add("  "+file2Name+": 座位=" + val2[0] + " , 數量=" + val2[1]);
            } else if (val2 == null) {
                differences.add(header);
                differences.add("  "+file1Name+": 座位=" + val1[0] + " , 數量=" + val1[1]);
                differences.add("  "+file2Name+": <無資料>");
            } else {
                String seat1 = val1[0].trim();
                String count1 = val1[1].trim();
                String seat2 = val2[0].trim();
                String count2 = val2[1].trim();

                if (!seat1.equals(seat2) || !count1.equals(count2)) {
                    differences.add(header);
                    if (!seat1.equals(seat2)) {
                        differences.add("  [座位差異] "+file1Name+": " + seat1 + " vs "+file2Name+": " + seat2);
                    }
                    if (!count1.equals(count2)) {
                        differences.add("  [數量差異] "+file1Name+": " + count1 + " vs "+file2Name+": " + count2);
                    }
                }
            }
        }

        return differences;
    }

    public static List<String> PFamCompareByTrainDateCar(String file1Path, String file2Path) throws IOException {
        Map<String, String[]> map1 = PFamBuildKeyedRowMapFromXlsx(Paths.get(file1Path));
        Map<String, String[]> map2 = PFamBuildKeyedRowMapFromXlsx(Paths.get(file2Path));

        String file1Name = Paths.get(file1Path).getFileName().toString().split("-")[0];
        String file2Name = Paths.get(file2Path).getFileName().toString().split("-")[0];

        List<String> differences = new ArrayList<>();
        Set<String> allKeys = new HashSet<>();
        allKeys.addAll(map1.keySet());
        allKeys.addAll(map2.keySet());

        List<String> sortedKeys = new ArrayList<>(allKeys);
        Collections.sort(sortedKeys);

        for (String key : sortedKeys) {
            String[] val1 = map1.get(key);
            String[] val2 = map2.get(key);

            String[] parts = key.split("_");
            String header = "差異 - 車次: " + parts[0] + ", 日期: " + parts[1] + ", 車廂: " + parts[2];

            if (val1 == null) {
                differences.add(header);
                differences.add("  " + file1Name + ": <無資料>");
                differences.add("  " + file2Name + ": " + Arrays.toString(val2));
            } else if (val2 == null) {
                differences.add(header);
                differences.add("  " + file1Name + ": " + Arrays.toString(val1));
                differences.add("  " + file2Name + ": <無資料>");
            } else {
                List<String> fieldNames = List.of("區間", "座位", "數量", "座位註記");
                for (int i = 0; i < val1.length; i++) {
                    String v1 = val1[i].trim();
                    String v2 = val2[i].trim();
                    if (!v1.equals(v2)) {
                        differences.add(header);
                        differences.add("  [" + fieldNames.get(i) + " 差異] " + file1Name + ": " + v1 + " vs " + file2Name + ": " + v2);
                    }
                }
            }
        }

        return differences;
    }
    public static List<String> ATICompareByTrainDateCar(String file1Path, String file2Path) throws IOException {
        Map<String, String[]> map1 = ATIBuildKeyedRowMapFromXlsx(Paths.get(file1Path));
        Map<String, String[]> map2 = ATIBuildKeyedRowMapFromXlsx(Paths.get(file2Path));

        String file1Name = Paths.get(file1Path).getFileName().toString().split("-")[0];
        String file2Name = Paths.get(file2Path).getFileName().toString().split("-")[0];


        List<String> differences = new ArrayList<>();
        Set<String> allKeys = new HashSet<>();
        String[] fieldNames = map1.remove("_HEADER_FIELDS_");
        map2.remove("_HEADER_FIELDS_");

        allKeys.addAll(map1.keySet());
        allKeys.addAll(map2.keySet());

        List<String> sortedKeys = new ArrayList<>(allKeys);
        Collections.sort(sortedKeys);

        for (String key : sortedKeys) {
            String[] val1 = map1.get(key);
            String[] val2 = map2.get(key);

            String[] parts = key.split("_");
            String header = "差異 - 車次: " + parts[0] + ", 日期: " + parts[1];

            if (val1 == null) {
                differences.add(header);
                differences.add("  " + file1Name + ": <無資料>");
                differences.add("  " + file2Name + ": " + Arrays.toString(val2));
            } else if (val2 == null) {
                differences.add(header);
                differences.add("  " + file1Name + ": " + Arrays.toString(val1));
                differences.add("  " + file2Name + ": <無資料>");
            } else {
                for (int i = 0; i < val1.length; i++) {
                    String v1 = val1[i].trim();
                    String v2 = val2[i].trim();
                    if (!v1.equals(v2)) {
                        differences.add(header);
                        differences.add("  [" + fieldNames[i] + " 差異] " + file1Name + ": " + v1 + " vs " + file2Name + ": " + v2);
                    }
                }
            }
        }

        return differences;
    }
    public static List<String> MiMlCompareByTrainDateCar(String file1Path, String file2Path) throws IOException {
        Map<String, String> map1 = MiMlBuildKeyedRowMapFromXlsx(Paths.get(file1Path));
        Map<String, String> map2 = MiMlBuildKeyedRowMapFromXlsx(Paths.get(file2Path));

        String file1Name = Paths.get(file1Path).getFileName().toString().split("-")[0];
        String file2Name = Paths.get(file2Path).getFileName().toString().split("-")[0];

        List<String> differences = new ArrayList<>();
        Set<String> allKeys = new HashSet<>();
        allKeys.addAll(map1.keySet());
        allKeys.addAll(map2.keySet());

        List<String> sortedKeys = new ArrayList<>(allKeys);
        Collections.sort(sortedKeys);

        for (String key : sortedKeys) {
            String val1 = map1.get(key);
            String val2 = map2.get(key);

            String[] parts = key.split("_", -1); // -1 保留空欄位
            String header = "差異 - 車次: " + parts[0]
                    + ", 日期: " + parts[1]
                    + ", type: " + parts[2]
                    + ", 起站: " + parts[3]
                    + ", 迄站: " + parts[4]
                    + ", 保留: " + parts[5]
                    + ", 廂等: " + parts[6];

            if (val1 == null && val2 == null) {
                continue;
            } else if (val1 == null) {
                differences.add(header);
                differences.add("  " + file1Name + ": <無資料>");
                differences.add("  " + file2Name + ": " + val2);
            } else if (val2 == null) {
                differences.add(header);
                differences.add("  " + file1Name + ": " + val1);
                differences.add("  " + file2Name + ": <無資料>");
            } else if (!val1.trim().equals(val2.trim())) {
                differences.add(header);
                differences.add("  [數量差異] " + file1Name + ": " + val1 + " vs " + file2Name + ": " + val2);
            }
        }

        return differences;
    }

    public static Map<String, String[]> VIPBuildKeyedRowMapFromXlsx(Path xlsxPath) throws IOException {
        Map<String, String[]> map = new HashMap<>();

        try (Workbook workbook = new XSSFWorkbook(Files.newInputStream(xlsxPath))) {
            Sheet sheet = workbook.getSheetAt(0); // 預設讀第一個工作表
            Iterator<Row> rowIterator = sheet.iterator();

            if (!rowIterator.hasNext()) return map;

            Row headerRow = rowIterator.next();
            Map<String, Integer> headerMap = new HashMap<>();
            for (Cell cell : headerRow) {
                headerMap.put(cell.getStringCellValue().trim(), cell.getColumnIndex());
            }

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                String train = getCellValue(row.getCell(headerMap.get("車次")));
                String date = getCellValue(row.getCell(headerMap.get("日期")));
                String car = getCellValue(row.getCell(headerMap.get("車廂")));
                String seat = getCellValue(row.getCell(headerMap.get("座位")));
                String count = getCellValue(row.getCell(headerMap.get("數量")));

                String key = String.join("_", train, date, car);
                map.put(key, new String[]{seat, count});
            }
        }

        return map;
    }
    public static Map<String, String[]> PFamBuildKeyedRowMapFromXlsx(Path xlsxPath) throws IOException {
        Map<String, String[]> map = new HashMap<>();

        try (Workbook workbook = new XSSFWorkbook(Files.newInputStream(xlsxPath))) {
            Sheet sheet = workbook.getSheetAt(0); // 預設讀第一個工作表
            Iterator<Row> rowIterator = sheet.iterator();

            if (!rowIterator.hasNext()) return map;

            Row headerRow = rowIterator.next();
            Map<String, Integer> headerMap = new HashMap<>();
            for (Cell cell : headerRow) {
                headerMap.put(cell.getStringCellValue().trim(), cell.getColumnIndex());
            }

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                String train = getCellValue(row.getCell(headerMap.get("車次")));
                String date = getCellValue(row.getCell(headerMap.get("日期")));
                String interval = getCellValue(row.getCell(headerMap.get("區間")));
                String car = getCellValue(row.getCell(headerMap.get("車廂")));
                String seat = getCellValue(row.getCell(headerMap.get("座位")));
                String count = getCellValue(row.getCell(headerMap.get("數量")));
                String Tag = getCellValue(row.getCell(headerMap.get("座位註記")));

                String key = String.join("_", train, date, car);
                map.put(key, new String[]{interval, seat, count ,Tag});
            }
        }

        return map;
    }
    public static Map<String, String[]> ATIBuildKeyedRowMapFromXlsx(Path xlsxPath) throws IOException {
        Map<String, String[]> map = new HashMap<>();

        try (Workbook workbook = new XSSFWorkbook(Files.newInputStream(xlsxPath))) {
            Sheet sheet = workbook.getSheetAt(0); // 預設讀第一個工作表
            Iterator<Row> rowIterator = sheet.iterator();

            if (!rowIterator.hasNext()) return map;

            Row headerRow = rowIterator.next();
            Map<String, Integer> headerMap = new LinkedHashMap<>(); // preserve order
            for (Cell cell : headerRow) {
                headerMap.put(cell.getStringCellValue().trim(), cell.getColumnIndex());
            }

            // 保留要組 key 的欄位
            Integer trainIdx = headerMap.get("車次");
            Integer dateIdx = headerMap.get("發車日期");

            // 移除 key 欄位，只保留要比較的欄位（保持順序）
            List<String> valueFieldNames = new ArrayList<>(headerMap.keySet());
            valueFieldNames.remove("車次");
            valueFieldNames.remove("發車日期");

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                String train = getCellValue(row.getCell(trainIdx));
                String date = getCellValue(row.getCell(dateIdx));
                String key = String.join("_", train, date);

                List<String> values = new ArrayList<>();
                for (String colName : valueFieldNames) {
                    int colIdx = headerMap.get(colName);
                    values.add(getCellValue(row.getCell(colIdx)));
                }

                map.put(key, values.toArray(new String[0]));
            }

            // 可選：記錄欄位名稱供比對方法使用
            map.put("_HEADER_FIELDS_", valueFieldNames.toArray(new String[0]));
        }

        return map;
    }
    public static Map<String, String> MiMlBuildKeyedRowMapFromXlsx(Path xlsxPath) throws IOException {
        Map<String, String> map = new HashMap<>();

        try (Workbook workbook = new XSSFWorkbook(Files.newInputStream(xlsxPath))) {
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            if (!rowIterator.hasNext()) return map;

            Row headerRow = rowIterator.next();
            Map<String, Integer> headerMap = new HashMap<>();
            for (Cell cell : headerRow) {
                headerMap.put(cell.getStringCellValue().trim(), cell.getColumnIndex());
            }

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                String train = getCellValue(row.getCell(headerMap.get("車次")));
                String date = getCellValue(row.getCell(headerMap.get("發車日期")));
                String type = getCellValue(row.getCell(headerMap.get("type")));
                String departure = getCellValue(row.getCell(headerMap.get("起站")));
                String destination = getCellValue(row.getCell(headerMap.get("迄站")));
                String keep = getCellValue(row.getCell(headerMap.get("保留")));
                String classCode = getCellValue(row.getCell(headerMap.get("訂位廂等")));
                String count = getCellValue(row.getCell(headerMap.get("數量")));

                // 避免誤把 header 當資料列
                if (train.equals("車次") && date.equals("發車日期")) continue;

                String key = String.join("_", train, date, type, departure, destination, keep, classCode);
                map.put(key, count);
            }
        }

        return map;
    }

    private static String getCellValue(Cell cell) {
        if (cell == null) return "";
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue().trim();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                } else {
                    return String.valueOf((int) cell.getNumericCellValue());
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            case BLANK:
            default:
                return "";
        }
    }
}
