@isTest
private class OASRunStepDeltaStepDetailsToolCallsOTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner1 = OASRunStepDeltaStepDetailsToolCallsO.getExample();
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner2 = runStepDeltaStepDetailsToolCallsObjectToolCallsInner1;
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner3 = new OASRunStepDeltaStepDetailsToolCallsO();
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner4 = runStepDeltaStepDetailsToolCallsObjectToolCallsInner3;

        System.assert(runStepDeltaStepDetailsToolCallsObjectToolCallsInner1.equals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner2));
        System.assert(runStepDeltaStepDetailsToolCallsObjectToolCallsInner2.equals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner1));
        System.assert(runStepDeltaStepDetailsToolCallsObjectToolCallsInner1.equals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner1));
        System.assert(runStepDeltaStepDetailsToolCallsObjectToolCallsInner3.equals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner4));
        System.assert(runStepDeltaStepDetailsToolCallsObjectToolCallsInner4.equals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner3));
        System.assert(runStepDeltaStepDetailsToolCallsObjectToolCallsInner3.equals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner1 = OASRunStepDeltaStepDetailsToolCallsO.getExample();
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner2 = OASRunStepDeltaStepDetailsToolCallsO.getExample();
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner3 = new OASRunStepDeltaStepDetailsToolCallsO();
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner4 = new OASRunStepDeltaStepDetailsToolCallsO();

        System.assert(runStepDeltaStepDetailsToolCallsObjectToolCallsInner1.equals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner2));
        System.assert(runStepDeltaStepDetailsToolCallsObjectToolCallsInner2.equals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner1));
        System.assert(runStepDeltaStepDetailsToolCallsObjectToolCallsInner3.equals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner4));
        System.assert(runStepDeltaStepDetailsToolCallsObjectToolCallsInner4.equals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner1 = OASRunStepDeltaStepDetailsToolCallsO.getExample();
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner2 = new OASRunStepDeltaStepDetailsToolCallsO();

        System.assertEquals(false, runStepDeltaStepDetailsToolCallsObjectToolCallsInner1.equals('foo'));
        System.assertEquals(false, runStepDeltaStepDetailsToolCallsObjectToolCallsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner1 = OASRunStepDeltaStepDetailsToolCallsO.getExample();
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner2 = new OASRunStepDeltaStepDetailsToolCallsO();
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner3;

        System.assertEquals(false, runStepDeltaStepDetailsToolCallsObjectToolCallsInner1.equals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner3));
        System.assertEquals(false, runStepDeltaStepDetailsToolCallsObjectToolCallsInner2.equals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner1 = OASRunStepDeltaStepDetailsToolCallsO.getExample();
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner2 = new OASRunStepDeltaStepDetailsToolCallsO();

        System.assertEquals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner1.hashCode(), runStepDeltaStepDetailsToolCallsObjectToolCallsInner1.hashCode());
        System.assertEquals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner2.hashCode(), runStepDeltaStepDetailsToolCallsObjectToolCallsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner1 = OASRunStepDeltaStepDetailsToolCallsO.getExample();
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner2 = OASRunStepDeltaStepDetailsToolCallsO.getExample();
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner3 = new OASRunStepDeltaStepDetailsToolCallsO();
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner4 = new OASRunStepDeltaStepDetailsToolCallsO();

        System.assert(runStepDeltaStepDetailsToolCallsObjectToolCallsInner1.equals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner2));
        System.assert(runStepDeltaStepDetailsToolCallsObjectToolCallsInner3.equals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner4));
        System.assertEquals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner1.hashCode(), runStepDeltaStepDetailsToolCallsObjectToolCallsInner2.hashCode());
        System.assertEquals(runStepDeltaStepDetailsToolCallsObjectToolCallsInner3.hashCode(), runStepDeltaStepDetailsToolCallsObjectToolCallsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunStepDeltaStepDetailsToolCallsO runStepDeltaStepDetailsToolCallsObjectToolCallsInner = new OASRunStepDeltaStepDetailsToolCallsO();
        Map<String, String> x-property-mappings = runStepDeltaStepDetailsToolCallsObjectToolCallsInner.getx-property-mappings();
        System.assertEquals('codeInterpreter', x-property-mappings.get('code_interpreter'));
    }
}
