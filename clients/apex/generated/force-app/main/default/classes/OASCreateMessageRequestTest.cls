@isTest
private class OASCreateMessageRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateMessageRequest createMessageRequest1 = OASCreateMessageRequest.getExample();
        OASCreateMessageRequest createMessageRequest2 = createMessageRequest1;
        OASCreateMessageRequest createMessageRequest3 = new OASCreateMessageRequest();
        OASCreateMessageRequest createMessageRequest4 = createMessageRequest3;

        System.assert(createMessageRequest1.equals(createMessageRequest2));
        System.assert(createMessageRequest2.equals(createMessageRequest1));
        System.assert(createMessageRequest1.equals(createMessageRequest1));
        System.assert(createMessageRequest3.equals(createMessageRequest4));
        System.assert(createMessageRequest4.equals(createMessageRequest3));
        System.assert(createMessageRequest3.equals(createMessageRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateMessageRequest createMessageRequest1 = OASCreateMessageRequest.getExample();
        OASCreateMessageRequest createMessageRequest2 = OASCreateMessageRequest.getExample();
        OASCreateMessageRequest createMessageRequest3 = new OASCreateMessageRequest();
        OASCreateMessageRequest createMessageRequest4 = new OASCreateMessageRequest();

        System.assert(createMessageRequest1.equals(createMessageRequest2));
        System.assert(createMessageRequest2.equals(createMessageRequest1));
        System.assert(createMessageRequest3.equals(createMessageRequest4));
        System.assert(createMessageRequest4.equals(createMessageRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateMessageRequest createMessageRequest1 = OASCreateMessageRequest.getExample();
        OASCreateMessageRequest createMessageRequest2 = new OASCreateMessageRequest();

        System.assertEquals(false, createMessageRequest1.equals('foo'));
        System.assertEquals(false, createMessageRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateMessageRequest createMessageRequest1 = OASCreateMessageRequest.getExample();
        OASCreateMessageRequest createMessageRequest2 = new OASCreateMessageRequest();
        OASCreateMessageRequest createMessageRequest3;

        System.assertEquals(false, createMessageRequest1.equals(createMessageRequest3));
        System.assertEquals(false, createMessageRequest2.equals(createMessageRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateMessageRequest createMessageRequest1 = OASCreateMessageRequest.getExample();
        OASCreateMessageRequest createMessageRequest2 = new OASCreateMessageRequest();

        System.assertEquals(createMessageRequest1.hashCode(), createMessageRequest1.hashCode());
        System.assertEquals(createMessageRequest2.hashCode(), createMessageRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateMessageRequest createMessageRequest1 = OASCreateMessageRequest.getExample();
        OASCreateMessageRequest createMessageRequest2 = OASCreateMessageRequest.getExample();
        OASCreateMessageRequest createMessageRequest3 = new OASCreateMessageRequest();
        OASCreateMessageRequest createMessageRequest4 = new OASCreateMessageRequest();

        System.assert(createMessageRequest1.equals(createMessageRequest2));
        System.assert(createMessageRequest3.equals(createMessageRequest4));
        System.assertEquals(createMessageRequest1.hashCode(), createMessageRequest2.hashCode());
        System.assertEquals(createMessageRequest3.hashCode(), createMessageRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateMessageRequest createMessageRequest = new OASCreateMessageRequest();
        System.assertEquals(new List<OASCreateMessageRequestAttachmentsIn>(), createMessageRequest.attachments);
        System.assertEquals(null, createMessageRequest.role);
        System.assertEquals(null, createMessageRequest.content);
        System.assertEquals(null, createMessageRequest.metadata);
    }
}
