@isTest
private class OASChatCompletionToolTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionTool chatCompletionTool1 = OASChatCompletionTool.getExample();
        OASChatCompletionTool chatCompletionTool2 = chatCompletionTool1;
        OASChatCompletionTool chatCompletionTool3 = new OASChatCompletionTool();
        OASChatCompletionTool chatCompletionTool4 = chatCompletionTool3;

        System.assert(chatCompletionTool1.equals(chatCompletionTool2));
        System.assert(chatCompletionTool2.equals(chatCompletionTool1));
        System.assert(chatCompletionTool1.equals(chatCompletionTool1));
        System.assert(chatCompletionTool3.equals(chatCompletionTool4));
        System.assert(chatCompletionTool4.equals(chatCompletionTool3));
        System.assert(chatCompletionTool3.equals(chatCompletionTool3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionTool chatCompletionTool1 = OASChatCompletionTool.getExample();
        OASChatCompletionTool chatCompletionTool2 = OASChatCompletionTool.getExample();
        OASChatCompletionTool chatCompletionTool3 = new OASChatCompletionTool();
        OASChatCompletionTool chatCompletionTool4 = new OASChatCompletionTool();

        System.assert(chatCompletionTool1.equals(chatCompletionTool2));
        System.assert(chatCompletionTool2.equals(chatCompletionTool1));
        System.assert(chatCompletionTool3.equals(chatCompletionTool4));
        System.assert(chatCompletionTool4.equals(chatCompletionTool3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionTool chatCompletionTool1 = OASChatCompletionTool.getExample();
        OASChatCompletionTool chatCompletionTool2 = new OASChatCompletionTool();

        System.assertEquals(false, chatCompletionTool1.equals('foo'));
        System.assertEquals(false, chatCompletionTool2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionTool chatCompletionTool1 = OASChatCompletionTool.getExample();
        OASChatCompletionTool chatCompletionTool2 = new OASChatCompletionTool();
        OASChatCompletionTool chatCompletionTool3;

        System.assertEquals(false, chatCompletionTool1.equals(chatCompletionTool3));
        System.assertEquals(false, chatCompletionTool2.equals(chatCompletionTool3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionTool chatCompletionTool1 = OASChatCompletionTool.getExample();
        OASChatCompletionTool chatCompletionTool2 = new OASChatCompletionTool();

        System.assertEquals(chatCompletionTool1.hashCode(), chatCompletionTool1.hashCode());
        System.assertEquals(chatCompletionTool2.hashCode(), chatCompletionTool2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionTool chatCompletionTool1 = OASChatCompletionTool.getExample();
        OASChatCompletionTool chatCompletionTool2 = OASChatCompletionTool.getExample();
        OASChatCompletionTool chatCompletionTool3 = new OASChatCompletionTool();
        OASChatCompletionTool chatCompletionTool4 = new OASChatCompletionTool();

        System.assert(chatCompletionTool1.equals(chatCompletionTool2));
        System.assert(chatCompletionTool3.equals(chatCompletionTool4));
        System.assertEquals(chatCompletionTool1.hashCode(), chatCompletionTool2.hashCode());
        System.assertEquals(chatCompletionTool3.hashCode(), chatCompletionTool4.hashCode());
    }
}
