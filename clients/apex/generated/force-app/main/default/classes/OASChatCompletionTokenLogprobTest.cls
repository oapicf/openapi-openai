@isTest
private class OASChatCompletionTokenLogprobTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob1 = OASChatCompletionTokenLogprob.getExample();
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob2 = chatCompletionTokenLogprob1;
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob3 = new OASChatCompletionTokenLogprob();
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob4 = chatCompletionTokenLogprob3;

        System.assert(chatCompletionTokenLogprob1.equals(chatCompletionTokenLogprob2));
        System.assert(chatCompletionTokenLogprob2.equals(chatCompletionTokenLogprob1));
        System.assert(chatCompletionTokenLogprob1.equals(chatCompletionTokenLogprob1));
        System.assert(chatCompletionTokenLogprob3.equals(chatCompletionTokenLogprob4));
        System.assert(chatCompletionTokenLogprob4.equals(chatCompletionTokenLogprob3));
        System.assert(chatCompletionTokenLogprob3.equals(chatCompletionTokenLogprob3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob1 = OASChatCompletionTokenLogprob.getExample();
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob2 = OASChatCompletionTokenLogprob.getExample();
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob3 = new OASChatCompletionTokenLogprob();
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob4 = new OASChatCompletionTokenLogprob();

        System.assert(chatCompletionTokenLogprob1.equals(chatCompletionTokenLogprob2));
        System.assert(chatCompletionTokenLogprob2.equals(chatCompletionTokenLogprob1));
        System.assert(chatCompletionTokenLogprob3.equals(chatCompletionTokenLogprob4));
        System.assert(chatCompletionTokenLogprob4.equals(chatCompletionTokenLogprob3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob1 = OASChatCompletionTokenLogprob.getExample();
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob2 = new OASChatCompletionTokenLogprob();

        System.assertEquals(false, chatCompletionTokenLogprob1.equals('foo'));
        System.assertEquals(false, chatCompletionTokenLogprob2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob1 = OASChatCompletionTokenLogprob.getExample();
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob2 = new OASChatCompletionTokenLogprob();
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob3;

        System.assertEquals(false, chatCompletionTokenLogprob1.equals(chatCompletionTokenLogprob3));
        System.assertEquals(false, chatCompletionTokenLogprob2.equals(chatCompletionTokenLogprob3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob1 = OASChatCompletionTokenLogprob.getExample();
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob2 = new OASChatCompletionTokenLogprob();

        System.assertEquals(chatCompletionTokenLogprob1.hashCode(), chatCompletionTokenLogprob1.hashCode());
        System.assertEquals(chatCompletionTokenLogprob2.hashCode(), chatCompletionTokenLogprob2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob1 = OASChatCompletionTokenLogprob.getExample();
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob2 = OASChatCompletionTokenLogprob.getExample();
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob3 = new OASChatCompletionTokenLogprob();
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob4 = new OASChatCompletionTokenLogprob();

        System.assert(chatCompletionTokenLogprob1.equals(chatCompletionTokenLogprob2));
        System.assert(chatCompletionTokenLogprob3.equals(chatCompletionTokenLogprob4));
        System.assertEquals(chatCompletionTokenLogprob1.hashCode(), chatCompletionTokenLogprob2.hashCode());
        System.assertEquals(chatCompletionTokenLogprob3.hashCode(), chatCompletionTokenLogprob4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob = new OASChatCompletionTokenLogprob();
        Map<String, String> x-property-mappings = chatCompletionTokenLogprob.getx-property-mappings();
        System.assertEquals('topLogprobs', x-property-mappings.get('top_logprobs'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASChatCompletionTokenLogprob chatCompletionTokenLogprob = new OASChatCompletionTokenLogprob();
        System.assertEquals(new List<Integer>(), chatCompletionTokenLogprob.bytes);
        System.assertEquals(new List<OASChatCompletionTokenLogprobTopLogp>(), chatCompletionTokenLogprob.topLogprobs);
        System.assertEquals(null, chatCompletionTokenLogprob.token);
        System.assertEquals(null, chatCompletionTokenLogprob.logprob);
    }
}
