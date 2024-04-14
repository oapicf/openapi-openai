@isTest
private class OASCreateAssistantRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateAssistantRequest createAssistantRequest1 = OASCreateAssistantRequest.getExample();
        OASCreateAssistantRequest createAssistantRequest2 = createAssistantRequest1;
        OASCreateAssistantRequest createAssistantRequest3 = new OASCreateAssistantRequest();
        OASCreateAssistantRequest createAssistantRequest4 = createAssistantRequest3;

        System.assert(createAssistantRequest1.equals(createAssistantRequest2));
        System.assert(createAssistantRequest2.equals(createAssistantRequest1));
        System.assert(createAssistantRequest1.equals(createAssistantRequest1));
        System.assert(createAssistantRequest3.equals(createAssistantRequest4));
        System.assert(createAssistantRequest4.equals(createAssistantRequest3));
        System.assert(createAssistantRequest3.equals(createAssistantRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateAssistantRequest createAssistantRequest1 = OASCreateAssistantRequest.getExample();
        OASCreateAssistantRequest createAssistantRequest2 = OASCreateAssistantRequest.getExample();
        OASCreateAssistantRequest createAssistantRequest3 = new OASCreateAssistantRequest();
        OASCreateAssistantRequest createAssistantRequest4 = new OASCreateAssistantRequest();

        System.assert(createAssistantRequest1.equals(createAssistantRequest2));
        System.assert(createAssistantRequest2.equals(createAssistantRequest1));
        System.assert(createAssistantRequest3.equals(createAssistantRequest4));
        System.assert(createAssistantRequest4.equals(createAssistantRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateAssistantRequest createAssistantRequest1 = OASCreateAssistantRequest.getExample();
        OASCreateAssistantRequest createAssistantRequest2 = new OASCreateAssistantRequest();

        System.assertEquals(false, createAssistantRequest1.equals('foo'));
        System.assertEquals(false, createAssistantRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateAssistantRequest createAssistantRequest1 = OASCreateAssistantRequest.getExample();
        OASCreateAssistantRequest createAssistantRequest2 = new OASCreateAssistantRequest();
        OASCreateAssistantRequest createAssistantRequest3;

        System.assertEquals(false, createAssistantRequest1.equals(createAssistantRequest3));
        System.assertEquals(false, createAssistantRequest2.equals(createAssistantRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateAssistantRequest createAssistantRequest1 = OASCreateAssistantRequest.getExample();
        OASCreateAssistantRequest createAssistantRequest2 = new OASCreateAssistantRequest();

        System.assertEquals(createAssistantRequest1.hashCode(), createAssistantRequest1.hashCode());
        System.assertEquals(createAssistantRequest2.hashCode(), createAssistantRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateAssistantRequest createAssistantRequest1 = OASCreateAssistantRequest.getExample();
        OASCreateAssistantRequest createAssistantRequest2 = OASCreateAssistantRequest.getExample();
        OASCreateAssistantRequest createAssistantRequest3 = new OASCreateAssistantRequest();
        OASCreateAssistantRequest createAssistantRequest4 = new OASCreateAssistantRequest();

        System.assert(createAssistantRequest1.equals(createAssistantRequest2));
        System.assert(createAssistantRequest3.equals(createAssistantRequest4));
        System.assertEquals(createAssistantRequest1.hashCode(), createAssistantRequest2.hashCode());
        System.assertEquals(createAssistantRequest3.hashCode(), createAssistantRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateAssistantRequest createAssistantRequest = new OASCreateAssistantRequest();
        Map<String, String> x-property-mappings = createAssistantRequest.getx-property-mappings();
        System.assertEquals('fileIds', x-property-mappings.get('file_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateAssistantRequest createAssistantRequest = new OASCreateAssistantRequest();
        System.assertEquals(new List<OASAssistantObjectToolsInner>(), createAssistantRequest.tools);
        System.assertEquals(new List<String>(), createAssistantRequest.fileIds);
        System.assertEquals(null, createAssistantRequest.model);
        System.assertEquals(null, createAssistantRequest.name);
        System.assertEquals(null, createAssistantRequest.description);
        System.assertEquals(null, createAssistantRequest.instructions);
        System.assertEquals(null, createAssistantRequest.metadata);
    }
}
