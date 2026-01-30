@isTest
private class OASFineTunePreferenceRequestInputPreTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner1 = OASFineTunePreferenceRequestInputPre.getExample();
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner2 = fineTunePreferenceRequestInputPreferredCompletionInner1;
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner3 = new OASFineTunePreferenceRequestInputPre();
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner4 = fineTunePreferenceRequestInputPreferredCompletionInner3;

        System.assert(fineTunePreferenceRequestInputPreferredCompletionInner1.equals(fineTunePreferenceRequestInputPreferredCompletionInner2));
        System.assert(fineTunePreferenceRequestInputPreferredCompletionInner2.equals(fineTunePreferenceRequestInputPreferredCompletionInner1));
        System.assert(fineTunePreferenceRequestInputPreferredCompletionInner1.equals(fineTunePreferenceRequestInputPreferredCompletionInner1));
        System.assert(fineTunePreferenceRequestInputPreferredCompletionInner3.equals(fineTunePreferenceRequestInputPreferredCompletionInner4));
        System.assert(fineTunePreferenceRequestInputPreferredCompletionInner4.equals(fineTunePreferenceRequestInputPreferredCompletionInner3));
        System.assert(fineTunePreferenceRequestInputPreferredCompletionInner3.equals(fineTunePreferenceRequestInputPreferredCompletionInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner1 = OASFineTunePreferenceRequestInputPre.getExample();
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner2 = OASFineTunePreferenceRequestInputPre.getExample();
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner3 = new OASFineTunePreferenceRequestInputPre();
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner4 = new OASFineTunePreferenceRequestInputPre();

        System.assert(fineTunePreferenceRequestInputPreferredCompletionInner1.equals(fineTunePreferenceRequestInputPreferredCompletionInner2));
        System.assert(fineTunePreferenceRequestInputPreferredCompletionInner2.equals(fineTunePreferenceRequestInputPreferredCompletionInner1));
        System.assert(fineTunePreferenceRequestInputPreferredCompletionInner3.equals(fineTunePreferenceRequestInputPreferredCompletionInner4));
        System.assert(fineTunePreferenceRequestInputPreferredCompletionInner4.equals(fineTunePreferenceRequestInputPreferredCompletionInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner1 = OASFineTunePreferenceRequestInputPre.getExample();
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner2 = new OASFineTunePreferenceRequestInputPre();

        System.assertEquals(false, fineTunePreferenceRequestInputPreferredCompletionInner1.equals('foo'));
        System.assertEquals(false, fineTunePreferenceRequestInputPreferredCompletionInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner1 = OASFineTunePreferenceRequestInputPre.getExample();
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner2 = new OASFineTunePreferenceRequestInputPre();
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner3;

        System.assertEquals(false, fineTunePreferenceRequestInputPreferredCompletionInner1.equals(fineTunePreferenceRequestInputPreferredCompletionInner3));
        System.assertEquals(false, fineTunePreferenceRequestInputPreferredCompletionInner2.equals(fineTunePreferenceRequestInputPreferredCompletionInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner1 = OASFineTunePreferenceRequestInputPre.getExample();
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner2 = new OASFineTunePreferenceRequestInputPre();

        System.assertEquals(fineTunePreferenceRequestInputPreferredCompletionInner1.hashCode(), fineTunePreferenceRequestInputPreferredCompletionInner1.hashCode());
        System.assertEquals(fineTunePreferenceRequestInputPreferredCompletionInner2.hashCode(), fineTunePreferenceRequestInputPreferredCompletionInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner1 = OASFineTunePreferenceRequestInputPre.getExample();
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner2 = OASFineTunePreferenceRequestInputPre.getExample();
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner3 = new OASFineTunePreferenceRequestInputPre();
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner4 = new OASFineTunePreferenceRequestInputPre();

        System.assert(fineTunePreferenceRequestInputPreferredCompletionInner1.equals(fineTunePreferenceRequestInputPreferredCompletionInner2));
        System.assert(fineTunePreferenceRequestInputPreferredCompletionInner3.equals(fineTunePreferenceRequestInputPreferredCompletionInner4));
        System.assertEquals(fineTunePreferenceRequestInputPreferredCompletionInner1.hashCode(), fineTunePreferenceRequestInputPreferredCompletionInner2.hashCode());
        System.assertEquals(fineTunePreferenceRequestInputPreferredCompletionInner3.hashCode(), fineTunePreferenceRequestInputPreferredCompletionInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner = new OASFineTunePreferenceRequestInputPre();
        Map<String, String> x-property-mappings = fineTunePreferenceRequestInputPreferredCompletionInner.getx-property-mappings();
        System.assertEquals('toolCalls', x-property-mappings.get('tool_calls'));
        System.assertEquals('functionCall', x-property-mappings.get('function_call'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFineTunePreferenceRequestInputPre fineTunePreferenceRequestInputPreferredCompletionInner = new OASFineTunePreferenceRequestInputPre();
        System.assertEquals(new List<OASChatCompletionMessageToolCall>(), fineTunePreferenceRequestInputPreferredCompletionInner.toolCalls);
        System.assertEquals(null, fineTunePreferenceRequestInputPreferredCompletionInner.content);
        System.assertEquals(null, fineTunePreferenceRequestInputPreferredCompletionInner.refusal);
        System.assertEquals(null, fineTunePreferenceRequestInputPreferredCompletionInner.role);
        System.assertEquals(null, fineTunePreferenceRequestInputPreferredCompletionInner.name);
        System.assertEquals(null, fineTunePreferenceRequestInputPreferredCompletionInner.audio);
        System.assertEquals(null, fineTunePreferenceRequestInputPreferredCompletionInner.functionCall);
    }
}
