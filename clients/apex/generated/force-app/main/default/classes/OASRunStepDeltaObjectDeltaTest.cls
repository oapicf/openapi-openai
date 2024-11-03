@isTest
private class OASRunStepDeltaObjectDeltaTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta1 = OASRunStepDeltaObjectDelta.getExample();
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta2 = runStepDeltaObjectDelta1;
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta3 = new OASRunStepDeltaObjectDelta();
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta4 = runStepDeltaObjectDelta3;

        System.assert(runStepDeltaObjectDelta1.equals(runStepDeltaObjectDelta2));
        System.assert(runStepDeltaObjectDelta2.equals(runStepDeltaObjectDelta1));
        System.assert(runStepDeltaObjectDelta1.equals(runStepDeltaObjectDelta1));
        System.assert(runStepDeltaObjectDelta3.equals(runStepDeltaObjectDelta4));
        System.assert(runStepDeltaObjectDelta4.equals(runStepDeltaObjectDelta3));
        System.assert(runStepDeltaObjectDelta3.equals(runStepDeltaObjectDelta3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta1 = OASRunStepDeltaObjectDelta.getExample();
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta2 = OASRunStepDeltaObjectDelta.getExample();
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta3 = new OASRunStepDeltaObjectDelta();
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta4 = new OASRunStepDeltaObjectDelta();

        System.assert(runStepDeltaObjectDelta1.equals(runStepDeltaObjectDelta2));
        System.assert(runStepDeltaObjectDelta2.equals(runStepDeltaObjectDelta1));
        System.assert(runStepDeltaObjectDelta3.equals(runStepDeltaObjectDelta4));
        System.assert(runStepDeltaObjectDelta4.equals(runStepDeltaObjectDelta3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta1 = OASRunStepDeltaObjectDelta.getExample();
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta2 = new OASRunStepDeltaObjectDelta();

        System.assertEquals(false, runStepDeltaObjectDelta1.equals('foo'));
        System.assertEquals(false, runStepDeltaObjectDelta2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta1 = OASRunStepDeltaObjectDelta.getExample();
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta2 = new OASRunStepDeltaObjectDelta();
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta3;

        System.assertEquals(false, runStepDeltaObjectDelta1.equals(runStepDeltaObjectDelta3));
        System.assertEquals(false, runStepDeltaObjectDelta2.equals(runStepDeltaObjectDelta3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta1 = OASRunStepDeltaObjectDelta.getExample();
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta2 = new OASRunStepDeltaObjectDelta();

        System.assertEquals(runStepDeltaObjectDelta1.hashCode(), runStepDeltaObjectDelta1.hashCode());
        System.assertEquals(runStepDeltaObjectDelta2.hashCode(), runStepDeltaObjectDelta2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta1 = OASRunStepDeltaObjectDelta.getExample();
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta2 = OASRunStepDeltaObjectDelta.getExample();
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta3 = new OASRunStepDeltaObjectDelta();
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta4 = new OASRunStepDeltaObjectDelta();

        System.assert(runStepDeltaObjectDelta1.equals(runStepDeltaObjectDelta2));
        System.assert(runStepDeltaObjectDelta3.equals(runStepDeltaObjectDelta4));
        System.assertEquals(runStepDeltaObjectDelta1.hashCode(), runStepDeltaObjectDelta2.hashCode());
        System.assertEquals(runStepDeltaObjectDelta3.hashCode(), runStepDeltaObjectDelta4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta = new OASRunStepDeltaObjectDelta();
        Map<String, String> x-property-mappings = runStepDeltaObjectDelta.getx-property-mappings();
        System.assertEquals('stepDetails', x-property-mappings.get('step_details'));
    }
}
