@isTest
private class OASRunStreamEventOneOf5Test {
    @isTest
    private static void equalsSameInstance() {
        OASRunStreamEventOneOf5 runStreamEventOneOf51 = OASRunStreamEventOneOf5.getExample();
        OASRunStreamEventOneOf5 runStreamEventOneOf52 = runStreamEventOneOf51;
        OASRunStreamEventOneOf5 runStreamEventOneOf53 = new OASRunStreamEventOneOf5();
        OASRunStreamEventOneOf5 runStreamEventOneOf54 = runStreamEventOneOf53;

        System.assert(runStreamEventOneOf51.equals(runStreamEventOneOf52));
        System.assert(runStreamEventOneOf52.equals(runStreamEventOneOf51));
        System.assert(runStreamEventOneOf51.equals(runStreamEventOneOf51));
        System.assert(runStreamEventOneOf53.equals(runStreamEventOneOf54));
        System.assert(runStreamEventOneOf54.equals(runStreamEventOneOf53));
        System.assert(runStreamEventOneOf53.equals(runStreamEventOneOf53));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStreamEventOneOf5 runStreamEventOneOf51 = OASRunStreamEventOneOf5.getExample();
        OASRunStreamEventOneOf5 runStreamEventOneOf52 = OASRunStreamEventOneOf5.getExample();
        OASRunStreamEventOneOf5 runStreamEventOneOf53 = new OASRunStreamEventOneOf5();
        OASRunStreamEventOneOf5 runStreamEventOneOf54 = new OASRunStreamEventOneOf5();

        System.assert(runStreamEventOneOf51.equals(runStreamEventOneOf52));
        System.assert(runStreamEventOneOf52.equals(runStreamEventOneOf51));
        System.assert(runStreamEventOneOf53.equals(runStreamEventOneOf54));
        System.assert(runStreamEventOneOf54.equals(runStreamEventOneOf53));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStreamEventOneOf5 runStreamEventOneOf51 = OASRunStreamEventOneOf5.getExample();
        OASRunStreamEventOneOf5 runStreamEventOneOf52 = new OASRunStreamEventOneOf5();

        System.assertEquals(false, runStreamEventOneOf51.equals('foo'));
        System.assertEquals(false, runStreamEventOneOf52.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStreamEventOneOf5 runStreamEventOneOf51 = OASRunStreamEventOneOf5.getExample();
        OASRunStreamEventOneOf5 runStreamEventOneOf52 = new OASRunStreamEventOneOf5();
        OASRunStreamEventOneOf5 runStreamEventOneOf53;

        System.assertEquals(false, runStreamEventOneOf51.equals(runStreamEventOneOf53));
        System.assertEquals(false, runStreamEventOneOf52.equals(runStreamEventOneOf53));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStreamEventOneOf5 runStreamEventOneOf51 = OASRunStreamEventOneOf5.getExample();
        OASRunStreamEventOneOf5 runStreamEventOneOf52 = new OASRunStreamEventOneOf5();

        System.assertEquals(runStreamEventOneOf51.hashCode(), runStreamEventOneOf51.hashCode());
        System.assertEquals(runStreamEventOneOf52.hashCode(), runStreamEventOneOf52.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStreamEventOneOf5 runStreamEventOneOf51 = OASRunStreamEventOneOf5.getExample();
        OASRunStreamEventOneOf5 runStreamEventOneOf52 = OASRunStreamEventOneOf5.getExample();
        OASRunStreamEventOneOf5 runStreamEventOneOf53 = new OASRunStreamEventOneOf5();
        OASRunStreamEventOneOf5 runStreamEventOneOf54 = new OASRunStreamEventOneOf5();

        System.assert(runStreamEventOneOf51.equals(runStreamEventOneOf52));
        System.assert(runStreamEventOneOf53.equals(runStreamEventOneOf54));
        System.assertEquals(runStreamEventOneOf51.hashCode(), runStreamEventOneOf52.hashCode());
        System.assertEquals(runStreamEventOneOf53.hashCode(), runStreamEventOneOf54.hashCode());
    }
}
