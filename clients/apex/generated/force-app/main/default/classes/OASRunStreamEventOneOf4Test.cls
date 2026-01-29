@isTest
private class OASRunStreamEventOneOf4Test {
    @isTest
    private static void equalsSameInstance() {
        OASRunStreamEventOneOf4 runStreamEventOneOf41 = OASRunStreamEventOneOf4.getExample();
        OASRunStreamEventOneOf4 runStreamEventOneOf42 = runStreamEventOneOf41;
        OASRunStreamEventOneOf4 runStreamEventOneOf43 = new OASRunStreamEventOneOf4();
        OASRunStreamEventOneOf4 runStreamEventOneOf44 = runStreamEventOneOf43;

        System.assert(runStreamEventOneOf41.equals(runStreamEventOneOf42));
        System.assert(runStreamEventOneOf42.equals(runStreamEventOneOf41));
        System.assert(runStreamEventOneOf41.equals(runStreamEventOneOf41));
        System.assert(runStreamEventOneOf43.equals(runStreamEventOneOf44));
        System.assert(runStreamEventOneOf44.equals(runStreamEventOneOf43));
        System.assert(runStreamEventOneOf43.equals(runStreamEventOneOf43));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStreamEventOneOf4 runStreamEventOneOf41 = OASRunStreamEventOneOf4.getExample();
        OASRunStreamEventOneOf4 runStreamEventOneOf42 = OASRunStreamEventOneOf4.getExample();
        OASRunStreamEventOneOf4 runStreamEventOneOf43 = new OASRunStreamEventOneOf4();
        OASRunStreamEventOneOf4 runStreamEventOneOf44 = new OASRunStreamEventOneOf4();

        System.assert(runStreamEventOneOf41.equals(runStreamEventOneOf42));
        System.assert(runStreamEventOneOf42.equals(runStreamEventOneOf41));
        System.assert(runStreamEventOneOf43.equals(runStreamEventOneOf44));
        System.assert(runStreamEventOneOf44.equals(runStreamEventOneOf43));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStreamEventOneOf4 runStreamEventOneOf41 = OASRunStreamEventOneOf4.getExample();
        OASRunStreamEventOneOf4 runStreamEventOneOf42 = new OASRunStreamEventOneOf4();

        System.assertEquals(false, runStreamEventOneOf41.equals('foo'));
        System.assertEquals(false, runStreamEventOneOf42.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStreamEventOneOf4 runStreamEventOneOf41 = OASRunStreamEventOneOf4.getExample();
        OASRunStreamEventOneOf4 runStreamEventOneOf42 = new OASRunStreamEventOneOf4();
        OASRunStreamEventOneOf4 runStreamEventOneOf43;

        System.assertEquals(false, runStreamEventOneOf41.equals(runStreamEventOneOf43));
        System.assertEquals(false, runStreamEventOneOf42.equals(runStreamEventOneOf43));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStreamEventOneOf4 runStreamEventOneOf41 = OASRunStreamEventOneOf4.getExample();
        OASRunStreamEventOneOf4 runStreamEventOneOf42 = new OASRunStreamEventOneOf4();

        System.assertEquals(runStreamEventOneOf41.hashCode(), runStreamEventOneOf41.hashCode());
        System.assertEquals(runStreamEventOneOf42.hashCode(), runStreamEventOneOf42.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStreamEventOneOf4 runStreamEventOneOf41 = OASRunStreamEventOneOf4.getExample();
        OASRunStreamEventOneOf4 runStreamEventOneOf42 = OASRunStreamEventOneOf4.getExample();
        OASRunStreamEventOneOf4 runStreamEventOneOf43 = new OASRunStreamEventOneOf4();
        OASRunStreamEventOneOf4 runStreamEventOneOf44 = new OASRunStreamEventOneOf4();

        System.assert(runStreamEventOneOf41.equals(runStreamEventOneOf42));
        System.assert(runStreamEventOneOf43.equals(runStreamEventOneOf44));
        System.assertEquals(runStreamEventOneOf41.hashCode(), runStreamEventOneOf42.hashCode());
        System.assertEquals(runStreamEventOneOf43.hashCode(), runStreamEventOneOf44.hashCode());
    }
}
