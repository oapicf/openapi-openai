@isTest
private class OASRunStreamEventOneOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStreamEventOneOf runStreamEventOneOf1 = OASRunStreamEventOneOf.getExample();
        OASRunStreamEventOneOf runStreamEventOneOf2 = runStreamEventOneOf1;
        OASRunStreamEventOneOf runStreamEventOneOf3 = new OASRunStreamEventOneOf();
        OASRunStreamEventOneOf runStreamEventOneOf4 = runStreamEventOneOf3;

        System.assert(runStreamEventOneOf1.equals(runStreamEventOneOf2));
        System.assert(runStreamEventOneOf2.equals(runStreamEventOneOf1));
        System.assert(runStreamEventOneOf1.equals(runStreamEventOneOf1));
        System.assert(runStreamEventOneOf3.equals(runStreamEventOneOf4));
        System.assert(runStreamEventOneOf4.equals(runStreamEventOneOf3));
        System.assert(runStreamEventOneOf3.equals(runStreamEventOneOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStreamEventOneOf runStreamEventOneOf1 = OASRunStreamEventOneOf.getExample();
        OASRunStreamEventOneOf runStreamEventOneOf2 = OASRunStreamEventOneOf.getExample();
        OASRunStreamEventOneOf runStreamEventOneOf3 = new OASRunStreamEventOneOf();
        OASRunStreamEventOneOf runStreamEventOneOf4 = new OASRunStreamEventOneOf();

        System.assert(runStreamEventOneOf1.equals(runStreamEventOneOf2));
        System.assert(runStreamEventOneOf2.equals(runStreamEventOneOf1));
        System.assert(runStreamEventOneOf3.equals(runStreamEventOneOf4));
        System.assert(runStreamEventOneOf4.equals(runStreamEventOneOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStreamEventOneOf runStreamEventOneOf1 = OASRunStreamEventOneOf.getExample();
        OASRunStreamEventOneOf runStreamEventOneOf2 = new OASRunStreamEventOneOf();

        System.assertEquals(false, runStreamEventOneOf1.equals('foo'));
        System.assertEquals(false, runStreamEventOneOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStreamEventOneOf runStreamEventOneOf1 = OASRunStreamEventOneOf.getExample();
        OASRunStreamEventOneOf runStreamEventOneOf2 = new OASRunStreamEventOneOf();
        OASRunStreamEventOneOf runStreamEventOneOf3;

        System.assertEquals(false, runStreamEventOneOf1.equals(runStreamEventOneOf3));
        System.assertEquals(false, runStreamEventOneOf2.equals(runStreamEventOneOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStreamEventOneOf runStreamEventOneOf1 = OASRunStreamEventOneOf.getExample();
        OASRunStreamEventOneOf runStreamEventOneOf2 = new OASRunStreamEventOneOf();

        System.assertEquals(runStreamEventOneOf1.hashCode(), runStreamEventOneOf1.hashCode());
        System.assertEquals(runStreamEventOneOf2.hashCode(), runStreamEventOneOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStreamEventOneOf runStreamEventOneOf1 = OASRunStreamEventOneOf.getExample();
        OASRunStreamEventOneOf runStreamEventOneOf2 = OASRunStreamEventOneOf.getExample();
        OASRunStreamEventOneOf runStreamEventOneOf3 = new OASRunStreamEventOneOf();
        OASRunStreamEventOneOf runStreamEventOneOf4 = new OASRunStreamEventOneOf();

        System.assert(runStreamEventOneOf1.equals(runStreamEventOneOf2));
        System.assert(runStreamEventOneOf3.equals(runStreamEventOneOf4));
        System.assertEquals(runStreamEventOneOf1.hashCode(), runStreamEventOneOf2.hashCode());
        System.assertEquals(runStreamEventOneOf3.hashCode(), runStreamEventOneOf4.hashCode());
    }
}
