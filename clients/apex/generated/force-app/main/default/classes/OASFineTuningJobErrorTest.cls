@isTest
private class OASFineTuningJobErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuningJobError fineTuningJobError1 = OASFineTuningJobError.getExample();
        OASFineTuningJobError fineTuningJobError2 = fineTuningJobError1;
        OASFineTuningJobError fineTuningJobError3 = new OASFineTuningJobError();
        OASFineTuningJobError fineTuningJobError4 = fineTuningJobError3;

        System.assert(fineTuningJobError1.equals(fineTuningJobError2));
        System.assert(fineTuningJobError2.equals(fineTuningJobError1));
        System.assert(fineTuningJobError1.equals(fineTuningJobError1));
        System.assert(fineTuningJobError3.equals(fineTuningJobError4));
        System.assert(fineTuningJobError4.equals(fineTuningJobError3));
        System.assert(fineTuningJobError3.equals(fineTuningJobError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuningJobError fineTuningJobError1 = OASFineTuningJobError.getExample();
        OASFineTuningJobError fineTuningJobError2 = OASFineTuningJobError.getExample();
        OASFineTuningJobError fineTuningJobError3 = new OASFineTuningJobError();
        OASFineTuningJobError fineTuningJobError4 = new OASFineTuningJobError();

        System.assert(fineTuningJobError1.equals(fineTuningJobError2));
        System.assert(fineTuningJobError2.equals(fineTuningJobError1));
        System.assert(fineTuningJobError3.equals(fineTuningJobError4));
        System.assert(fineTuningJobError4.equals(fineTuningJobError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuningJobError fineTuningJobError1 = OASFineTuningJobError.getExample();
        OASFineTuningJobError fineTuningJobError2 = new OASFineTuningJobError();

        System.assertEquals(false, fineTuningJobError1.equals('foo'));
        System.assertEquals(false, fineTuningJobError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuningJobError fineTuningJobError1 = OASFineTuningJobError.getExample();
        OASFineTuningJobError fineTuningJobError2 = new OASFineTuningJobError();
        OASFineTuningJobError fineTuningJobError3;

        System.assertEquals(false, fineTuningJobError1.equals(fineTuningJobError3));
        System.assertEquals(false, fineTuningJobError2.equals(fineTuningJobError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuningJobError fineTuningJobError1 = OASFineTuningJobError.getExample();
        OASFineTuningJobError fineTuningJobError2 = new OASFineTuningJobError();

        System.assertEquals(fineTuningJobError1.hashCode(), fineTuningJobError1.hashCode());
        System.assertEquals(fineTuningJobError2.hashCode(), fineTuningJobError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuningJobError fineTuningJobError1 = OASFineTuningJobError.getExample();
        OASFineTuningJobError fineTuningJobError2 = OASFineTuningJobError.getExample();
        OASFineTuningJobError fineTuningJobError3 = new OASFineTuningJobError();
        OASFineTuningJobError fineTuningJobError4 = new OASFineTuningJobError();

        System.assert(fineTuningJobError1.equals(fineTuningJobError2));
        System.assert(fineTuningJobError3.equals(fineTuningJobError4));
        System.assertEquals(fineTuningJobError1.hashCode(), fineTuningJobError2.hashCode());
        System.assertEquals(fineTuningJobError3.hashCode(), fineTuningJobError4.hashCode());
    }
}
