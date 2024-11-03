@isTest
private class OASErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASError error1 = OASError.getExample();
        OASError error2 = error1;
        OASError error3 = new OASError();
        OASError error4 = error3;

        System.assert(error1.equals(error2));
        System.assert(error2.equals(error1));
        System.assert(error1.equals(error1));
        System.assert(error3.equals(error4));
        System.assert(error4.equals(error3));
        System.assert(error3.equals(error3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASError error1 = OASError.getExample();
        OASError error2 = OASError.getExample();
        OASError error3 = new OASError();
        OASError error4 = new OASError();

        System.assert(error1.equals(error2));
        System.assert(error2.equals(error1));
        System.assert(error3.equals(error4));
        System.assert(error4.equals(error3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASError error1 = OASError.getExample();
        OASError error2 = new OASError();

        System.assertEquals(false, error1.equals('foo'));
        System.assertEquals(false, error2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASError error1 = OASError.getExample();
        OASError error2 = new OASError();
        OASError error3;

        System.assertEquals(false, error1.equals(error3));
        System.assertEquals(false, error2.equals(error3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASError error1 = OASError.getExample();
        OASError error2 = new OASError();

        System.assertEquals(error1.hashCode(), error1.hashCode());
        System.assertEquals(error2.hashCode(), error2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASError error1 = OASError.getExample();
        OASError error2 = OASError.getExample();
        OASError error3 = new OASError();
        OASError error4 = new OASError();

        System.assert(error1.equals(error2));
        System.assert(error3.equals(error4));
        System.assertEquals(error1.hashCode(), error2.hashCode());
        System.assertEquals(error3.hashCode(), error4.hashCode());
    }
}
