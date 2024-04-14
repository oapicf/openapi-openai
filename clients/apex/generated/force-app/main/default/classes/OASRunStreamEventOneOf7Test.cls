@isTest
private class OASRunStreamEventOneOf7Test {
    @isTest
    private static void equalsSameInstance() {
        OASRunStreamEventOneOf7 runStreamEventOneOf71 = OASRunStreamEventOneOf7.getExample();
        OASRunStreamEventOneOf7 runStreamEventOneOf72 = runStreamEventOneOf71;
        OASRunStreamEventOneOf7 runStreamEventOneOf73 = new OASRunStreamEventOneOf7();
        OASRunStreamEventOneOf7 runStreamEventOneOf74 = runStreamEventOneOf73;

        System.assert(runStreamEventOneOf71.equals(runStreamEventOneOf72));
        System.assert(runStreamEventOneOf72.equals(runStreamEventOneOf71));
        System.assert(runStreamEventOneOf71.equals(runStreamEventOneOf71));
        System.assert(runStreamEventOneOf73.equals(runStreamEventOneOf74));
        System.assert(runStreamEventOneOf74.equals(runStreamEventOneOf73));
        System.assert(runStreamEventOneOf73.equals(runStreamEventOneOf73));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStreamEventOneOf7 runStreamEventOneOf71 = OASRunStreamEventOneOf7.getExample();
        OASRunStreamEventOneOf7 runStreamEventOneOf72 = OASRunStreamEventOneOf7.getExample();
        OASRunStreamEventOneOf7 runStreamEventOneOf73 = new OASRunStreamEventOneOf7();
        OASRunStreamEventOneOf7 runStreamEventOneOf74 = new OASRunStreamEventOneOf7();

        System.assert(runStreamEventOneOf71.equals(runStreamEventOneOf72));
        System.assert(runStreamEventOneOf72.equals(runStreamEventOneOf71));
        System.assert(runStreamEventOneOf73.equals(runStreamEventOneOf74));
        System.assert(runStreamEventOneOf74.equals(runStreamEventOneOf73));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStreamEventOneOf7 runStreamEventOneOf71 = OASRunStreamEventOneOf7.getExample();
        OASRunStreamEventOneOf7 runStreamEventOneOf72 = new OASRunStreamEventOneOf7();

        System.assertEquals(false, runStreamEventOneOf71.equals('foo'));
        System.assertEquals(false, runStreamEventOneOf72.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStreamEventOneOf7 runStreamEventOneOf71 = OASRunStreamEventOneOf7.getExample();
        OASRunStreamEventOneOf7 runStreamEventOneOf72 = new OASRunStreamEventOneOf7();
        OASRunStreamEventOneOf7 runStreamEventOneOf73;

        System.assertEquals(false, runStreamEventOneOf71.equals(runStreamEventOneOf73));
        System.assertEquals(false, runStreamEventOneOf72.equals(runStreamEventOneOf73));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStreamEventOneOf7 runStreamEventOneOf71 = OASRunStreamEventOneOf7.getExample();
        OASRunStreamEventOneOf7 runStreamEventOneOf72 = new OASRunStreamEventOneOf7();

        System.assertEquals(runStreamEventOneOf71.hashCode(), runStreamEventOneOf71.hashCode());
        System.assertEquals(runStreamEventOneOf72.hashCode(), runStreamEventOneOf72.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStreamEventOneOf7 runStreamEventOneOf71 = OASRunStreamEventOneOf7.getExample();
        OASRunStreamEventOneOf7 runStreamEventOneOf72 = OASRunStreamEventOneOf7.getExample();
        OASRunStreamEventOneOf7 runStreamEventOneOf73 = new OASRunStreamEventOneOf7();
        OASRunStreamEventOneOf7 runStreamEventOneOf74 = new OASRunStreamEventOneOf7();

        System.assert(runStreamEventOneOf71.equals(runStreamEventOneOf72));
        System.assert(runStreamEventOneOf73.equals(runStreamEventOneOf74));
        System.assertEquals(runStreamEventOneOf71.hashCode(), runStreamEventOneOf72.hashCode());
        System.assertEquals(runStreamEventOneOf73.hashCode(), runStreamEventOneOf74.hashCode());
    }
}
