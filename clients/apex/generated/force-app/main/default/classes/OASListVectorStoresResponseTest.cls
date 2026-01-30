@isTest
private class OASListVectorStoresResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASListVectorStoresResponse listVectorStoresResponse1 = OASListVectorStoresResponse.getExample();
        OASListVectorStoresResponse listVectorStoresResponse2 = listVectorStoresResponse1;
        OASListVectorStoresResponse listVectorStoresResponse3 = new OASListVectorStoresResponse();
        OASListVectorStoresResponse listVectorStoresResponse4 = listVectorStoresResponse3;

        System.assert(listVectorStoresResponse1.equals(listVectorStoresResponse2));
        System.assert(listVectorStoresResponse2.equals(listVectorStoresResponse1));
        System.assert(listVectorStoresResponse1.equals(listVectorStoresResponse1));
        System.assert(listVectorStoresResponse3.equals(listVectorStoresResponse4));
        System.assert(listVectorStoresResponse4.equals(listVectorStoresResponse3));
        System.assert(listVectorStoresResponse3.equals(listVectorStoresResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListVectorStoresResponse listVectorStoresResponse1 = OASListVectorStoresResponse.getExample();
        OASListVectorStoresResponse listVectorStoresResponse2 = OASListVectorStoresResponse.getExample();
        OASListVectorStoresResponse listVectorStoresResponse3 = new OASListVectorStoresResponse();
        OASListVectorStoresResponse listVectorStoresResponse4 = new OASListVectorStoresResponse();

        System.assert(listVectorStoresResponse1.equals(listVectorStoresResponse2));
        System.assert(listVectorStoresResponse2.equals(listVectorStoresResponse1));
        System.assert(listVectorStoresResponse3.equals(listVectorStoresResponse4));
        System.assert(listVectorStoresResponse4.equals(listVectorStoresResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListVectorStoresResponse listVectorStoresResponse1 = OASListVectorStoresResponse.getExample();
        OASListVectorStoresResponse listVectorStoresResponse2 = new OASListVectorStoresResponse();

        System.assertEquals(false, listVectorStoresResponse1.equals('foo'));
        System.assertEquals(false, listVectorStoresResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListVectorStoresResponse listVectorStoresResponse1 = OASListVectorStoresResponse.getExample();
        OASListVectorStoresResponse listVectorStoresResponse2 = new OASListVectorStoresResponse();
        OASListVectorStoresResponse listVectorStoresResponse3;

        System.assertEquals(false, listVectorStoresResponse1.equals(listVectorStoresResponse3));
        System.assertEquals(false, listVectorStoresResponse2.equals(listVectorStoresResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListVectorStoresResponse listVectorStoresResponse1 = OASListVectorStoresResponse.getExample();
        OASListVectorStoresResponse listVectorStoresResponse2 = new OASListVectorStoresResponse();

        System.assertEquals(listVectorStoresResponse1.hashCode(), listVectorStoresResponse1.hashCode());
        System.assertEquals(listVectorStoresResponse2.hashCode(), listVectorStoresResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListVectorStoresResponse listVectorStoresResponse1 = OASListVectorStoresResponse.getExample();
        OASListVectorStoresResponse listVectorStoresResponse2 = OASListVectorStoresResponse.getExample();
        OASListVectorStoresResponse listVectorStoresResponse3 = new OASListVectorStoresResponse();
        OASListVectorStoresResponse listVectorStoresResponse4 = new OASListVectorStoresResponse();

        System.assert(listVectorStoresResponse1.equals(listVectorStoresResponse2));
        System.assert(listVectorStoresResponse3.equals(listVectorStoresResponse4));
        System.assertEquals(listVectorStoresResponse1.hashCode(), listVectorStoresResponse2.hashCode());
        System.assertEquals(listVectorStoresResponse3.hashCode(), listVectorStoresResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListVectorStoresResponse listVectorStoresResponse = new OASListVectorStoresResponse();
        Map<String, String> x-property-mappings = listVectorStoresResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListVectorStoresResponse listVectorStoresResponse = new OASListVectorStoresResponse();
        System.assertEquals(new List<OASVectorStoreObject>(), listVectorStoresResponse.data);
        System.assertEquals(null, listVectorStoresResponse.r_object);
        System.assertEquals(null, listVectorStoresResponse.firstId);
        System.assertEquals(null, listVectorStoresResponse.lastId);
        System.assertEquals(null, listVectorStoresResponse.hasMore);
    }
}
