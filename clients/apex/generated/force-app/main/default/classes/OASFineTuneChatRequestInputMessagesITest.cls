@isTest
private class OASFineTuneChatRequestInputMessagesITest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner1 = OASFineTuneChatRequestInputMessagesI.getExample();
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner2 = fineTuneChatRequestInputMessagesInner1;
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner3 = new OASFineTuneChatRequestInputMessagesI();
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner4 = fineTuneChatRequestInputMessagesInner3;

        System.assert(fineTuneChatRequestInputMessagesInner1.equals(fineTuneChatRequestInputMessagesInner2));
        System.assert(fineTuneChatRequestInputMessagesInner2.equals(fineTuneChatRequestInputMessagesInner1));
        System.assert(fineTuneChatRequestInputMessagesInner1.equals(fineTuneChatRequestInputMessagesInner1));
        System.assert(fineTuneChatRequestInputMessagesInner3.equals(fineTuneChatRequestInputMessagesInner4));
        System.assert(fineTuneChatRequestInputMessagesInner4.equals(fineTuneChatRequestInputMessagesInner3));
        System.assert(fineTuneChatRequestInputMessagesInner3.equals(fineTuneChatRequestInputMessagesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner1 = OASFineTuneChatRequestInputMessagesI.getExample();
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner2 = OASFineTuneChatRequestInputMessagesI.getExample();
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner3 = new OASFineTuneChatRequestInputMessagesI();
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner4 = new OASFineTuneChatRequestInputMessagesI();

        System.assert(fineTuneChatRequestInputMessagesInner1.equals(fineTuneChatRequestInputMessagesInner2));
        System.assert(fineTuneChatRequestInputMessagesInner2.equals(fineTuneChatRequestInputMessagesInner1));
        System.assert(fineTuneChatRequestInputMessagesInner3.equals(fineTuneChatRequestInputMessagesInner4));
        System.assert(fineTuneChatRequestInputMessagesInner4.equals(fineTuneChatRequestInputMessagesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner1 = OASFineTuneChatRequestInputMessagesI.getExample();
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner2 = new OASFineTuneChatRequestInputMessagesI();

        System.assertEquals(false, fineTuneChatRequestInputMessagesInner1.equals('foo'));
        System.assertEquals(false, fineTuneChatRequestInputMessagesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner1 = OASFineTuneChatRequestInputMessagesI.getExample();
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner2 = new OASFineTuneChatRequestInputMessagesI();
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner3;

        System.assertEquals(false, fineTuneChatRequestInputMessagesInner1.equals(fineTuneChatRequestInputMessagesInner3));
        System.assertEquals(false, fineTuneChatRequestInputMessagesInner2.equals(fineTuneChatRequestInputMessagesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner1 = OASFineTuneChatRequestInputMessagesI.getExample();
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner2 = new OASFineTuneChatRequestInputMessagesI();

        System.assertEquals(fineTuneChatRequestInputMessagesInner1.hashCode(), fineTuneChatRequestInputMessagesInner1.hashCode());
        System.assertEquals(fineTuneChatRequestInputMessagesInner2.hashCode(), fineTuneChatRequestInputMessagesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner1 = OASFineTuneChatRequestInputMessagesI.getExample();
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner2 = OASFineTuneChatRequestInputMessagesI.getExample();
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner3 = new OASFineTuneChatRequestInputMessagesI();
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner4 = new OASFineTuneChatRequestInputMessagesI();

        System.assert(fineTuneChatRequestInputMessagesInner1.equals(fineTuneChatRequestInputMessagesInner2));
        System.assert(fineTuneChatRequestInputMessagesInner3.equals(fineTuneChatRequestInputMessagesInner4));
        System.assertEquals(fineTuneChatRequestInputMessagesInner1.hashCode(), fineTuneChatRequestInputMessagesInner2.hashCode());
        System.assertEquals(fineTuneChatRequestInputMessagesInner3.hashCode(), fineTuneChatRequestInputMessagesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner = new OASFineTuneChatRequestInputMessagesI();
        Map<String, String> x-property-mappings = fineTuneChatRequestInputMessagesInner.getx-property-mappings();
        System.assertEquals('toolCalls', x-property-mappings.get('tool_calls'));
        System.assertEquals('functionCall', x-property-mappings.get('function_call'));
        System.assertEquals('toolCallId', x-property-mappings.get('tool_call_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFineTuneChatRequestInputMessagesI fineTuneChatRequestInputMessagesInner = new OASFineTuneChatRequestInputMessagesI();
        System.assertEquals(new List<OASChatCompletionMessageToolCall>(), fineTuneChatRequestInputMessagesInner.toolCalls);
        System.assertEquals(null, fineTuneChatRequestInputMessagesInner.content);
        System.assertEquals(null, fineTuneChatRequestInputMessagesInner.role);
        System.assertEquals(null, fineTuneChatRequestInputMessagesInner.name);
        System.assertEquals(null, fineTuneChatRequestInputMessagesInner.weight);
        System.assertEquals(null, fineTuneChatRequestInputMessagesInner.refusal);
        System.assertEquals(null, fineTuneChatRequestInputMessagesInner.audio);
        System.assertEquals(null, fineTuneChatRequestInputMessagesInner.functionCall);
        System.assertEquals(null, fineTuneChatRequestInputMessagesInner.toolCallId);
    }
}
