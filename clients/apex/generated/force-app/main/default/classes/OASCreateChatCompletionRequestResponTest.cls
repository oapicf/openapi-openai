@isTest
private class OASCreateChatCompletionRequestResponTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat1 = OASCreateChatCompletionRequestRespon.getExample();
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat2 = createChatCompletionRequestResponseFormat1;
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat3 = new OASCreateChatCompletionRequestRespon();
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat4 = createChatCompletionRequestResponseFormat3;

        System.assert(createChatCompletionRequestResponseFormat1.equals(createChatCompletionRequestResponseFormat2));
        System.assert(createChatCompletionRequestResponseFormat2.equals(createChatCompletionRequestResponseFormat1));
        System.assert(createChatCompletionRequestResponseFormat1.equals(createChatCompletionRequestResponseFormat1));
        System.assert(createChatCompletionRequestResponseFormat3.equals(createChatCompletionRequestResponseFormat4));
        System.assert(createChatCompletionRequestResponseFormat4.equals(createChatCompletionRequestResponseFormat3));
        System.assert(createChatCompletionRequestResponseFormat3.equals(createChatCompletionRequestResponseFormat3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat1 = OASCreateChatCompletionRequestRespon.getExample();
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat2 = OASCreateChatCompletionRequestRespon.getExample();
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat3 = new OASCreateChatCompletionRequestRespon();
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat4 = new OASCreateChatCompletionRequestRespon();

        System.assert(createChatCompletionRequestResponseFormat1.equals(createChatCompletionRequestResponseFormat2));
        System.assert(createChatCompletionRequestResponseFormat2.equals(createChatCompletionRequestResponseFormat1));
        System.assert(createChatCompletionRequestResponseFormat3.equals(createChatCompletionRequestResponseFormat4));
        System.assert(createChatCompletionRequestResponseFormat4.equals(createChatCompletionRequestResponseFormat3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat1 = OASCreateChatCompletionRequestRespon.getExample();
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat2 = new OASCreateChatCompletionRequestRespon();

        System.assertEquals(false, createChatCompletionRequestResponseFormat1.equals('foo'));
        System.assertEquals(false, createChatCompletionRequestResponseFormat2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat1 = OASCreateChatCompletionRequestRespon.getExample();
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat2 = new OASCreateChatCompletionRequestRespon();
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat3;

        System.assertEquals(false, createChatCompletionRequestResponseFormat1.equals(createChatCompletionRequestResponseFormat3));
        System.assertEquals(false, createChatCompletionRequestResponseFormat2.equals(createChatCompletionRequestResponseFormat3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat1 = OASCreateChatCompletionRequestRespon.getExample();
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat2 = new OASCreateChatCompletionRequestRespon();

        System.assertEquals(createChatCompletionRequestResponseFormat1.hashCode(), createChatCompletionRequestResponseFormat1.hashCode());
        System.assertEquals(createChatCompletionRequestResponseFormat2.hashCode(), createChatCompletionRequestResponseFormat2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat1 = OASCreateChatCompletionRequestRespon.getExample();
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat2 = OASCreateChatCompletionRequestRespon.getExample();
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat3 = new OASCreateChatCompletionRequestRespon();
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat4 = new OASCreateChatCompletionRequestRespon();

        System.assert(createChatCompletionRequestResponseFormat1.equals(createChatCompletionRequestResponseFormat2));
        System.assert(createChatCompletionRequestResponseFormat3.equals(createChatCompletionRequestResponseFormat4));
        System.assertEquals(createChatCompletionRequestResponseFormat1.hashCode(), createChatCompletionRequestResponseFormat2.hashCode());
        System.assertEquals(createChatCompletionRequestResponseFormat3.hashCode(), createChatCompletionRequestResponseFormat4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateChatCompletionRequestRespon createChatCompletionRequestResponseFormat = new OASCreateChatCompletionRequestRespon();
        Map<String, String> x-property-mappings = createChatCompletionRequestResponseFormat.getx-property-mappings();
        System.assertEquals('jsonSchema', x-property-mappings.get('json_schema'));
    }
}
