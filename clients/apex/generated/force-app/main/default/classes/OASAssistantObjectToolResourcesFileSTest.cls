@isTest
private class OASAssistantObjectToolResourcesFileSTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch1 = OASAssistantObjectToolResourcesFileS.getExample();
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch2 = assistantObjectToolResourcesFileSearch1;
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch3 = new OASAssistantObjectToolResourcesFileS();
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch4 = assistantObjectToolResourcesFileSearch3;

        System.assert(assistantObjectToolResourcesFileSearch1.equals(assistantObjectToolResourcesFileSearch2));
        System.assert(assistantObjectToolResourcesFileSearch2.equals(assistantObjectToolResourcesFileSearch1));
        System.assert(assistantObjectToolResourcesFileSearch1.equals(assistantObjectToolResourcesFileSearch1));
        System.assert(assistantObjectToolResourcesFileSearch3.equals(assistantObjectToolResourcesFileSearch4));
        System.assert(assistantObjectToolResourcesFileSearch4.equals(assistantObjectToolResourcesFileSearch3));
        System.assert(assistantObjectToolResourcesFileSearch3.equals(assistantObjectToolResourcesFileSearch3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch1 = OASAssistantObjectToolResourcesFileS.getExample();
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch2 = OASAssistantObjectToolResourcesFileS.getExample();
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch3 = new OASAssistantObjectToolResourcesFileS();
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch4 = new OASAssistantObjectToolResourcesFileS();

        System.assert(assistantObjectToolResourcesFileSearch1.equals(assistantObjectToolResourcesFileSearch2));
        System.assert(assistantObjectToolResourcesFileSearch2.equals(assistantObjectToolResourcesFileSearch1));
        System.assert(assistantObjectToolResourcesFileSearch3.equals(assistantObjectToolResourcesFileSearch4));
        System.assert(assistantObjectToolResourcesFileSearch4.equals(assistantObjectToolResourcesFileSearch3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch1 = OASAssistantObjectToolResourcesFileS.getExample();
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch2 = new OASAssistantObjectToolResourcesFileS();

        System.assertEquals(false, assistantObjectToolResourcesFileSearch1.equals('foo'));
        System.assertEquals(false, assistantObjectToolResourcesFileSearch2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch1 = OASAssistantObjectToolResourcesFileS.getExample();
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch2 = new OASAssistantObjectToolResourcesFileS();
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch3;

        System.assertEquals(false, assistantObjectToolResourcesFileSearch1.equals(assistantObjectToolResourcesFileSearch3));
        System.assertEquals(false, assistantObjectToolResourcesFileSearch2.equals(assistantObjectToolResourcesFileSearch3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch1 = OASAssistantObjectToolResourcesFileS.getExample();
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch2 = new OASAssistantObjectToolResourcesFileS();

        System.assertEquals(assistantObjectToolResourcesFileSearch1.hashCode(), assistantObjectToolResourcesFileSearch1.hashCode());
        System.assertEquals(assistantObjectToolResourcesFileSearch2.hashCode(), assistantObjectToolResourcesFileSearch2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch1 = OASAssistantObjectToolResourcesFileS.getExample();
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch2 = OASAssistantObjectToolResourcesFileS.getExample();
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch3 = new OASAssistantObjectToolResourcesFileS();
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch4 = new OASAssistantObjectToolResourcesFileS();

        System.assert(assistantObjectToolResourcesFileSearch1.equals(assistantObjectToolResourcesFileSearch2));
        System.assert(assistantObjectToolResourcesFileSearch3.equals(assistantObjectToolResourcesFileSearch4));
        System.assertEquals(assistantObjectToolResourcesFileSearch1.hashCode(), assistantObjectToolResourcesFileSearch2.hashCode());
        System.assertEquals(assistantObjectToolResourcesFileSearch3.hashCode(), assistantObjectToolResourcesFileSearch4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch = new OASAssistantObjectToolResourcesFileS();
        Map<String, String> x-property-mappings = assistantObjectToolResourcesFileSearch.getx-property-mappings();
        System.assertEquals('vectorStoreIds', x-property-mappings.get('vector_store_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAssistantObjectToolResourcesFileS assistantObjectToolResourcesFileSearch = new OASAssistantObjectToolResourcesFileS();
        System.assertEquals(new List<String>(), assistantObjectToolResourcesFileSearch.vectorStoreIds);
    }
}
