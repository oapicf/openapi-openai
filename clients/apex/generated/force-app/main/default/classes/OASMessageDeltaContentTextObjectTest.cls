@isTest
private class OASMessageDeltaContentTextObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageDeltaContentTextObject messageDeltaContentTextObject1 = OASMessageDeltaContentTextObject.getExample();
        OASMessageDeltaContentTextObject messageDeltaContentTextObject2 = messageDeltaContentTextObject1;
        OASMessageDeltaContentTextObject messageDeltaContentTextObject3 = new OASMessageDeltaContentTextObject();
        OASMessageDeltaContentTextObject messageDeltaContentTextObject4 = messageDeltaContentTextObject3;

        System.assert(messageDeltaContentTextObject1.equals(messageDeltaContentTextObject2));
        System.assert(messageDeltaContentTextObject2.equals(messageDeltaContentTextObject1));
        System.assert(messageDeltaContentTextObject1.equals(messageDeltaContentTextObject1));
        System.assert(messageDeltaContentTextObject3.equals(messageDeltaContentTextObject4));
        System.assert(messageDeltaContentTextObject4.equals(messageDeltaContentTextObject3));
        System.assert(messageDeltaContentTextObject3.equals(messageDeltaContentTextObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageDeltaContentTextObject messageDeltaContentTextObject1 = OASMessageDeltaContentTextObject.getExample();
        OASMessageDeltaContentTextObject messageDeltaContentTextObject2 = OASMessageDeltaContentTextObject.getExample();
        OASMessageDeltaContentTextObject messageDeltaContentTextObject3 = new OASMessageDeltaContentTextObject();
        OASMessageDeltaContentTextObject messageDeltaContentTextObject4 = new OASMessageDeltaContentTextObject();

        System.assert(messageDeltaContentTextObject1.equals(messageDeltaContentTextObject2));
        System.assert(messageDeltaContentTextObject2.equals(messageDeltaContentTextObject1));
        System.assert(messageDeltaContentTextObject3.equals(messageDeltaContentTextObject4));
        System.assert(messageDeltaContentTextObject4.equals(messageDeltaContentTextObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageDeltaContentTextObject messageDeltaContentTextObject1 = OASMessageDeltaContentTextObject.getExample();
        OASMessageDeltaContentTextObject messageDeltaContentTextObject2 = new OASMessageDeltaContentTextObject();

        System.assertEquals(false, messageDeltaContentTextObject1.equals('foo'));
        System.assertEquals(false, messageDeltaContentTextObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageDeltaContentTextObject messageDeltaContentTextObject1 = OASMessageDeltaContentTextObject.getExample();
        OASMessageDeltaContentTextObject messageDeltaContentTextObject2 = new OASMessageDeltaContentTextObject();
        OASMessageDeltaContentTextObject messageDeltaContentTextObject3;

        System.assertEquals(false, messageDeltaContentTextObject1.equals(messageDeltaContentTextObject3));
        System.assertEquals(false, messageDeltaContentTextObject2.equals(messageDeltaContentTextObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageDeltaContentTextObject messageDeltaContentTextObject1 = OASMessageDeltaContentTextObject.getExample();
        OASMessageDeltaContentTextObject messageDeltaContentTextObject2 = new OASMessageDeltaContentTextObject();

        System.assertEquals(messageDeltaContentTextObject1.hashCode(), messageDeltaContentTextObject1.hashCode());
        System.assertEquals(messageDeltaContentTextObject2.hashCode(), messageDeltaContentTextObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageDeltaContentTextObject messageDeltaContentTextObject1 = OASMessageDeltaContentTextObject.getExample();
        OASMessageDeltaContentTextObject messageDeltaContentTextObject2 = OASMessageDeltaContentTextObject.getExample();
        OASMessageDeltaContentTextObject messageDeltaContentTextObject3 = new OASMessageDeltaContentTextObject();
        OASMessageDeltaContentTextObject messageDeltaContentTextObject4 = new OASMessageDeltaContentTextObject();

        System.assert(messageDeltaContentTextObject1.equals(messageDeltaContentTextObject2));
        System.assert(messageDeltaContentTextObject3.equals(messageDeltaContentTextObject4));
        System.assertEquals(messageDeltaContentTextObject1.hashCode(), messageDeltaContentTextObject2.hashCode());
        System.assertEquals(messageDeltaContentTextObject3.hashCode(), messageDeltaContentTextObject4.hashCode());
    }
}
