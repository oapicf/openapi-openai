@isTest
private class OASDeleteModelResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteModelResponse deleteModelResponse1 = OASDeleteModelResponse.getExample();
        OASDeleteModelResponse deleteModelResponse2 = deleteModelResponse1;
        OASDeleteModelResponse deleteModelResponse3 = new OASDeleteModelResponse();
        OASDeleteModelResponse deleteModelResponse4 = deleteModelResponse3;

        System.assert(deleteModelResponse1.equals(deleteModelResponse2));
        System.assert(deleteModelResponse2.equals(deleteModelResponse1));
        System.assert(deleteModelResponse1.equals(deleteModelResponse1));
        System.assert(deleteModelResponse3.equals(deleteModelResponse4));
        System.assert(deleteModelResponse4.equals(deleteModelResponse3));
        System.assert(deleteModelResponse3.equals(deleteModelResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteModelResponse deleteModelResponse1 = OASDeleteModelResponse.getExample();
        OASDeleteModelResponse deleteModelResponse2 = OASDeleteModelResponse.getExample();
        OASDeleteModelResponse deleteModelResponse3 = new OASDeleteModelResponse();
        OASDeleteModelResponse deleteModelResponse4 = new OASDeleteModelResponse();

        System.assert(deleteModelResponse1.equals(deleteModelResponse2));
        System.assert(deleteModelResponse2.equals(deleteModelResponse1));
        System.assert(deleteModelResponse3.equals(deleteModelResponse4));
        System.assert(deleteModelResponse4.equals(deleteModelResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteModelResponse deleteModelResponse1 = OASDeleteModelResponse.getExample();
        OASDeleteModelResponse deleteModelResponse2 = new OASDeleteModelResponse();

        System.assertEquals(false, deleteModelResponse1.equals('foo'));
        System.assertEquals(false, deleteModelResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteModelResponse deleteModelResponse1 = OASDeleteModelResponse.getExample();
        OASDeleteModelResponse deleteModelResponse2 = new OASDeleteModelResponse();
        OASDeleteModelResponse deleteModelResponse3;

        System.assertEquals(false, deleteModelResponse1.equals(deleteModelResponse3));
        System.assertEquals(false, deleteModelResponse2.equals(deleteModelResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteModelResponse deleteModelResponse1 = OASDeleteModelResponse.getExample();
        OASDeleteModelResponse deleteModelResponse2 = new OASDeleteModelResponse();

        System.assertEquals(deleteModelResponse1.hashCode(), deleteModelResponse1.hashCode());
        System.assertEquals(deleteModelResponse2.hashCode(), deleteModelResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteModelResponse deleteModelResponse1 = OASDeleteModelResponse.getExample();
        OASDeleteModelResponse deleteModelResponse2 = OASDeleteModelResponse.getExample();
        OASDeleteModelResponse deleteModelResponse3 = new OASDeleteModelResponse();
        OASDeleteModelResponse deleteModelResponse4 = new OASDeleteModelResponse();

        System.assert(deleteModelResponse1.equals(deleteModelResponse2));
        System.assert(deleteModelResponse3.equals(deleteModelResponse4));
        System.assertEquals(deleteModelResponse1.hashCode(), deleteModelResponse2.hashCode());
        System.assertEquals(deleteModelResponse3.hashCode(), deleteModelResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeleteModelResponse deleteModelResponse = new OASDeleteModelResponse();
        Map<String, String> x-property-mappings = deleteModelResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
