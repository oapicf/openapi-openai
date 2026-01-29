@isTest
private class OASRunStepStreamEventOneOf6Test {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf61 = OASRunStepStreamEventOneOf6.getExample();
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf62 = runStepStreamEventOneOf61;
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf63 = new OASRunStepStreamEventOneOf6();
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf64 = runStepStreamEventOneOf63;

        System.assert(runStepStreamEventOneOf61.equals(runStepStreamEventOneOf62));
        System.assert(runStepStreamEventOneOf62.equals(runStepStreamEventOneOf61));
        System.assert(runStepStreamEventOneOf61.equals(runStepStreamEventOneOf61));
        System.assert(runStepStreamEventOneOf63.equals(runStepStreamEventOneOf64));
        System.assert(runStepStreamEventOneOf64.equals(runStepStreamEventOneOf63));
        System.assert(runStepStreamEventOneOf63.equals(runStepStreamEventOneOf63));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf61 = OASRunStepStreamEventOneOf6.getExample();
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf62 = OASRunStepStreamEventOneOf6.getExample();
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf63 = new OASRunStepStreamEventOneOf6();
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf64 = new OASRunStepStreamEventOneOf6();

        System.assert(runStepStreamEventOneOf61.equals(runStepStreamEventOneOf62));
        System.assert(runStepStreamEventOneOf62.equals(runStepStreamEventOneOf61));
        System.assert(runStepStreamEventOneOf63.equals(runStepStreamEventOneOf64));
        System.assert(runStepStreamEventOneOf64.equals(runStepStreamEventOneOf63));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf61 = OASRunStepStreamEventOneOf6.getExample();
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf62 = new OASRunStepStreamEventOneOf6();

        System.assertEquals(false, runStepStreamEventOneOf61.equals('foo'));
        System.assertEquals(false, runStepStreamEventOneOf62.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf61 = OASRunStepStreamEventOneOf6.getExample();
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf62 = new OASRunStepStreamEventOneOf6();
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf63;

        System.assertEquals(false, runStepStreamEventOneOf61.equals(runStepStreamEventOneOf63));
        System.assertEquals(false, runStepStreamEventOneOf62.equals(runStepStreamEventOneOf63));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf61 = OASRunStepStreamEventOneOf6.getExample();
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf62 = new OASRunStepStreamEventOneOf6();

        System.assertEquals(runStepStreamEventOneOf61.hashCode(), runStepStreamEventOneOf61.hashCode());
        System.assertEquals(runStepStreamEventOneOf62.hashCode(), runStepStreamEventOneOf62.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf61 = OASRunStepStreamEventOneOf6.getExample();
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf62 = OASRunStepStreamEventOneOf6.getExample();
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf63 = new OASRunStepStreamEventOneOf6();
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf64 = new OASRunStepStreamEventOneOf6();

        System.assert(runStepStreamEventOneOf61.equals(runStepStreamEventOneOf62));
        System.assert(runStepStreamEventOneOf63.equals(runStepStreamEventOneOf64));
        System.assertEquals(runStepStreamEventOneOf61.hashCode(), runStepStreamEventOneOf62.hashCode());
        System.assertEquals(runStepStreamEventOneOf63.hashCode(), runStepStreamEventOneOf64.hashCode());
    }
}
