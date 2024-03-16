@isTest
private class OASCreateModerationRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateModerationRequest createModerationRequest1 = OASCreateModerationRequest.getExample();
        OASCreateModerationRequest createModerationRequest2 = createModerationRequest1;
        OASCreateModerationRequest createModerationRequest3 = new OASCreateModerationRequest();
        OASCreateModerationRequest createModerationRequest4 = createModerationRequest3;

        System.assert(createModerationRequest1.equals(createModerationRequest2));
        System.assert(createModerationRequest2.equals(createModerationRequest1));
        System.assert(createModerationRequest1.equals(createModerationRequest1));
        System.assert(createModerationRequest3.equals(createModerationRequest4));
        System.assert(createModerationRequest4.equals(createModerationRequest3));
        System.assert(createModerationRequest3.equals(createModerationRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateModerationRequest createModerationRequest1 = OASCreateModerationRequest.getExample();
        OASCreateModerationRequest createModerationRequest2 = OASCreateModerationRequest.getExample();
        OASCreateModerationRequest createModerationRequest3 = new OASCreateModerationRequest();
        OASCreateModerationRequest createModerationRequest4 = new OASCreateModerationRequest();

        System.assert(createModerationRequest1.equals(createModerationRequest2));
        System.assert(createModerationRequest2.equals(createModerationRequest1));
        System.assert(createModerationRequest3.equals(createModerationRequest4));
        System.assert(createModerationRequest4.equals(createModerationRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateModerationRequest createModerationRequest1 = OASCreateModerationRequest.getExample();
        OASCreateModerationRequest createModerationRequest2 = new OASCreateModerationRequest();

        System.assertEquals(false, createModerationRequest1.equals('foo'));
        System.assertEquals(false, createModerationRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateModerationRequest createModerationRequest1 = OASCreateModerationRequest.getExample();
        OASCreateModerationRequest createModerationRequest2 = new OASCreateModerationRequest();
        OASCreateModerationRequest createModerationRequest3;

        System.assertEquals(false, createModerationRequest1.equals(createModerationRequest3));
        System.assertEquals(false, createModerationRequest2.equals(createModerationRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateModerationRequest createModerationRequest1 = OASCreateModerationRequest.getExample();
        OASCreateModerationRequest createModerationRequest2 = new OASCreateModerationRequest();

        System.assertEquals(createModerationRequest1.hashCode(), createModerationRequest1.hashCode());
        System.assertEquals(createModerationRequest2.hashCode(), createModerationRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateModerationRequest createModerationRequest1 = OASCreateModerationRequest.getExample();
        OASCreateModerationRequest createModerationRequest2 = OASCreateModerationRequest.getExample();
        OASCreateModerationRequest createModerationRequest3 = new OASCreateModerationRequest();
        OASCreateModerationRequest createModerationRequest4 = new OASCreateModerationRequest();

        System.assert(createModerationRequest1.equals(createModerationRequest2));
        System.assert(createModerationRequest3.equals(createModerationRequest4));
        System.assertEquals(createModerationRequest1.hashCode(), createModerationRequest2.hashCode());
        System.assertEquals(createModerationRequest3.hashCode(), createModerationRequest4.hashCode());
    }
}
