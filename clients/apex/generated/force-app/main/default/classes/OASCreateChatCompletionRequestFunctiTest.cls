@isTest
private class OASCreateChatCompletionRequestFunctiTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall1 = OASCreateChatCompletionRequestFuncti.getExample();
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall2 = createChatCompletionRequestFunctionCall1;
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall3 = new OASCreateChatCompletionRequestFuncti();
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall4 = createChatCompletionRequestFunctionCall3;

        System.assert(createChatCompletionRequestFunctionCall1.equals(createChatCompletionRequestFunctionCall2));
        System.assert(createChatCompletionRequestFunctionCall2.equals(createChatCompletionRequestFunctionCall1));
        System.assert(createChatCompletionRequestFunctionCall1.equals(createChatCompletionRequestFunctionCall1));
        System.assert(createChatCompletionRequestFunctionCall3.equals(createChatCompletionRequestFunctionCall4));
        System.assert(createChatCompletionRequestFunctionCall4.equals(createChatCompletionRequestFunctionCall3));
        System.assert(createChatCompletionRequestFunctionCall3.equals(createChatCompletionRequestFunctionCall3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall1 = OASCreateChatCompletionRequestFuncti.getExample();
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall2 = OASCreateChatCompletionRequestFuncti.getExample();
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall3 = new OASCreateChatCompletionRequestFuncti();
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall4 = new OASCreateChatCompletionRequestFuncti();

        System.assert(createChatCompletionRequestFunctionCall1.equals(createChatCompletionRequestFunctionCall2));
        System.assert(createChatCompletionRequestFunctionCall2.equals(createChatCompletionRequestFunctionCall1));
        System.assert(createChatCompletionRequestFunctionCall3.equals(createChatCompletionRequestFunctionCall4));
        System.assert(createChatCompletionRequestFunctionCall4.equals(createChatCompletionRequestFunctionCall3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall1 = OASCreateChatCompletionRequestFuncti.getExample();
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall2 = new OASCreateChatCompletionRequestFuncti();

        System.assertEquals(false, createChatCompletionRequestFunctionCall1.equals('foo'));
        System.assertEquals(false, createChatCompletionRequestFunctionCall2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall1 = OASCreateChatCompletionRequestFuncti.getExample();
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall2 = new OASCreateChatCompletionRequestFuncti();
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall3;

        System.assertEquals(false, createChatCompletionRequestFunctionCall1.equals(createChatCompletionRequestFunctionCall3));
        System.assertEquals(false, createChatCompletionRequestFunctionCall2.equals(createChatCompletionRequestFunctionCall3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall1 = OASCreateChatCompletionRequestFuncti.getExample();
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall2 = new OASCreateChatCompletionRequestFuncti();

        System.assertEquals(createChatCompletionRequestFunctionCall1.hashCode(), createChatCompletionRequestFunctionCall1.hashCode());
        System.assertEquals(createChatCompletionRequestFunctionCall2.hashCode(), createChatCompletionRequestFunctionCall2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall1 = OASCreateChatCompletionRequestFuncti.getExample();
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall2 = OASCreateChatCompletionRequestFuncti.getExample();
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall3 = new OASCreateChatCompletionRequestFuncti();
        OASCreateChatCompletionRequestFuncti createChatCompletionRequestFunctionCall4 = new OASCreateChatCompletionRequestFuncti();

        System.assert(createChatCompletionRequestFunctionCall1.equals(createChatCompletionRequestFunctionCall2));
        System.assert(createChatCompletionRequestFunctionCall3.equals(createChatCompletionRequestFunctionCall4));
        System.assertEquals(createChatCompletionRequestFunctionCall1.hashCode(), createChatCompletionRequestFunctionCall2.hashCode());
        System.assertEquals(createChatCompletionRequestFunctionCall3.hashCode(), createChatCompletionRequestFunctionCall4.hashCode());
    }
}
