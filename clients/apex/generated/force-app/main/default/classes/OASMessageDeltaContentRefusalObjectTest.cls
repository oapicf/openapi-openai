@isTest
private class OASMessageDeltaContentRefusalObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject1 = OASMessageDeltaContentRefusalObject.getExample();
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject2 = messageDeltaContentRefusalObject1;
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject3 = new OASMessageDeltaContentRefusalObject();
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject4 = messageDeltaContentRefusalObject3;

        System.assert(messageDeltaContentRefusalObject1.equals(messageDeltaContentRefusalObject2));
        System.assert(messageDeltaContentRefusalObject2.equals(messageDeltaContentRefusalObject1));
        System.assert(messageDeltaContentRefusalObject1.equals(messageDeltaContentRefusalObject1));
        System.assert(messageDeltaContentRefusalObject3.equals(messageDeltaContentRefusalObject4));
        System.assert(messageDeltaContentRefusalObject4.equals(messageDeltaContentRefusalObject3));
        System.assert(messageDeltaContentRefusalObject3.equals(messageDeltaContentRefusalObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject1 = OASMessageDeltaContentRefusalObject.getExample();
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject2 = OASMessageDeltaContentRefusalObject.getExample();
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject3 = new OASMessageDeltaContentRefusalObject();
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject4 = new OASMessageDeltaContentRefusalObject();

        System.assert(messageDeltaContentRefusalObject1.equals(messageDeltaContentRefusalObject2));
        System.assert(messageDeltaContentRefusalObject2.equals(messageDeltaContentRefusalObject1));
        System.assert(messageDeltaContentRefusalObject3.equals(messageDeltaContentRefusalObject4));
        System.assert(messageDeltaContentRefusalObject4.equals(messageDeltaContentRefusalObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject1 = OASMessageDeltaContentRefusalObject.getExample();
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject2 = new OASMessageDeltaContentRefusalObject();

        System.assertEquals(false, messageDeltaContentRefusalObject1.equals('foo'));
        System.assertEquals(false, messageDeltaContentRefusalObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject1 = OASMessageDeltaContentRefusalObject.getExample();
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject2 = new OASMessageDeltaContentRefusalObject();
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject3;

        System.assertEquals(false, messageDeltaContentRefusalObject1.equals(messageDeltaContentRefusalObject3));
        System.assertEquals(false, messageDeltaContentRefusalObject2.equals(messageDeltaContentRefusalObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject1 = OASMessageDeltaContentRefusalObject.getExample();
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject2 = new OASMessageDeltaContentRefusalObject();

        System.assertEquals(messageDeltaContentRefusalObject1.hashCode(), messageDeltaContentRefusalObject1.hashCode());
        System.assertEquals(messageDeltaContentRefusalObject2.hashCode(), messageDeltaContentRefusalObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject1 = OASMessageDeltaContentRefusalObject.getExample();
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject2 = OASMessageDeltaContentRefusalObject.getExample();
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject3 = new OASMessageDeltaContentRefusalObject();
        OASMessageDeltaContentRefusalObject messageDeltaContentRefusalObject4 = new OASMessageDeltaContentRefusalObject();

        System.assert(messageDeltaContentRefusalObject1.equals(messageDeltaContentRefusalObject2));
        System.assert(messageDeltaContentRefusalObject3.equals(messageDeltaContentRefusalObject4));
        System.assertEquals(messageDeltaContentRefusalObject1.hashCode(), messageDeltaContentRefusalObject2.hashCode());
        System.assertEquals(messageDeltaContentRefusalObject3.hashCode(), messageDeltaContentRefusalObject4.hashCode());
    }
}
