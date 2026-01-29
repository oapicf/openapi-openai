@isTest
private class OASCreateFineTuningJobRequestModelTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel1 = OASCreateFineTuningJobRequestModel.getExample();
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel2 = createFineTuningJobRequestModel1;
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel3 = new OASCreateFineTuningJobRequestModel();
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel4 = createFineTuningJobRequestModel3;

        System.assert(createFineTuningJobRequestModel1.equals(createFineTuningJobRequestModel2));
        System.assert(createFineTuningJobRequestModel2.equals(createFineTuningJobRequestModel1));
        System.assert(createFineTuningJobRequestModel1.equals(createFineTuningJobRequestModel1));
        System.assert(createFineTuningJobRequestModel3.equals(createFineTuningJobRequestModel4));
        System.assert(createFineTuningJobRequestModel4.equals(createFineTuningJobRequestModel3));
        System.assert(createFineTuningJobRequestModel3.equals(createFineTuningJobRequestModel3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel1 = OASCreateFineTuningJobRequestModel.getExample();
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel2 = OASCreateFineTuningJobRequestModel.getExample();
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel3 = new OASCreateFineTuningJobRequestModel();
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel4 = new OASCreateFineTuningJobRequestModel();

        System.assert(createFineTuningJobRequestModel1.equals(createFineTuningJobRequestModel2));
        System.assert(createFineTuningJobRequestModel2.equals(createFineTuningJobRequestModel1));
        System.assert(createFineTuningJobRequestModel3.equals(createFineTuningJobRequestModel4));
        System.assert(createFineTuningJobRequestModel4.equals(createFineTuningJobRequestModel3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel1 = OASCreateFineTuningJobRequestModel.getExample();
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel2 = new OASCreateFineTuningJobRequestModel();

        System.assertEquals(false, createFineTuningJobRequestModel1.equals('foo'));
        System.assertEquals(false, createFineTuningJobRequestModel2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel1 = OASCreateFineTuningJobRequestModel.getExample();
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel2 = new OASCreateFineTuningJobRequestModel();
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel3;

        System.assertEquals(false, createFineTuningJobRequestModel1.equals(createFineTuningJobRequestModel3));
        System.assertEquals(false, createFineTuningJobRequestModel2.equals(createFineTuningJobRequestModel3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel1 = OASCreateFineTuningJobRequestModel.getExample();
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel2 = new OASCreateFineTuningJobRequestModel();

        System.assertEquals(createFineTuningJobRequestModel1.hashCode(), createFineTuningJobRequestModel1.hashCode());
        System.assertEquals(createFineTuningJobRequestModel2.hashCode(), createFineTuningJobRequestModel2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel1 = OASCreateFineTuningJobRequestModel.getExample();
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel2 = OASCreateFineTuningJobRequestModel.getExample();
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel3 = new OASCreateFineTuningJobRequestModel();
        OASCreateFineTuningJobRequestModel createFineTuningJobRequestModel4 = new OASCreateFineTuningJobRequestModel();

        System.assert(createFineTuningJobRequestModel1.equals(createFineTuningJobRequestModel2));
        System.assert(createFineTuningJobRequestModel3.equals(createFineTuningJobRequestModel4));
        System.assertEquals(createFineTuningJobRequestModel1.hashCode(), createFineTuningJobRequestModel2.hashCode());
        System.assertEquals(createFineTuningJobRequestModel3.hashCode(), createFineTuningJobRequestModel4.hashCode());
    }
}
