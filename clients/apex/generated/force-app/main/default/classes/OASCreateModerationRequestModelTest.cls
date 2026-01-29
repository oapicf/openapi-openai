@isTest
private class OASCreateModerationRequestModelTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateModerationRequestModel createModerationRequestModel1 = OASCreateModerationRequestModel.getExample();
        OASCreateModerationRequestModel createModerationRequestModel2 = createModerationRequestModel1;
        OASCreateModerationRequestModel createModerationRequestModel3 = new OASCreateModerationRequestModel();
        OASCreateModerationRequestModel createModerationRequestModel4 = createModerationRequestModel3;

        System.assert(createModerationRequestModel1.equals(createModerationRequestModel2));
        System.assert(createModerationRequestModel2.equals(createModerationRequestModel1));
        System.assert(createModerationRequestModel1.equals(createModerationRequestModel1));
        System.assert(createModerationRequestModel3.equals(createModerationRequestModel4));
        System.assert(createModerationRequestModel4.equals(createModerationRequestModel3));
        System.assert(createModerationRequestModel3.equals(createModerationRequestModel3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateModerationRequestModel createModerationRequestModel1 = OASCreateModerationRequestModel.getExample();
        OASCreateModerationRequestModel createModerationRequestModel2 = OASCreateModerationRequestModel.getExample();
        OASCreateModerationRequestModel createModerationRequestModel3 = new OASCreateModerationRequestModel();
        OASCreateModerationRequestModel createModerationRequestModel4 = new OASCreateModerationRequestModel();

        System.assert(createModerationRequestModel1.equals(createModerationRequestModel2));
        System.assert(createModerationRequestModel2.equals(createModerationRequestModel1));
        System.assert(createModerationRequestModel3.equals(createModerationRequestModel4));
        System.assert(createModerationRequestModel4.equals(createModerationRequestModel3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateModerationRequestModel createModerationRequestModel1 = OASCreateModerationRequestModel.getExample();
        OASCreateModerationRequestModel createModerationRequestModel2 = new OASCreateModerationRequestModel();

        System.assertEquals(false, createModerationRequestModel1.equals('foo'));
        System.assertEquals(false, createModerationRequestModel2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateModerationRequestModel createModerationRequestModel1 = OASCreateModerationRequestModel.getExample();
        OASCreateModerationRequestModel createModerationRequestModel2 = new OASCreateModerationRequestModel();
        OASCreateModerationRequestModel createModerationRequestModel3;

        System.assertEquals(false, createModerationRequestModel1.equals(createModerationRequestModel3));
        System.assertEquals(false, createModerationRequestModel2.equals(createModerationRequestModel3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateModerationRequestModel createModerationRequestModel1 = OASCreateModerationRequestModel.getExample();
        OASCreateModerationRequestModel createModerationRequestModel2 = new OASCreateModerationRequestModel();

        System.assertEquals(createModerationRequestModel1.hashCode(), createModerationRequestModel1.hashCode());
        System.assertEquals(createModerationRequestModel2.hashCode(), createModerationRequestModel2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateModerationRequestModel createModerationRequestModel1 = OASCreateModerationRequestModel.getExample();
        OASCreateModerationRequestModel createModerationRequestModel2 = OASCreateModerationRequestModel.getExample();
        OASCreateModerationRequestModel createModerationRequestModel3 = new OASCreateModerationRequestModel();
        OASCreateModerationRequestModel createModerationRequestModel4 = new OASCreateModerationRequestModel();

        System.assert(createModerationRequestModel1.equals(createModerationRequestModel2));
        System.assert(createModerationRequestModel3.equals(createModerationRequestModel4));
        System.assertEquals(createModerationRequestModel1.hashCode(), createModerationRequestModel2.hashCode());
        System.assertEquals(createModerationRequestModel3.hashCode(), createModerationRequestModel4.hashCode());
    }
}
