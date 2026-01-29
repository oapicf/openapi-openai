@isTest
private class OASCreateCompletionRequestModelTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateCompletionRequestModel createCompletionRequestModel1 = OASCreateCompletionRequestModel.getExample();
        OASCreateCompletionRequestModel createCompletionRequestModel2 = createCompletionRequestModel1;
        OASCreateCompletionRequestModel createCompletionRequestModel3 = new OASCreateCompletionRequestModel();
        OASCreateCompletionRequestModel createCompletionRequestModel4 = createCompletionRequestModel3;

        System.assert(createCompletionRequestModel1.equals(createCompletionRequestModel2));
        System.assert(createCompletionRequestModel2.equals(createCompletionRequestModel1));
        System.assert(createCompletionRequestModel1.equals(createCompletionRequestModel1));
        System.assert(createCompletionRequestModel3.equals(createCompletionRequestModel4));
        System.assert(createCompletionRequestModel4.equals(createCompletionRequestModel3));
        System.assert(createCompletionRequestModel3.equals(createCompletionRequestModel3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateCompletionRequestModel createCompletionRequestModel1 = OASCreateCompletionRequestModel.getExample();
        OASCreateCompletionRequestModel createCompletionRequestModel2 = OASCreateCompletionRequestModel.getExample();
        OASCreateCompletionRequestModel createCompletionRequestModel3 = new OASCreateCompletionRequestModel();
        OASCreateCompletionRequestModel createCompletionRequestModel4 = new OASCreateCompletionRequestModel();

        System.assert(createCompletionRequestModel1.equals(createCompletionRequestModel2));
        System.assert(createCompletionRequestModel2.equals(createCompletionRequestModel1));
        System.assert(createCompletionRequestModel3.equals(createCompletionRequestModel4));
        System.assert(createCompletionRequestModel4.equals(createCompletionRequestModel3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateCompletionRequestModel createCompletionRequestModel1 = OASCreateCompletionRequestModel.getExample();
        OASCreateCompletionRequestModel createCompletionRequestModel2 = new OASCreateCompletionRequestModel();

        System.assertEquals(false, createCompletionRequestModel1.equals('foo'));
        System.assertEquals(false, createCompletionRequestModel2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateCompletionRequestModel createCompletionRequestModel1 = OASCreateCompletionRequestModel.getExample();
        OASCreateCompletionRequestModel createCompletionRequestModel2 = new OASCreateCompletionRequestModel();
        OASCreateCompletionRequestModel createCompletionRequestModel3;

        System.assertEquals(false, createCompletionRequestModel1.equals(createCompletionRequestModel3));
        System.assertEquals(false, createCompletionRequestModel2.equals(createCompletionRequestModel3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateCompletionRequestModel createCompletionRequestModel1 = OASCreateCompletionRequestModel.getExample();
        OASCreateCompletionRequestModel createCompletionRequestModel2 = new OASCreateCompletionRequestModel();

        System.assertEquals(createCompletionRequestModel1.hashCode(), createCompletionRequestModel1.hashCode());
        System.assertEquals(createCompletionRequestModel2.hashCode(), createCompletionRequestModel2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateCompletionRequestModel createCompletionRequestModel1 = OASCreateCompletionRequestModel.getExample();
        OASCreateCompletionRequestModel createCompletionRequestModel2 = OASCreateCompletionRequestModel.getExample();
        OASCreateCompletionRequestModel createCompletionRequestModel3 = new OASCreateCompletionRequestModel();
        OASCreateCompletionRequestModel createCompletionRequestModel4 = new OASCreateCompletionRequestModel();

        System.assert(createCompletionRequestModel1.equals(createCompletionRequestModel2));
        System.assert(createCompletionRequestModel3.equals(createCompletionRequestModel4));
        System.assertEquals(createCompletionRequestModel1.hashCode(), createCompletionRequestModel2.hashCode());
        System.assertEquals(createCompletionRequestModel3.hashCode(), createCompletionRequestModel4.hashCode());
    }
}
