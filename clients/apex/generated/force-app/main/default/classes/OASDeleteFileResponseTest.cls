@isTest
private class OASDeleteFileResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteFileResponse deleteFileResponse1 = OASDeleteFileResponse.getExample();
        OASDeleteFileResponse deleteFileResponse2 = deleteFileResponse1;
        OASDeleteFileResponse deleteFileResponse3 = new OASDeleteFileResponse();
        OASDeleteFileResponse deleteFileResponse4 = deleteFileResponse3;

        System.assert(deleteFileResponse1.equals(deleteFileResponse2));
        System.assert(deleteFileResponse2.equals(deleteFileResponse1));
        System.assert(deleteFileResponse1.equals(deleteFileResponse1));
        System.assert(deleteFileResponse3.equals(deleteFileResponse4));
        System.assert(deleteFileResponse4.equals(deleteFileResponse3));
        System.assert(deleteFileResponse3.equals(deleteFileResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteFileResponse deleteFileResponse1 = OASDeleteFileResponse.getExample();
        OASDeleteFileResponse deleteFileResponse2 = OASDeleteFileResponse.getExample();
        OASDeleteFileResponse deleteFileResponse3 = new OASDeleteFileResponse();
        OASDeleteFileResponse deleteFileResponse4 = new OASDeleteFileResponse();

        System.assert(deleteFileResponse1.equals(deleteFileResponse2));
        System.assert(deleteFileResponse2.equals(deleteFileResponse1));
        System.assert(deleteFileResponse3.equals(deleteFileResponse4));
        System.assert(deleteFileResponse4.equals(deleteFileResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteFileResponse deleteFileResponse1 = OASDeleteFileResponse.getExample();
        OASDeleteFileResponse deleteFileResponse2 = new OASDeleteFileResponse();

        System.assertEquals(false, deleteFileResponse1.equals('foo'));
        System.assertEquals(false, deleteFileResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteFileResponse deleteFileResponse1 = OASDeleteFileResponse.getExample();
        OASDeleteFileResponse deleteFileResponse2 = new OASDeleteFileResponse();
        OASDeleteFileResponse deleteFileResponse3;

        System.assertEquals(false, deleteFileResponse1.equals(deleteFileResponse3));
        System.assertEquals(false, deleteFileResponse2.equals(deleteFileResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteFileResponse deleteFileResponse1 = OASDeleteFileResponse.getExample();
        OASDeleteFileResponse deleteFileResponse2 = new OASDeleteFileResponse();

        System.assertEquals(deleteFileResponse1.hashCode(), deleteFileResponse1.hashCode());
        System.assertEquals(deleteFileResponse2.hashCode(), deleteFileResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteFileResponse deleteFileResponse1 = OASDeleteFileResponse.getExample();
        OASDeleteFileResponse deleteFileResponse2 = OASDeleteFileResponse.getExample();
        OASDeleteFileResponse deleteFileResponse3 = new OASDeleteFileResponse();
        OASDeleteFileResponse deleteFileResponse4 = new OASDeleteFileResponse();

        System.assert(deleteFileResponse1.equals(deleteFileResponse2));
        System.assert(deleteFileResponse3.equals(deleteFileResponse4));
        System.assertEquals(deleteFileResponse1.hashCode(), deleteFileResponse2.hashCode());
        System.assertEquals(deleteFileResponse3.hashCode(), deleteFileResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeleteFileResponse deleteFileResponse = new OASDeleteFileResponse();
        Map<String, String> x-property-mappings = deleteFileResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
