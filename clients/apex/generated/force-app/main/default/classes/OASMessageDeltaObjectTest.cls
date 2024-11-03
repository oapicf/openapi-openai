@isTest
private class OASMessageDeltaObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageDeltaObject messageDeltaObject1 = OASMessageDeltaObject.getExample();
        OASMessageDeltaObject messageDeltaObject2 = messageDeltaObject1;
        OASMessageDeltaObject messageDeltaObject3 = new OASMessageDeltaObject();
        OASMessageDeltaObject messageDeltaObject4 = messageDeltaObject3;

        System.assert(messageDeltaObject1.equals(messageDeltaObject2));
        System.assert(messageDeltaObject2.equals(messageDeltaObject1));
        System.assert(messageDeltaObject1.equals(messageDeltaObject1));
        System.assert(messageDeltaObject3.equals(messageDeltaObject4));
        System.assert(messageDeltaObject4.equals(messageDeltaObject3));
        System.assert(messageDeltaObject3.equals(messageDeltaObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageDeltaObject messageDeltaObject1 = OASMessageDeltaObject.getExample();
        OASMessageDeltaObject messageDeltaObject2 = OASMessageDeltaObject.getExample();
        OASMessageDeltaObject messageDeltaObject3 = new OASMessageDeltaObject();
        OASMessageDeltaObject messageDeltaObject4 = new OASMessageDeltaObject();

        System.assert(messageDeltaObject1.equals(messageDeltaObject2));
        System.assert(messageDeltaObject2.equals(messageDeltaObject1));
        System.assert(messageDeltaObject3.equals(messageDeltaObject4));
        System.assert(messageDeltaObject4.equals(messageDeltaObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageDeltaObject messageDeltaObject1 = OASMessageDeltaObject.getExample();
        OASMessageDeltaObject messageDeltaObject2 = new OASMessageDeltaObject();

        System.assertEquals(false, messageDeltaObject1.equals('foo'));
        System.assertEquals(false, messageDeltaObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageDeltaObject messageDeltaObject1 = OASMessageDeltaObject.getExample();
        OASMessageDeltaObject messageDeltaObject2 = new OASMessageDeltaObject();
        OASMessageDeltaObject messageDeltaObject3;

        System.assertEquals(false, messageDeltaObject1.equals(messageDeltaObject3));
        System.assertEquals(false, messageDeltaObject2.equals(messageDeltaObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageDeltaObject messageDeltaObject1 = OASMessageDeltaObject.getExample();
        OASMessageDeltaObject messageDeltaObject2 = new OASMessageDeltaObject();

        System.assertEquals(messageDeltaObject1.hashCode(), messageDeltaObject1.hashCode());
        System.assertEquals(messageDeltaObject2.hashCode(), messageDeltaObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageDeltaObject messageDeltaObject1 = OASMessageDeltaObject.getExample();
        OASMessageDeltaObject messageDeltaObject2 = OASMessageDeltaObject.getExample();
        OASMessageDeltaObject messageDeltaObject3 = new OASMessageDeltaObject();
        OASMessageDeltaObject messageDeltaObject4 = new OASMessageDeltaObject();

        System.assert(messageDeltaObject1.equals(messageDeltaObject2));
        System.assert(messageDeltaObject3.equals(messageDeltaObject4));
        System.assertEquals(messageDeltaObject1.hashCode(), messageDeltaObject2.hashCode());
        System.assertEquals(messageDeltaObject3.hashCode(), messageDeltaObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMessageDeltaObject messageDeltaObject = new OASMessageDeltaObject();
        Map<String, String> x-property-mappings = messageDeltaObject.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
