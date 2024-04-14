@isTest
private class OASDeleteAssistantFileResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteAssistantFileResponse deleteAssistantFileResponse1 = OASDeleteAssistantFileResponse.getExample();
        OASDeleteAssistantFileResponse deleteAssistantFileResponse2 = deleteAssistantFileResponse1;
        OASDeleteAssistantFileResponse deleteAssistantFileResponse3 = new OASDeleteAssistantFileResponse();
        OASDeleteAssistantFileResponse deleteAssistantFileResponse4 = deleteAssistantFileResponse3;

        System.assert(deleteAssistantFileResponse1.equals(deleteAssistantFileResponse2));
        System.assert(deleteAssistantFileResponse2.equals(deleteAssistantFileResponse1));
        System.assert(deleteAssistantFileResponse1.equals(deleteAssistantFileResponse1));
        System.assert(deleteAssistantFileResponse3.equals(deleteAssistantFileResponse4));
        System.assert(deleteAssistantFileResponse4.equals(deleteAssistantFileResponse3));
        System.assert(deleteAssistantFileResponse3.equals(deleteAssistantFileResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteAssistantFileResponse deleteAssistantFileResponse1 = OASDeleteAssistantFileResponse.getExample();
        OASDeleteAssistantFileResponse deleteAssistantFileResponse2 = OASDeleteAssistantFileResponse.getExample();
        OASDeleteAssistantFileResponse deleteAssistantFileResponse3 = new OASDeleteAssistantFileResponse();
        OASDeleteAssistantFileResponse deleteAssistantFileResponse4 = new OASDeleteAssistantFileResponse();

        System.assert(deleteAssistantFileResponse1.equals(deleteAssistantFileResponse2));
        System.assert(deleteAssistantFileResponse2.equals(deleteAssistantFileResponse1));
        System.assert(deleteAssistantFileResponse3.equals(deleteAssistantFileResponse4));
        System.assert(deleteAssistantFileResponse4.equals(deleteAssistantFileResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteAssistantFileResponse deleteAssistantFileResponse1 = OASDeleteAssistantFileResponse.getExample();
        OASDeleteAssistantFileResponse deleteAssistantFileResponse2 = new OASDeleteAssistantFileResponse();

        System.assertEquals(false, deleteAssistantFileResponse1.equals('foo'));
        System.assertEquals(false, deleteAssistantFileResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteAssistantFileResponse deleteAssistantFileResponse1 = OASDeleteAssistantFileResponse.getExample();
        OASDeleteAssistantFileResponse deleteAssistantFileResponse2 = new OASDeleteAssistantFileResponse();
        OASDeleteAssistantFileResponse deleteAssistantFileResponse3;

        System.assertEquals(false, deleteAssistantFileResponse1.equals(deleteAssistantFileResponse3));
        System.assertEquals(false, deleteAssistantFileResponse2.equals(deleteAssistantFileResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteAssistantFileResponse deleteAssistantFileResponse1 = OASDeleteAssistantFileResponse.getExample();
        OASDeleteAssistantFileResponse deleteAssistantFileResponse2 = new OASDeleteAssistantFileResponse();

        System.assertEquals(deleteAssistantFileResponse1.hashCode(), deleteAssistantFileResponse1.hashCode());
        System.assertEquals(deleteAssistantFileResponse2.hashCode(), deleteAssistantFileResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteAssistantFileResponse deleteAssistantFileResponse1 = OASDeleteAssistantFileResponse.getExample();
        OASDeleteAssistantFileResponse deleteAssistantFileResponse2 = OASDeleteAssistantFileResponse.getExample();
        OASDeleteAssistantFileResponse deleteAssistantFileResponse3 = new OASDeleteAssistantFileResponse();
        OASDeleteAssistantFileResponse deleteAssistantFileResponse4 = new OASDeleteAssistantFileResponse();

        System.assert(deleteAssistantFileResponse1.equals(deleteAssistantFileResponse2));
        System.assert(deleteAssistantFileResponse3.equals(deleteAssistantFileResponse4));
        System.assertEquals(deleteAssistantFileResponse1.hashCode(), deleteAssistantFileResponse2.hashCode());
        System.assertEquals(deleteAssistantFileResponse3.hashCode(), deleteAssistantFileResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeleteAssistantFileResponse deleteAssistantFileResponse = new OASDeleteAssistantFileResponse();
        Map<String, String> x-property-mappings = deleteAssistantFileResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
