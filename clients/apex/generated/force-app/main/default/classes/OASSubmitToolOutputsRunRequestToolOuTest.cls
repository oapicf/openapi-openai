@isTest
private class OASSubmitToolOutputsRunRequestToolOuTest {
    @isTest
    private static void equalsSameInstance() {
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner1 = OASSubmitToolOutputsRunRequestToolOu.getExample();
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner2 = submitToolOutputsRunRequestToolOutputsInner1;
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner3 = new OASSubmitToolOutputsRunRequestToolOu();
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner4 = submitToolOutputsRunRequestToolOutputsInner3;

        System.assert(submitToolOutputsRunRequestToolOutputsInner1.equals(submitToolOutputsRunRequestToolOutputsInner2));
        System.assert(submitToolOutputsRunRequestToolOutputsInner2.equals(submitToolOutputsRunRequestToolOutputsInner1));
        System.assert(submitToolOutputsRunRequestToolOutputsInner1.equals(submitToolOutputsRunRequestToolOutputsInner1));
        System.assert(submitToolOutputsRunRequestToolOutputsInner3.equals(submitToolOutputsRunRequestToolOutputsInner4));
        System.assert(submitToolOutputsRunRequestToolOutputsInner4.equals(submitToolOutputsRunRequestToolOutputsInner3));
        System.assert(submitToolOutputsRunRequestToolOutputsInner3.equals(submitToolOutputsRunRequestToolOutputsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner1 = OASSubmitToolOutputsRunRequestToolOu.getExample();
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner2 = OASSubmitToolOutputsRunRequestToolOu.getExample();
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner3 = new OASSubmitToolOutputsRunRequestToolOu();
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner4 = new OASSubmitToolOutputsRunRequestToolOu();

        System.assert(submitToolOutputsRunRequestToolOutputsInner1.equals(submitToolOutputsRunRequestToolOutputsInner2));
        System.assert(submitToolOutputsRunRequestToolOutputsInner2.equals(submitToolOutputsRunRequestToolOutputsInner1));
        System.assert(submitToolOutputsRunRequestToolOutputsInner3.equals(submitToolOutputsRunRequestToolOutputsInner4));
        System.assert(submitToolOutputsRunRequestToolOutputsInner4.equals(submitToolOutputsRunRequestToolOutputsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner1 = OASSubmitToolOutputsRunRequestToolOu.getExample();
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner2 = new OASSubmitToolOutputsRunRequestToolOu();

        System.assertEquals(false, submitToolOutputsRunRequestToolOutputsInner1.equals('foo'));
        System.assertEquals(false, submitToolOutputsRunRequestToolOutputsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner1 = OASSubmitToolOutputsRunRequestToolOu.getExample();
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner2 = new OASSubmitToolOutputsRunRequestToolOu();
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner3;

        System.assertEquals(false, submitToolOutputsRunRequestToolOutputsInner1.equals(submitToolOutputsRunRequestToolOutputsInner3));
        System.assertEquals(false, submitToolOutputsRunRequestToolOutputsInner2.equals(submitToolOutputsRunRequestToolOutputsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner1 = OASSubmitToolOutputsRunRequestToolOu.getExample();
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner2 = new OASSubmitToolOutputsRunRequestToolOu();

        System.assertEquals(submitToolOutputsRunRequestToolOutputsInner1.hashCode(), submitToolOutputsRunRequestToolOutputsInner1.hashCode());
        System.assertEquals(submitToolOutputsRunRequestToolOutputsInner2.hashCode(), submitToolOutputsRunRequestToolOutputsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner1 = OASSubmitToolOutputsRunRequestToolOu.getExample();
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner2 = OASSubmitToolOutputsRunRequestToolOu.getExample();
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner3 = new OASSubmitToolOutputsRunRequestToolOu();
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner4 = new OASSubmitToolOutputsRunRequestToolOu();

        System.assert(submitToolOutputsRunRequestToolOutputsInner1.equals(submitToolOutputsRunRequestToolOutputsInner2));
        System.assert(submitToolOutputsRunRequestToolOutputsInner3.equals(submitToolOutputsRunRequestToolOutputsInner4));
        System.assertEquals(submitToolOutputsRunRequestToolOutputsInner1.hashCode(), submitToolOutputsRunRequestToolOutputsInner2.hashCode());
        System.assertEquals(submitToolOutputsRunRequestToolOutputsInner3.hashCode(), submitToolOutputsRunRequestToolOutputsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSubmitToolOutputsRunRequestToolOu submitToolOutputsRunRequestToolOutputsInner = new OASSubmitToolOutputsRunRequestToolOu();
        Map<String, String> x-property-mappings = submitToolOutputsRunRequestToolOutputsInner.getx-property-mappings();
        System.assertEquals('toolCallId', x-property-mappings.get('tool_call_id'));
    }
}
