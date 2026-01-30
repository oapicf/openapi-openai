@isTest
private class OASCreateChatCompletionRequestAudioTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio1 = OASCreateChatCompletionRequestAudio.getExample();
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio2 = createChatCompletionRequestAudio1;
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio3 = new OASCreateChatCompletionRequestAudio();
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio4 = createChatCompletionRequestAudio3;

        System.assert(createChatCompletionRequestAudio1.equals(createChatCompletionRequestAudio2));
        System.assert(createChatCompletionRequestAudio2.equals(createChatCompletionRequestAudio1));
        System.assert(createChatCompletionRequestAudio1.equals(createChatCompletionRequestAudio1));
        System.assert(createChatCompletionRequestAudio3.equals(createChatCompletionRequestAudio4));
        System.assert(createChatCompletionRequestAudio4.equals(createChatCompletionRequestAudio3));
        System.assert(createChatCompletionRequestAudio3.equals(createChatCompletionRequestAudio3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio1 = OASCreateChatCompletionRequestAudio.getExample();
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio2 = OASCreateChatCompletionRequestAudio.getExample();
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio3 = new OASCreateChatCompletionRequestAudio();
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio4 = new OASCreateChatCompletionRequestAudio();

        System.assert(createChatCompletionRequestAudio1.equals(createChatCompletionRequestAudio2));
        System.assert(createChatCompletionRequestAudio2.equals(createChatCompletionRequestAudio1));
        System.assert(createChatCompletionRequestAudio3.equals(createChatCompletionRequestAudio4));
        System.assert(createChatCompletionRequestAudio4.equals(createChatCompletionRequestAudio3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio1 = OASCreateChatCompletionRequestAudio.getExample();
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio2 = new OASCreateChatCompletionRequestAudio();

        System.assertEquals(false, createChatCompletionRequestAudio1.equals('foo'));
        System.assertEquals(false, createChatCompletionRequestAudio2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio1 = OASCreateChatCompletionRequestAudio.getExample();
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio2 = new OASCreateChatCompletionRequestAudio();
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio3;

        System.assertEquals(false, createChatCompletionRequestAudio1.equals(createChatCompletionRequestAudio3));
        System.assertEquals(false, createChatCompletionRequestAudio2.equals(createChatCompletionRequestAudio3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio1 = OASCreateChatCompletionRequestAudio.getExample();
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio2 = new OASCreateChatCompletionRequestAudio();

        System.assertEquals(createChatCompletionRequestAudio1.hashCode(), createChatCompletionRequestAudio1.hashCode());
        System.assertEquals(createChatCompletionRequestAudio2.hashCode(), createChatCompletionRequestAudio2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio1 = OASCreateChatCompletionRequestAudio.getExample();
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio2 = OASCreateChatCompletionRequestAudio.getExample();
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio3 = new OASCreateChatCompletionRequestAudio();
        OASCreateChatCompletionRequestAudio createChatCompletionRequestAudio4 = new OASCreateChatCompletionRequestAudio();

        System.assert(createChatCompletionRequestAudio1.equals(createChatCompletionRequestAudio2));
        System.assert(createChatCompletionRequestAudio3.equals(createChatCompletionRequestAudio4));
        System.assertEquals(createChatCompletionRequestAudio1.hashCode(), createChatCompletionRequestAudio2.hashCode());
        System.assertEquals(createChatCompletionRequestAudio3.hashCode(), createChatCompletionRequestAudio4.hashCode());
    }
}
