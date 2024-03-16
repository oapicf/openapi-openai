@isTest
private class OASCreateTranscriptionResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateTranscriptionResponse createTranscriptionResponse1 = OASCreateTranscriptionResponse.getExample();
        OASCreateTranscriptionResponse createTranscriptionResponse2 = createTranscriptionResponse1;
        OASCreateTranscriptionResponse createTranscriptionResponse3 = new OASCreateTranscriptionResponse();
        OASCreateTranscriptionResponse createTranscriptionResponse4 = createTranscriptionResponse3;

        System.assert(createTranscriptionResponse1.equals(createTranscriptionResponse2));
        System.assert(createTranscriptionResponse2.equals(createTranscriptionResponse1));
        System.assert(createTranscriptionResponse1.equals(createTranscriptionResponse1));
        System.assert(createTranscriptionResponse3.equals(createTranscriptionResponse4));
        System.assert(createTranscriptionResponse4.equals(createTranscriptionResponse3));
        System.assert(createTranscriptionResponse3.equals(createTranscriptionResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateTranscriptionResponse createTranscriptionResponse1 = OASCreateTranscriptionResponse.getExample();
        OASCreateTranscriptionResponse createTranscriptionResponse2 = OASCreateTranscriptionResponse.getExample();
        OASCreateTranscriptionResponse createTranscriptionResponse3 = new OASCreateTranscriptionResponse();
        OASCreateTranscriptionResponse createTranscriptionResponse4 = new OASCreateTranscriptionResponse();

        System.assert(createTranscriptionResponse1.equals(createTranscriptionResponse2));
        System.assert(createTranscriptionResponse2.equals(createTranscriptionResponse1));
        System.assert(createTranscriptionResponse3.equals(createTranscriptionResponse4));
        System.assert(createTranscriptionResponse4.equals(createTranscriptionResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateTranscriptionResponse createTranscriptionResponse1 = OASCreateTranscriptionResponse.getExample();
        OASCreateTranscriptionResponse createTranscriptionResponse2 = new OASCreateTranscriptionResponse();

        System.assertEquals(false, createTranscriptionResponse1.equals('foo'));
        System.assertEquals(false, createTranscriptionResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateTranscriptionResponse createTranscriptionResponse1 = OASCreateTranscriptionResponse.getExample();
        OASCreateTranscriptionResponse createTranscriptionResponse2 = new OASCreateTranscriptionResponse();
        OASCreateTranscriptionResponse createTranscriptionResponse3;

        System.assertEquals(false, createTranscriptionResponse1.equals(createTranscriptionResponse3));
        System.assertEquals(false, createTranscriptionResponse2.equals(createTranscriptionResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateTranscriptionResponse createTranscriptionResponse1 = OASCreateTranscriptionResponse.getExample();
        OASCreateTranscriptionResponse createTranscriptionResponse2 = new OASCreateTranscriptionResponse();

        System.assertEquals(createTranscriptionResponse1.hashCode(), createTranscriptionResponse1.hashCode());
        System.assertEquals(createTranscriptionResponse2.hashCode(), createTranscriptionResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateTranscriptionResponse createTranscriptionResponse1 = OASCreateTranscriptionResponse.getExample();
        OASCreateTranscriptionResponse createTranscriptionResponse2 = OASCreateTranscriptionResponse.getExample();
        OASCreateTranscriptionResponse createTranscriptionResponse3 = new OASCreateTranscriptionResponse();
        OASCreateTranscriptionResponse createTranscriptionResponse4 = new OASCreateTranscriptionResponse();

        System.assert(createTranscriptionResponse1.equals(createTranscriptionResponse2));
        System.assert(createTranscriptionResponse3.equals(createTranscriptionResponse4));
        System.assertEquals(createTranscriptionResponse1.hashCode(), createTranscriptionResponse2.hashCode());
        System.assertEquals(createTranscriptionResponse3.hashCode(), createTranscriptionResponse4.hashCode());
    }
}
