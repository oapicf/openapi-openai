@isTest
private class OASRunStepStreamEventOneOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepStreamEventOneOf runStepStreamEventOneOf1 = OASRunStepStreamEventOneOf.getExample();
        OASRunStepStreamEventOneOf runStepStreamEventOneOf2 = runStepStreamEventOneOf1;
        OASRunStepStreamEventOneOf runStepStreamEventOneOf3 = new OASRunStepStreamEventOneOf();
        OASRunStepStreamEventOneOf runStepStreamEventOneOf4 = runStepStreamEventOneOf3;

        System.assert(runStepStreamEventOneOf1.equals(runStepStreamEventOneOf2));
        System.assert(runStepStreamEventOneOf2.equals(runStepStreamEventOneOf1));
        System.assert(runStepStreamEventOneOf1.equals(runStepStreamEventOneOf1));
        System.assert(runStepStreamEventOneOf3.equals(runStepStreamEventOneOf4));
        System.assert(runStepStreamEventOneOf4.equals(runStepStreamEventOneOf3));
        System.assert(runStepStreamEventOneOf3.equals(runStepStreamEventOneOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepStreamEventOneOf runStepStreamEventOneOf1 = OASRunStepStreamEventOneOf.getExample();
        OASRunStepStreamEventOneOf runStepStreamEventOneOf2 = OASRunStepStreamEventOneOf.getExample();
        OASRunStepStreamEventOneOf runStepStreamEventOneOf3 = new OASRunStepStreamEventOneOf();
        OASRunStepStreamEventOneOf runStepStreamEventOneOf4 = new OASRunStepStreamEventOneOf();

        System.assert(runStepStreamEventOneOf1.equals(runStepStreamEventOneOf2));
        System.assert(runStepStreamEventOneOf2.equals(runStepStreamEventOneOf1));
        System.assert(runStepStreamEventOneOf3.equals(runStepStreamEventOneOf4));
        System.assert(runStepStreamEventOneOf4.equals(runStepStreamEventOneOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepStreamEventOneOf runStepStreamEventOneOf1 = OASRunStepStreamEventOneOf.getExample();
        OASRunStepStreamEventOneOf runStepStreamEventOneOf2 = new OASRunStepStreamEventOneOf();

        System.assertEquals(false, runStepStreamEventOneOf1.equals('foo'));
        System.assertEquals(false, runStepStreamEventOneOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepStreamEventOneOf runStepStreamEventOneOf1 = OASRunStepStreamEventOneOf.getExample();
        OASRunStepStreamEventOneOf runStepStreamEventOneOf2 = new OASRunStepStreamEventOneOf();
        OASRunStepStreamEventOneOf runStepStreamEventOneOf3;

        System.assertEquals(false, runStepStreamEventOneOf1.equals(runStepStreamEventOneOf3));
        System.assertEquals(false, runStepStreamEventOneOf2.equals(runStepStreamEventOneOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepStreamEventOneOf runStepStreamEventOneOf1 = OASRunStepStreamEventOneOf.getExample();
        OASRunStepStreamEventOneOf runStepStreamEventOneOf2 = new OASRunStepStreamEventOneOf();

        System.assertEquals(runStepStreamEventOneOf1.hashCode(), runStepStreamEventOneOf1.hashCode());
        System.assertEquals(runStepStreamEventOneOf2.hashCode(), runStepStreamEventOneOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepStreamEventOneOf runStepStreamEventOneOf1 = OASRunStepStreamEventOneOf.getExample();
        OASRunStepStreamEventOneOf runStepStreamEventOneOf2 = OASRunStepStreamEventOneOf.getExample();
        OASRunStepStreamEventOneOf runStepStreamEventOneOf3 = new OASRunStepStreamEventOneOf();
        OASRunStepStreamEventOneOf runStepStreamEventOneOf4 = new OASRunStepStreamEventOneOf();

        System.assert(runStepStreamEventOneOf1.equals(runStepStreamEventOneOf2));
        System.assert(runStepStreamEventOneOf3.equals(runStepStreamEventOneOf4));
        System.assertEquals(runStepStreamEventOneOf1.hashCode(), runStepStreamEventOneOf2.hashCode());
        System.assertEquals(runStepStreamEventOneOf3.hashCode(), runStepStreamEventOneOf4.hashCode());
    }
}
