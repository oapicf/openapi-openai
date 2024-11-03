@isTest
private class OASRunStreamEventOneOf1Test {
    @isTest
    private static void equalsSameInstance() {
        OASRunStreamEventOneOf1 runStreamEventOneOf11 = OASRunStreamEventOneOf1.getExample();
        OASRunStreamEventOneOf1 runStreamEventOneOf12 = runStreamEventOneOf11;
        OASRunStreamEventOneOf1 runStreamEventOneOf13 = new OASRunStreamEventOneOf1();
        OASRunStreamEventOneOf1 runStreamEventOneOf14 = runStreamEventOneOf13;

        System.assert(runStreamEventOneOf11.equals(runStreamEventOneOf12));
        System.assert(runStreamEventOneOf12.equals(runStreamEventOneOf11));
        System.assert(runStreamEventOneOf11.equals(runStreamEventOneOf11));
        System.assert(runStreamEventOneOf13.equals(runStreamEventOneOf14));
        System.assert(runStreamEventOneOf14.equals(runStreamEventOneOf13));
        System.assert(runStreamEventOneOf13.equals(runStreamEventOneOf13));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStreamEventOneOf1 runStreamEventOneOf11 = OASRunStreamEventOneOf1.getExample();
        OASRunStreamEventOneOf1 runStreamEventOneOf12 = OASRunStreamEventOneOf1.getExample();
        OASRunStreamEventOneOf1 runStreamEventOneOf13 = new OASRunStreamEventOneOf1();
        OASRunStreamEventOneOf1 runStreamEventOneOf14 = new OASRunStreamEventOneOf1();

        System.assert(runStreamEventOneOf11.equals(runStreamEventOneOf12));
        System.assert(runStreamEventOneOf12.equals(runStreamEventOneOf11));
        System.assert(runStreamEventOneOf13.equals(runStreamEventOneOf14));
        System.assert(runStreamEventOneOf14.equals(runStreamEventOneOf13));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStreamEventOneOf1 runStreamEventOneOf11 = OASRunStreamEventOneOf1.getExample();
        OASRunStreamEventOneOf1 runStreamEventOneOf12 = new OASRunStreamEventOneOf1();

        System.assertEquals(false, runStreamEventOneOf11.equals('foo'));
        System.assertEquals(false, runStreamEventOneOf12.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStreamEventOneOf1 runStreamEventOneOf11 = OASRunStreamEventOneOf1.getExample();
        OASRunStreamEventOneOf1 runStreamEventOneOf12 = new OASRunStreamEventOneOf1();
        OASRunStreamEventOneOf1 runStreamEventOneOf13;

        System.assertEquals(false, runStreamEventOneOf11.equals(runStreamEventOneOf13));
        System.assertEquals(false, runStreamEventOneOf12.equals(runStreamEventOneOf13));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStreamEventOneOf1 runStreamEventOneOf11 = OASRunStreamEventOneOf1.getExample();
        OASRunStreamEventOneOf1 runStreamEventOneOf12 = new OASRunStreamEventOneOf1();

        System.assertEquals(runStreamEventOneOf11.hashCode(), runStreamEventOneOf11.hashCode());
        System.assertEquals(runStreamEventOneOf12.hashCode(), runStreamEventOneOf12.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStreamEventOneOf1 runStreamEventOneOf11 = OASRunStreamEventOneOf1.getExample();
        OASRunStreamEventOneOf1 runStreamEventOneOf12 = OASRunStreamEventOneOf1.getExample();
        OASRunStreamEventOneOf1 runStreamEventOneOf13 = new OASRunStreamEventOneOf1();
        OASRunStreamEventOneOf1 runStreamEventOneOf14 = new OASRunStreamEventOneOf1();

        System.assert(runStreamEventOneOf11.equals(runStreamEventOneOf12));
        System.assert(runStreamEventOneOf13.equals(runStreamEventOneOf14));
        System.assertEquals(runStreamEventOneOf11.hashCode(), runStreamEventOneOf12.hashCode());
        System.assertEquals(runStreamEventOneOf13.hashCode(), runStreamEventOneOf14.hashCode());
    }
}
