@isTest
private class OASCreateEditRequestModelTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateEditRequestModel createEditRequestModel1 = OASCreateEditRequestModel.getExample();
        OASCreateEditRequestModel createEditRequestModel2 = createEditRequestModel1;
        OASCreateEditRequestModel createEditRequestModel3 = new OASCreateEditRequestModel();
        OASCreateEditRequestModel createEditRequestModel4 = createEditRequestModel3;

        System.assert(createEditRequestModel1.equals(createEditRequestModel2));
        System.assert(createEditRequestModel2.equals(createEditRequestModel1));
        System.assert(createEditRequestModel1.equals(createEditRequestModel1));
        System.assert(createEditRequestModel3.equals(createEditRequestModel4));
        System.assert(createEditRequestModel4.equals(createEditRequestModel3));
        System.assert(createEditRequestModel3.equals(createEditRequestModel3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateEditRequestModel createEditRequestModel1 = OASCreateEditRequestModel.getExample();
        OASCreateEditRequestModel createEditRequestModel2 = OASCreateEditRequestModel.getExample();
        OASCreateEditRequestModel createEditRequestModel3 = new OASCreateEditRequestModel();
        OASCreateEditRequestModel createEditRequestModel4 = new OASCreateEditRequestModel();

        System.assert(createEditRequestModel1.equals(createEditRequestModel2));
        System.assert(createEditRequestModel2.equals(createEditRequestModel1));
        System.assert(createEditRequestModel3.equals(createEditRequestModel4));
        System.assert(createEditRequestModel4.equals(createEditRequestModel3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateEditRequestModel createEditRequestModel1 = OASCreateEditRequestModel.getExample();
        OASCreateEditRequestModel createEditRequestModel2 = new OASCreateEditRequestModel();

        System.assertEquals(false, createEditRequestModel1.equals('foo'));
        System.assertEquals(false, createEditRequestModel2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateEditRequestModel createEditRequestModel1 = OASCreateEditRequestModel.getExample();
        OASCreateEditRequestModel createEditRequestModel2 = new OASCreateEditRequestModel();
        OASCreateEditRequestModel createEditRequestModel3;

        System.assertEquals(false, createEditRequestModel1.equals(createEditRequestModel3));
        System.assertEquals(false, createEditRequestModel2.equals(createEditRequestModel3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateEditRequestModel createEditRequestModel1 = OASCreateEditRequestModel.getExample();
        OASCreateEditRequestModel createEditRequestModel2 = new OASCreateEditRequestModel();

        System.assertEquals(createEditRequestModel1.hashCode(), createEditRequestModel1.hashCode());
        System.assertEquals(createEditRequestModel2.hashCode(), createEditRequestModel2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateEditRequestModel createEditRequestModel1 = OASCreateEditRequestModel.getExample();
        OASCreateEditRequestModel createEditRequestModel2 = OASCreateEditRequestModel.getExample();
        OASCreateEditRequestModel createEditRequestModel3 = new OASCreateEditRequestModel();
        OASCreateEditRequestModel createEditRequestModel4 = new OASCreateEditRequestModel();

        System.assert(createEditRequestModel1.equals(createEditRequestModel2));
        System.assert(createEditRequestModel3.equals(createEditRequestModel4));
        System.assertEquals(createEditRequestModel1.hashCode(), createEditRequestModel2.hashCode());
        System.assertEquals(createEditRequestModel3.hashCode(), createEditRequestModel4.hashCode());
    }
}
