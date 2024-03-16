@isTest
private class OASCreateFineTuneRequestModelTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateFineTuneRequestModel createFineTuneRequestModel1 = OASCreateFineTuneRequestModel.getExample();
        OASCreateFineTuneRequestModel createFineTuneRequestModel2 = createFineTuneRequestModel1;
        OASCreateFineTuneRequestModel createFineTuneRequestModel3 = new OASCreateFineTuneRequestModel();
        OASCreateFineTuneRequestModel createFineTuneRequestModel4 = createFineTuneRequestModel3;

        System.assert(createFineTuneRequestModel1.equals(createFineTuneRequestModel2));
        System.assert(createFineTuneRequestModel2.equals(createFineTuneRequestModel1));
        System.assert(createFineTuneRequestModel1.equals(createFineTuneRequestModel1));
        System.assert(createFineTuneRequestModel3.equals(createFineTuneRequestModel4));
        System.assert(createFineTuneRequestModel4.equals(createFineTuneRequestModel3));
        System.assert(createFineTuneRequestModel3.equals(createFineTuneRequestModel3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateFineTuneRequestModel createFineTuneRequestModel1 = OASCreateFineTuneRequestModel.getExample();
        OASCreateFineTuneRequestModel createFineTuneRequestModel2 = OASCreateFineTuneRequestModel.getExample();
        OASCreateFineTuneRequestModel createFineTuneRequestModel3 = new OASCreateFineTuneRequestModel();
        OASCreateFineTuneRequestModel createFineTuneRequestModel4 = new OASCreateFineTuneRequestModel();

        System.assert(createFineTuneRequestModel1.equals(createFineTuneRequestModel2));
        System.assert(createFineTuneRequestModel2.equals(createFineTuneRequestModel1));
        System.assert(createFineTuneRequestModel3.equals(createFineTuneRequestModel4));
        System.assert(createFineTuneRequestModel4.equals(createFineTuneRequestModel3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateFineTuneRequestModel createFineTuneRequestModel1 = OASCreateFineTuneRequestModel.getExample();
        OASCreateFineTuneRequestModel createFineTuneRequestModel2 = new OASCreateFineTuneRequestModel();

        System.assertEquals(false, createFineTuneRequestModel1.equals('foo'));
        System.assertEquals(false, createFineTuneRequestModel2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateFineTuneRequestModel createFineTuneRequestModel1 = OASCreateFineTuneRequestModel.getExample();
        OASCreateFineTuneRequestModel createFineTuneRequestModel2 = new OASCreateFineTuneRequestModel();
        OASCreateFineTuneRequestModel createFineTuneRequestModel3;

        System.assertEquals(false, createFineTuneRequestModel1.equals(createFineTuneRequestModel3));
        System.assertEquals(false, createFineTuneRequestModel2.equals(createFineTuneRequestModel3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateFineTuneRequestModel createFineTuneRequestModel1 = OASCreateFineTuneRequestModel.getExample();
        OASCreateFineTuneRequestModel createFineTuneRequestModel2 = new OASCreateFineTuneRequestModel();

        System.assertEquals(createFineTuneRequestModel1.hashCode(), createFineTuneRequestModel1.hashCode());
        System.assertEquals(createFineTuneRequestModel2.hashCode(), createFineTuneRequestModel2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateFineTuneRequestModel createFineTuneRequestModel1 = OASCreateFineTuneRequestModel.getExample();
        OASCreateFineTuneRequestModel createFineTuneRequestModel2 = OASCreateFineTuneRequestModel.getExample();
        OASCreateFineTuneRequestModel createFineTuneRequestModel3 = new OASCreateFineTuneRequestModel();
        OASCreateFineTuneRequestModel createFineTuneRequestModel4 = new OASCreateFineTuneRequestModel();

        System.assert(createFineTuneRequestModel1.equals(createFineTuneRequestModel2));
        System.assert(createFineTuneRequestModel3.equals(createFineTuneRequestModel4));
        System.assertEquals(createFineTuneRequestModel1.hashCode(), createFineTuneRequestModel2.hashCode());
        System.assertEquals(createFineTuneRequestModel3.hashCode(), createFineTuneRequestModel4.hashCode());
    }
}
