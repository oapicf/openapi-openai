@isTest
private class OASCreateImageEditRequestModelTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateImageEditRequestModel createImageEditRequestModel1 = OASCreateImageEditRequestModel.getExample();
        OASCreateImageEditRequestModel createImageEditRequestModel2 = createImageEditRequestModel1;
        OASCreateImageEditRequestModel createImageEditRequestModel3 = new OASCreateImageEditRequestModel();
        OASCreateImageEditRequestModel createImageEditRequestModel4 = createImageEditRequestModel3;

        System.assert(createImageEditRequestModel1.equals(createImageEditRequestModel2));
        System.assert(createImageEditRequestModel2.equals(createImageEditRequestModel1));
        System.assert(createImageEditRequestModel1.equals(createImageEditRequestModel1));
        System.assert(createImageEditRequestModel3.equals(createImageEditRequestModel4));
        System.assert(createImageEditRequestModel4.equals(createImageEditRequestModel3));
        System.assert(createImageEditRequestModel3.equals(createImageEditRequestModel3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateImageEditRequestModel createImageEditRequestModel1 = OASCreateImageEditRequestModel.getExample();
        OASCreateImageEditRequestModel createImageEditRequestModel2 = OASCreateImageEditRequestModel.getExample();
        OASCreateImageEditRequestModel createImageEditRequestModel3 = new OASCreateImageEditRequestModel();
        OASCreateImageEditRequestModel createImageEditRequestModel4 = new OASCreateImageEditRequestModel();

        System.assert(createImageEditRequestModel1.equals(createImageEditRequestModel2));
        System.assert(createImageEditRequestModel2.equals(createImageEditRequestModel1));
        System.assert(createImageEditRequestModel3.equals(createImageEditRequestModel4));
        System.assert(createImageEditRequestModel4.equals(createImageEditRequestModel3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateImageEditRequestModel createImageEditRequestModel1 = OASCreateImageEditRequestModel.getExample();
        OASCreateImageEditRequestModel createImageEditRequestModel2 = new OASCreateImageEditRequestModel();

        System.assertEquals(false, createImageEditRequestModel1.equals('foo'));
        System.assertEquals(false, createImageEditRequestModel2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateImageEditRequestModel createImageEditRequestModel1 = OASCreateImageEditRequestModel.getExample();
        OASCreateImageEditRequestModel createImageEditRequestModel2 = new OASCreateImageEditRequestModel();
        OASCreateImageEditRequestModel createImageEditRequestModel3;

        System.assertEquals(false, createImageEditRequestModel1.equals(createImageEditRequestModel3));
        System.assertEquals(false, createImageEditRequestModel2.equals(createImageEditRequestModel3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateImageEditRequestModel createImageEditRequestModel1 = OASCreateImageEditRequestModel.getExample();
        OASCreateImageEditRequestModel createImageEditRequestModel2 = new OASCreateImageEditRequestModel();

        System.assertEquals(createImageEditRequestModel1.hashCode(), createImageEditRequestModel1.hashCode());
        System.assertEquals(createImageEditRequestModel2.hashCode(), createImageEditRequestModel2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateImageEditRequestModel createImageEditRequestModel1 = OASCreateImageEditRequestModel.getExample();
        OASCreateImageEditRequestModel createImageEditRequestModel2 = OASCreateImageEditRequestModel.getExample();
        OASCreateImageEditRequestModel createImageEditRequestModel3 = new OASCreateImageEditRequestModel();
        OASCreateImageEditRequestModel createImageEditRequestModel4 = new OASCreateImageEditRequestModel();

        System.assert(createImageEditRequestModel1.equals(createImageEditRequestModel2));
        System.assert(createImageEditRequestModel3.equals(createImageEditRequestModel4));
        System.assertEquals(createImageEditRequestModel1.hashCode(), createImageEditRequestModel2.hashCode());
        System.assertEquals(createImageEditRequestModel3.hashCode(), createImageEditRequestModel4.hashCode());
    }
}
