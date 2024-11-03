@isTest
private class OASCreateTranscriptionRequestModelTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel1 = OASCreateTranscriptionRequestModel.getExample();
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel2 = createTranscriptionRequestModel1;
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel3 = new OASCreateTranscriptionRequestModel();
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel4 = createTranscriptionRequestModel3;

        System.assert(createTranscriptionRequestModel1.equals(createTranscriptionRequestModel2));
        System.assert(createTranscriptionRequestModel2.equals(createTranscriptionRequestModel1));
        System.assert(createTranscriptionRequestModel1.equals(createTranscriptionRequestModel1));
        System.assert(createTranscriptionRequestModel3.equals(createTranscriptionRequestModel4));
        System.assert(createTranscriptionRequestModel4.equals(createTranscriptionRequestModel3));
        System.assert(createTranscriptionRequestModel3.equals(createTranscriptionRequestModel3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel1 = OASCreateTranscriptionRequestModel.getExample();
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel2 = OASCreateTranscriptionRequestModel.getExample();
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel3 = new OASCreateTranscriptionRequestModel();
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel4 = new OASCreateTranscriptionRequestModel();

        System.assert(createTranscriptionRequestModel1.equals(createTranscriptionRequestModel2));
        System.assert(createTranscriptionRequestModel2.equals(createTranscriptionRequestModel1));
        System.assert(createTranscriptionRequestModel3.equals(createTranscriptionRequestModel4));
        System.assert(createTranscriptionRequestModel4.equals(createTranscriptionRequestModel3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel1 = OASCreateTranscriptionRequestModel.getExample();
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel2 = new OASCreateTranscriptionRequestModel();

        System.assertEquals(false, createTranscriptionRequestModel1.equals('foo'));
        System.assertEquals(false, createTranscriptionRequestModel2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel1 = OASCreateTranscriptionRequestModel.getExample();
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel2 = new OASCreateTranscriptionRequestModel();
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel3;

        System.assertEquals(false, createTranscriptionRequestModel1.equals(createTranscriptionRequestModel3));
        System.assertEquals(false, createTranscriptionRequestModel2.equals(createTranscriptionRequestModel3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel1 = OASCreateTranscriptionRequestModel.getExample();
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel2 = new OASCreateTranscriptionRequestModel();

        System.assertEquals(createTranscriptionRequestModel1.hashCode(), createTranscriptionRequestModel1.hashCode());
        System.assertEquals(createTranscriptionRequestModel2.hashCode(), createTranscriptionRequestModel2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel1 = OASCreateTranscriptionRequestModel.getExample();
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel2 = OASCreateTranscriptionRequestModel.getExample();
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel3 = new OASCreateTranscriptionRequestModel();
        OASCreateTranscriptionRequestModel createTranscriptionRequestModel4 = new OASCreateTranscriptionRequestModel();

        System.assert(createTranscriptionRequestModel1.equals(createTranscriptionRequestModel2));
        System.assert(createTranscriptionRequestModel3.equals(createTranscriptionRequestModel4));
        System.assertEquals(createTranscriptionRequestModel1.hashCode(), createTranscriptionRequestModel2.hashCode());
        System.assertEquals(createTranscriptionRequestModel3.hashCode(), createTranscriptionRequestModel4.hashCode());
    }
}
