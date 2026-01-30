@isTest
private class OASMessageRequestContentTextObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageRequestContentTextObject messageRequestContentTextObject1 = OASMessageRequestContentTextObject.getExample();
        OASMessageRequestContentTextObject messageRequestContentTextObject2 = messageRequestContentTextObject1;
        OASMessageRequestContentTextObject messageRequestContentTextObject3 = new OASMessageRequestContentTextObject();
        OASMessageRequestContentTextObject messageRequestContentTextObject4 = messageRequestContentTextObject3;

        System.assert(messageRequestContentTextObject1.equals(messageRequestContentTextObject2));
        System.assert(messageRequestContentTextObject2.equals(messageRequestContentTextObject1));
        System.assert(messageRequestContentTextObject1.equals(messageRequestContentTextObject1));
        System.assert(messageRequestContentTextObject3.equals(messageRequestContentTextObject4));
        System.assert(messageRequestContentTextObject4.equals(messageRequestContentTextObject3));
        System.assert(messageRequestContentTextObject3.equals(messageRequestContentTextObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageRequestContentTextObject messageRequestContentTextObject1 = OASMessageRequestContentTextObject.getExample();
        OASMessageRequestContentTextObject messageRequestContentTextObject2 = OASMessageRequestContentTextObject.getExample();
        OASMessageRequestContentTextObject messageRequestContentTextObject3 = new OASMessageRequestContentTextObject();
        OASMessageRequestContentTextObject messageRequestContentTextObject4 = new OASMessageRequestContentTextObject();

        System.assert(messageRequestContentTextObject1.equals(messageRequestContentTextObject2));
        System.assert(messageRequestContentTextObject2.equals(messageRequestContentTextObject1));
        System.assert(messageRequestContentTextObject3.equals(messageRequestContentTextObject4));
        System.assert(messageRequestContentTextObject4.equals(messageRequestContentTextObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageRequestContentTextObject messageRequestContentTextObject1 = OASMessageRequestContentTextObject.getExample();
        OASMessageRequestContentTextObject messageRequestContentTextObject2 = new OASMessageRequestContentTextObject();

        System.assertEquals(false, messageRequestContentTextObject1.equals('foo'));
        System.assertEquals(false, messageRequestContentTextObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageRequestContentTextObject messageRequestContentTextObject1 = OASMessageRequestContentTextObject.getExample();
        OASMessageRequestContentTextObject messageRequestContentTextObject2 = new OASMessageRequestContentTextObject();
        OASMessageRequestContentTextObject messageRequestContentTextObject3;

        System.assertEquals(false, messageRequestContentTextObject1.equals(messageRequestContentTextObject3));
        System.assertEquals(false, messageRequestContentTextObject2.equals(messageRequestContentTextObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageRequestContentTextObject messageRequestContentTextObject1 = OASMessageRequestContentTextObject.getExample();
        OASMessageRequestContentTextObject messageRequestContentTextObject2 = new OASMessageRequestContentTextObject();

        System.assertEquals(messageRequestContentTextObject1.hashCode(), messageRequestContentTextObject1.hashCode());
        System.assertEquals(messageRequestContentTextObject2.hashCode(), messageRequestContentTextObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageRequestContentTextObject messageRequestContentTextObject1 = OASMessageRequestContentTextObject.getExample();
        OASMessageRequestContentTextObject messageRequestContentTextObject2 = OASMessageRequestContentTextObject.getExample();
        OASMessageRequestContentTextObject messageRequestContentTextObject3 = new OASMessageRequestContentTextObject();
        OASMessageRequestContentTextObject messageRequestContentTextObject4 = new OASMessageRequestContentTextObject();

        System.assert(messageRequestContentTextObject1.equals(messageRequestContentTextObject2));
        System.assert(messageRequestContentTextObject3.equals(messageRequestContentTextObject4));
        System.assertEquals(messageRequestContentTextObject1.hashCode(), messageRequestContentTextObject2.hashCode());
        System.assertEquals(messageRequestContentTextObject3.hashCode(), messageRequestContentTextObject4.hashCode());
    }
}
