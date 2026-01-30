@isTest
private class OASCreateThreadRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateThreadRequest createThreadRequest1 = OASCreateThreadRequest.getExample();
        OASCreateThreadRequest createThreadRequest2 = createThreadRequest1;
        OASCreateThreadRequest createThreadRequest3 = new OASCreateThreadRequest();
        OASCreateThreadRequest createThreadRequest4 = createThreadRequest3;

        System.assert(createThreadRequest1.equals(createThreadRequest2));
        System.assert(createThreadRequest2.equals(createThreadRequest1));
        System.assert(createThreadRequest1.equals(createThreadRequest1));
        System.assert(createThreadRequest3.equals(createThreadRequest4));
        System.assert(createThreadRequest4.equals(createThreadRequest3));
        System.assert(createThreadRequest3.equals(createThreadRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateThreadRequest createThreadRequest1 = OASCreateThreadRequest.getExample();
        OASCreateThreadRequest createThreadRequest2 = OASCreateThreadRequest.getExample();
        OASCreateThreadRequest createThreadRequest3 = new OASCreateThreadRequest();
        OASCreateThreadRequest createThreadRequest4 = new OASCreateThreadRequest();

        System.assert(createThreadRequest1.equals(createThreadRequest2));
        System.assert(createThreadRequest2.equals(createThreadRequest1));
        System.assert(createThreadRequest3.equals(createThreadRequest4));
        System.assert(createThreadRequest4.equals(createThreadRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateThreadRequest createThreadRequest1 = OASCreateThreadRequest.getExample();
        OASCreateThreadRequest createThreadRequest2 = new OASCreateThreadRequest();

        System.assertEquals(false, createThreadRequest1.equals('foo'));
        System.assertEquals(false, createThreadRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateThreadRequest createThreadRequest1 = OASCreateThreadRequest.getExample();
        OASCreateThreadRequest createThreadRequest2 = new OASCreateThreadRequest();
        OASCreateThreadRequest createThreadRequest3;

        System.assertEquals(false, createThreadRequest1.equals(createThreadRequest3));
        System.assertEquals(false, createThreadRequest2.equals(createThreadRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateThreadRequest createThreadRequest1 = OASCreateThreadRequest.getExample();
        OASCreateThreadRequest createThreadRequest2 = new OASCreateThreadRequest();

        System.assertEquals(createThreadRequest1.hashCode(), createThreadRequest1.hashCode());
        System.assertEquals(createThreadRequest2.hashCode(), createThreadRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateThreadRequest createThreadRequest1 = OASCreateThreadRequest.getExample();
        OASCreateThreadRequest createThreadRequest2 = OASCreateThreadRequest.getExample();
        OASCreateThreadRequest createThreadRequest3 = new OASCreateThreadRequest();
        OASCreateThreadRequest createThreadRequest4 = new OASCreateThreadRequest();

        System.assert(createThreadRequest1.equals(createThreadRequest2));
        System.assert(createThreadRequest3.equals(createThreadRequest4));
        System.assertEquals(createThreadRequest1.hashCode(), createThreadRequest2.hashCode());
        System.assertEquals(createThreadRequest3.hashCode(), createThreadRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateThreadRequest createThreadRequest = new OASCreateThreadRequest();
        Map<String, String> x-property-mappings = createThreadRequest.getx-property-mappings();
        System.assertEquals('toolResources', x-property-mappings.get('tool_resources'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateThreadRequest createThreadRequest = new OASCreateThreadRequest();
        System.assertEquals(new List<OASCreateMessageRequest>(), createThreadRequest.messages);
        System.assertEquals(null, createThreadRequest.toolResources);
        System.assertEquals(null, createThreadRequest.metadata);
    }
}
