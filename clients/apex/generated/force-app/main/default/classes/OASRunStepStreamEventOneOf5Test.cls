@isTest
private class OASRunStepStreamEventOneOf5Test {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf51 = OASRunStepStreamEventOneOf5.getExample();
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf52 = runStepStreamEventOneOf51;
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf53 = new OASRunStepStreamEventOneOf5();
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf54 = runStepStreamEventOneOf53;

        System.assert(runStepStreamEventOneOf51.equals(runStepStreamEventOneOf52));
        System.assert(runStepStreamEventOneOf52.equals(runStepStreamEventOneOf51));
        System.assert(runStepStreamEventOneOf51.equals(runStepStreamEventOneOf51));
        System.assert(runStepStreamEventOneOf53.equals(runStepStreamEventOneOf54));
        System.assert(runStepStreamEventOneOf54.equals(runStepStreamEventOneOf53));
        System.assert(runStepStreamEventOneOf53.equals(runStepStreamEventOneOf53));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf51 = OASRunStepStreamEventOneOf5.getExample();
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf52 = OASRunStepStreamEventOneOf5.getExample();
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf53 = new OASRunStepStreamEventOneOf5();
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf54 = new OASRunStepStreamEventOneOf5();

        System.assert(runStepStreamEventOneOf51.equals(runStepStreamEventOneOf52));
        System.assert(runStepStreamEventOneOf52.equals(runStepStreamEventOneOf51));
        System.assert(runStepStreamEventOneOf53.equals(runStepStreamEventOneOf54));
        System.assert(runStepStreamEventOneOf54.equals(runStepStreamEventOneOf53));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf51 = OASRunStepStreamEventOneOf5.getExample();
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf52 = new OASRunStepStreamEventOneOf5();

        System.assertEquals(false, runStepStreamEventOneOf51.equals('foo'));
        System.assertEquals(false, runStepStreamEventOneOf52.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf51 = OASRunStepStreamEventOneOf5.getExample();
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf52 = new OASRunStepStreamEventOneOf5();
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf53;

        System.assertEquals(false, runStepStreamEventOneOf51.equals(runStepStreamEventOneOf53));
        System.assertEquals(false, runStepStreamEventOneOf52.equals(runStepStreamEventOneOf53));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf51 = OASRunStepStreamEventOneOf5.getExample();
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf52 = new OASRunStepStreamEventOneOf5();

        System.assertEquals(runStepStreamEventOneOf51.hashCode(), runStepStreamEventOneOf51.hashCode());
        System.assertEquals(runStepStreamEventOneOf52.hashCode(), runStepStreamEventOneOf52.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf51 = OASRunStepStreamEventOneOf5.getExample();
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf52 = OASRunStepStreamEventOneOf5.getExample();
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf53 = new OASRunStepStreamEventOneOf5();
        OASRunStepStreamEventOneOf5 runStepStreamEventOneOf54 = new OASRunStepStreamEventOneOf5();

        System.assert(runStepStreamEventOneOf51.equals(runStepStreamEventOneOf52));
        System.assert(runStepStreamEventOneOf53.equals(runStepStreamEventOneOf54));
        System.assertEquals(runStepStreamEventOneOf51.hashCode(), runStepStreamEventOneOf52.hashCode());
        System.assertEquals(runStepStreamEventOneOf53.hashCode(), runStepStreamEventOneOf54.hashCode());
    }
}
