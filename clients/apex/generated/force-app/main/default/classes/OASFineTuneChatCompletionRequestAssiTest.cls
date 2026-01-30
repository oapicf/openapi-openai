@isTest
private class OASFineTuneChatCompletionRequestAssiTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage1 = OASFineTuneChatCompletionRequestAssi.getExample();
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage2 = fineTuneChatCompletionRequestAssistantMessage1;
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage3 = new OASFineTuneChatCompletionRequestAssi();
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage4 = fineTuneChatCompletionRequestAssistantMessage3;

        System.assert(fineTuneChatCompletionRequestAssistantMessage1.equals(fineTuneChatCompletionRequestAssistantMessage2));
        System.assert(fineTuneChatCompletionRequestAssistantMessage2.equals(fineTuneChatCompletionRequestAssistantMessage1));
        System.assert(fineTuneChatCompletionRequestAssistantMessage1.equals(fineTuneChatCompletionRequestAssistantMessage1));
        System.assert(fineTuneChatCompletionRequestAssistantMessage3.equals(fineTuneChatCompletionRequestAssistantMessage4));
        System.assert(fineTuneChatCompletionRequestAssistantMessage4.equals(fineTuneChatCompletionRequestAssistantMessage3));
        System.assert(fineTuneChatCompletionRequestAssistantMessage3.equals(fineTuneChatCompletionRequestAssistantMessage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage1 = OASFineTuneChatCompletionRequestAssi.getExample();
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage2 = OASFineTuneChatCompletionRequestAssi.getExample();
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage3 = new OASFineTuneChatCompletionRequestAssi();
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage4 = new OASFineTuneChatCompletionRequestAssi();

        System.assert(fineTuneChatCompletionRequestAssistantMessage1.equals(fineTuneChatCompletionRequestAssistantMessage2));
        System.assert(fineTuneChatCompletionRequestAssistantMessage2.equals(fineTuneChatCompletionRequestAssistantMessage1));
        System.assert(fineTuneChatCompletionRequestAssistantMessage3.equals(fineTuneChatCompletionRequestAssistantMessage4));
        System.assert(fineTuneChatCompletionRequestAssistantMessage4.equals(fineTuneChatCompletionRequestAssistantMessage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage1 = OASFineTuneChatCompletionRequestAssi.getExample();
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage2 = new OASFineTuneChatCompletionRequestAssi();

        System.assertEquals(false, fineTuneChatCompletionRequestAssistantMessage1.equals('foo'));
        System.assertEquals(false, fineTuneChatCompletionRequestAssistantMessage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage1 = OASFineTuneChatCompletionRequestAssi.getExample();
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage2 = new OASFineTuneChatCompletionRequestAssi();
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage3;

        System.assertEquals(false, fineTuneChatCompletionRequestAssistantMessage1.equals(fineTuneChatCompletionRequestAssistantMessage3));
        System.assertEquals(false, fineTuneChatCompletionRequestAssistantMessage2.equals(fineTuneChatCompletionRequestAssistantMessage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage1 = OASFineTuneChatCompletionRequestAssi.getExample();
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage2 = new OASFineTuneChatCompletionRequestAssi();

        System.assertEquals(fineTuneChatCompletionRequestAssistantMessage1.hashCode(), fineTuneChatCompletionRequestAssistantMessage1.hashCode());
        System.assertEquals(fineTuneChatCompletionRequestAssistantMessage2.hashCode(), fineTuneChatCompletionRequestAssistantMessage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage1 = OASFineTuneChatCompletionRequestAssi.getExample();
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage2 = OASFineTuneChatCompletionRequestAssi.getExample();
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage3 = new OASFineTuneChatCompletionRequestAssi();
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage4 = new OASFineTuneChatCompletionRequestAssi();

        System.assert(fineTuneChatCompletionRequestAssistantMessage1.equals(fineTuneChatCompletionRequestAssistantMessage2));
        System.assert(fineTuneChatCompletionRequestAssistantMessage3.equals(fineTuneChatCompletionRequestAssistantMessage4));
        System.assertEquals(fineTuneChatCompletionRequestAssistantMessage1.hashCode(), fineTuneChatCompletionRequestAssistantMessage2.hashCode());
        System.assertEquals(fineTuneChatCompletionRequestAssistantMessage3.hashCode(), fineTuneChatCompletionRequestAssistantMessage4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage = new OASFineTuneChatCompletionRequestAssi();
        Map<String, String> x-property-mappings = fineTuneChatCompletionRequestAssistantMessage.getx-property-mappings();
        System.assertEquals('toolCalls', x-property-mappings.get('tool_calls'));
        System.assertEquals('functionCall', x-property-mappings.get('function_call'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFineTuneChatCompletionRequestAssi fineTuneChatCompletionRequestAssistantMessage = new OASFineTuneChatCompletionRequestAssi();
        System.assertEquals(new List<OASChatCompletionMessageToolCall>(), fineTuneChatCompletionRequestAssistantMessage.toolCalls);
        System.assertEquals(null, fineTuneChatCompletionRequestAssistantMessage.content);
        System.assertEquals(null, fineTuneChatCompletionRequestAssistantMessage.refusal);
        System.assertEquals(null, fineTuneChatCompletionRequestAssistantMessage.role);
        System.assertEquals(null, fineTuneChatCompletionRequestAssistantMessage.name);
        System.assertEquals(null, fineTuneChatCompletionRequestAssistantMessage.audio);
        System.assertEquals(null, fineTuneChatCompletionRequestAssistantMessage.functionCall);
        System.assertEquals(null, fineTuneChatCompletionRequestAssistantMessage.weight);
    }
}
