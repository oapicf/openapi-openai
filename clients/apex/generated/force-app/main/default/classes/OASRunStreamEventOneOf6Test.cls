@isTest
private class OASRunStreamEventOneOf6Test {
    @isTest
    private static void equalsSameInstance() {
        OASRunStreamEventOneOf6 runStreamEventOneOf61 = OASRunStreamEventOneOf6.getExample();
        OASRunStreamEventOneOf6 runStreamEventOneOf62 = runStreamEventOneOf61;
        OASRunStreamEventOneOf6 runStreamEventOneOf63 = new OASRunStreamEventOneOf6();
        OASRunStreamEventOneOf6 runStreamEventOneOf64 = runStreamEventOneOf63;

        System.assert(runStreamEventOneOf61.equals(runStreamEventOneOf62));
        System.assert(runStreamEventOneOf62.equals(runStreamEventOneOf61));
        System.assert(runStreamEventOneOf61.equals(runStreamEventOneOf61));
        System.assert(runStreamEventOneOf63.equals(runStreamEventOneOf64));
        System.assert(runStreamEventOneOf64.equals(runStreamEventOneOf63));
        System.assert(runStreamEventOneOf63.equals(runStreamEventOneOf63));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStreamEventOneOf6 runStreamEventOneOf61 = OASRunStreamEventOneOf6.getExample();
        OASRunStreamEventOneOf6 runStreamEventOneOf62 = OASRunStreamEventOneOf6.getExample();
        OASRunStreamEventOneOf6 runStreamEventOneOf63 = new OASRunStreamEventOneOf6();
        OASRunStreamEventOneOf6 runStreamEventOneOf64 = new OASRunStreamEventOneOf6();

        System.assert(runStreamEventOneOf61.equals(runStreamEventOneOf62));
        System.assert(runStreamEventOneOf62.equals(runStreamEventOneOf61));
        System.assert(runStreamEventOneOf63.equals(runStreamEventOneOf64));
        System.assert(runStreamEventOneOf64.equals(runStreamEventOneOf63));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStreamEventOneOf6 runStreamEventOneOf61 = OASRunStreamEventOneOf6.getExample();
        OASRunStreamEventOneOf6 runStreamEventOneOf62 = new OASRunStreamEventOneOf6();

        System.assertEquals(false, runStreamEventOneOf61.equals('foo'));
        System.assertEquals(false, runStreamEventOneOf62.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStreamEventOneOf6 runStreamEventOneOf61 = OASRunStreamEventOneOf6.getExample();
        OASRunStreamEventOneOf6 runStreamEventOneOf62 = new OASRunStreamEventOneOf6();
        OASRunStreamEventOneOf6 runStreamEventOneOf63;

        System.assertEquals(false, runStreamEventOneOf61.equals(runStreamEventOneOf63));
        System.assertEquals(false, runStreamEventOneOf62.equals(runStreamEventOneOf63));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStreamEventOneOf6 runStreamEventOneOf61 = OASRunStreamEventOneOf6.getExample();
        OASRunStreamEventOneOf6 runStreamEventOneOf62 = new OASRunStreamEventOneOf6();

        System.assertEquals(runStreamEventOneOf61.hashCode(), runStreamEventOneOf61.hashCode());
        System.assertEquals(runStreamEventOneOf62.hashCode(), runStreamEventOneOf62.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStreamEventOneOf6 runStreamEventOneOf61 = OASRunStreamEventOneOf6.getExample();
        OASRunStreamEventOneOf6 runStreamEventOneOf62 = OASRunStreamEventOneOf6.getExample();
        OASRunStreamEventOneOf6 runStreamEventOneOf63 = new OASRunStreamEventOneOf6();
        OASRunStreamEventOneOf6 runStreamEventOneOf64 = new OASRunStreamEventOneOf6();

        System.assert(runStreamEventOneOf61.equals(runStreamEventOneOf62));
        System.assert(runStreamEventOneOf63.equals(runStreamEventOneOf64));
        System.assertEquals(runStreamEventOneOf61.hashCode(), runStreamEventOneOf62.hashCode());
        System.assertEquals(runStreamEventOneOf63.hashCode(), runStreamEventOneOf64.hashCode());
    }
}
