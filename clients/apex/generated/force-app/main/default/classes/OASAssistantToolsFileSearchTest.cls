@isTest
private class OASAssistantToolsFileSearchTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantToolsFileSearch assistantToolsFileSearch1 = OASAssistantToolsFileSearch.getExample();
        OASAssistantToolsFileSearch assistantToolsFileSearch2 = assistantToolsFileSearch1;
        OASAssistantToolsFileSearch assistantToolsFileSearch3 = new OASAssistantToolsFileSearch();
        OASAssistantToolsFileSearch assistantToolsFileSearch4 = assistantToolsFileSearch3;

        System.assert(assistantToolsFileSearch1.equals(assistantToolsFileSearch2));
        System.assert(assistantToolsFileSearch2.equals(assistantToolsFileSearch1));
        System.assert(assistantToolsFileSearch1.equals(assistantToolsFileSearch1));
        System.assert(assistantToolsFileSearch3.equals(assistantToolsFileSearch4));
        System.assert(assistantToolsFileSearch4.equals(assistantToolsFileSearch3));
        System.assert(assistantToolsFileSearch3.equals(assistantToolsFileSearch3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantToolsFileSearch assistantToolsFileSearch1 = OASAssistantToolsFileSearch.getExample();
        OASAssistantToolsFileSearch assistantToolsFileSearch2 = OASAssistantToolsFileSearch.getExample();
        OASAssistantToolsFileSearch assistantToolsFileSearch3 = new OASAssistantToolsFileSearch();
        OASAssistantToolsFileSearch assistantToolsFileSearch4 = new OASAssistantToolsFileSearch();

        System.assert(assistantToolsFileSearch1.equals(assistantToolsFileSearch2));
        System.assert(assistantToolsFileSearch2.equals(assistantToolsFileSearch1));
        System.assert(assistantToolsFileSearch3.equals(assistantToolsFileSearch4));
        System.assert(assistantToolsFileSearch4.equals(assistantToolsFileSearch3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantToolsFileSearch assistantToolsFileSearch1 = OASAssistantToolsFileSearch.getExample();
        OASAssistantToolsFileSearch assistantToolsFileSearch2 = new OASAssistantToolsFileSearch();

        System.assertEquals(false, assistantToolsFileSearch1.equals('foo'));
        System.assertEquals(false, assistantToolsFileSearch2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantToolsFileSearch assistantToolsFileSearch1 = OASAssistantToolsFileSearch.getExample();
        OASAssistantToolsFileSearch assistantToolsFileSearch2 = new OASAssistantToolsFileSearch();
        OASAssistantToolsFileSearch assistantToolsFileSearch3;

        System.assertEquals(false, assistantToolsFileSearch1.equals(assistantToolsFileSearch3));
        System.assertEquals(false, assistantToolsFileSearch2.equals(assistantToolsFileSearch3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantToolsFileSearch assistantToolsFileSearch1 = OASAssistantToolsFileSearch.getExample();
        OASAssistantToolsFileSearch assistantToolsFileSearch2 = new OASAssistantToolsFileSearch();

        System.assertEquals(assistantToolsFileSearch1.hashCode(), assistantToolsFileSearch1.hashCode());
        System.assertEquals(assistantToolsFileSearch2.hashCode(), assistantToolsFileSearch2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantToolsFileSearch assistantToolsFileSearch1 = OASAssistantToolsFileSearch.getExample();
        OASAssistantToolsFileSearch assistantToolsFileSearch2 = OASAssistantToolsFileSearch.getExample();
        OASAssistantToolsFileSearch assistantToolsFileSearch3 = new OASAssistantToolsFileSearch();
        OASAssistantToolsFileSearch assistantToolsFileSearch4 = new OASAssistantToolsFileSearch();

        System.assert(assistantToolsFileSearch1.equals(assistantToolsFileSearch2));
        System.assert(assistantToolsFileSearch3.equals(assistantToolsFileSearch4));
        System.assertEquals(assistantToolsFileSearch1.hashCode(), assistantToolsFileSearch2.hashCode());
        System.assertEquals(assistantToolsFileSearch3.hashCode(), assistantToolsFileSearch4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAssistantToolsFileSearch assistantToolsFileSearch = new OASAssistantToolsFileSearch();
        Map<String, String> x-property-mappings = assistantToolsFileSearch.getx-property-mappings();
        System.assertEquals('fileSearch', x-property-mappings.get('file_search'));
    }
}
