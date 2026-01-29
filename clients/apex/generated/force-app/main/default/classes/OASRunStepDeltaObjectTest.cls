@isTest
private class OASRunStepDeltaObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepDeltaObject runStepDeltaObject1 = OASRunStepDeltaObject.getExample();
        OASRunStepDeltaObject runStepDeltaObject2 = runStepDeltaObject1;
        OASRunStepDeltaObject runStepDeltaObject3 = new OASRunStepDeltaObject();
        OASRunStepDeltaObject runStepDeltaObject4 = runStepDeltaObject3;

        System.assert(runStepDeltaObject1.equals(runStepDeltaObject2));
        System.assert(runStepDeltaObject2.equals(runStepDeltaObject1));
        System.assert(runStepDeltaObject1.equals(runStepDeltaObject1));
        System.assert(runStepDeltaObject3.equals(runStepDeltaObject4));
        System.assert(runStepDeltaObject4.equals(runStepDeltaObject3));
        System.assert(runStepDeltaObject3.equals(runStepDeltaObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepDeltaObject runStepDeltaObject1 = OASRunStepDeltaObject.getExample();
        OASRunStepDeltaObject runStepDeltaObject2 = OASRunStepDeltaObject.getExample();
        OASRunStepDeltaObject runStepDeltaObject3 = new OASRunStepDeltaObject();
        OASRunStepDeltaObject runStepDeltaObject4 = new OASRunStepDeltaObject();

        System.assert(runStepDeltaObject1.equals(runStepDeltaObject2));
        System.assert(runStepDeltaObject2.equals(runStepDeltaObject1));
        System.assert(runStepDeltaObject3.equals(runStepDeltaObject4));
        System.assert(runStepDeltaObject4.equals(runStepDeltaObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepDeltaObject runStepDeltaObject1 = OASRunStepDeltaObject.getExample();
        OASRunStepDeltaObject runStepDeltaObject2 = new OASRunStepDeltaObject();

        System.assertEquals(false, runStepDeltaObject1.equals('foo'));
        System.assertEquals(false, runStepDeltaObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepDeltaObject runStepDeltaObject1 = OASRunStepDeltaObject.getExample();
        OASRunStepDeltaObject runStepDeltaObject2 = new OASRunStepDeltaObject();
        OASRunStepDeltaObject runStepDeltaObject3;

        System.assertEquals(false, runStepDeltaObject1.equals(runStepDeltaObject3));
        System.assertEquals(false, runStepDeltaObject2.equals(runStepDeltaObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepDeltaObject runStepDeltaObject1 = OASRunStepDeltaObject.getExample();
        OASRunStepDeltaObject runStepDeltaObject2 = new OASRunStepDeltaObject();

        System.assertEquals(runStepDeltaObject1.hashCode(), runStepDeltaObject1.hashCode());
        System.assertEquals(runStepDeltaObject2.hashCode(), runStepDeltaObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepDeltaObject runStepDeltaObject1 = OASRunStepDeltaObject.getExample();
        OASRunStepDeltaObject runStepDeltaObject2 = OASRunStepDeltaObject.getExample();
        OASRunStepDeltaObject runStepDeltaObject3 = new OASRunStepDeltaObject();
        OASRunStepDeltaObject runStepDeltaObject4 = new OASRunStepDeltaObject();

        System.assert(runStepDeltaObject1.equals(runStepDeltaObject2));
        System.assert(runStepDeltaObject3.equals(runStepDeltaObject4));
        System.assertEquals(runStepDeltaObject1.hashCode(), runStepDeltaObject2.hashCode());
        System.assertEquals(runStepDeltaObject3.hashCode(), runStepDeltaObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunStepDeltaObject runStepDeltaObject = new OASRunStepDeltaObject();
        Map<String, String> x-property-mappings = runStepDeltaObject.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
