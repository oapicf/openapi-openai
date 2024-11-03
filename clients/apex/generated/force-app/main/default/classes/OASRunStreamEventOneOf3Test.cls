@isTest
private class OASRunStreamEventOneOf3Test {
    @isTest
    private static void equalsSameInstance() {
        OASRunStreamEventOneOf3 runStreamEventOneOf31 = OASRunStreamEventOneOf3.getExample();
        OASRunStreamEventOneOf3 runStreamEventOneOf32 = runStreamEventOneOf31;
        OASRunStreamEventOneOf3 runStreamEventOneOf33 = new OASRunStreamEventOneOf3();
        OASRunStreamEventOneOf3 runStreamEventOneOf34 = runStreamEventOneOf33;

        System.assert(runStreamEventOneOf31.equals(runStreamEventOneOf32));
        System.assert(runStreamEventOneOf32.equals(runStreamEventOneOf31));
        System.assert(runStreamEventOneOf31.equals(runStreamEventOneOf31));
        System.assert(runStreamEventOneOf33.equals(runStreamEventOneOf34));
        System.assert(runStreamEventOneOf34.equals(runStreamEventOneOf33));
        System.assert(runStreamEventOneOf33.equals(runStreamEventOneOf33));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStreamEventOneOf3 runStreamEventOneOf31 = OASRunStreamEventOneOf3.getExample();
        OASRunStreamEventOneOf3 runStreamEventOneOf32 = OASRunStreamEventOneOf3.getExample();
        OASRunStreamEventOneOf3 runStreamEventOneOf33 = new OASRunStreamEventOneOf3();
        OASRunStreamEventOneOf3 runStreamEventOneOf34 = new OASRunStreamEventOneOf3();

        System.assert(runStreamEventOneOf31.equals(runStreamEventOneOf32));
        System.assert(runStreamEventOneOf32.equals(runStreamEventOneOf31));
        System.assert(runStreamEventOneOf33.equals(runStreamEventOneOf34));
        System.assert(runStreamEventOneOf34.equals(runStreamEventOneOf33));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStreamEventOneOf3 runStreamEventOneOf31 = OASRunStreamEventOneOf3.getExample();
        OASRunStreamEventOneOf3 runStreamEventOneOf32 = new OASRunStreamEventOneOf3();

        System.assertEquals(false, runStreamEventOneOf31.equals('foo'));
        System.assertEquals(false, runStreamEventOneOf32.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStreamEventOneOf3 runStreamEventOneOf31 = OASRunStreamEventOneOf3.getExample();
        OASRunStreamEventOneOf3 runStreamEventOneOf32 = new OASRunStreamEventOneOf3();
        OASRunStreamEventOneOf3 runStreamEventOneOf33;

        System.assertEquals(false, runStreamEventOneOf31.equals(runStreamEventOneOf33));
        System.assertEquals(false, runStreamEventOneOf32.equals(runStreamEventOneOf33));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStreamEventOneOf3 runStreamEventOneOf31 = OASRunStreamEventOneOf3.getExample();
        OASRunStreamEventOneOf3 runStreamEventOneOf32 = new OASRunStreamEventOneOf3();

        System.assertEquals(runStreamEventOneOf31.hashCode(), runStreamEventOneOf31.hashCode());
        System.assertEquals(runStreamEventOneOf32.hashCode(), runStreamEventOneOf32.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStreamEventOneOf3 runStreamEventOneOf31 = OASRunStreamEventOneOf3.getExample();
        OASRunStreamEventOneOf3 runStreamEventOneOf32 = OASRunStreamEventOneOf3.getExample();
        OASRunStreamEventOneOf3 runStreamEventOneOf33 = new OASRunStreamEventOneOf3();
        OASRunStreamEventOneOf3 runStreamEventOneOf34 = new OASRunStreamEventOneOf3();

        System.assert(runStreamEventOneOf31.equals(runStreamEventOneOf32));
        System.assert(runStreamEventOneOf33.equals(runStreamEventOneOf34));
        System.assertEquals(runStreamEventOneOf31.hashCode(), runStreamEventOneOf32.hashCode());
        System.assertEquals(runStreamEventOneOf33.hashCode(), runStreamEventOneOf34.hashCode());
    }
}
