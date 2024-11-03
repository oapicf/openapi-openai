@isTest
private class OASRunObjectLastErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunObjectLastError runObjectLastError1 = OASRunObjectLastError.getExample();
        OASRunObjectLastError runObjectLastError2 = runObjectLastError1;
        OASRunObjectLastError runObjectLastError3 = new OASRunObjectLastError();
        OASRunObjectLastError runObjectLastError4 = runObjectLastError3;

        System.assert(runObjectLastError1.equals(runObjectLastError2));
        System.assert(runObjectLastError2.equals(runObjectLastError1));
        System.assert(runObjectLastError1.equals(runObjectLastError1));
        System.assert(runObjectLastError3.equals(runObjectLastError4));
        System.assert(runObjectLastError4.equals(runObjectLastError3));
        System.assert(runObjectLastError3.equals(runObjectLastError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunObjectLastError runObjectLastError1 = OASRunObjectLastError.getExample();
        OASRunObjectLastError runObjectLastError2 = OASRunObjectLastError.getExample();
        OASRunObjectLastError runObjectLastError3 = new OASRunObjectLastError();
        OASRunObjectLastError runObjectLastError4 = new OASRunObjectLastError();

        System.assert(runObjectLastError1.equals(runObjectLastError2));
        System.assert(runObjectLastError2.equals(runObjectLastError1));
        System.assert(runObjectLastError3.equals(runObjectLastError4));
        System.assert(runObjectLastError4.equals(runObjectLastError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunObjectLastError runObjectLastError1 = OASRunObjectLastError.getExample();
        OASRunObjectLastError runObjectLastError2 = new OASRunObjectLastError();

        System.assertEquals(false, runObjectLastError1.equals('foo'));
        System.assertEquals(false, runObjectLastError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunObjectLastError runObjectLastError1 = OASRunObjectLastError.getExample();
        OASRunObjectLastError runObjectLastError2 = new OASRunObjectLastError();
        OASRunObjectLastError runObjectLastError3;

        System.assertEquals(false, runObjectLastError1.equals(runObjectLastError3));
        System.assertEquals(false, runObjectLastError2.equals(runObjectLastError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunObjectLastError runObjectLastError1 = OASRunObjectLastError.getExample();
        OASRunObjectLastError runObjectLastError2 = new OASRunObjectLastError();

        System.assertEquals(runObjectLastError1.hashCode(), runObjectLastError1.hashCode());
        System.assertEquals(runObjectLastError2.hashCode(), runObjectLastError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunObjectLastError runObjectLastError1 = OASRunObjectLastError.getExample();
        OASRunObjectLastError runObjectLastError2 = OASRunObjectLastError.getExample();
        OASRunObjectLastError runObjectLastError3 = new OASRunObjectLastError();
        OASRunObjectLastError runObjectLastError4 = new OASRunObjectLastError();

        System.assert(runObjectLastError1.equals(runObjectLastError2));
        System.assert(runObjectLastError3.equals(runObjectLastError4));
        System.assertEquals(runObjectLastError1.hashCode(), runObjectLastError2.hashCode());
        System.assertEquals(runObjectLastError3.hashCode(), runObjectLastError4.hashCode());
    }
}
