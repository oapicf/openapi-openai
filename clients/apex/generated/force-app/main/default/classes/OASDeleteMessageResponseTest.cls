@isTest
private class OASDeleteMessageResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteMessageResponse deleteMessageResponse1 = OASDeleteMessageResponse.getExample();
        OASDeleteMessageResponse deleteMessageResponse2 = deleteMessageResponse1;
        OASDeleteMessageResponse deleteMessageResponse3 = new OASDeleteMessageResponse();
        OASDeleteMessageResponse deleteMessageResponse4 = deleteMessageResponse3;

        System.assert(deleteMessageResponse1.equals(deleteMessageResponse2));
        System.assert(deleteMessageResponse2.equals(deleteMessageResponse1));
        System.assert(deleteMessageResponse1.equals(deleteMessageResponse1));
        System.assert(deleteMessageResponse3.equals(deleteMessageResponse4));
        System.assert(deleteMessageResponse4.equals(deleteMessageResponse3));
        System.assert(deleteMessageResponse3.equals(deleteMessageResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteMessageResponse deleteMessageResponse1 = OASDeleteMessageResponse.getExample();
        OASDeleteMessageResponse deleteMessageResponse2 = OASDeleteMessageResponse.getExample();
        OASDeleteMessageResponse deleteMessageResponse3 = new OASDeleteMessageResponse();
        OASDeleteMessageResponse deleteMessageResponse4 = new OASDeleteMessageResponse();

        System.assert(deleteMessageResponse1.equals(deleteMessageResponse2));
        System.assert(deleteMessageResponse2.equals(deleteMessageResponse1));
        System.assert(deleteMessageResponse3.equals(deleteMessageResponse4));
        System.assert(deleteMessageResponse4.equals(deleteMessageResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteMessageResponse deleteMessageResponse1 = OASDeleteMessageResponse.getExample();
        OASDeleteMessageResponse deleteMessageResponse2 = new OASDeleteMessageResponse();

        System.assertEquals(false, deleteMessageResponse1.equals('foo'));
        System.assertEquals(false, deleteMessageResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteMessageResponse deleteMessageResponse1 = OASDeleteMessageResponse.getExample();
        OASDeleteMessageResponse deleteMessageResponse2 = new OASDeleteMessageResponse();
        OASDeleteMessageResponse deleteMessageResponse3;

        System.assertEquals(false, deleteMessageResponse1.equals(deleteMessageResponse3));
        System.assertEquals(false, deleteMessageResponse2.equals(deleteMessageResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteMessageResponse deleteMessageResponse1 = OASDeleteMessageResponse.getExample();
        OASDeleteMessageResponse deleteMessageResponse2 = new OASDeleteMessageResponse();

        System.assertEquals(deleteMessageResponse1.hashCode(), deleteMessageResponse1.hashCode());
        System.assertEquals(deleteMessageResponse2.hashCode(), deleteMessageResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteMessageResponse deleteMessageResponse1 = OASDeleteMessageResponse.getExample();
        OASDeleteMessageResponse deleteMessageResponse2 = OASDeleteMessageResponse.getExample();
        OASDeleteMessageResponse deleteMessageResponse3 = new OASDeleteMessageResponse();
        OASDeleteMessageResponse deleteMessageResponse4 = new OASDeleteMessageResponse();

        System.assert(deleteMessageResponse1.equals(deleteMessageResponse2));
        System.assert(deleteMessageResponse3.equals(deleteMessageResponse4));
        System.assertEquals(deleteMessageResponse1.hashCode(), deleteMessageResponse2.hashCode());
        System.assertEquals(deleteMessageResponse3.hashCode(), deleteMessageResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeleteMessageResponse deleteMessageResponse = new OASDeleteMessageResponse();
        Map<String, String> x-property-mappings = deleteMessageResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
