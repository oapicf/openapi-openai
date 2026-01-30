@isTest
private class OASDeleteVectorStoreResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteVectorStoreResponse deleteVectorStoreResponse1 = OASDeleteVectorStoreResponse.getExample();
        OASDeleteVectorStoreResponse deleteVectorStoreResponse2 = deleteVectorStoreResponse1;
        OASDeleteVectorStoreResponse deleteVectorStoreResponse3 = new OASDeleteVectorStoreResponse();
        OASDeleteVectorStoreResponse deleteVectorStoreResponse4 = deleteVectorStoreResponse3;

        System.assert(deleteVectorStoreResponse1.equals(deleteVectorStoreResponse2));
        System.assert(deleteVectorStoreResponse2.equals(deleteVectorStoreResponse1));
        System.assert(deleteVectorStoreResponse1.equals(deleteVectorStoreResponse1));
        System.assert(deleteVectorStoreResponse3.equals(deleteVectorStoreResponse4));
        System.assert(deleteVectorStoreResponse4.equals(deleteVectorStoreResponse3));
        System.assert(deleteVectorStoreResponse3.equals(deleteVectorStoreResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteVectorStoreResponse deleteVectorStoreResponse1 = OASDeleteVectorStoreResponse.getExample();
        OASDeleteVectorStoreResponse deleteVectorStoreResponse2 = OASDeleteVectorStoreResponse.getExample();
        OASDeleteVectorStoreResponse deleteVectorStoreResponse3 = new OASDeleteVectorStoreResponse();
        OASDeleteVectorStoreResponse deleteVectorStoreResponse4 = new OASDeleteVectorStoreResponse();

        System.assert(deleteVectorStoreResponse1.equals(deleteVectorStoreResponse2));
        System.assert(deleteVectorStoreResponse2.equals(deleteVectorStoreResponse1));
        System.assert(deleteVectorStoreResponse3.equals(deleteVectorStoreResponse4));
        System.assert(deleteVectorStoreResponse4.equals(deleteVectorStoreResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteVectorStoreResponse deleteVectorStoreResponse1 = OASDeleteVectorStoreResponse.getExample();
        OASDeleteVectorStoreResponse deleteVectorStoreResponse2 = new OASDeleteVectorStoreResponse();

        System.assertEquals(false, deleteVectorStoreResponse1.equals('foo'));
        System.assertEquals(false, deleteVectorStoreResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteVectorStoreResponse deleteVectorStoreResponse1 = OASDeleteVectorStoreResponse.getExample();
        OASDeleteVectorStoreResponse deleteVectorStoreResponse2 = new OASDeleteVectorStoreResponse();
        OASDeleteVectorStoreResponse deleteVectorStoreResponse3;

        System.assertEquals(false, deleteVectorStoreResponse1.equals(deleteVectorStoreResponse3));
        System.assertEquals(false, deleteVectorStoreResponse2.equals(deleteVectorStoreResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteVectorStoreResponse deleteVectorStoreResponse1 = OASDeleteVectorStoreResponse.getExample();
        OASDeleteVectorStoreResponse deleteVectorStoreResponse2 = new OASDeleteVectorStoreResponse();

        System.assertEquals(deleteVectorStoreResponse1.hashCode(), deleteVectorStoreResponse1.hashCode());
        System.assertEquals(deleteVectorStoreResponse2.hashCode(), deleteVectorStoreResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteVectorStoreResponse deleteVectorStoreResponse1 = OASDeleteVectorStoreResponse.getExample();
        OASDeleteVectorStoreResponse deleteVectorStoreResponse2 = OASDeleteVectorStoreResponse.getExample();
        OASDeleteVectorStoreResponse deleteVectorStoreResponse3 = new OASDeleteVectorStoreResponse();
        OASDeleteVectorStoreResponse deleteVectorStoreResponse4 = new OASDeleteVectorStoreResponse();

        System.assert(deleteVectorStoreResponse1.equals(deleteVectorStoreResponse2));
        System.assert(deleteVectorStoreResponse3.equals(deleteVectorStoreResponse4));
        System.assertEquals(deleteVectorStoreResponse1.hashCode(), deleteVectorStoreResponse2.hashCode());
        System.assertEquals(deleteVectorStoreResponse3.hashCode(), deleteVectorStoreResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeleteVectorStoreResponse deleteVectorStoreResponse = new OASDeleteVectorStoreResponse();
        Map<String, String> x-property-mappings = deleteVectorStoreResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
