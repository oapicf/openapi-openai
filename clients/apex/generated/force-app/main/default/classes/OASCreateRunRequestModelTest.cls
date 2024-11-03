@isTest
private class OASCreateRunRequestModelTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateRunRequestModel createRunRequestModel1 = OASCreateRunRequestModel.getExample();
        OASCreateRunRequestModel createRunRequestModel2 = createRunRequestModel1;
        OASCreateRunRequestModel createRunRequestModel3 = new OASCreateRunRequestModel();
        OASCreateRunRequestModel createRunRequestModel4 = createRunRequestModel3;

        System.assert(createRunRequestModel1.equals(createRunRequestModel2));
        System.assert(createRunRequestModel2.equals(createRunRequestModel1));
        System.assert(createRunRequestModel1.equals(createRunRequestModel1));
        System.assert(createRunRequestModel3.equals(createRunRequestModel4));
        System.assert(createRunRequestModel4.equals(createRunRequestModel3));
        System.assert(createRunRequestModel3.equals(createRunRequestModel3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateRunRequestModel createRunRequestModel1 = OASCreateRunRequestModel.getExample();
        OASCreateRunRequestModel createRunRequestModel2 = OASCreateRunRequestModel.getExample();
        OASCreateRunRequestModel createRunRequestModel3 = new OASCreateRunRequestModel();
        OASCreateRunRequestModel createRunRequestModel4 = new OASCreateRunRequestModel();

        System.assert(createRunRequestModel1.equals(createRunRequestModel2));
        System.assert(createRunRequestModel2.equals(createRunRequestModel1));
        System.assert(createRunRequestModel3.equals(createRunRequestModel4));
        System.assert(createRunRequestModel4.equals(createRunRequestModel3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateRunRequestModel createRunRequestModel1 = OASCreateRunRequestModel.getExample();
        OASCreateRunRequestModel createRunRequestModel2 = new OASCreateRunRequestModel();

        System.assertEquals(false, createRunRequestModel1.equals('foo'));
        System.assertEquals(false, createRunRequestModel2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateRunRequestModel createRunRequestModel1 = OASCreateRunRequestModel.getExample();
        OASCreateRunRequestModel createRunRequestModel2 = new OASCreateRunRequestModel();
        OASCreateRunRequestModel createRunRequestModel3;

        System.assertEquals(false, createRunRequestModel1.equals(createRunRequestModel3));
        System.assertEquals(false, createRunRequestModel2.equals(createRunRequestModel3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateRunRequestModel createRunRequestModel1 = OASCreateRunRequestModel.getExample();
        OASCreateRunRequestModel createRunRequestModel2 = new OASCreateRunRequestModel();

        System.assertEquals(createRunRequestModel1.hashCode(), createRunRequestModel1.hashCode());
        System.assertEquals(createRunRequestModel2.hashCode(), createRunRequestModel2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateRunRequestModel createRunRequestModel1 = OASCreateRunRequestModel.getExample();
        OASCreateRunRequestModel createRunRequestModel2 = OASCreateRunRequestModel.getExample();
        OASCreateRunRequestModel createRunRequestModel3 = new OASCreateRunRequestModel();
        OASCreateRunRequestModel createRunRequestModel4 = new OASCreateRunRequestModel();

        System.assert(createRunRequestModel1.equals(createRunRequestModel2));
        System.assert(createRunRequestModel3.equals(createRunRequestModel4));
        System.assertEquals(createRunRequestModel1.hashCode(), createRunRequestModel2.hashCode());
        System.assertEquals(createRunRequestModel3.hashCode(), createRunRequestModel4.hashCode());
    }
}
