@isTest
private class OASRunStepDetailsToolCallsCodeObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter1 = OASRunStepDetailsToolCallsCodeObject.getExample();
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter2 = runStepDetailsToolCallsCodeObjectCodeInterpreter1;
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter3 = new OASRunStepDetailsToolCallsCodeObject();
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter4 = runStepDetailsToolCallsCodeObjectCodeInterpreter3;

        System.assert(runStepDetailsToolCallsCodeObjectCodeInterpreter1.equals(runStepDetailsToolCallsCodeObjectCodeInterpreter2));
        System.assert(runStepDetailsToolCallsCodeObjectCodeInterpreter2.equals(runStepDetailsToolCallsCodeObjectCodeInterpreter1));
        System.assert(runStepDetailsToolCallsCodeObjectCodeInterpreter1.equals(runStepDetailsToolCallsCodeObjectCodeInterpreter1));
        System.assert(runStepDetailsToolCallsCodeObjectCodeInterpreter3.equals(runStepDetailsToolCallsCodeObjectCodeInterpreter4));
        System.assert(runStepDetailsToolCallsCodeObjectCodeInterpreter4.equals(runStepDetailsToolCallsCodeObjectCodeInterpreter3));
        System.assert(runStepDetailsToolCallsCodeObjectCodeInterpreter3.equals(runStepDetailsToolCallsCodeObjectCodeInterpreter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter1 = OASRunStepDetailsToolCallsCodeObject.getExample();
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter2 = OASRunStepDetailsToolCallsCodeObject.getExample();
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter3 = new OASRunStepDetailsToolCallsCodeObject();
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter4 = new OASRunStepDetailsToolCallsCodeObject();

        System.assert(runStepDetailsToolCallsCodeObjectCodeInterpreter1.equals(runStepDetailsToolCallsCodeObjectCodeInterpreter2));
        System.assert(runStepDetailsToolCallsCodeObjectCodeInterpreter2.equals(runStepDetailsToolCallsCodeObjectCodeInterpreter1));
        System.assert(runStepDetailsToolCallsCodeObjectCodeInterpreter3.equals(runStepDetailsToolCallsCodeObjectCodeInterpreter4));
        System.assert(runStepDetailsToolCallsCodeObjectCodeInterpreter4.equals(runStepDetailsToolCallsCodeObjectCodeInterpreter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter1 = OASRunStepDetailsToolCallsCodeObject.getExample();
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter2 = new OASRunStepDetailsToolCallsCodeObject();

        System.assertEquals(false, runStepDetailsToolCallsCodeObjectCodeInterpreter1.equals('foo'));
        System.assertEquals(false, runStepDetailsToolCallsCodeObjectCodeInterpreter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter1 = OASRunStepDetailsToolCallsCodeObject.getExample();
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter2 = new OASRunStepDetailsToolCallsCodeObject();
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter3;

        System.assertEquals(false, runStepDetailsToolCallsCodeObjectCodeInterpreter1.equals(runStepDetailsToolCallsCodeObjectCodeInterpreter3));
        System.assertEquals(false, runStepDetailsToolCallsCodeObjectCodeInterpreter2.equals(runStepDetailsToolCallsCodeObjectCodeInterpreter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter1 = OASRunStepDetailsToolCallsCodeObject.getExample();
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter2 = new OASRunStepDetailsToolCallsCodeObject();

        System.assertEquals(runStepDetailsToolCallsCodeObjectCodeInterpreter1.hashCode(), runStepDetailsToolCallsCodeObjectCodeInterpreter1.hashCode());
        System.assertEquals(runStepDetailsToolCallsCodeObjectCodeInterpreter2.hashCode(), runStepDetailsToolCallsCodeObjectCodeInterpreter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter1 = OASRunStepDetailsToolCallsCodeObject.getExample();
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter2 = OASRunStepDetailsToolCallsCodeObject.getExample();
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter3 = new OASRunStepDetailsToolCallsCodeObject();
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter4 = new OASRunStepDetailsToolCallsCodeObject();

        System.assert(runStepDetailsToolCallsCodeObjectCodeInterpreter1.equals(runStepDetailsToolCallsCodeObjectCodeInterpreter2));
        System.assert(runStepDetailsToolCallsCodeObjectCodeInterpreter3.equals(runStepDetailsToolCallsCodeObjectCodeInterpreter4));
        System.assertEquals(runStepDetailsToolCallsCodeObjectCodeInterpreter1.hashCode(), runStepDetailsToolCallsCodeObjectCodeInterpreter2.hashCode());
        System.assertEquals(runStepDetailsToolCallsCodeObjectCodeInterpreter3.hashCode(), runStepDetailsToolCallsCodeObjectCodeInterpreter4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter = new OASRunStepDetailsToolCallsCodeObject();
        System.assertEquals(new List<OASRunStepDetailsToolCallsCodeObject>(), runStepDetailsToolCallsCodeObjectCodeInterpreter.outputs);
        System.assertEquals(null, runStepDetailsToolCallsCodeObjectCodeInterpreter.input);
    }
}
