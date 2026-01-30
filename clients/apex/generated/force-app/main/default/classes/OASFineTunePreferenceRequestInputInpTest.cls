@isTest
private class OASFineTunePreferenceRequestInputInpTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput1 = OASFineTunePreferenceRequestInputInp.getExample();
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput2 = fineTunePreferenceRequestInputInput1;
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput3 = new OASFineTunePreferenceRequestInputInp();
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput4 = fineTunePreferenceRequestInputInput3;

        System.assert(fineTunePreferenceRequestInputInput1.equals(fineTunePreferenceRequestInputInput2));
        System.assert(fineTunePreferenceRequestInputInput2.equals(fineTunePreferenceRequestInputInput1));
        System.assert(fineTunePreferenceRequestInputInput1.equals(fineTunePreferenceRequestInputInput1));
        System.assert(fineTunePreferenceRequestInputInput3.equals(fineTunePreferenceRequestInputInput4));
        System.assert(fineTunePreferenceRequestInputInput4.equals(fineTunePreferenceRequestInputInput3));
        System.assert(fineTunePreferenceRequestInputInput3.equals(fineTunePreferenceRequestInputInput3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput1 = OASFineTunePreferenceRequestInputInp.getExample();
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput2 = OASFineTunePreferenceRequestInputInp.getExample();
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput3 = new OASFineTunePreferenceRequestInputInp();
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput4 = new OASFineTunePreferenceRequestInputInp();

        System.assert(fineTunePreferenceRequestInputInput1.equals(fineTunePreferenceRequestInputInput2));
        System.assert(fineTunePreferenceRequestInputInput2.equals(fineTunePreferenceRequestInputInput1));
        System.assert(fineTunePreferenceRequestInputInput3.equals(fineTunePreferenceRequestInputInput4));
        System.assert(fineTunePreferenceRequestInputInput4.equals(fineTunePreferenceRequestInputInput3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput1 = OASFineTunePreferenceRequestInputInp.getExample();
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput2 = new OASFineTunePreferenceRequestInputInp();

        System.assertEquals(false, fineTunePreferenceRequestInputInput1.equals('foo'));
        System.assertEquals(false, fineTunePreferenceRequestInputInput2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput1 = OASFineTunePreferenceRequestInputInp.getExample();
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput2 = new OASFineTunePreferenceRequestInputInp();
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput3;

        System.assertEquals(false, fineTunePreferenceRequestInputInput1.equals(fineTunePreferenceRequestInputInput3));
        System.assertEquals(false, fineTunePreferenceRequestInputInput2.equals(fineTunePreferenceRequestInputInput3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput1 = OASFineTunePreferenceRequestInputInp.getExample();
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput2 = new OASFineTunePreferenceRequestInputInp();

        System.assertEquals(fineTunePreferenceRequestInputInput1.hashCode(), fineTunePreferenceRequestInputInput1.hashCode());
        System.assertEquals(fineTunePreferenceRequestInputInput2.hashCode(), fineTunePreferenceRequestInputInput2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput1 = OASFineTunePreferenceRequestInputInp.getExample();
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput2 = OASFineTunePreferenceRequestInputInp.getExample();
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput3 = new OASFineTunePreferenceRequestInputInp();
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput4 = new OASFineTunePreferenceRequestInputInp();

        System.assert(fineTunePreferenceRequestInputInput1.equals(fineTunePreferenceRequestInputInput2));
        System.assert(fineTunePreferenceRequestInputInput3.equals(fineTunePreferenceRequestInputInput4));
        System.assertEquals(fineTunePreferenceRequestInputInput1.hashCode(), fineTunePreferenceRequestInputInput2.hashCode());
        System.assertEquals(fineTunePreferenceRequestInputInput3.hashCode(), fineTunePreferenceRequestInputInput4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput = new OASFineTunePreferenceRequestInputInp();
        Map<String, String> x-property-mappings = fineTunePreferenceRequestInputInput.getx-property-mappings();
        System.assertEquals('parallelToolCalls', x-property-mappings.get('parallel_tool_calls'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFineTunePreferenceRequestInputInp fineTunePreferenceRequestInputInput = new OASFineTunePreferenceRequestInputInp();
        System.assertEquals(new List<OASFineTuneChatRequestInputMessagesI>(), fineTunePreferenceRequestInputInput.messages);
        System.assertEquals(new List<OASChatCompletionTool>(), fineTunePreferenceRequestInputInput.tools);
        System.assertEquals(true, fineTunePreferenceRequestInputInput.parallelToolCalls);
    }
}
