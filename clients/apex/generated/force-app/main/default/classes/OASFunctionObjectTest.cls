@isTest
private class OASFunctionObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASFunctionObject functionObject1 = OASFunctionObject.getExample();
        OASFunctionObject functionObject2 = functionObject1;
        OASFunctionObject functionObject3 = new OASFunctionObject();
        OASFunctionObject functionObject4 = functionObject3;

        System.assert(functionObject1.equals(functionObject2));
        System.assert(functionObject2.equals(functionObject1));
        System.assert(functionObject1.equals(functionObject1));
        System.assert(functionObject3.equals(functionObject4));
        System.assert(functionObject4.equals(functionObject3));
        System.assert(functionObject3.equals(functionObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFunctionObject functionObject1 = OASFunctionObject.getExample();
        OASFunctionObject functionObject2 = OASFunctionObject.getExample();
        OASFunctionObject functionObject3 = new OASFunctionObject();
        OASFunctionObject functionObject4 = new OASFunctionObject();

        System.assert(functionObject1.equals(functionObject2));
        System.assert(functionObject2.equals(functionObject1));
        System.assert(functionObject3.equals(functionObject4));
        System.assert(functionObject4.equals(functionObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFunctionObject functionObject1 = OASFunctionObject.getExample();
        OASFunctionObject functionObject2 = new OASFunctionObject();

        System.assertEquals(false, functionObject1.equals('foo'));
        System.assertEquals(false, functionObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFunctionObject functionObject1 = OASFunctionObject.getExample();
        OASFunctionObject functionObject2 = new OASFunctionObject();
        OASFunctionObject functionObject3;

        System.assertEquals(false, functionObject1.equals(functionObject3));
        System.assertEquals(false, functionObject2.equals(functionObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFunctionObject functionObject1 = OASFunctionObject.getExample();
        OASFunctionObject functionObject2 = new OASFunctionObject();

        System.assertEquals(functionObject1.hashCode(), functionObject1.hashCode());
        System.assertEquals(functionObject2.hashCode(), functionObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFunctionObject functionObject1 = OASFunctionObject.getExample();
        OASFunctionObject functionObject2 = OASFunctionObject.getExample();
        OASFunctionObject functionObject3 = new OASFunctionObject();
        OASFunctionObject functionObject4 = new OASFunctionObject();

        System.assert(functionObject1.equals(functionObject2));
        System.assert(functionObject3.equals(functionObject4));
        System.assertEquals(functionObject1.hashCode(), functionObject2.hashCode());
        System.assertEquals(functionObject3.hashCode(), functionObject4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFunctionObject functionObject = new OASFunctionObject();
        System.assertEquals(new Map<String, oas_any_type_not_mapped>(), functionObject.parameters);
        System.assertEquals(null, functionObject.description);
        System.assertEquals(null, functionObject.name);
    }
}
