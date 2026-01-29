@isTest
private class OASCreateChatCompletionRequestModelTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel1 = OASCreateChatCompletionRequestModel.getExample();
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel2 = createChatCompletionRequestModel1;
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel3 = new OASCreateChatCompletionRequestModel();
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel4 = createChatCompletionRequestModel3;

        System.assert(createChatCompletionRequestModel1.equals(createChatCompletionRequestModel2));
        System.assert(createChatCompletionRequestModel2.equals(createChatCompletionRequestModel1));
        System.assert(createChatCompletionRequestModel1.equals(createChatCompletionRequestModel1));
        System.assert(createChatCompletionRequestModel3.equals(createChatCompletionRequestModel4));
        System.assert(createChatCompletionRequestModel4.equals(createChatCompletionRequestModel3));
        System.assert(createChatCompletionRequestModel3.equals(createChatCompletionRequestModel3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel1 = OASCreateChatCompletionRequestModel.getExample();
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel2 = OASCreateChatCompletionRequestModel.getExample();
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel3 = new OASCreateChatCompletionRequestModel();
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel4 = new OASCreateChatCompletionRequestModel();

        System.assert(createChatCompletionRequestModel1.equals(createChatCompletionRequestModel2));
        System.assert(createChatCompletionRequestModel2.equals(createChatCompletionRequestModel1));
        System.assert(createChatCompletionRequestModel3.equals(createChatCompletionRequestModel4));
        System.assert(createChatCompletionRequestModel4.equals(createChatCompletionRequestModel3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel1 = OASCreateChatCompletionRequestModel.getExample();
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel2 = new OASCreateChatCompletionRequestModel();

        System.assertEquals(false, createChatCompletionRequestModel1.equals('foo'));
        System.assertEquals(false, createChatCompletionRequestModel2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel1 = OASCreateChatCompletionRequestModel.getExample();
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel2 = new OASCreateChatCompletionRequestModel();
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel3;

        System.assertEquals(false, createChatCompletionRequestModel1.equals(createChatCompletionRequestModel3));
        System.assertEquals(false, createChatCompletionRequestModel2.equals(createChatCompletionRequestModel3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel1 = OASCreateChatCompletionRequestModel.getExample();
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel2 = new OASCreateChatCompletionRequestModel();

        System.assertEquals(createChatCompletionRequestModel1.hashCode(), createChatCompletionRequestModel1.hashCode());
        System.assertEquals(createChatCompletionRequestModel2.hashCode(), createChatCompletionRequestModel2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel1 = OASCreateChatCompletionRequestModel.getExample();
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel2 = OASCreateChatCompletionRequestModel.getExample();
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel3 = new OASCreateChatCompletionRequestModel();
        OASCreateChatCompletionRequestModel createChatCompletionRequestModel4 = new OASCreateChatCompletionRequestModel();

        System.assert(createChatCompletionRequestModel1.equals(createChatCompletionRequestModel2));
        System.assert(createChatCompletionRequestModel3.equals(createChatCompletionRequestModel4));
        System.assertEquals(createChatCompletionRequestModel1.hashCode(), createChatCompletionRequestModel2.hashCode());
        System.assertEquals(createChatCompletionRequestModel3.hashCode(), createChatCompletionRequestModel4.hashCode());
    }
}
