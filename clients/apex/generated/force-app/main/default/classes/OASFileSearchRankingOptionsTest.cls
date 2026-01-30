@isTest
private class OASFileSearchRankingOptionsTest {
    @isTest
    private static void equalsSameInstance() {
        OASFileSearchRankingOptions fileSearchRankingOptions1 = OASFileSearchRankingOptions.getExample();
        OASFileSearchRankingOptions fileSearchRankingOptions2 = fileSearchRankingOptions1;
        OASFileSearchRankingOptions fileSearchRankingOptions3 = new OASFileSearchRankingOptions();
        OASFileSearchRankingOptions fileSearchRankingOptions4 = fileSearchRankingOptions3;

        System.assert(fileSearchRankingOptions1.equals(fileSearchRankingOptions2));
        System.assert(fileSearchRankingOptions2.equals(fileSearchRankingOptions1));
        System.assert(fileSearchRankingOptions1.equals(fileSearchRankingOptions1));
        System.assert(fileSearchRankingOptions3.equals(fileSearchRankingOptions4));
        System.assert(fileSearchRankingOptions4.equals(fileSearchRankingOptions3));
        System.assert(fileSearchRankingOptions3.equals(fileSearchRankingOptions3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFileSearchRankingOptions fileSearchRankingOptions1 = OASFileSearchRankingOptions.getExample();
        OASFileSearchRankingOptions fileSearchRankingOptions2 = OASFileSearchRankingOptions.getExample();
        OASFileSearchRankingOptions fileSearchRankingOptions3 = new OASFileSearchRankingOptions();
        OASFileSearchRankingOptions fileSearchRankingOptions4 = new OASFileSearchRankingOptions();

        System.assert(fileSearchRankingOptions1.equals(fileSearchRankingOptions2));
        System.assert(fileSearchRankingOptions2.equals(fileSearchRankingOptions1));
        System.assert(fileSearchRankingOptions3.equals(fileSearchRankingOptions4));
        System.assert(fileSearchRankingOptions4.equals(fileSearchRankingOptions3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFileSearchRankingOptions fileSearchRankingOptions1 = OASFileSearchRankingOptions.getExample();
        OASFileSearchRankingOptions fileSearchRankingOptions2 = new OASFileSearchRankingOptions();

        System.assertEquals(false, fileSearchRankingOptions1.equals('foo'));
        System.assertEquals(false, fileSearchRankingOptions2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFileSearchRankingOptions fileSearchRankingOptions1 = OASFileSearchRankingOptions.getExample();
        OASFileSearchRankingOptions fileSearchRankingOptions2 = new OASFileSearchRankingOptions();
        OASFileSearchRankingOptions fileSearchRankingOptions3;

        System.assertEquals(false, fileSearchRankingOptions1.equals(fileSearchRankingOptions3));
        System.assertEquals(false, fileSearchRankingOptions2.equals(fileSearchRankingOptions3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFileSearchRankingOptions fileSearchRankingOptions1 = OASFileSearchRankingOptions.getExample();
        OASFileSearchRankingOptions fileSearchRankingOptions2 = new OASFileSearchRankingOptions();

        System.assertEquals(fileSearchRankingOptions1.hashCode(), fileSearchRankingOptions1.hashCode());
        System.assertEquals(fileSearchRankingOptions2.hashCode(), fileSearchRankingOptions2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFileSearchRankingOptions fileSearchRankingOptions1 = OASFileSearchRankingOptions.getExample();
        OASFileSearchRankingOptions fileSearchRankingOptions2 = OASFileSearchRankingOptions.getExample();
        OASFileSearchRankingOptions fileSearchRankingOptions3 = new OASFileSearchRankingOptions();
        OASFileSearchRankingOptions fileSearchRankingOptions4 = new OASFileSearchRankingOptions();

        System.assert(fileSearchRankingOptions1.equals(fileSearchRankingOptions2));
        System.assert(fileSearchRankingOptions3.equals(fileSearchRankingOptions4));
        System.assertEquals(fileSearchRankingOptions1.hashCode(), fileSearchRankingOptions2.hashCode());
        System.assertEquals(fileSearchRankingOptions3.hashCode(), fileSearchRankingOptions4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFileSearchRankingOptions fileSearchRankingOptions = new OASFileSearchRankingOptions();
        Map<String, String> x-property-mappings = fileSearchRankingOptions.getx-property-mappings();
        System.assertEquals('scoreThreshold', x-property-mappings.get('score_threshold'));
    }
}
