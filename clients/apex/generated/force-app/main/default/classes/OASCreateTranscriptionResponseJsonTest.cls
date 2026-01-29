@isTest
private class OASCreateTranscriptionResponseJsonTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson1 = OASCreateTranscriptionResponseJson.getExample();
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson2 = createTranscriptionResponseJson1;
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson3 = new OASCreateTranscriptionResponseJson();
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson4 = createTranscriptionResponseJson3;

        System.assert(createTranscriptionResponseJson1.equals(createTranscriptionResponseJson2));
        System.assert(createTranscriptionResponseJson2.equals(createTranscriptionResponseJson1));
        System.assert(createTranscriptionResponseJson1.equals(createTranscriptionResponseJson1));
        System.assert(createTranscriptionResponseJson3.equals(createTranscriptionResponseJson4));
        System.assert(createTranscriptionResponseJson4.equals(createTranscriptionResponseJson3));
        System.assert(createTranscriptionResponseJson3.equals(createTranscriptionResponseJson3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson1 = OASCreateTranscriptionResponseJson.getExample();
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson2 = OASCreateTranscriptionResponseJson.getExample();
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson3 = new OASCreateTranscriptionResponseJson();
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson4 = new OASCreateTranscriptionResponseJson();

        System.assert(createTranscriptionResponseJson1.equals(createTranscriptionResponseJson2));
        System.assert(createTranscriptionResponseJson2.equals(createTranscriptionResponseJson1));
        System.assert(createTranscriptionResponseJson3.equals(createTranscriptionResponseJson4));
        System.assert(createTranscriptionResponseJson4.equals(createTranscriptionResponseJson3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson1 = OASCreateTranscriptionResponseJson.getExample();
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson2 = new OASCreateTranscriptionResponseJson();

        System.assertEquals(false, createTranscriptionResponseJson1.equals('foo'));
        System.assertEquals(false, createTranscriptionResponseJson2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson1 = OASCreateTranscriptionResponseJson.getExample();
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson2 = new OASCreateTranscriptionResponseJson();
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson3;

        System.assertEquals(false, createTranscriptionResponseJson1.equals(createTranscriptionResponseJson3));
        System.assertEquals(false, createTranscriptionResponseJson2.equals(createTranscriptionResponseJson3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson1 = OASCreateTranscriptionResponseJson.getExample();
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson2 = new OASCreateTranscriptionResponseJson();

        System.assertEquals(createTranscriptionResponseJson1.hashCode(), createTranscriptionResponseJson1.hashCode());
        System.assertEquals(createTranscriptionResponseJson2.hashCode(), createTranscriptionResponseJson2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson1 = OASCreateTranscriptionResponseJson.getExample();
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson2 = OASCreateTranscriptionResponseJson.getExample();
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson3 = new OASCreateTranscriptionResponseJson();
        OASCreateTranscriptionResponseJson createTranscriptionResponseJson4 = new OASCreateTranscriptionResponseJson();

        System.assert(createTranscriptionResponseJson1.equals(createTranscriptionResponseJson2));
        System.assert(createTranscriptionResponseJson3.equals(createTranscriptionResponseJson4));
        System.assertEquals(createTranscriptionResponseJson1.hashCode(), createTranscriptionResponseJson2.hashCode());
        System.assertEquals(createTranscriptionResponseJson3.hashCode(), createTranscriptionResponseJson4.hashCode());
    }
}
