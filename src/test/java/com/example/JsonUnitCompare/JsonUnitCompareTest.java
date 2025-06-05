package com.example.JsonUnitCompare;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.nio.file.Files;
import java.nio.file.Path;

import static com.example.JsonUnitCompare.SortJson.sortJson;

public class JsonUnitCompareTest {
    private static final ObjectMapper mapper = new ObjectMapper();
    String dir = "D:\\下載\\diff";
    String suffix = ".json";
    @Test
    public void compareJsonFiles_AtiTables() throws Exception {
        String prefix = "AtiTables" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    //OP Console
    @Test
    public void compareJsonFiles_AvailabilityClasses() throws Exception {
        String prefix = "AvailabilityClasses" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_BasicFarePlansSearch() throws Exception {
        String prefix = "BasicFarePlansSearch" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_BasicFarePrices() throws Exception {
        String prefix = "BasicFarePrices" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_BusinessSubsidies() throws Exception {
        String prefix = "BusinessSubsidies" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_CampaignCreditCards() throws Exception {
        String prefix = "CampaignCreditCards" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_CarDiagrams() throws Exception {
        String prefix = "CarDiagrams" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_CardIssuingBanks() throws Exception {
        String prefix = "CardIssuingBanks" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    //OP Console
    @Test
    public void compareJsonFiles_Carriers() throws Exception {
        String prefix = "Carriers" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_Channels() throws Exception {
        String prefix = "Channels" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);

    }
    //OP Console
    @Test
    public void compareJsonFiles_ChannelTypeConstraints() throws Exception {
        String prefix = "ChannelTypeConstraints" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);

    }
    @Test
    public void compareJsonFiles_ChannelTypes() throws Exception {
        String prefix = "ChannelTypes" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_ClassCodes() throws Exception {
        String prefix = "ClassCodes" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_ClassCodeSettings() throws Exception {
        String prefix = "ClassCodeSettings" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_CoBrandedCardBankPromotions() throws Exception {
        String prefix = "CoBrandedCardBankPromotions" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_CoBrandedCardMunicipalities() throws Exception {
        String prefix = "CoBrandedCardMunicipalities" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_CoBrandedCardOperatingParameterEASYCARD() throws Exception {
        String prefix = "CoBrandedCardOperatingParameterEASYCARD" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_CoBrandedCardOperatingParameterHAPPYCASH() throws Exception {
        String prefix = "CoBrandedCardOperatingParameterHAPPYCASH" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_CoBrandedCardOperatingParameterICASH() throws Exception {
        String prefix = "CoBrandedCardOperatingParameterICASH" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_CoBrandedCardOperatingParameterIPASS() throws Exception {
        String prefix = "CoBrandedCardOperatingParameterIPASS" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_CoBrandedCardProfiles() throws Exception {
        String prefix = "CoBrandedCardProfiles" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_CoBrandedCards() throws Exception {
        String prefix = "CoBrandedCards" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_CompanionAssignCandidatePriorities() throws Exception {
        String prefix = "CompanionAssignCandidatePriorities" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_CompartmentPrintInfos() throws Exception {
        String prefix = "CompartmentPrintInfos" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_Compartments() throws Exception {
        String prefix = "Compartments" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_CscDeferredControls() throws Exception {
        String prefix = "CscDeferredControls" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_DefaultRefundServiceFees() throws Exception {
        String prefix = "DefaultRefundServiceFees" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_DesignatedDates() throws Exception {
        String prefix = "DesignatedDates" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_DiscountFarePrices() throws Exception {
        String prefix = "DiscountFarePrices" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_EffectiveSaleDatePoliciesDateRanges() throws Exception {
        String prefix = "EffectiveSaleDatePoliciesDateRanges" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_EffectiveSaleDatePoliciesEarlyDays() throws Exception {
        String prefix = "EffectiveSaleDatePoliciesEarlyDays" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_EffectiveSaleDatePoliciesFrequencies() throws Exception {
        String prefix = "EffectiveSaleDatePoliciesFrequencies" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_EligibleTrains() throws Exception {
        String prefix = "EligibleTrains" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_FareGroups() throws Exception {
        String prefix = "FareGroups" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_FarePlansSearch() throws Exception {
        String prefix = "FarePlansSearch" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void  compareJsonFiles_FormOfPaymentTypes() throws Exception {
        String prefix = "FormOfPaymentTypes" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_FreeSeatingPromotions() throws Exception {
        String prefix = "FreeSeatingPromotions" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_GeneralTime() throws Exception {
        String prefix = "GeneralTime" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_GroupPlans() throws Exception {
        String prefix = "GroupPlans" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_HoldLimitRules() throws Exception {
        String prefix = "HoldLimitRules" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_HoldLimitStrategies() throws Exception {
        String prefix = "HoldLimitStrategies" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_ImmediateHoldLimitSettings() throws Exception {
        String prefix = "ImmediateHoldLimitSettings" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    //OP Console
    @Test
    public void compareJsonFiles_MarketRuleReleaseTimings() throws Exception {
        String prefix = "MarketRuleReleaseTimings" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_MetroAreas() throws Exception {
        String prefix = "MetroAreas" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_MultiRideTickets() throws Exception {
        String prefix = "MultiRideTickets" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_NrsSalesControls() throws Exception {
        String prefix = "NrsSalesControls" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_Offices() throws Exception {
        String prefix = "Offices" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_OtherServiceDisruptions() throws Exception {
        String prefix = "OtherServiceDisruptions" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_PassengerProfileFreeSeatingCombinations() throws Exception {
        String prefix = "PassengerProfileFreeSeatingCombinations" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_PassengerProfilePlans() throws Exception {
        String prefix = "PassengerProfilePlans" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_PassengerProfiles() throws Exception {
        String prefix = "PassengerProfiles" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_PatternRanks() throws Exception {
        String prefix = "PatternRanks" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_PeakCalendarDates() throws Exception {
        String prefix = "PeakCalendarDates" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_PeakTimeNames() throws Exception {
        String prefix = "PeakTimeNames" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_PeakWeekdays() throws Exception {
        String prefix = "PeakWeekdays" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_PenaltyServiceCharges() throws Exception {
        String prefix = "PenaltyServiceCharges" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_PeriodicTickets() throws Exception {
        String prefix = "PeriodicTickets" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_Projects() throws Exception {
        String prefix = "Projects" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_ProjectSalesChannelFlagSettings() throws Exception {
        String prefix = "ProjectSalesChannelFlagSettings" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_ProjectServiceFees() throws Exception {
        String prefix = "ProjectServiceFees" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_ProjectsTicketPrintings() throws Exception {
        String prefix = "ProjectsTicketPrintings" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_PromotionCategoryMappings() throws Exception {
        String prefix = "PromotionCategoryMappings" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_PromotionsSearch() throws Exception {
        String prefix = "PromotionsSearch" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_RefundServiceFees() throws Exception {
        String prefix = "RefundServiceFees" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_RoundingMethods() throws Exception {
        String prefix = "RoundingMethods" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_RouteSuspensions() throws Exception {
        String prefix = "RouteSuspensions" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_RowRanks() throws Exception {
        String prefix = "RowRanks" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_SeatAttributes() throws Exception {
        String prefix = "SeatAttributes" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_ServiceDisruptionEvents() throws Exception {
        String prefix = "ServiceDisruptionEvents" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_ServiceDisruptionPassengerProfiles() throws Exception {
        String prefix = "ServiceDisruptionPassengerProfiles" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_ServiceDisruptions() throws Exception {
        String prefix = "ServiceDisruptions" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_ServiceDisruptionTimeframes() throws Exception {
        String prefix = "ServiceDisruptionTimeframes" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_ServiceFeeFreeRefunds() throws Exception {
        String prefix = "ServiceFeeFreeRefunds" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_SingleAssignCandidatePriorities() throws Exception {
        String prefix = "SingleAssignCandidatePriorities" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_Stations() throws Exception {
        String prefix = "Stations" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_StoppingPatterns() throws Exception {
        String prefix = "StoppingPatterns" +"_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_StoredValueTickets() throws Exception {
        String prefix = "StoredValueTickets" +"_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_TicketEndorsements() throws Exception {
        String prefix = "TicketEndorsements" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    //OP Console
    @Test
    public void compareJsonFiles_Ticketindicators() throws Exception {
        String prefix = "Ticketindicators" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_TicketProductPolicy() throws Exception {
        String prefix = "TicketProductPolicy" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_TicketScopePolicies() throws Exception {
        String prefix = "TicketScopePolicies" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_TicketTypes() throws Exception {
        String prefix = "TicketTypes" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_TrainAssemblies() throws Exception {
        String prefix = "TrainAssemblies" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_TrainAssembliesVersions() throws Exception {
        String prefix = "TrainAssembliesVersions" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }

    @Test
    public void compareJsonFiles_TrainDiagrams() throws Exception {
        String prefix = "TrainDiagrams" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_TrainLastDeparture() throws Exception {
        String prefix = "TrainLastDeparture" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }
    @Test
    public void compareJsonFiles_UnavailableTags() throws Exception {
        String prefix = "UnavailableTags" + "_";

        Path[] files = LatestFilesFinder.findLatestTwoFiles(dir, prefix, suffix);

        if (files.length < 2) {
            throw new RuntimeException("找不到兩個以上符合條件的檔案");
        }

        JsonNode tree1 = mapper.readTree(Files.newInputStream(files[0]));
        JsonNode tree2 = mapper.readTree(Files.newInputStream(files[1]));

        JsonNode sortedTree1 = sortJson(tree1);
        JsonNode sortedTree2 = sortJson(tree2);

        String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree1);
        String json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sortedTree2);

        JSONAssert.assertEquals(json1, json2, true);
    }

}
