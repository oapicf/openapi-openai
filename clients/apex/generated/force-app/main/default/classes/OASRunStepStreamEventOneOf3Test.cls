@isTest
private class OASRunStepStreamEventOneOf3Test {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf31 = OASRunStepStreamEventOneOf3.getExample();
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf32 = runStepStreamEventOneOf31;
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf33 = new OASRunStepStreamEventOneOf3();
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf34 = runStepStreamEventOneOf33;

        System.assert(runStepStreamEventOneOf31.equals(runStepStreamEventOneOf32));
        System.assert(runStepStreamEventOneOf32.equals(runStepStreamEventOneOf31));
        System.assert(runStepStreamEventOneOf31.equals(runStepStreamEventOneOf31));
        System.assert(runStepStreamEventOneOf33.equals(runStepStreamEventOneOf34));
        System.assert(runStepStreamEventOneOf34.equals(runStepStreamEventOneOf33));
        System.assert(runStepStreamEventOneOf33.equals(runStepStreamEventOneOf33));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf31 = OASRunStepStreamEventOneOf3.getExample();
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf32 = OASRunStepStreamEventOneOf3.getExample();
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf33 = new OASRunStepStreamEventOneOf3();
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf34 = new OASRunStepStreamEventOneOf3();

        System.assert(runStepStreamEventOneOf31.equals(runStepStreamEventOneOf32));
        System.assert(runStepStreamEventOneOf32.equals(runStepStreamEventOneOf31));
        System.assert(runStepStreamEventOneOf33.equals(runStepStreamEventOneOf34));
        System.assert(runStepStreamEventOneOf34.equals(runStepStreamEventOneOf33));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf31 = OASRunStepStreamEventOneOf3.getExample();
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf32 = new OASRunStepStreamEventOneOf3();

        System.assertEquals(false, runStepStreamEventOneOf31.equals('foo'));
        System.assertEquals(false, runStepStreamEventOneOf32.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf31 = OASRunStepStreamEventOneOf3.getExample();
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf32 = new OASRunStepStreamEventOneOf3();
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf33;

        System.assertEquals(false, runStepStreamEventOneOf31.equals(runStepStreamEventOneOf33));
        System.assertEquals(false, runStepStreamEventOneOf32.equals(runStepStreamEventOneOf33));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf31 = OASRunStepStreamEventOneOf3.getExample();
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf32 = new OASRunStepStreamEventOneOf3();

        System.assertEquals(runStepStreamEventOneOf31.hashCode(), runStepStreamEventOneOf31.hashCode());
        System.assertEquals(runStepStreamEventOneOf32.hashCode(), runStepStreamEventOneOf32.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf31 = OASRunStepStreamEventOneOf3.getExample();
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf32 = OASRunStepStreamEventOneOf3.getExample();
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf33 = new OASRunStepStreamEventOneOf3();
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf34 = new OASRunStepStreamEventOneOf3();

        System.assert(runStepStreamEventOneOf31.equals(runStepStreamEventOneOf32));
        System.assert(runStepStreamEventOneOf33.equals(runStepStreamEventOneOf34));
        System.assertEquals(runStepStreamEventOneOf31.hashCode(), runStepStreamEventOneOf32.hashCode());
        System.assertEquals(runStepStreamEventOneOf33.hashCode(), runStepStreamEventOneOf34.hashCode());
    }
}
