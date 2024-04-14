@isTest
private class OASRunStepStreamEventOneOf1Test {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf11 = OASRunStepStreamEventOneOf1.getExample();
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf12 = runStepStreamEventOneOf11;
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf13 = new OASRunStepStreamEventOneOf1();
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf14 = runStepStreamEventOneOf13;

        System.assert(runStepStreamEventOneOf11.equals(runStepStreamEventOneOf12));
        System.assert(runStepStreamEventOneOf12.equals(runStepStreamEventOneOf11));
        System.assert(runStepStreamEventOneOf11.equals(runStepStreamEventOneOf11));
        System.assert(runStepStreamEventOneOf13.equals(runStepStreamEventOneOf14));
        System.assert(runStepStreamEventOneOf14.equals(runStepStreamEventOneOf13));
        System.assert(runStepStreamEventOneOf13.equals(runStepStreamEventOneOf13));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf11 = OASRunStepStreamEventOneOf1.getExample();
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf12 = OASRunStepStreamEventOneOf1.getExample();
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf13 = new OASRunStepStreamEventOneOf1();
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf14 = new OASRunStepStreamEventOneOf1();

        System.assert(runStepStreamEventOneOf11.equals(runStepStreamEventOneOf12));
        System.assert(runStepStreamEventOneOf12.equals(runStepStreamEventOneOf11));
        System.assert(runStepStreamEventOneOf13.equals(runStepStreamEventOneOf14));
        System.assert(runStepStreamEventOneOf14.equals(runStepStreamEventOneOf13));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf11 = OASRunStepStreamEventOneOf1.getExample();
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf12 = new OASRunStepStreamEventOneOf1();

        System.assertEquals(false, runStepStreamEventOneOf11.equals('foo'));
        System.assertEquals(false, runStepStreamEventOneOf12.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf11 = OASRunStepStreamEventOneOf1.getExample();
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf12 = new OASRunStepStreamEventOneOf1();
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf13;

        System.assertEquals(false, runStepStreamEventOneOf11.equals(runStepStreamEventOneOf13));
        System.assertEquals(false, runStepStreamEventOneOf12.equals(runStepStreamEventOneOf13));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf11 = OASRunStepStreamEventOneOf1.getExample();
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf12 = new OASRunStepStreamEventOneOf1();

        System.assertEquals(runStepStreamEventOneOf11.hashCode(), runStepStreamEventOneOf11.hashCode());
        System.assertEquals(runStepStreamEventOneOf12.hashCode(), runStepStreamEventOneOf12.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf11 = OASRunStepStreamEventOneOf1.getExample();
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf12 = OASRunStepStreamEventOneOf1.getExample();
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf13 = new OASRunStepStreamEventOneOf1();
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf14 = new OASRunStepStreamEventOneOf1();

        System.assert(runStepStreamEventOneOf11.equals(runStepStreamEventOneOf12));
        System.assert(runStepStreamEventOneOf13.equals(runStepStreamEventOneOf14));
        System.assertEquals(runStepStreamEventOneOf11.hashCode(), runStepStreamEventOneOf12.hashCode());
        System.assertEquals(runStepStreamEventOneOf13.hashCode(), runStepStreamEventOneOf14.hashCode());
    }
}
