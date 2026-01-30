@isTest
private class OASFineTuneChatRequestInputTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuneChatRequestInput fineTuneChatRequestInput1 = OASFineTuneChatRequestInput.getExample();
        OASFineTuneChatRequestInput fineTuneChatRequestInput2 = fineTuneChatRequestInput1;
        OASFineTuneChatRequestInput fineTuneChatRequestInput3 = new OASFineTuneChatRequestInput();
        OASFineTuneChatRequestInput fineTuneChatRequestInput4 = fineTuneChatRequestInput3;

        System.assert(fineTuneChatRequestInput1.equals(fineTuneChatRequestInput2));
        System.assert(fineTuneChatRequestInput2.equals(fineTuneChatRequestInput1));
        System.assert(fineTuneChatRequestInput1.equals(fineTuneChatRequestInput1));
        System.assert(fineTuneChatRequestInput3.equals(fineTuneChatRequestInput4));
        System.assert(fineTuneChatRequestInput4.equals(fineTuneChatRequestInput3));
        System.assert(fineTuneChatRequestInput3.equals(fineTuneChatRequestInput3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuneChatRequestInput fineTuneChatRequestInput1 = OASFineTuneChatRequestInput.getExample();
        OASFineTuneChatRequestInput fineTuneChatRequestInput2 = OASFineTuneChatRequestInput.getExample();
        OASFineTuneChatRequestInput fineTuneChatRequestInput3 = new OASFineTuneChatRequestInput();
        OASFineTuneChatRequestInput fineTuneChatRequestInput4 = new OASFineTuneChatRequestInput();

        System.assert(fineTuneChatRequestInput1.equals(fineTuneChatRequestInput2));
        System.assert(fineTuneChatRequestInput2.equals(fineTuneChatRequestInput1));
        System.assert(fineTuneChatRequestInput3.equals(fineTuneChatRequestInput4));
        System.assert(fineTuneChatRequestInput4.equals(fineTuneChatRequestInput3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuneChatRequestInput fineTuneChatRequestInput1 = OASFineTuneChatRequestInput.getExample();
        OASFineTuneChatRequestInput fineTuneChatRequestInput2 = new OASFineTuneChatRequestInput();

        System.assertEquals(false, fineTuneChatRequestInput1.equals('foo'));
        System.assertEquals(false, fineTuneChatRequestInput2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuneChatRequestInput fineTuneChatRequestInput1 = OASFineTuneChatRequestInput.getExample();
        OASFineTuneChatRequestInput fineTuneChatRequestInput2 = new OASFineTuneChatRequestInput();
        OASFineTuneChatRequestInput fineTuneChatRequestInput3;

        System.assertEquals(false, fineTuneChatRequestInput1.equals(fineTuneChatRequestInput3));
        System.assertEquals(false, fineTuneChatRequestInput2.equals(fineTuneChatRequestInput3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuneChatRequestInput fineTuneChatRequestInput1 = OASFineTuneChatRequestInput.getExample();
        OASFineTuneChatRequestInput fineTuneChatRequestInput2 = new OASFineTuneChatRequestInput();

        System.assertEquals(fineTuneChatRequestInput1.hashCode(), fineTuneChatRequestInput1.hashCode());
        System.assertEquals(fineTuneChatRequestInput2.hashCode(), fineTuneChatRequestInput2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuneChatRequestInput fineTuneChatRequestInput1 = OASFineTuneChatRequestInput.getExample();
        OASFineTuneChatRequestInput fineTuneChatRequestInput2 = OASFineTuneChatRequestInput.getExample();
        OASFineTuneChatRequestInput fineTuneChatRequestInput3 = new OASFineTuneChatRequestInput();
        OASFineTuneChatRequestInput fineTuneChatRequestInput4 = new OASFineTuneChatRequestInput();

        System.assert(fineTuneChatRequestInput1.equals(fineTuneChatRequestInput2));
        System.assert(fineTuneChatRequestInput3.equals(fineTuneChatRequestInput4));
        System.assertEquals(fineTuneChatRequestInput1.hashCode(), fineTuneChatRequestInput2.hashCode());
        System.assertEquals(fineTuneChatRequestInput3.hashCode(), fineTuneChatRequestInput4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFineTuneChatRequestInput fineTuneChatRequestInput = new OASFineTuneChatRequestInput();
        Map<String, String> x-property-mappings = fineTuneChatRequestInput.getx-property-mappings();
        System.assertEquals('parallelToolCalls', x-property-mappings.get('parallel_tool_calls'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFineTuneChatRequestInput fineTuneChatRequestInput = new OASFineTuneChatRequestInput();
        System.assertEquals(new List<OASFineTuneChatRequestInputMessagesI>(), fineTuneChatRequestInput.messages);
        System.assertEquals(new List<OASChatCompletionTool>(), fineTuneChatRequestInput.tools);
        System.assertEquals(true, fineTuneChatRequestInput.parallelToolCalls);
        System.assertEquals(new List<OASChatCompletionFunctions>(), fineTuneChatRequestInput.functions);
    }
}
