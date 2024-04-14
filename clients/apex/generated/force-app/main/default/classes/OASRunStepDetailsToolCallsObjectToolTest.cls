@isTest
private class OASRunStepDetailsToolCallsObjectToolTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner1 = OASRunStepDetailsToolCallsObjectTool.getExample();
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner2 = runStepDetailsToolCallsObjectToolCallsInner1;
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner3 = new OASRunStepDetailsToolCallsObjectTool();
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner4 = runStepDetailsToolCallsObjectToolCallsInner3;

        System.assert(runStepDetailsToolCallsObjectToolCallsInner1.equals(runStepDetailsToolCallsObjectToolCallsInner2));
        System.assert(runStepDetailsToolCallsObjectToolCallsInner2.equals(runStepDetailsToolCallsObjectToolCallsInner1));
        System.assert(runStepDetailsToolCallsObjectToolCallsInner1.equals(runStepDetailsToolCallsObjectToolCallsInner1));
        System.assert(runStepDetailsToolCallsObjectToolCallsInner3.equals(runStepDetailsToolCallsObjectToolCallsInner4));
        System.assert(runStepDetailsToolCallsObjectToolCallsInner4.equals(runStepDetailsToolCallsObjectToolCallsInner3));
        System.assert(runStepDetailsToolCallsObjectToolCallsInner3.equals(runStepDetailsToolCallsObjectToolCallsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner1 = OASRunStepDetailsToolCallsObjectTool.getExample();
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner2 = OASRunStepDetailsToolCallsObjectTool.getExample();
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner3 = new OASRunStepDetailsToolCallsObjectTool();
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner4 = new OASRunStepDetailsToolCallsObjectTool();

        System.assert(runStepDetailsToolCallsObjectToolCallsInner1.equals(runStepDetailsToolCallsObjectToolCallsInner2));
        System.assert(runStepDetailsToolCallsObjectToolCallsInner2.equals(runStepDetailsToolCallsObjectToolCallsInner1));
        System.assert(runStepDetailsToolCallsObjectToolCallsInner3.equals(runStepDetailsToolCallsObjectToolCallsInner4));
        System.assert(runStepDetailsToolCallsObjectToolCallsInner4.equals(runStepDetailsToolCallsObjectToolCallsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner1 = OASRunStepDetailsToolCallsObjectTool.getExample();
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner2 = new OASRunStepDetailsToolCallsObjectTool();

        System.assertEquals(false, runStepDetailsToolCallsObjectToolCallsInner1.equals('foo'));
        System.assertEquals(false, runStepDetailsToolCallsObjectToolCallsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner1 = OASRunStepDetailsToolCallsObjectTool.getExample();
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner2 = new OASRunStepDetailsToolCallsObjectTool();
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner3;

        System.assertEquals(false, runStepDetailsToolCallsObjectToolCallsInner1.equals(runStepDetailsToolCallsObjectToolCallsInner3));
        System.assertEquals(false, runStepDetailsToolCallsObjectToolCallsInner2.equals(runStepDetailsToolCallsObjectToolCallsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner1 = OASRunStepDetailsToolCallsObjectTool.getExample();
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner2 = new OASRunStepDetailsToolCallsObjectTool();

        System.assertEquals(runStepDetailsToolCallsObjectToolCallsInner1.hashCode(), runStepDetailsToolCallsObjectToolCallsInner1.hashCode());
        System.assertEquals(runStepDetailsToolCallsObjectToolCallsInner2.hashCode(), runStepDetailsToolCallsObjectToolCallsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner1 = OASRunStepDetailsToolCallsObjectTool.getExample();
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner2 = OASRunStepDetailsToolCallsObjectTool.getExample();
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner3 = new OASRunStepDetailsToolCallsObjectTool();
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner4 = new OASRunStepDetailsToolCallsObjectTool();

        System.assert(runStepDetailsToolCallsObjectToolCallsInner1.equals(runStepDetailsToolCallsObjectToolCallsInner2));
        System.assert(runStepDetailsToolCallsObjectToolCallsInner3.equals(runStepDetailsToolCallsObjectToolCallsInner4));
        System.assertEquals(runStepDetailsToolCallsObjectToolCallsInner1.hashCode(), runStepDetailsToolCallsObjectToolCallsInner2.hashCode());
        System.assertEquals(runStepDetailsToolCallsObjectToolCallsInner3.hashCode(), runStepDetailsToolCallsObjectToolCallsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunStepDetailsToolCallsObjectTool runStepDetailsToolCallsObjectToolCallsInner = new OASRunStepDetailsToolCallsObjectTool();
        Map<String, String> x-property-mappings = runStepDetailsToolCallsObjectToolCallsInner.getx-property-mappings();
        System.assertEquals('codeInterpreter', x-property-mappings.get('code_interpreter'));
    }
}
