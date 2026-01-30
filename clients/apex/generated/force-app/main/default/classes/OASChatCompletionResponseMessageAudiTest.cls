@isTest
private class OASChatCompletionResponseMessageAudiTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio1 = OASChatCompletionResponseMessageAudi.getExample();
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio2 = chatCompletionResponseMessageAudio1;
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio3 = new OASChatCompletionResponseMessageAudi();
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio4 = chatCompletionResponseMessageAudio3;

        System.assert(chatCompletionResponseMessageAudio1.equals(chatCompletionResponseMessageAudio2));
        System.assert(chatCompletionResponseMessageAudio2.equals(chatCompletionResponseMessageAudio1));
        System.assert(chatCompletionResponseMessageAudio1.equals(chatCompletionResponseMessageAudio1));
        System.assert(chatCompletionResponseMessageAudio3.equals(chatCompletionResponseMessageAudio4));
        System.assert(chatCompletionResponseMessageAudio4.equals(chatCompletionResponseMessageAudio3));
        System.assert(chatCompletionResponseMessageAudio3.equals(chatCompletionResponseMessageAudio3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio1 = OASChatCompletionResponseMessageAudi.getExample();
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio2 = OASChatCompletionResponseMessageAudi.getExample();
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio3 = new OASChatCompletionResponseMessageAudi();
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio4 = new OASChatCompletionResponseMessageAudi();

        System.assert(chatCompletionResponseMessageAudio1.equals(chatCompletionResponseMessageAudio2));
        System.assert(chatCompletionResponseMessageAudio2.equals(chatCompletionResponseMessageAudio1));
        System.assert(chatCompletionResponseMessageAudio3.equals(chatCompletionResponseMessageAudio4));
        System.assert(chatCompletionResponseMessageAudio4.equals(chatCompletionResponseMessageAudio3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio1 = OASChatCompletionResponseMessageAudi.getExample();
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio2 = new OASChatCompletionResponseMessageAudi();

        System.assertEquals(false, chatCompletionResponseMessageAudio1.equals('foo'));
        System.assertEquals(false, chatCompletionResponseMessageAudio2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio1 = OASChatCompletionResponseMessageAudi.getExample();
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio2 = new OASChatCompletionResponseMessageAudi();
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio3;

        System.assertEquals(false, chatCompletionResponseMessageAudio1.equals(chatCompletionResponseMessageAudio3));
        System.assertEquals(false, chatCompletionResponseMessageAudio2.equals(chatCompletionResponseMessageAudio3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio1 = OASChatCompletionResponseMessageAudi.getExample();
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio2 = new OASChatCompletionResponseMessageAudi();

        System.assertEquals(chatCompletionResponseMessageAudio1.hashCode(), chatCompletionResponseMessageAudio1.hashCode());
        System.assertEquals(chatCompletionResponseMessageAudio2.hashCode(), chatCompletionResponseMessageAudio2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio1 = OASChatCompletionResponseMessageAudi.getExample();
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio2 = OASChatCompletionResponseMessageAudi.getExample();
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio3 = new OASChatCompletionResponseMessageAudi();
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio4 = new OASChatCompletionResponseMessageAudi();

        System.assert(chatCompletionResponseMessageAudio1.equals(chatCompletionResponseMessageAudio2));
        System.assert(chatCompletionResponseMessageAudio3.equals(chatCompletionResponseMessageAudio4));
        System.assertEquals(chatCompletionResponseMessageAudio1.hashCode(), chatCompletionResponseMessageAudio2.hashCode());
        System.assertEquals(chatCompletionResponseMessageAudio3.hashCode(), chatCompletionResponseMessageAudio4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASChatCompletionResponseMessageAudi chatCompletionResponseMessageAudio = new OASChatCompletionResponseMessageAudi();
        Map<String, String> x-property-mappings = chatCompletionResponseMessageAudio.getx-property-mappings();
        System.assertEquals('expiresAt', x-property-mappings.get('expires_at'));
    }
}
