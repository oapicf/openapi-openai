@isTest
private class OASChatCompletionTokenLogprobTopLogpTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner1 = OASChatCompletionTokenLogprobTopLogp.getExample();
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner2 = chatCompletionTokenLogprobTopLogprobsInner1;
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner3 = new OASChatCompletionTokenLogprobTopLogp();
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner4 = chatCompletionTokenLogprobTopLogprobsInner3;

        System.assert(chatCompletionTokenLogprobTopLogprobsInner1.equals(chatCompletionTokenLogprobTopLogprobsInner2));
        System.assert(chatCompletionTokenLogprobTopLogprobsInner2.equals(chatCompletionTokenLogprobTopLogprobsInner1));
        System.assert(chatCompletionTokenLogprobTopLogprobsInner1.equals(chatCompletionTokenLogprobTopLogprobsInner1));
        System.assert(chatCompletionTokenLogprobTopLogprobsInner3.equals(chatCompletionTokenLogprobTopLogprobsInner4));
        System.assert(chatCompletionTokenLogprobTopLogprobsInner4.equals(chatCompletionTokenLogprobTopLogprobsInner3));
        System.assert(chatCompletionTokenLogprobTopLogprobsInner3.equals(chatCompletionTokenLogprobTopLogprobsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner1 = OASChatCompletionTokenLogprobTopLogp.getExample();
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner2 = OASChatCompletionTokenLogprobTopLogp.getExample();
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner3 = new OASChatCompletionTokenLogprobTopLogp();
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner4 = new OASChatCompletionTokenLogprobTopLogp();

        System.assert(chatCompletionTokenLogprobTopLogprobsInner1.equals(chatCompletionTokenLogprobTopLogprobsInner2));
        System.assert(chatCompletionTokenLogprobTopLogprobsInner2.equals(chatCompletionTokenLogprobTopLogprobsInner1));
        System.assert(chatCompletionTokenLogprobTopLogprobsInner3.equals(chatCompletionTokenLogprobTopLogprobsInner4));
        System.assert(chatCompletionTokenLogprobTopLogprobsInner4.equals(chatCompletionTokenLogprobTopLogprobsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner1 = OASChatCompletionTokenLogprobTopLogp.getExample();
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner2 = new OASChatCompletionTokenLogprobTopLogp();

        System.assertEquals(false, chatCompletionTokenLogprobTopLogprobsInner1.equals('foo'));
        System.assertEquals(false, chatCompletionTokenLogprobTopLogprobsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner1 = OASChatCompletionTokenLogprobTopLogp.getExample();
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner2 = new OASChatCompletionTokenLogprobTopLogp();
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner3;

        System.assertEquals(false, chatCompletionTokenLogprobTopLogprobsInner1.equals(chatCompletionTokenLogprobTopLogprobsInner3));
        System.assertEquals(false, chatCompletionTokenLogprobTopLogprobsInner2.equals(chatCompletionTokenLogprobTopLogprobsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner1 = OASChatCompletionTokenLogprobTopLogp.getExample();
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner2 = new OASChatCompletionTokenLogprobTopLogp();

        System.assertEquals(chatCompletionTokenLogprobTopLogprobsInner1.hashCode(), chatCompletionTokenLogprobTopLogprobsInner1.hashCode());
        System.assertEquals(chatCompletionTokenLogprobTopLogprobsInner2.hashCode(), chatCompletionTokenLogprobTopLogprobsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner1 = OASChatCompletionTokenLogprobTopLogp.getExample();
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner2 = OASChatCompletionTokenLogprobTopLogp.getExample();
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner3 = new OASChatCompletionTokenLogprobTopLogp();
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner4 = new OASChatCompletionTokenLogprobTopLogp();

        System.assert(chatCompletionTokenLogprobTopLogprobsInner1.equals(chatCompletionTokenLogprobTopLogprobsInner2));
        System.assert(chatCompletionTokenLogprobTopLogprobsInner3.equals(chatCompletionTokenLogprobTopLogprobsInner4));
        System.assertEquals(chatCompletionTokenLogprobTopLogprobsInner1.hashCode(), chatCompletionTokenLogprobTopLogprobsInner2.hashCode());
        System.assertEquals(chatCompletionTokenLogprobTopLogprobsInner3.hashCode(), chatCompletionTokenLogprobTopLogprobsInner4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASChatCompletionTokenLogprobTopLogp chatCompletionTokenLogprobTopLogprobsInner = new OASChatCompletionTokenLogprobTopLogp();
        System.assertEquals(new List<Integer>(), chatCompletionTokenLogprobTopLogprobsInner.bytes);
        System.assertEquals(null, chatCompletionTokenLogprobTopLogprobsInner.token);
        System.assertEquals(null, chatCompletionTokenLogprobTopLogprobsInner.logprob);
    }
}
