@isTest
private class OASApiKeyListTest {
    @isTest
    private static void equalsSameInstance() {
        OASApiKeyList apiKeyList1 = OASApiKeyList.getExample();
        OASApiKeyList apiKeyList2 = apiKeyList1;
        OASApiKeyList apiKeyList3 = new OASApiKeyList();
        OASApiKeyList apiKeyList4 = apiKeyList3;

        System.assert(apiKeyList1.equals(apiKeyList2));
        System.assert(apiKeyList2.equals(apiKeyList1));
        System.assert(apiKeyList1.equals(apiKeyList1));
        System.assert(apiKeyList3.equals(apiKeyList4));
        System.assert(apiKeyList4.equals(apiKeyList3));
        System.assert(apiKeyList3.equals(apiKeyList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASApiKeyList apiKeyList1 = OASApiKeyList.getExample();
        OASApiKeyList apiKeyList2 = OASApiKeyList.getExample();
        OASApiKeyList apiKeyList3 = new OASApiKeyList();
        OASApiKeyList apiKeyList4 = new OASApiKeyList();

        System.assert(apiKeyList1.equals(apiKeyList2));
        System.assert(apiKeyList2.equals(apiKeyList1));
        System.assert(apiKeyList3.equals(apiKeyList4));
        System.assert(apiKeyList4.equals(apiKeyList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASApiKeyList apiKeyList1 = OASApiKeyList.getExample();
        OASApiKeyList apiKeyList2 = new OASApiKeyList();

        System.assertEquals(false, apiKeyList1.equals('foo'));
        System.assertEquals(false, apiKeyList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASApiKeyList apiKeyList1 = OASApiKeyList.getExample();
        OASApiKeyList apiKeyList2 = new OASApiKeyList();
        OASApiKeyList apiKeyList3;

        System.assertEquals(false, apiKeyList1.equals(apiKeyList3));
        System.assertEquals(false, apiKeyList2.equals(apiKeyList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASApiKeyList apiKeyList1 = OASApiKeyList.getExample();
        OASApiKeyList apiKeyList2 = new OASApiKeyList();

        System.assertEquals(apiKeyList1.hashCode(), apiKeyList1.hashCode());
        System.assertEquals(apiKeyList2.hashCode(), apiKeyList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASApiKeyList apiKeyList1 = OASApiKeyList.getExample();
        OASApiKeyList apiKeyList2 = OASApiKeyList.getExample();
        OASApiKeyList apiKeyList3 = new OASApiKeyList();
        OASApiKeyList apiKeyList4 = new OASApiKeyList();

        System.assert(apiKeyList1.equals(apiKeyList2));
        System.assert(apiKeyList3.equals(apiKeyList4));
        System.assertEquals(apiKeyList1.hashCode(), apiKeyList2.hashCode());
        System.assertEquals(apiKeyList3.hashCode(), apiKeyList4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASApiKeyList apiKeyList = new OASApiKeyList();
        Map<String, String> x-property-mappings = apiKeyList.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASApiKeyList apiKeyList = new OASApiKeyList();
        System.assertEquals(new List<OASAdminApiKey>(), apiKeyList.data);
        System.assertEquals(null, apiKeyList.r_object);
        System.assertEquals(null, apiKeyList.hasMore);
        System.assertEquals(null, apiKeyList.firstId);
        System.assertEquals(null, apiKeyList.lastId);
    }
}
