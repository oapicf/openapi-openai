@isTest
private class OASCreateTranslationResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateTranslationResponse createTranslationResponse1 = OASCreateTranslationResponse.getExample();
        OASCreateTranslationResponse createTranslationResponse2 = createTranslationResponse1;
        OASCreateTranslationResponse createTranslationResponse3 = new OASCreateTranslationResponse();
        OASCreateTranslationResponse createTranslationResponse4 = createTranslationResponse3;

        System.assert(createTranslationResponse1.equals(createTranslationResponse2));
        System.assert(createTranslationResponse2.equals(createTranslationResponse1));
        System.assert(createTranslationResponse1.equals(createTranslationResponse1));
        System.assert(createTranslationResponse3.equals(createTranslationResponse4));
        System.assert(createTranslationResponse4.equals(createTranslationResponse3));
        System.assert(createTranslationResponse3.equals(createTranslationResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateTranslationResponse createTranslationResponse1 = OASCreateTranslationResponse.getExample();
        OASCreateTranslationResponse createTranslationResponse2 = OASCreateTranslationResponse.getExample();
        OASCreateTranslationResponse createTranslationResponse3 = new OASCreateTranslationResponse();
        OASCreateTranslationResponse createTranslationResponse4 = new OASCreateTranslationResponse();

        System.assert(createTranslationResponse1.equals(createTranslationResponse2));
        System.assert(createTranslationResponse2.equals(createTranslationResponse1));
        System.assert(createTranslationResponse3.equals(createTranslationResponse4));
        System.assert(createTranslationResponse4.equals(createTranslationResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateTranslationResponse createTranslationResponse1 = OASCreateTranslationResponse.getExample();
        OASCreateTranslationResponse createTranslationResponse2 = new OASCreateTranslationResponse();

        System.assertEquals(false, createTranslationResponse1.equals('foo'));
        System.assertEquals(false, createTranslationResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateTranslationResponse createTranslationResponse1 = OASCreateTranslationResponse.getExample();
        OASCreateTranslationResponse createTranslationResponse2 = new OASCreateTranslationResponse();
        OASCreateTranslationResponse createTranslationResponse3;

        System.assertEquals(false, createTranslationResponse1.equals(createTranslationResponse3));
        System.assertEquals(false, createTranslationResponse2.equals(createTranslationResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateTranslationResponse createTranslationResponse1 = OASCreateTranslationResponse.getExample();
        OASCreateTranslationResponse createTranslationResponse2 = new OASCreateTranslationResponse();

        System.assertEquals(createTranslationResponse1.hashCode(), createTranslationResponse1.hashCode());
        System.assertEquals(createTranslationResponse2.hashCode(), createTranslationResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateTranslationResponse createTranslationResponse1 = OASCreateTranslationResponse.getExample();
        OASCreateTranslationResponse createTranslationResponse2 = OASCreateTranslationResponse.getExample();
        OASCreateTranslationResponse createTranslationResponse3 = new OASCreateTranslationResponse();
        OASCreateTranslationResponse createTranslationResponse4 = new OASCreateTranslationResponse();

        System.assert(createTranslationResponse1.equals(createTranslationResponse2));
        System.assert(createTranslationResponse3.equals(createTranslationResponse4));
        System.assertEquals(createTranslationResponse1.hashCode(), createTranslationResponse2.hashCode());
        System.assertEquals(createTranslationResponse3.hashCode(), createTranslationResponse4.hashCode());
    }
}
