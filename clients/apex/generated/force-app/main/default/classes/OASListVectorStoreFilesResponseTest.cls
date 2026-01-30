@isTest
private class OASListVectorStoreFilesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse1 = OASListVectorStoreFilesResponse.getExample();
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse2 = listVectorStoreFilesResponse1;
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse3 = new OASListVectorStoreFilesResponse();
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse4 = listVectorStoreFilesResponse3;

        System.assert(listVectorStoreFilesResponse1.equals(listVectorStoreFilesResponse2));
        System.assert(listVectorStoreFilesResponse2.equals(listVectorStoreFilesResponse1));
        System.assert(listVectorStoreFilesResponse1.equals(listVectorStoreFilesResponse1));
        System.assert(listVectorStoreFilesResponse3.equals(listVectorStoreFilesResponse4));
        System.assert(listVectorStoreFilesResponse4.equals(listVectorStoreFilesResponse3));
        System.assert(listVectorStoreFilesResponse3.equals(listVectorStoreFilesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse1 = OASListVectorStoreFilesResponse.getExample();
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse2 = OASListVectorStoreFilesResponse.getExample();
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse3 = new OASListVectorStoreFilesResponse();
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse4 = new OASListVectorStoreFilesResponse();

        System.assert(listVectorStoreFilesResponse1.equals(listVectorStoreFilesResponse2));
        System.assert(listVectorStoreFilesResponse2.equals(listVectorStoreFilesResponse1));
        System.assert(listVectorStoreFilesResponse3.equals(listVectorStoreFilesResponse4));
        System.assert(listVectorStoreFilesResponse4.equals(listVectorStoreFilesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse1 = OASListVectorStoreFilesResponse.getExample();
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse2 = new OASListVectorStoreFilesResponse();

        System.assertEquals(false, listVectorStoreFilesResponse1.equals('foo'));
        System.assertEquals(false, listVectorStoreFilesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse1 = OASListVectorStoreFilesResponse.getExample();
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse2 = new OASListVectorStoreFilesResponse();
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse3;

        System.assertEquals(false, listVectorStoreFilesResponse1.equals(listVectorStoreFilesResponse3));
        System.assertEquals(false, listVectorStoreFilesResponse2.equals(listVectorStoreFilesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse1 = OASListVectorStoreFilesResponse.getExample();
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse2 = new OASListVectorStoreFilesResponse();

        System.assertEquals(listVectorStoreFilesResponse1.hashCode(), listVectorStoreFilesResponse1.hashCode());
        System.assertEquals(listVectorStoreFilesResponse2.hashCode(), listVectorStoreFilesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse1 = OASListVectorStoreFilesResponse.getExample();
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse2 = OASListVectorStoreFilesResponse.getExample();
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse3 = new OASListVectorStoreFilesResponse();
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse4 = new OASListVectorStoreFilesResponse();

        System.assert(listVectorStoreFilesResponse1.equals(listVectorStoreFilesResponse2));
        System.assert(listVectorStoreFilesResponse3.equals(listVectorStoreFilesResponse4));
        System.assertEquals(listVectorStoreFilesResponse1.hashCode(), listVectorStoreFilesResponse2.hashCode());
        System.assertEquals(listVectorStoreFilesResponse3.hashCode(), listVectorStoreFilesResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse = new OASListVectorStoreFilesResponse();
        Map<String, String> x-property-mappings = listVectorStoreFilesResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListVectorStoreFilesResponse listVectorStoreFilesResponse = new OASListVectorStoreFilesResponse();
        System.assertEquals(new List<OASVectorStoreFileObject>(), listVectorStoreFilesResponse.data);
        System.assertEquals(null, listVectorStoreFilesResponse.r_object);
        System.assertEquals(null, listVectorStoreFilesResponse.firstId);
        System.assertEquals(null, listVectorStoreFilesResponse.lastId);
        System.assertEquals(null, listVectorStoreFilesResponse.hasMore);
    }
}
