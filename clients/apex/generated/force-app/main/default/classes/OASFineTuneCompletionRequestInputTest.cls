@isTest
private class OASFineTuneCompletionRequestInputTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput1 = OASFineTuneCompletionRequestInput.getExample();
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput2 = fineTuneCompletionRequestInput1;
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput3 = new OASFineTuneCompletionRequestInput();
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput4 = fineTuneCompletionRequestInput3;

        System.assert(fineTuneCompletionRequestInput1.equals(fineTuneCompletionRequestInput2));
        System.assert(fineTuneCompletionRequestInput2.equals(fineTuneCompletionRequestInput1));
        System.assert(fineTuneCompletionRequestInput1.equals(fineTuneCompletionRequestInput1));
        System.assert(fineTuneCompletionRequestInput3.equals(fineTuneCompletionRequestInput4));
        System.assert(fineTuneCompletionRequestInput4.equals(fineTuneCompletionRequestInput3));
        System.assert(fineTuneCompletionRequestInput3.equals(fineTuneCompletionRequestInput3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput1 = OASFineTuneCompletionRequestInput.getExample();
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput2 = OASFineTuneCompletionRequestInput.getExample();
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput3 = new OASFineTuneCompletionRequestInput();
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput4 = new OASFineTuneCompletionRequestInput();

        System.assert(fineTuneCompletionRequestInput1.equals(fineTuneCompletionRequestInput2));
        System.assert(fineTuneCompletionRequestInput2.equals(fineTuneCompletionRequestInput1));
        System.assert(fineTuneCompletionRequestInput3.equals(fineTuneCompletionRequestInput4));
        System.assert(fineTuneCompletionRequestInput4.equals(fineTuneCompletionRequestInput3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput1 = OASFineTuneCompletionRequestInput.getExample();
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput2 = new OASFineTuneCompletionRequestInput();

        System.assertEquals(false, fineTuneCompletionRequestInput1.equals('foo'));
        System.assertEquals(false, fineTuneCompletionRequestInput2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput1 = OASFineTuneCompletionRequestInput.getExample();
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput2 = new OASFineTuneCompletionRequestInput();
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput3;

        System.assertEquals(false, fineTuneCompletionRequestInput1.equals(fineTuneCompletionRequestInput3));
        System.assertEquals(false, fineTuneCompletionRequestInput2.equals(fineTuneCompletionRequestInput3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput1 = OASFineTuneCompletionRequestInput.getExample();
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput2 = new OASFineTuneCompletionRequestInput();

        System.assertEquals(fineTuneCompletionRequestInput1.hashCode(), fineTuneCompletionRequestInput1.hashCode());
        System.assertEquals(fineTuneCompletionRequestInput2.hashCode(), fineTuneCompletionRequestInput2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput1 = OASFineTuneCompletionRequestInput.getExample();
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput2 = OASFineTuneCompletionRequestInput.getExample();
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput3 = new OASFineTuneCompletionRequestInput();
        OASFineTuneCompletionRequestInput fineTuneCompletionRequestInput4 = new OASFineTuneCompletionRequestInput();

        System.assert(fineTuneCompletionRequestInput1.equals(fineTuneCompletionRequestInput2));
        System.assert(fineTuneCompletionRequestInput3.equals(fineTuneCompletionRequestInput4));
        System.assertEquals(fineTuneCompletionRequestInput1.hashCode(), fineTuneCompletionRequestInput2.hashCode());
        System.assertEquals(fineTuneCompletionRequestInput3.hashCode(), fineTuneCompletionRequestInput4.hashCode());
    }
}
