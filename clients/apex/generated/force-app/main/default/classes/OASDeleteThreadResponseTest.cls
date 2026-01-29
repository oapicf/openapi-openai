@isTest
private class OASDeleteThreadResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteThreadResponse deleteThreadResponse1 = OASDeleteThreadResponse.getExample();
        OASDeleteThreadResponse deleteThreadResponse2 = deleteThreadResponse1;
        OASDeleteThreadResponse deleteThreadResponse3 = new OASDeleteThreadResponse();
        OASDeleteThreadResponse deleteThreadResponse4 = deleteThreadResponse3;

        System.assert(deleteThreadResponse1.equals(deleteThreadResponse2));
        System.assert(deleteThreadResponse2.equals(deleteThreadResponse1));
        System.assert(deleteThreadResponse1.equals(deleteThreadResponse1));
        System.assert(deleteThreadResponse3.equals(deleteThreadResponse4));
        System.assert(deleteThreadResponse4.equals(deleteThreadResponse3));
        System.assert(deleteThreadResponse3.equals(deleteThreadResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteThreadResponse deleteThreadResponse1 = OASDeleteThreadResponse.getExample();
        OASDeleteThreadResponse deleteThreadResponse2 = OASDeleteThreadResponse.getExample();
        OASDeleteThreadResponse deleteThreadResponse3 = new OASDeleteThreadResponse();
        OASDeleteThreadResponse deleteThreadResponse4 = new OASDeleteThreadResponse();

        System.assert(deleteThreadResponse1.equals(deleteThreadResponse2));
        System.assert(deleteThreadResponse2.equals(deleteThreadResponse1));
        System.assert(deleteThreadResponse3.equals(deleteThreadResponse4));
        System.assert(deleteThreadResponse4.equals(deleteThreadResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteThreadResponse deleteThreadResponse1 = OASDeleteThreadResponse.getExample();
        OASDeleteThreadResponse deleteThreadResponse2 = new OASDeleteThreadResponse();

        System.assertEquals(false, deleteThreadResponse1.equals('foo'));
        System.assertEquals(false, deleteThreadResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteThreadResponse deleteThreadResponse1 = OASDeleteThreadResponse.getExample();
        OASDeleteThreadResponse deleteThreadResponse2 = new OASDeleteThreadResponse();
        OASDeleteThreadResponse deleteThreadResponse3;

        System.assertEquals(false, deleteThreadResponse1.equals(deleteThreadResponse3));
        System.assertEquals(false, deleteThreadResponse2.equals(deleteThreadResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteThreadResponse deleteThreadResponse1 = OASDeleteThreadResponse.getExample();
        OASDeleteThreadResponse deleteThreadResponse2 = new OASDeleteThreadResponse();

        System.assertEquals(deleteThreadResponse1.hashCode(), deleteThreadResponse1.hashCode());
        System.assertEquals(deleteThreadResponse2.hashCode(), deleteThreadResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteThreadResponse deleteThreadResponse1 = OASDeleteThreadResponse.getExample();
        OASDeleteThreadResponse deleteThreadResponse2 = OASDeleteThreadResponse.getExample();
        OASDeleteThreadResponse deleteThreadResponse3 = new OASDeleteThreadResponse();
        OASDeleteThreadResponse deleteThreadResponse4 = new OASDeleteThreadResponse();

        System.assert(deleteThreadResponse1.equals(deleteThreadResponse2));
        System.assert(deleteThreadResponse3.equals(deleteThreadResponse4));
        System.assertEquals(deleteThreadResponse1.hashCode(), deleteThreadResponse2.hashCode());
        System.assertEquals(deleteThreadResponse3.hashCode(), deleteThreadResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeleteThreadResponse deleteThreadResponse = new OASDeleteThreadResponse();
        Map<String, String> x-property-mappings = deleteThreadResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
