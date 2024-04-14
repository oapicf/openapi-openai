@isTest
private class OASRunStepStreamEventOneOf2Test {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf21 = OASRunStepStreamEventOneOf2.getExample();
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf22 = runStepStreamEventOneOf21;
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf23 = new OASRunStepStreamEventOneOf2();
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf24 = runStepStreamEventOneOf23;

        System.assert(runStepStreamEventOneOf21.equals(runStepStreamEventOneOf22));
        System.assert(runStepStreamEventOneOf22.equals(runStepStreamEventOneOf21));
        System.assert(runStepStreamEventOneOf21.equals(runStepStreamEventOneOf21));
        System.assert(runStepStreamEventOneOf23.equals(runStepStreamEventOneOf24));
        System.assert(runStepStreamEventOneOf24.equals(runStepStreamEventOneOf23));
        System.assert(runStepStreamEventOneOf23.equals(runStepStreamEventOneOf23));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf21 = OASRunStepStreamEventOneOf2.getExample();
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf22 = OASRunStepStreamEventOneOf2.getExample();
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf23 = new OASRunStepStreamEventOneOf2();
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf24 = new OASRunStepStreamEventOneOf2();

        System.assert(runStepStreamEventOneOf21.equals(runStepStreamEventOneOf22));
        System.assert(runStepStreamEventOneOf22.equals(runStepStreamEventOneOf21));
        System.assert(runStepStreamEventOneOf23.equals(runStepStreamEventOneOf24));
        System.assert(runStepStreamEventOneOf24.equals(runStepStreamEventOneOf23));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf21 = OASRunStepStreamEventOneOf2.getExample();
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf22 = new OASRunStepStreamEventOneOf2();

        System.assertEquals(false, runStepStreamEventOneOf21.equals('foo'));
        System.assertEquals(false, runStepStreamEventOneOf22.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf21 = OASRunStepStreamEventOneOf2.getExample();
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf22 = new OASRunStepStreamEventOneOf2();
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf23;

        System.assertEquals(false, runStepStreamEventOneOf21.equals(runStepStreamEventOneOf23));
        System.assertEquals(false, runStepStreamEventOneOf22.equals(runStepStreamEventOneOf23));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf21 = OASRunStepStreamEventOneOf2.getExample();
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf22 = new OASRunStepStreamEventOneOf2();

        System.assertEquals(runStepStreamEventOneOf21.hashCode(), runStepStreamEventOneOf21.hashCode());
        System.assertEquals(runStepStreamEventOneOf22.hashCode(), runStepStreamEventOneOf22.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf21 = OASRunStepStreamEventOneOf2.getExample();
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf22 = OASRunStepStreamEventOneOf2.getExample();
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf23 = new OASRunStepStreamEventOneOf2();
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf24 = new OASRunStepStreamEventOneOf2();

        System.assert(runStepStreamEventOneOf21.equals(runStepStreamEventOneOf22));
        System.assert(runStepStreamEventOneOf23.equals(runStepStreamEventOneOf24));
        System.assertEquals(runStepStreamEventOneOf21.hashCode(), runStepStreamEventOneOf22.hashCode());
        System.assertEquals(runStepStreamEventOneOf23.hashCode(), runStepStreamEventOneOf24.hashCode());
    }
}
