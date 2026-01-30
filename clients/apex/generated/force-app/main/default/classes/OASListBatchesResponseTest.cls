@isTest
private class OASListBatchesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASListBatchesResponse listBatchesResponse1 = OASListBatchesResponse.getExample();
        OASListBatchesResponse listBatchesResponse2 = listBatchesResponse1;
        OASListBatchesResponse listBatchesResponse3 = new OASListBatchesResponse();
        OASListBatchesResponse listBatchesResponse4 = listBatchesResponse3;

        System.assert(listBatchesResponse1.equals(listBatchesResponse2));
        System.assert(listBatchesResponse2.equals(listBatchesResponse1));
        System.assert(listBatchesResponse1.equals(listBatchesResponse1));
        System.assert(listBatchesResponse3.equals(listBatchesResponse4));
        System.assert(listBatchesResponse4.equals(listBatchesResponse3));
        System.assert(listBatchesResponse3.equals(listBatchesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListBatchesResponse listBatchesResponse1 = OASListBatchesResponse.getExample();
        OASListBatchesResponse listBatchesResponse2 = OASListBatchesResponse.getExample();
        OASListBatchesResponse listBatchesResponse3 = new OASListBatchesResponse();
        OASListBatchesResponse listBatchesResponse4 = new OASListBatchesResponse();

        System.assert(listBatchesResponse1.equals(listBatchesResponse2));
        System.assert(listBatchesResponse2.equals(listBatchesResponse1));
        System.assert(listBatchesResponse3.equals(listBatchesResponse4));
        System.assert(listBatchesResponse4.equals(listBatchesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListBatchesResponse listBatchesResponse1 = OASListBatchesResponse.getExample();
        OASListBatchesResponse listBatchesResponse2 = new OASListBatchesResponse();

        System.assertEquals(false, listBatchesResponse1.equals('foo'));
        System.assertEquals(false, listBatchesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListBatchesResponse listBatchesResponse1 = OASListBatchesResponse.getExample();
        OASListBatchesResponse listBatchesResponse2 = new OASListBatchesResponse();
        OASListBatchesResponse listBatchesResponse3;

        System.assertEquals(false, listBatchesResponse1.equals(listBatchesResponse3));
        System.assertEquals(false, listBatchesResponse2.equals(listBatchesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListBatchesResponse listBatchesResponse1 = OASListBatchesResponse.getExample();
        OASListBatchesResponse listBatchesResponse2 = new OASListBatchesResponse();

        System.assertEquals(listBatchesResponse1.hashCode(), listBatchesResponse1.hashCode());
        System.assertEquals(listBatchesResponse2.hashCode(), listBatchesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListBatchesResponse listBatchesResponse1 = OASListBatchesResponse.getExample();
        OASListBatchesResponse listBatchesResponse2 = OASListBatchesResponse.getExample();
        OASListBatchesResponse listBatchesResponse3 = new OASListBatchesResponse();
        OASListBatchesResponse listBatchesResponse4 = new OASListBatchesResponse();

        System.assert(listBatchesResponse1.equals(listBatchesResponse2));
        System.assert(listBatchesResponse3.equals(listBatchesResponse4));
        System.assertEquals(listBatchesResponse1.hashCode(), listBatchesResponse2.hashCode());
        System.assertEquals(listBatchesResponse3.hashCode(), listBatchesResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListBatchesResponse listBatchesResponse = new OASListBatchesResponse();
        Map<String, String> x-property-mappings = listBatchesResponse.getx-property-mappings();
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListBatchesResponse listBatchesResponse = new OASListBatchesResponse();
        System.assertEquals(new List<OASBatch>(), listBatchesResponse.data);
        System.assertEquals(null, listBatchesResponse.firstId);
        System.assertEquals(null, listBatchesResponse.lastId);
        System.assertEquals(null, listBatchesResponse.hasMore);
        System.assertEquals(null, listBatchesResponse.r_object);
    }
}
