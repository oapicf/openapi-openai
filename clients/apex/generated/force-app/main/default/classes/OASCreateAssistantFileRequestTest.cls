@isTest
private class OASCreateAssistantFileRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateAssistantFileRequest createAssistantFileRequest1 = OASCreateAssistantFileRequest.getExample();
        OASCreateAssistantFileRequest createAssistantFileRequest2 = createAssistantFileRequest1;
        OASCreateAssistantFileRequest createAssistantFileRequest3 = new OASCreateAssistantFileRequest();
        OASCreateAssistantFileRequest createAssistantFileRequest4 = createAssistantFileRequest3;

        System.assert(createAssistantFileRequest1.equals(createAssistantFileRequest2));
        System.assert(createAssistantFileRequest2.equals(createAssistantFileRequest1));
        System.assert(createAssistantFileRequest1.equals(createAssistantFileRequest1));
        System.assert(createAssistantFileRequest3.equals(createAssistantFileRequest4));
        System.assert(createAssistantFileRequest4.equals(createAssistantFileRequest3));
        System.assert(createAssistantFileRequest3.equals(createAssistantFileRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateAssistantFileRequest createAssistantFileRequest1 = OASCreateAssistantFileRequest.getExample();
        OASCreateAssistantFileRequest createAssistantFileRequest2 = OASCreateAssistantFileRequest.getExample();
        OASCreateAssistantFileRequest createAssistantFileRequest3 = new OASCreateAssistantFileRequest();
        OASCreateAssistantFileRequest createAssistantFileRequest4 = new OASCreateAssistantFileRequest();

        System.assert(createAssistantFileRequest1.equals(createAssistantFileRequest2));
        System.assert(createAssistantFileRequest2.equals(createAssistantFileRequest1));
        System.assert(createAssistantFileRequest3.equals(createAssistantFileRequest4));
        System.assert(createAssistantFileRequest4.equals(createAssistantFileRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateAssistantFileRequest createAssistantFileRequest1 = OASCreateAssistantFileRequest.getExample();
        OASCreateAssistantFileRequest createAssistantFileRequest2 = new OASCreateAssistantFileRequest();

        System.assertEquals(false, createAssistantFileRequest1.equals('foo'));
        System.assertEquals(false, createAssistantFileRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateAssistantFileRequest createAssistantFileRequest1 = OASCreateAssistantFileRequest.getExample();
        OASCreateAssistantFileRequest createAssistantFileRequest2 = new OASCreateAssistantFileRequest();
        OASCreateAssistantFileRequest createAssistantFileRequest3;

        System.assertEquals(false, createAssistantFileRequest1.equals(createAssistantFileRequest3));
        System.assertEquals(false, createAssistantFileRequest2.equals(createAssistantFileRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateAssistantFileRequest createAssistantFileRequest1 = OASCreateAssistantFileRequest.getExample();
        OASCreateAssistantFileRequest createAssistantFileRequest2 = new OASCreateAssistantFileRequest();

        System.assertEquals(createAssistantFileRequest1.hashCode(), createAssistantFileRequest1.hashCode());
        System.assertEquals(createAssistantFileRequest2.hashCode(), createAssistantFileRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateAssistantFileRequest createAssistantFileRequest1 = OASCreateAssistantFileRequest.getExample();
        OASCreateAssistantFileRequest createAssistantFileRequest2 = OASCreateAssistantFileRequest.getExample();
        OASCreateAssistantFileRequest createAssistantFileRequest3 = new OASCreateAssistantFileRequest();
        OASCreateAssistantFileRequest createAssistantFileRequest4 = new OASCreateAssistantFileRequest();

        System.assert(createAssistantFileRequest1.equals(createAssistantFileRequest2));
        System.assert(createAssistantFileRequest3.equals(createAssistantFileRequest4));
        System.assertEquals(createAssistantFileRequest1.hashCode(), createAssistantFileRequest2.hashCode());
        System.assertEquals(createAssistantFileRequest3.hashCode(), createAssistantFileRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateAssistantFileRequest createAssistantFileRequest = new OASCreateAssistantFileRequest();
        Map<String, String> x-property-mappings = createAssistantFileRequest.getx-property-mappings();
        System.assertEquals('fileId', x-property-mappings.get('file_id'));
    }
}
