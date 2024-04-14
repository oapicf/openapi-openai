@isTest
private class OASRunStepStreamEventOneOf4Test {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf41 = OASRunStepStreamEventOneOf4.getExample();
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf42 = runStepStreamEventOneOf41;
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf43 = new OASRunStepStreamEventOneOf4();
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf44 = runStepStreamEventOneOf43;

        System.assert(runStepStreamEventOneOf41.equals(runStepStreamEventOneOf42));
        System.assert(runStepStreamEventOneOf42.equals(runStepStreamEventOneOf41));
        System.assert(runStepStreamEventOneOf41.equals(runStepStreamEventOneOf41));
        System.assert(runStepStreamEventOneOf43.equals(runStepStreamEventOneOf44));
        System.assert(runStepStreamEventOneOf44.equals(runStepStreamEventOneOf43));
        System.assert(runStepStreamEventOneOf43.equals(runStepStreamEventOneOf43));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf41 = OASRunStepStreamEventOneOf4.getExample();
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf42 = OASRunStepStreamEventOneOf4.getExample();
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf43 = new OASRunStepStreamEventOneOf4();
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf44 = new OASRunStepStreamEventOneOf4();

        System.assert(runStepStreamEventOneOf41.equals(runStepStreamEventOneOf42));
        System.assert(runStepStreamEventOneOf42.equals(runStepStreamEventOneOf41));
        System.assert(runStepStreamEventOneOf43.equals(runStepStreamEventOneOf44));
        System.assert(runStepStreamEventOneOf44.equals(runStepStreamEventOneOf43));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf41 = OASRunStepStreamEventOneOf4.getExample();
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf42 = new OASRunStepStreamEventOneOf4();

        System.assertEquals(false, runStepStreamEventOneOf41.equals('foo'));
        System.assertEquals(false, runStepStreamEventOneOf42.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf41 = OASRunStepStreamEventOneOf4.getExample();
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf42 = new OASRunStepStreamEventOneOf4();
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf43;

        System.assertEquals(false, runStepStreamEventOneOf41.equals(runStepStreamEventOneOf43));
        System.assertEquals(false, runStepStreamEventOneOf42.equals(runStepStreamEventOneOf43));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf41 = OASRunStepStreamEventOneOf4.getExample();
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf42 = new OASRunStepStreamEventOneOf4();

        System.assertEquals(runStepStreamEventOneOf41.hashCode(), runStepStreamEventOneOf41.hashCode());
        System.assertEquals(runStepStreamEventOneOf42.hashCode(), runStepStreamEventOneOf42.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf41 = OASRunStepStreamEventOneOf4.getExample();
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf42 = OASRunStepStreamEventOneOf4.getExample();
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf43 = new OASRunStepStreamEventOneOf4();
        OASRunStepStreamEventOneOf4 runStepStreamEventOneOf44 = new OASRunStepStreamEventOneOf4();

        System.assert(runStepStreamEventOneOf41.equals(runStepStreamEventOneOf42));
        System.assert(runStepStreamEventOneOf43.equals(runStepStreamEventOneOf44));
        System.assertEquals(runStepStreamEventOneOf41.hashCode(), runStepStreamEventOneOf42.hashCode());
        System.assertEquals(runStepStreamEventOneOf43.hashCode(), runStepStreamEventOneOf44.hashCode());
    }
}
