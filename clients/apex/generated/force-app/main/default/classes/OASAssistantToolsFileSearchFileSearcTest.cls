@isTest
private class OASAssistantToolsFileSearchFileSearcTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch1 = OASAssistantToolsFileSearchFileSearc.getExample();
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch2 = assistantToolsFileSearchFileSearch1;
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch3 = new OASAssistantToolsFileSearchFileSearc();
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch4 = assistantToolsFileSearchFileSearch3;

        System.assert(assistantToolsFileSearchFileSearch1.equals(assistantToolsFileSearchFileSearch2));
        System.assert(assistantToolsFileSearchFileSearch2.equals(assistantToolsFileSearchFileSearch1));
        System.assert(assistantToolsFileSearchFileSearch1.equals(assistantToolsFileSearchFileSearch1));
        System.assert(assistantToolsFileSearchFileSearch3.equals(assistantToolsFileSearchFileSearch4));
        System.assert(assistantToolsFileSearchFileSearch4.equals(assistantToolsFileSearchFileSearch3));
        System.assert(assistantToolsFileSearchFileSearch3.equals(assistantToolsFileSearchFileSearch3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch1 = OASAssistantToolsFileSearchFileSearc.getExample();
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch2 = OASAssistantToolsFileSearchFileSearc.getExample();
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch3 = new OASAssistantToolsFileSearchFileSearc();
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch4 = new OASAssistantToolsFileSearchFileSearc();

        System.assert(assistantToolsFileSearchFileSearch1.equals(assistantToolsFileSearchFileSearch2));
        System.assert(assistantToolsFileSearchFileSearch2.equals(assistantToolsFileSearchFileSearch1));
        System.assert(assistantToolsFileSearchFileSearch3.equals(assistantToolsFileSearchFileSearch4));
        System.assert(assistantToolsFileSearchFileSearch4.equals(assistantToolsFileSearchFileSearch3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch1 = OASAssistantToolsFileSearchFileSearc.getExample();
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch2 = new OASAssistantToolsFileSearchFileSearc();

        System.assertEquals(false, assistantToolsFileSearchFileSearch1.equals('foo'));
        System.assertEquals(false, assistantToolsFileSearchFileSearch2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch1 = OASAssistantToolsFileSearchFileSearc.getExample();
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch2 = new OASAssistantToolsFileSearchFileSearc();
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch3;

        System.assertEquals(false, assistantToolsFileSearchFileSearch1.equals(assistantToolsFileSearchFileSearch3));
        System.assertEquals(false, assistantToolsFileSearchFileSearch2.equals(assistantToolsFileSearchFileSearch3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch1 = OASAssistantToolsFileSearchFileSearc.getExample();
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch2 = new OASAssistantToolsFileSearchFileSearc();

        System.assertEquals(assistantToolsFileSearchFileSearch1.hashCode(), assistantToolsFileSearchFileSearch1.hashCode());
        System.assertEquals(assistantToolsFileSearchFileSearch2.hashCode(), assistantToolsFileSearchFileSearch2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch1 = OASAssistantToolsFileSearchFileSearc.getExample();
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch2 = OASAssistantToolsFileSearchFileSearc.getExample();
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch3 = new OASAssistantToolsFileSearchFileSearc();
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch4 = new OASAssistantToolsFileSearchFileSearc();

        System.assert(assistantToolsFileSearchFileSearch1.equals(assistantToolsFileSearchFileSearch2));
        System.assert(assistantToolsFileSearchFileSearch3.equals(assistantToolsFileSearchFileSearch4));
        System.assertEquals(assistantToolsFileSearchFileSearch1.hashCode(), assistantToolsFileSearchFileSearch2.hashCode());
        System.assertEquals(assistantToolsFileSearchFileSearch3.hashCode(), assistantToolsFileSearchFileSearch4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAssistantToolsFileSearchFileSearc assistantToolsFileSearchFileSearch = new OASAssistantToolsFileSearchFileSearc();
        Map<String, String> x-property-mappings = assistantToolsFileSearchFileSearch.getx-property-mappings();
        System.assertEquals('maxNumResults', x-property-mappings.get('max_num_results'));
        System.assertEquals('rankingOptions', x-property-mappings.get('ranking_options'));
    }
}
