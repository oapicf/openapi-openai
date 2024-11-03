@isTest
private class OASRunStreamEventOneOf2Test {
    @isTest
    private static void equalsSameInstance() {
        OASRunStreamEventOneOf2 runStreamEventOneOf21 = OASRunStreamEventOneOf2.getExample();
        OASRunStreamEventOneOf2 runStreamEventOneOf22 = runStreamEventOneOf21;
        OASRunStreamEventOneOf2 runStreamEventOneOf23 = new OASRunStreamEventOneOf2();
        OASRunStreamEventOneOf2 runStreamEventOneOf24 = runStreamEventOneOf23;

        System.assert(runStreamEventOneOf21.equals(runStreamEventOneOf22));
        System.assert(runStreamEventOneOf22.equals(runStreamEventOneOf21));
        System.assert(runStreamEventOneOf21.equals(runStreamEventOneOf21));
        System.assert(runStreamEventOneOf23.equals(runStreamEventOneOf24));
        System.assert(runStreamEventOneOf24.equals(runStreamEventOneOf23));
        System.assert(runStreamEventOneOf23.equals(runStreamEventOneOf23));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStreamEventOneOf2 runStreamEventOneOf21 = OASRunStreamEventOneOf2.getExample();
        OASRunStreamEventOneOf2 runStreamEventOneOf22 = OASRunStreamEventOneOf2.getExample();
        OASRunStreamEventOneOf2 runStreamEventOneOf23 = new OASRunStreamEventOneOf2();
        OASRunStreamEventOneOf2 runStreamEventOneOf24 = new OASRunStreamEventOneOf2();

        System.assert(runStreamEventOneOf21.equals(runStreamEventOneOf22));
        System.assert(runStreamEventOneOf22.equals(runStreamEventOneOf21));
        System.assert(runStreamEventOneOf23.equals(runStreamEventOneOf24));
        System.assert(runStreamEventOneOf24.equals(runStreamEventOneOf23));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStreamEventOneOf2 runStreamEventOneOf21 = OASRunStreamEventOneOf2.getExample();
        OASRunStreamEventOneOf2 runStreamEventOneOf22 = new OASRunStreamEventOneOf2();

        System.assertEquals(false, runStreamEventOneOf21.equals('foo'));
        System.assertEquals(false, runStreamEventOneOf22.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStreamEventOneOf2 runStreamEventOneOf21 = OASRunStreamEventOneOf2.getExample();
        OASRunStreamEventOneOf2 runStreamEventOneOf22 = new OASRunStreamEventOneOf2();
        OASRunStreamEventOneOf2 runStreamEventOneOf23;

        System.assertEquals(false, runStreamEventOneOf21.equals(runStreamEventOneOf23));
        System.assertEquals(false, runStreamEventOneOf22.equals(runStreamEventOneOf23));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStreamEventOneOf2 runStreamEventOneOf21 = OASRunStreamEventOneOf2.getExample();
        OASRunStreamEventOneOf2 runStreamEventOneOf22 = new OASRunStreamEventOneOf2();

        System.assertEquals(runStreamEventOneOf21.hashCode(), runStreamEventOneOf21.hashCode());
        System.assertEquals(runStreamEventOneOf22.hashCode(), runStreamEventOneOf22.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStreamEventOneOf2 runStreamEventOneOf21 = OASRunStreamEventOneOf2.getExample();
        OASRunStreamEventOneOf2 runStreamEventOneOf22 = OASRunStreamEventOneOf2.getExample();
        OASRunStreamEventOneOf2 runStreamEventOneOf23 = new OASRunStreamEventOneOf2();
        OASRunStreamEventOneOf2 runStreamEventOneOf24 = new OASRunStreamEventOneOf2();

        System.assert(runStreamEventOneOf21.equals(runStreamEventOneOf22));
        System.assert(runStreamEventOneOf23.equals(runStreamEventOneOf24));
        System.assertEquals(runStreamEventOneOf21.hashCode(), runStreamEventOneOf22.hashCode());
        System.assertEquals(runStreamEventOneOf23.hashCode(), runStreamEventOneOf24.hashCode());
    }
}
