@isTest
private class OASDeleteAssistantResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteAssistantResponse deleteAssistantResponse1 = OASDeleteAssistantResponse.getExample();
        OASDeleteAssistantResponse deleteAssistantResponse2 = deleteAssistantResponse1;
        OASDeleteAssistantResponse deleteAssistantResponse3 = new OASDeleteAssistantResponse();
        OASDeleteAssistantResponse deleteAssistantResponse4 = deleteAssistantResponse3;

        System.assert(deleteAssistantResponse1.equals(deleteAssistantResponse2));
        System.assert(deleteAssistantResponse2.equals(deleteAssistantResponse1));
        System.assert(deleteAssistantResponse1.equals(deleteAssistantResponse1));
        System.assert(deleteAssistantResponse3.equals(deleteAssistantResponse4));
        System.assert(deleteAssistantResponse4.equals(deleteAssistantResponse3));
        System.assert(deleteAssistantResponse3.equals(deleteAssistantResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteAssistantResponse deleteAssistantResponse1 = OASDeleteAssistantResponse.getExample();
        OASDeleteAssistantResponse deleteAssistantResponse2 = OASDeleteAssistantResponse.getExample();
        OASDeleteAssistantResponse deleteAssistantResponse3 = new OASDeleteAssistantResponse();
        OASDeleteAssistantResponse deleteAssistantResponse4 = new OASDeleteAssistantResponse();

        System.assert(deleteAssistantResponse1.equals(deleteAssistantResponse2));
        System.assert(deleteAssistantResponse2.equals(deleteAssistantResponse1));
        System.assert(deleteAssistantResponse3.equals(deleteAssistantResponse4));
        System.assert(deleteAssistantResponse4.equals(deleteAssistantResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteAssistantResponse deleteAssistantResponse1 = OASDeleteAssistantResponse.getExample();
        OASDeleteAssistantResponse deleteAssistantResponse2 = new OASDeleteAssistantResponse();

        System.assertEquals(false, deleteAssistantResponse1.equals('foo'));
        System.assertEquals(false, deleteAssistantResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteAssistantResponse deleteAssistantResponse1 = OASDeleteAssistantResponse.getExample();
        OASDeleteAssistantResponse deleteAssistantResponse2 = new OASDeleteAssistantResponse();
        OASDeleteAssistantResponse deleteAssistantResponse3;

        System.assertEquals(false, deleteAssistantResponse1.equals(deleteAssistantResponse3));
        System.assertEquals(false, deleteAssistantResponse2.equals(deleteAssistantResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteAssistantResponse deleteAssistantResponse1 = OASDeleteAssistantResponse.getExample();
        OASDeleteAssistantResponse deleteAssistantResponse2 = new OASDeleteAssistantResponse();

        System.assertEquals(deleteAssistantResponse1.hashCode(), deleteAssistantResponse1.hashCode());
        System.assertEquals(deleteAssistantResponse2.hashCode(), deleteAssistantResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteAssistantResponse deleteAssistantResponse1 = OASDeleteAssistantResponse.getExample();
        OASDeleteAssistantResponse deleteAssistantResponse2 = OASDeleteAssistantResponse.getExample();
        OASDeleteAssistantResponse deleteAssistantResponse3 = new OASDeleteAssistantResponse();
        OASDeleteAssistantResponse deleteAssistantResponse4 = new OASDeleteAssistantResponse();

        System.assert(deleteAssistantResponse1.equals(deleteAssistantResponse2));
        System.assert(deleteAssistantResponse3.equals(deleteAssistantResponse4));
        System.assertEquals(deleteAssistantResponse1.hashCode(), deleteAssistantResponse2.hashCode());
        System.assertEquals(deleteAssistantResponse3.hashCode(), deleteAssistantResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeleteAssistantResponse deleteAssistantResponse = new OASDeleteAssistantResponse();
        Map<String, String> x-property-mappings = deleteAssistantResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
