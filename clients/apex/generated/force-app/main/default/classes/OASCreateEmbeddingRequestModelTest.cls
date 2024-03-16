@isTest
private class OASCreateEmbeddingRequestModelTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel1 = OASCreateEmbeddingRequestModel.getExample();
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel2 = createEmbeddingRequestModel1;
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel3 = new OASCreateEmbeddingRequestModel();
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel4 = createEmbeddingRequestModel3;

        System.assert(createEmbeddingRequestModel1.equals(createEmbeddingRequestModel2));
        System.assert(createEmbeddingRequestModel2.equals(createEmbeddingRequestModel1));
        System.assert(createEmbeddingRequestModel1.equals(createEmbeddingRequestModel1));
        System.assert(createEmbeddingRequestModel3.equals(createEmbeddingRequestModel4));
        System.assert(createEmbeddingRequestModel4.equals(createEmbeddingRequestModel3));
        System.assert(createEmbeddingRequestModel3.equals(createEmbeddingRequestModel3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel1 = OASCreateEmbeddingRequestModel.getExample();
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel2 = OASCreateEmbeddingRequestModel.getExample();
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel3 = new OASCreateEmbeddingRequestModel();
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel4 = new OASCreateEmbeddingRequestModel();

        System.assert(createEmbeddingRequestModel1.equals(createEmbeddingRequestModel2));
        System.assert(createEmbeddingRequestModel2.equals(createEmbeddingRequestModel1));
        System.assert(createEmbeddingRequestModel3.equals(createEmbeddingRequestModel4));
        System.assert(createEmbeddingRequestModel4.equals(createEmbeddingRequestModel3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel1 = OASCreateEmbeddingRequestModel.getExample();
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel2 = new OASCreateEmbeddingRequestModel();

        System.assertEquals(false, createEmbeddingRequestModel1.equals('foo'));
        System.assertEquals(false, createEmbeddingRequestModel2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel1 = OASCreateEmbeddingRequestModel.getExample();
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel2 = new OASCreateEmbeddingRequestModel();
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel3;

        System.assertEquals(false, createEmbeddingRequestModel1.equals(createEmbeddingRequestModel3));
        System.assertEquals(false, createEmbeddingRequestModel2.equals(createEmbeddingRequestModel3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel1 = OASCreateEmbeddingRequestModel.getExample();
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel2 = new OASCreateEmbeddingRequestModel();

        System.assertEquals(createEmbeddingRequestModel1.hashCode(), createEmbeddingRequestModel1.hashCode());
        System.assertEquals(createEmbeddingRequestModel2.hashCode(), createEmbeddingRequestModel2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel1 = OASCreateEmbeddingRequestModel.getExample();
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel2 = OASCreateEmbeddingRequestModel.getExample();
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel3 = new OASCreateEmbeddingRequestModel();
        OASCreateEmbeddingRequestModel createEmbeddingRequestModel4 = new OASCreateEmbeddingRequestModel();

        System.assert(createEmbeddingRequestModel1.equals(createEmbeddingRequestModel2));
        System.assert(createEmbeddingRequestModel3.equals(createEmbeddingRequestModel4));
        System.assertEquals(createEmbeddingRequestModel1.hashCode(), createEmbeddingRequestModel2.hashCode());
        System.assertEquals(createEmbeddingRequestModel3.hashCode(), createEmbeddingRequestModel4.hashCode());
    }
}
