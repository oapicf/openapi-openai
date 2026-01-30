@isTest
private class OASFineTunePreferenceRequestInputTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput1 = OASFineTunePreferenceRequestInput.getExample();
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput2 = fineTunePreferenceRequestInput1;
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput3 = new OASFineTunePreferenceRequestInput();
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput4 = fineTunePreferenceRequestInput3;

        System.assert(fineTunePreferenceRequestInput1.equals(fineTunePreferenceRequestInput2));
        System.assert(fineTunePreferenceRequestInput2.equals(fineTunePreferenceRequestInput1));
        System.assert(fineTunePreferenceRequestInput1.equals(fineTunePreferenceRequestInput1));
        System.assert(fineTunePreferenceRequestInput3.equals(fineTunePreferenceRequestInput4));
        System.assert(fineTunePreferenceRequestInput4.equals(fineTunePreferenceRequestInput3));
        System.assert(fineTunePreferenceRequestInput3.equals(fineTunePreferenceRequestInput3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput1 = OASFineTunePreferenceRequestInput.getExample();
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput2 = OASFineTunePreferenceRequestInput.getExample();
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput3 = new OASFineTunePreferenceRequestInput();
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput4 = new OASFineTunePreferenceRequestInput();

        System.assert(fineTunePreferenceRequestInput1.equals(fineTunePreferenceRequestInput2));
        System.assert(fineTunePreferenceRequestInput2.equals(fineTunePreferenceRequestInput1));
        System.assert(fineTunePreferenceRequestInput3.equals(fineTunePreferenceRequestInput4));
        System.assert(fineTunePreferenceRequestInput4.equals(fineTunePreferenceRequestInput3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput1 = OASFineTunePreferenceRequestInput.getExample();
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput2 = new OASFineTunePreferenceRequestInput();

        System.assertEquals(false, fineTunePreferenceRequestInput1.equals('foo'));
        System.assertEquals(false, fineTunePreferenceRequestInput2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput1 = OASFineTunePreferenceRequestInput.getExample();
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput2 = new OASFineTunePreferenceRequestInput();
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput3;

        System.assertEquals(false, fineTunePreferenceRequestInput1.equals(fineTunePreferenceRequestInput3));
        System.assertEquals(false, fineTunePreferenceRequestInput2.equals(fineTunePreferenceRequestInput3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput1 = OASFineTunePreferenceRequestInput.getExample();
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput2 = new OASFineTunePreferenceRequestInput();

        System.assertEquals(fineTunePreferenceRequestInput1.hashCode(), fineTunePreferenceRequestInput1.hashCode());
        System.assertEquals(fineTunePreferenceRequestInput2.hashCode(), fineTunePreferenceRequestInput2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput1 = OASFineTunePreferenceRequestInput.getExample();
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput2 = OASFineTunePreferenceRequestInput.getExample();
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput3 = new OASFineTunePreferenceRequestInput();
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput4 = new OASFineTunePreferenceRequestInput();

        System.assert(fineTunePreferenceRequestInput1.equals(fineTunePreferenceRequestInput2));
        System.assert(fineTunePreferenceRequestInput3.equals(fineTunePreferenceRequestInput4));
        System.assertEquals(fineTunePreferenceRequestInput1.hashCode(), fineTunePreferenceRequestInput2.hashCode());
        System.assertEquals(fineTunePreferenceRequestInput3.hashCode(), fineTunePreferenceRequestInput4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput = new OASFineTunePreferenceRequestInput();
        Map<String, String> x-property-mappings = fineTunePreferenceRequestInput.getx-property-mappings();
        System.assertEquals('preferredCompletion', x-property-mappings.get('preferred_completion'));
        System.assertEquals('nonPreferredCompletion', x-property-mappings.get('non_preferred_completion'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFineTunePreferenceRequestInput fineTunePreferenceRequestInput = new OASFineTunePreferenceRequestInput();
        System.assertEquals(new List<OASFineTunePreferenceRequestInputPre>(), fineTunePreferenceRequestInput.preferredCompletion);
        System.assertEquals(new List<OASFineTunePreferenceRequestInputPre>(), fineTunePreferenceRequestInput.nonPreferredCompletion);
        System.assertEquals(null, fineTunePreferenceRequestInput.input);
    }
}
