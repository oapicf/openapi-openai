@isTest
private class OASDeleteVectorStoreFileResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse1 = OASDeleteVectorStoreFileResponse.getExample();
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse2 = deleteVectorStoreFileResponse1;
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse3 = new OASDeleteVectorStoreFileResponse();
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse4 = deleteVectorStoreFileResponse3;

        System.assert(deleteVectorStoreFileResponse1.equals(deleteVectorStoreFileResponse2));
        System.assert(deleteVectorStoreFileResponse2.equals(deleteVectorStoreFileResponse1));
        System.assert(deleteVectorStoreFileResponse1.equals(deleteVectorStoreFileResponse1));
        System.assert(deleteVectorStoreFileResponse3.equals(deleteVectorStoreFileResponse4));
        System.assert(deleteVectorStoreFileResponse4.equals(deleteVectorStoreFileResponse3));
        System.assert(deleteVectorStoreFileResponse3.equals(deleteVectorStoreFileResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse1 = OASDeleteVectorStoreFileResponse.getExample();
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse2 = OASDeleteVectorStoreFileResponse.getExample();
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse3 = new OASDeleteVectorStoreFileResponse();
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse4 = new OASDeleteVectorStoreFileResponse();

        System.assert(deleteVectorStoreFileResponse1.equals(deleteVectorStoreFileResponse2));
        System.assert(deleteVectorStoreFileResponse2.equals(deleteVectorStoreFileResponse1));
        System.assert(deleteVectorStoreFileResponse3.equals(deleteVectorStoreFileResponse4));
        System.assert(deleteVectorStoreFileResponse4.equals(deleteVectorStoreFileResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse1 = OASDeleteVectorStoreFileResponse.getExample();
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse2 = new OASDeleteVectorStoreFileResponse();

        System.assertEquals(false, deleteVectorStoreFileResponse1.equals('foo'));
        System.assertEquals(false, deleteVectorStoreFileResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse1 = OASDeleteVectorStoreFileResponse.getExample();
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse2 = new OASDeleteVectorStoreFileResponse();
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse3;

        System.assertEquals(false, deleteVectorStoreFileResponse1.equals(deleteVectorStoreFileResponse3));
        System.assertEquals(false, deleteVectorStoreFileResponse2.equals(deleteVectorStoreFileResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse1 = OASDeleteVectorStoreFileResponse.getExample();
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse2 = new OASDeleteVectorStoreFileResponse();

        System.assertEquals(deleteVectorStoreFileResponse1.hashCode(), deleteVectorStoreFileResponse1.hashCode());
        System.assertEquals(deleteVectorStoreFileResponse2.hashCode(), deleteVectorStoreFileResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse1 = OASDeleteVectorStoreFileResponse.getExample();
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse2 = OASDeleteVectorStoreFileResponse.getExample();
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse3 = new OASDeleteVectorStoreFileResponse();
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse4 = new OASDeleteVectorStoreFileResponse();

        System.assert(deleteVectorStoreFileResponse1.equals(deleteVectorStoreFileResponse2));
        System.assert(deleteVectorStoreFileResponse3.equals(deleteVectorStoreFileResponse4));
        System.assertEquals(deleteVectorStoreFileResponse1.hashCode(), deleteVectorStoreFileResponse2.hashCode());
        System.assertEquals(deleteVectorStoreFileResponse3.hashCode(), deleteVectorStoreFileResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeleteVectorStoreFileResponse deleteVectorStoreFileResponse = new OASDeleteVectorStoreFileResponse();
        Map<String, String> x-property-mappings = deleteVectorStoreFileResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
