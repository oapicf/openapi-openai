@isTest
private class OASCreateSpeechRequestModelTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateSpeechRequestModel createSpeechRequestModel1 = OASCreateSpeechRequestModel.getExample();
        OASCreateSpeechRequestModel createSpeechRequestModel2 = createSpeechRequestModel1;
        OASCreateSpeechRequestModel createSpeechRequestModel3 = new OASCreateSpeechRequestModel();
        OASCreateSpeechRequestModel createSpeechRequestModel4 = createSpeechRequestModel3;

        System.assert(createSpeechRequestModel1.equals(createSpeechRequestModel2));
        System.assert(createSpeechRequestModel2.equals(createSpeechRequestModel1));
        System.assert(createSpeechRequestModel1.equals(createSpeechRequestModel1));
        System.assert(createSpeechRequestModel3.equals(createSpeechRequestModel4));
        System.assert(createSpeechRequestModel4.equals(createSpeechRequestModel3));
        System.assert(createSpeechRequestModel3.equals(createSpeechRequestModel3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateSpeechRequestModel createSpeechRequestModel1 = OASCreateSpeechRequestModel.getExample();
        OASCreateSpeechRequestModel createSpeechRequestModel2 = OASCreateSpeechRequestModel.getExample();
        OASCreateSpeechRequestModel createSpeechRequestModel3 = new OASCreateSpeechRequestModel();
        OASCreateSpeechRequestModel createSpeechRequestModel4 = new OASCreateSpeechRequestModel();

        System.assert(createSpeechRequestModel1.equals(createSpeechRequestModel2));
        System.assert(createSpeechRequestModel2.equals(createSpeechRequestModel1));
        System.assert(createSpeechRequestModel3.equals(createSpeechRequestModel4));
        System.assert(createSpeechRequestModel4.equals(createSpeechRequestModel3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateSpeechRequestModel createSpeechRequestModel1 = OASCreateSpeechRequestModel.getExample();
        OASCreateSpeechRequestModel createSpeechRequestModel2 = new OASCreateSpeechRequestModel();

        System.assertEquals(false, createSpeechRequestModel1.equals('foo'));
        System.assertEquals(false, createSpeechRequestModel2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateSpeechRequestModel createSpeechRequestModel1 = OASCreateSpeechRequestModel.getExample();
        OASCreateSpeechRequestModel createSpeechRequestModel2 = new OASCreateSpeechRequestModel();
        OASCreateSpeechRequestModel createSpeechRequestModel3;

        System.assertEquals(false, createSpeechRequestModel1.equals(createSpeechRequestModel3));
        System.assertEquals(false, createSpeechRequestModel2.equals(createSpeechRequestModel3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateSpeechRequestModel createSpeechRequestModel1 = OASCreateSpeechRequestModel.getExample();
        OASCreateSpeechRequestModel createSpeechRequestModel2 = new OASCreateSpeechRequestModel();

        System.assertEquals(createSpeechRequestModel1.hashCode(), createSpeechRequestModel1.hashCode());
        System.assertEquals(createSpeechRequestModel2.hashCode(), createSpeechRequestModel2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateSpeechRequestModel createSpeechRequestModel1 = OASCreateSpeechRequestModel.getExample();
        OASCreateSpeechRequestModel createSpeechRequestModel2 = OASCreateSpeechRequestModel.getExample();
        OASCreateSpeechRequestModel createSpeechRequestModel3 = new OASCreateSpeechRequestModel();
        OASCreateSpeechRequestModel createSpeechRequestModel4 = new OASCreateSpeechRequestModel();

        System.assert(createSpeechRequestModel1.equals(createSpeechRequestModel2));
        System.assert(createSpeechRequestModel3.equals(createSpeechRequestModel4));
        System.assertEquals(createSpeechRequestModel1.hashCode(), createSpeechRequestModel2.hashCode());
        System.assertEquals(createSpeechRequestModel3.hashCode(), createSpeechRequestModel4.hashCode());
    }
}
