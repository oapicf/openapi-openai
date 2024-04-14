@isTest
private class OASCreateTranslationResponseJsonTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateTranslationResponseJson createTranslationResponseJson1 = OASCreateTranslationResponseJson.getExample();
        OASCreateTranslationResponseJson createTranslationResponseJson2 = createTranslationResponseJson1;
        OASCreateTranslationResponseJson createTranslationResponseJson3 = new OASCreateTranslationResponseJson();
        OASCreateTranslationResponseJson createTranslationResponseJson4 = createTranslationResponseJson3;

        System.assert(createTranslationResponseJson1.equals(createTranslationResponseJson2));
        System.assert(createTranslationResponseJson2.equals(createTranslationResponseJson1));
        System.assert(createTranslationResponseJson1.equals(createTranslationResponseJson1));
        System.assert(createTranslationResponseJson3.equals(createTranslationResponseJson4));
        System.assert(createTranslationResponseJson4.equals(createTranslationResponseJson3));
        System.assert(createTranslationResponseJson3.equals(createTranslationResponseJson3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateTranslationResponseJson createTranslationResponseJson1 = OASCreateTranslationResponseJson.getExample();
        OASCreateTranslationResponseJson createTranslationResponseJson2 = OASCreateTranslationResponseJson.getExample();
        OASCreateTranslationResponseJson createTranslationResponseJson3 = new OASCreateTranslationResponseJson();
        OASCreateTranslationResponseJson createTranslationResponseJson4 = new OASCreateTranslationResponseJson();

        System.assert(createTranslationResponseJson1.equals(createTranslationResponseJson2));
        System.assert(createTranslationResponseJson2.equals(createTranslationResponseJson1));
        System.assert(createTranslationResponseJson3.equals(createTranslationResponseJson4));
        System.assert(createTranslationResponseJson4.equals(createTranslationResponseJson3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateTranslationResponseJson createTranslationResponseJson1 = OASCreateTranslationResponseJson.getExample();
        OASCreateTranslationResponseJson createTranslationResponseJson2 = new OASCreateTranslationResponseJson();

        System.assertEquals(false, createTranslationResponseJson1.equals('foo'));
        System.assertEquals(false, createTranslationResponseJson2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateTranslationResponseJson createTranslationResponseJson1 = OASCreateTranslationResponseJson.getExample();
        OASCreateTranslationResponseJson createTranslationResponseJson2 = new OASCreateTranslationResponseJson();
        OASCreateTranslationResponseJson createTranslationResponseJson3;

        System.assertEquals(false, createTranslationResponseJson1.equals(createTranslationResponseJson3));
        System.assertEquals(false, createTranslationResponseJson2.equals(createTranslationResponseJson3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateTranslationResponseJson createTranslationResponseJson1 = OASCreateTranslationResponseJson.getExample();
        OASCreateTranslationResponseJson createTranslationResponseJson2 = new OASCreateTranslationResponseJson();

        System.assertEquals(createTranslationResponseJson1.hashCode(), createTranslationResponseJson1.hashCode());
        System.assertEquals(createTranslationResponseJson2.hashCode(), createTranslationResponseJson2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateTranslationResponseJson createTranslationResponseJson1 = OASCreateTranslationResponseJson.getExample();
        OASCreateTranslationResponseJson createTranslationResponseJson2 = OASCreateTranslationResponseJson.getExample();
        OASCreateTranslationResponseJson createTranslationResponseJson3 = new OASCreateTranslationResponseJson();
        OASCreateTranslationResponseJson createTranslationResponseJson4 = new OASCreateTranslationResponseJson();

        System.assert(createTranslationResponseJson1.equals(createTranslationResponseJson2));
        System.assert(createTranslationResponseJson3.equals(createTranslationResponseJson4));
        System.assertEquals(createTranslationResponseJson1.hashCode(), createTranslationResponseJson2.hashCode());
        System.assertEquals(createTranslationResponseJson3.hashCode(), createTranslationResponseJson4.hashCode());
    }
}
