@isTest
private class OASRunStepObjectLastErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepObjectLastError runStepObjectLastError1 = OASRunStepObjectLastError.getExample();
        OASRunStepObjectLastError runStepObjectLastError2 = runStepObjectLastError1;
        OASRunStepObjectLastError runStepObjectLastError3 = new OASRunStepObjectLastError();
        OASRunStepObjectLastError runStepObjectLastError4 = runStepObjectLastError3;

        System.assert(runStepObjectLastError1.equals(runStepObjectLastError2));
        System.assert(runStepObjectLastError2.equals(runStepObjectLastError1));
        System.assert(runStepObjectLastError1.equals(runStepObjectLastError1));
        System.assert(runStepObjectLastError3.equals(runStepObjectLastError4));
        System.assert(runStepObjectLastError4.equals(runStepObjectLastError3));
        System.assert(runStepObjectLastError3.equals(runStepObjectLastError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepObjectLastError runStepObjectLastError1 = OASRunStepObjectLastError.getExample();
        OASRunStepObjectLastError runStepObjectLastError2 = OASRunStepObjectLastError.getExample();
        OASRunStepObjectLastError runStepObjectLastError3 = new OASRunStepObjectLastError();
        OASRunStepObjectLastError runStepObjectLastError4 = new OASRunStepObjectLastError();

        System.assert(runStepObjectLastError1.equals(runStepObjectLastError2));
        System.assert(runStepObjectLastError2.equals(runStepObjectLastError1));
        System.assert(runStepObjectLastError3.equals(runStepObjectLastError4));
        System.assert(runStepObjectLastError4.equals(runStepObjectLastError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepObjectLastError runStepObjectLastError1 = OASRunStepObjectLastError.getExample();
        OASRunStepObjectLastError runStepObjectLastError2 = new OASRunStepObjectLastError();

        System.assertEquals(false, runStepObjectLastError1.equals('foo'));
        System.assertEquals(false, runStepObjectLastError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepObjectLastError runStepObjectLastError1 = OASRunStepObjectLastError.getExample();
        OASRunStepObjectLastError runStepObjectLastError2 = new OASRunStepObjectLastError();
        OASRunStepObjectLastError runStepObjectLastError3;

        System.assertEquals(false, runStepObjectLastError1.equals(runStepObjectLastError3));
        System.assertEquals(false, runStepObjectLastError2.equals(runStepObjectLastError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepObjectLastError runStepObjectLastError1 = OASRunStepObjectLastError.getExample();
        OASRunStepObjectLastError runStepObjectLastError2 = new OASRunStepObjectLastError();

        System.assertEquals(runStepObjectLastError1.hashCode(), runStepObjectLastError1.hashCode());
        System.assertEquals(runStepObjectLastError2.hashCode(), runStepObjectLastError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepObjectLastError runStepObjectLastError1 = OASRunStepObjectLastError.getExample();
        OASRunStepObjectLastError runStepObjectLastError2 = OASRunStepObjectLastError.getExample();
        OASRunStepObjectLastError runStepObjectLastError3 = new OASRunStepObjectLastError();
        OASRunStepObjectLastError runStepObjectLastError4 = new OASRunStepObjectLastError();

        System.assert(runStepObjectLastError1.equals(runStepObjectLastError2));
        System.assert(runStepObjectLastError3.equals(runStepObjectLastError4));
        System.assertEquals(runStepObjectLastError1.hashCode(), runStepObjectLastError2.hashCode());
        System.assertEquals(runStepObjectLastError3.hashCode(), runStepObjectLastError4.hashCode());
    }
}
