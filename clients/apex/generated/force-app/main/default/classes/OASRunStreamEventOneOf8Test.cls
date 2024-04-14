@isTest
private class OASRunStreamEventOneOf8Test {
    @isTest
    private static void equalsSameInstance() {
        OASRunStreamEventOneOf8 runStreamEventOneOf81 = OASRunStreamEventOneOf8.getExample();
        OASRunStreamEventOneOf8 runStreamEventOneOf82 = runStreamEventOneOf81;
        OASRunStreamEventOneOf8 runStreamEventOneOf83 = new OASRunStreamEventOneOf8();
        OASRunStreamEventOneOf8 runStreamEventOneOf84 = runStreamEventOneOf83;

        System.assert(runStreamEventOneOf81.equals(runStreamEventOneOf82));
        System.assert(runStreamEventOneOf82.equals(runStreamEventOneOf81));
        System.assert(runStreamEventOneOf81.equals(runStreamEventOneOf81));
        System.assert(runStreamEventOneOf83.equals(runStreamEventOneOf84));
        System.assert(runStreamEventOneOf84.equals(runStreamEventOneOf83));
        System.assert(runStreamEventOneOf83.equals(runStreamEventOneOf83));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStreamEventOneOf8 runStreamEventOneOf81 = OASRunStreamEventOneOf8.getExample();
        OASRunStreamEventOneOf8 runStreamEventOneOf82 = OASRunStreamEventOneOf8.getExample();
        OASRunStreamEventOneOf8 runStreamEventOneOf83 = new OASRunStreamEventOneOf8();
        OASRunStreamEventOneOf8 runStreamEventOneOf84 = new OASRunStreamEventOneOf8();

        System.assert(runStreamEventOneOf81.equals(runStreamEventOneOf82));
        System.assert(runStreamEventOneOf82.equals(runStreamEventOneOf81));
        System.assert(runStreamEventOneOf83.equals(runStreamEventOneOf84));
        System.assert(runStreamEventOneOf84.equals(runStreamEventOneOf83));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStreamEventOneOf8 runStreamEventOneOf81 = OASRunStreamEventOneOf8.getExample();
        OASRunStreamEventOneOf8 runStreamEventOneOf82 = new OASRunStreamEventOneOf8();

        System.assertEquals(false, runStreamEventOneOf81.equals('foo'));
        System.assertEquals(false, runStreamEventOneOf82.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStreamEventOneOf8 runStreamEventOneOf81 = OASRunStreamEventOneOf8.getExample();
        OASRunStreamEventOneOf8 runStreamEventOneOf82 = new OASRunStreamEventOneOf8();
        OASRunStreamEventOneOf8 runStreamEventOneOf83;

        System.assertEquals(false, runStreamEventOneOf81.equals(runStreamEventOneOf83));
        System.assertEquals(false, runStreamEventOneOf82.equals(runStreamEventOneOf83));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStreamEventOneOf8 runStreamEventOneOf81 = OASRunStreamEventOneOf8.getExample();
        OASRunStreamEventOneOf8 runStreamEventOneOf82 = new OASRunStreamEventOneOf8();

        System.assertEquals(runStreamEventOneOf81.hashCode(), runStreamEventOneOf81.hashCode());
        System.assertEquals(runStreamEventOneOf82.hashCode(), runStreamEventOneOf82.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStreamEventOneOf8 runStreamEventOneOf81 = OASRunStreamEventOneOf8.getExample();
        OASRunStreamEventOneOf8 runStreamEventOneOf82 = OASRunStreamEventOneOf8.getExample();
        OASRunStreamEventOneOf8 runStreamEventOneOf83 = new OASRunStreamEventOneOf8();
        OASRunStreamEventOneOf8 runStreamEventOneOf84 = new OASRunStreamEventOneOf8();

        System.assert(runStreamEventOneOf81.equals(runStreamEventOneOf82));
        System.assert(runStreamEventOneOf83.equals(runStreamEventOneOf84));
        System.assertEquals(runStreamEventOneOf81.hashCode(), runStreamEventOneOf82.hashCode());
        System.assertEquals(runStreamEventOneOf83.hashCode(), runStreamEventOneOf84.hashCode());
    }
}
