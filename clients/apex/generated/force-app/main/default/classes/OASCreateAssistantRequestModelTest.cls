@isTest
private class OASCreateAssistantRequestModelTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateAssistantRequestModel createAssistantRequestModel1 = OASCreateAssistantRequestModel.getExample();
        OASCreateAssistantRequestModel createAssistantRequestModel2 = createAssistantRequestModel1;
        OASCreateAssistantRequestModel createAssistantRequestModel3 = new OASCreateAssistantRequestModel();
        OASCreateAssistantRequestModel createAssistantRequestModel4 = createAssistantRequestModel3;

        System.assert(createAssistantRequestModel1.equals(createAssistantRequestModel2));
        System.assert(createAssistantRequestModel2.equals(createAssistantRequestModel1));
        System.assert(createAssistantRequestModel1.equals(createAssistantRequestModel1));
        System.assert(createAssistantRequestModel3.equals(createAssistantRequestModel4));
        System.assert(createAssistantRequestModel4.equals(createAssistantRequestModel3));
        System.assert(createAssistantRequestModel3.equals(createAssistantRequestModel3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateAssistantRequestModel createAssistantRequestModel1 = OASCreateAssistantRequestModel.getExample();
        OASCreateAssistantRequestModel createAssistantRequestModel2 = OASCreateAssistantRequestModel.getExample();
        OASCreateAssistantRequestModel createAssistantRequestModel3 = new OASCreateAssistantRequestModel();
        OASCreateAssistantRequestModel createAssistantRequestModel4 = new OASCreateAssistantRequestModel();

        System.assert(createAssistantRequestModel1.equals(createAssistantRequestModel2));
        System.assert(createAssistantRequestModel2.equals(createAssistantRequestModel1));
        System.assert(createAssistantRequestModel3.equals(createAssistantRequestModel4));
        System.assert(createAssistantRequestModel4.equals(createAssistantRequestModel3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateAssistantRequestModel createAssistantRequestModel1 = OASCreateAssistantRequestModel.getExample();
        OASCreateAssistantRequestModel createAssistantRequestModel2 = new OASCreateAssistantRequestModel();

        System.assertEquals(false, createAssistantRequestModel1.equals('foo'));
        System.assertEquals(false, createAssistantRequestModel2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateAssistantRequestModel createAssistantRequestModel1 = OASCreateAssistantRequestModel.getExample();
        OASCreateAssistantRequestModel createAssistantRequestModel2 = new OASCreateAssistantRequestModel();
        OASCreateAssistantRequestModel createAssistantRequestModel3;

        System.assertEquals(false, createAssistantRequestModel1.equals(createAssistantRequestModel3));
        System.assertEquals(false, createAssistantRequestModel2.equals(createAssistantRequestModel3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateAssistantRequestModel createAssistantRequestModel1 = OASCreateAssistantRequestModel.getExample();
        OASCreateAssistantRequestModel createAssistantRequestModel2 = new OASCreateAssistantRequestModel();

        System.assertEquals(createAssistantRequestModel1.hashCode(), createAssistantRequestModel1.hashCode());
        System.assertEquals(createAssistantRequestModel2.hashCode(), createAssistantRequestModel2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateAssistantRequestModel createAssistantRequestModel1 = OASCreateAssistantRequestModel.getExample();
        OASCreateAssistantRequestModel createAssistantRequestModel2 = OASCreateAssistantRequestModel.getExample();
        OASCreateAssistantRequestModel createAssistantRequestModel3 = new OASCreateAssistantRequestModel();
        OASCreateAssistantRequestModel createAssistantRequestModel4 = new OASCreateAssistantRequestModel();

        System.assert(createAssistantRequestModel1.equals(createAssistantRequestModel2));
        System.assert(createAssistantRequestModel3.equals(createAssistantRequestModel4));
        System.assertEquals(createAssistantRequestModel1.hashCode(), createAssistantRequestModel2.hashCode());
        System.assertEquals(createAssistantRequestModel3.hashCode(), createAssistantRequestModel4.hashCode());
    }
}
