@isTest
private class OASCreateImageRequestModelTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateImageRequestModel createImageRequestModel1 = OASCreateImageRequestModel.getExample();
        OASCreateImageRequestModel createImageRequestModel2 = createImageRequestModel1;
        OASCreateImageRequestModel createImageRequestModel3 = new OASCreateImageRequestModel();
        OASCreateImageRequestModel createImageRequestModel4 = createImageRequestModel3;

        System.assert(createImageRequestModel1.equals(createImageRequestModel2));
        System.assert(createImageRequestModel2.equals(createImageRequestModel1));
        System.assert(createImageRequestModel1.equals(createImageRequestModel1));
        System.assert(createImageRequestModel3.equals(createImageRequestModel4));
        System.assert(createImageRequestModel4.equals(createImageRequestModel3));
        System.assert(createImageRequestModel3.equals(createImageRequestModel3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateImageRequestModel createImageRequestModel1 = OASCreateImageRequestModel.getExample();
        OASCreateImageRequestModel createImageRequestModel2 = OASCreateImageRequestModel.getExample();
        OASCreateImageRequestModel createImageRequestModel3 = new OASCreateImageRequestModel();
        OASCreateImageRequestModel createImageRequestModel4 = new OASCreateImageRequestModel();

        System.assert(createImageRequestModel1.equals(createImageRequestModel2));
        System.assert(createImageRequestModel2.equals(createImageRequestModel1));
        System.assert(createImageRequestModel3.equals(createImageRequestModel4));
        System.assert(createImageRequestModel4.equals(createImageRequestModel3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateImageRequestModel createImageRequestModel1 = OASCreateImageRequestModel.getExample();
        OASCreateImageRequestModel createImageRequestModel2 = new OASCreateImageRequestModel();

        System.assertEquals(false, createImageRequestModel1.equals('foo'));
        System.assertEquals(false, createImageRequestModel2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateImageRequestModel createImageRequestModel1 = OASCreateImageRequestModel.getExample();
        OASCreateImageRequestModel createImageRequestModel2 = new OASCreateImageRequestModel();
        OASCreateImageRequestModel createImageRequestModel3;

        System.assertEquals(false, createImageRequestModel1.equals(createImageRequestModel3));
        System.assertEquals(false, createImageRequestModel2.equals(createImageRequestModel3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateImageRequestModel createImageRequestModel1 = OASCreateImageRequestModel.getExample();
        OASCreateImageRequestModel createImageRequestModel2 = new OASCreateImageRequestModel();

        System.assertEquals(createImageRequestModel1.hashCode(), createImageRequestModel1.hashCode());
        System.assertEquals(createImageRequestModel2.hashCode(), createImageRequestModel2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateImageRequestModel createImageRequestModel1 = OASCreateImageRequestModel.getExample();
        OASCreateImageRequestModel createImageRequestModel2 = OASCreateImageRequestModel.getExample();
        OASCreateImageRequestModel createImageRequestModel3 = new OASCreateImageRequestModel();
        OASCreateImageRequestModel createImageRequestModel4 = new OASCreateImageRequestModel();

        System.assert(createImageRequestModel1.equals(createImageRequestModel2));
        System.assert(createImageRequestModel3.equals(createImageRequestModel4));
        System.assertEquals(createImageRequestModel1.hashCode(), createImageRequestModel2.hashCode());
        System.assertEquals(createImageRequestModel3.hashCode(), createImageRequestModel4.hashCode());
    }
}
