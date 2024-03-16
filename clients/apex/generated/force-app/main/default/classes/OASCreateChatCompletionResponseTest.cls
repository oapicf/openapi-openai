@isTest
private class OASCreateChatCompletionResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateChatCompletionResponse createChatCompletionResponse1 = OASCreateChatCompletionResponse.getExample();
        OASCreateChatCompletionResponse createChatCompletionResponse2 = createChatCompletionResponse1;
        OASCreateChatCompletionResponse createChatCompletionResponse3 = new OASCreateChatCompletionResponse();
        OASCreateChatCompletionResponse createChatCompletionResponse4 = createChatCompletionResponse3;

        System.assert(createChatCompletionResponse1.equals(createChatCompletionResponse2));
        System.assert(createChatCompletionResponse2.equals(createChatCompletionResponse1));
        System.assert(createChatCompletionResponse1.equals(createChatCompletionResponse1));
        System.assert(createChatCompletionResponse3.equals(createChatCompletionResponse4));
        System.assert(createChatCompletionResponse4.equals(createChatCompletionResponse3));
        System.assert(createChatCompletionResponse3.equals(createChatCompletionResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateChatCompletionResponse createChatCompletionResponse1 = OASCreateChatCompletionResponse.getExample();
        OASCreateChatCompletionResponse createChatCompletionResponse2 = OASCreateChatCompletionResponse.getExample();
        OASCreateChatCompletionResponse createChatCompletionResponse3 = new OASCreateChatCompletionResponse();
        OASCreateChatCompletionResponse createChatCompletionResponse4 = new OASCreateChatCompletionResponse();

        System.assert(createChatCompletionResponse1.equals(createChatCompletionResponse2));
        System.assert(createChatCompletionResponse2.equals(createChatCompletionResponse1));
        System.assert(createChatCompletionResponse3.equals(createChatCompletionResponse4));
        System.assert(createChatCompletionResponse4.equals(createChatCompletionResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateChatCompletionResponse createChatCompletionResponse1 = OASCreateChatCompletionResponse.getExample();
        OASCreateChatCompletionResponse createChatCompletionResponse2 = new OASCreateChatCompletionResponse();

        System.assertEquals(false, createChatCompletionResponse1.equals('foo'));
        System.assertEquals(false, createChatCompletionResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateChatCompletionResponse createChatCompletionResponse1 = OASCreateChatCompletionResponse.getExample();
        OASCreateChatCompletionResponse createChatCompletionResponse2 = new OASCreateChatCompletionResponse();
        OASCreateChatCompletionResponse createChatCompletionResponse3;

        System.assertEquals(false, createChatCompletionResponse1.equals(createChatCompletionResponse3));
        System.assertEquals(false, createChatCompletionResponse2.equals(createChatCompletionResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateChatCompletionResponse createChatCompletionResponse1 = OASCreateChatCompletionResponse.getExample();
        OASCreateChatCompletionResponse createChatCompletionResponse2 = new OASCreateChatCompletionResponse();

        System.assertEquals(createChatCompletionResponse1.hashCode(), createChatCompletionResponse1.hashCode());
        System.assertEquals(createChatCompletionResponse2.hashCode(), createChatCompletionResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateChatCompletionResponse createChatCompletionResponse1 = OASCreateChatCompletionResponse.getExample();
        OASCreateChatCompletionResponse createChatCompletionResponse2 = OASCreateChatCompletionResponse.getExample();
        OASCreateChatCompletionResponse createChatCompletionResponse3 = new OASCreateChatCompletionResponse();
        OASCreateChatCompletionResponse createChatCompletionResponse4 = new OASCreateChatCompletionResponse();

        System.assert(createChatCompletionResponse1.equals(createChatCompletionResponse2));
        System.assert(createChatCompletionResponse3.equals(createChatCompletionResponse4));
        System.assertEquals(createChatCompletionResponse1.hashCode(), createChatCompletionResponse2.hashCode());
        System.assertEquals(createChatCompletionResponse3.hashCode(), createChatCompletionResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateChatCompletionResponse createChatCompletionResponse = new OASCreateChatCompletionResponse();
        Map<String, String> x-property-mappings = createChatCompletionResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateChatCompletionResponse createChatCompletionResponse = new OASCreateChatCompletionResponse();
        System.assertEquals(new List<OASCreateChatCompletionResponseChoic>(), createChatCompletionResponse.choices);
        System.assertEquals(null, createChatCompletionResponse.id);
        System.assertEquals(null, createChatCompletionResponse.r_object);
        System.assertEquals(null, createChatCompletionResponse.created);
        System.assertEquals(null, createChatCompletionResponse.model);
        System.assertEquals(null, createChatCompletionResponse.usage);
    }
}
