@isTest
private class OASModelTest {
    @isTest
    private static void equalsSameInstance() {
        OASModel model1 = OASModel.getExample();
        OASModel model2 = model1;
        OASModel model3 = new OASModel();
        OASModel model4 = model3;

        System.assert(model1.equals(model2));
        System.assert(model2.equals(model1));
        System.assert(model1.equals(model1));
        System.assert(model3.equals(model4));
        System.assert(model4.equals(model3));
        System.assert(model3.equals(model3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASModel model1 = OASModel.getExample();
        OASModel model2 = OASModel.getExample();
        OASModel model3 = new OASModel();
        OASModel model4 = new OASModel();

        System.assert(model1.equals(model2));
        System.assert(model2.equals(model1));
        System.assert(model3.equals(model4));
        System.assert(model4.equals(model3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASModel model1 = OASModel.getExample();
        OASModel model2 = new OASModel();

        System.assertEquals(false, model1.equals('foo'));
        System.assertEquals(false, model2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASModel model1 = OASModel.getExample();
        OASModel model2 = new OASModel();
        OASModel model3;

        System.assertEquals(false, model1.equals(model3));
        System.assertEquals(false, model2.equals(model3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASModel model1 = OASModel.getExample();
        OASModel model2 = new OASModel();

        System.assertEquals(model1.hashCode(), model1.hashCode());
        System.assertEquals(model2.hashCode(), model2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASModel model1 = OASModel.getExample();
        OASModel model2 = OASModel.getExample();
        OASModel model3 = new OASModel();
        OASModel model4 = new OASModel();

        System.assert(model1.equals(model2));
        System.assert(model3.equals(model4));
        System.assertEquals(model1.hashCode(), model2.hashCode());
        System.assertEquals(model3.hashCode(), model4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASModel model = new OASModel();
        Map<String, String> x-property-mappings = model.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('ownedBy', x-property-mappings.get('owned_by'));
    }
}
