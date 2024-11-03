@isTest
private class OASMessageContentTextObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageContentTextObject messageContentTextObject1 = OASMessageContentTextObject.getExample();
        OASMessageContentTextObject messageContentTextObject2 = messageContentTextObject1;
        OASMessageContentTextObject messageContentTextObject3 = new OASMessageContentTextObject();
        OASMessageContentTextObject messageContentTextObject4 = messageContentTextObject3;

        System.assert(messageContentTextObject1.equals(messageContentTextObject2));
        System.assert(messageContentTextObject2.equals(messageContentTextObject1));
        System.assert(messageContentTextObject1.equals(messageContentTextObject1));
        System.assert(messageContentTextObject3.equals(messageContentTextObject4));
        System.assert(messageContentTextObject4.equals(messageContentTextObject3));
        System.assert(messageContentTextObject3.equals(messageContentTextObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageContentTextObject messageContentTextObject1 = OASMessageContentTextObject.getExample();
        OASMessageContentTextObject messageContentTextObject2 = OASMessageContentTextObject.getExample();
        OASMessageContentTextObject messageContentTextObject3 = new OASMessageContentTextObject();
        OASMessageContentTextObject messageContentTextObject4 = new OASMessageContentTextObject();

        System.assert(messageContentTextObject1.equals(messageContentTextObject2));
        System.assert(messageContentTextObject2.equals(messageContentTextObject1));
        System.assert(messageContentTextObject3.equals(messageContentTextObject4));
        System.assert(messageContentTextObject4.equals(messageContentTextObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageContentTextObject messageContentTextObject1 = OASMessageContentTextObject.getExample();
        OASMessageContentTextObject messageContentTextObject2 = new OASMessageContentTextObject();

        System.assertEquals(false, messageContentTextObject1.equals('foo'));
        System.assertEquals(false, messageContentTextObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageContentTextObject messageContentTextObject1 = OASMessageContentTextObject.getExample();
        OASMessageContentTextObject messageContentTextObject2 = new OASMessageContentTextObject();
        OASMessageContentTextObject messageContentTextObject3;

        System.assertEquals(false, messageContentTextObject1.equals(messageContentTextObject3));
        System.assertEquals(false, messageContentTextObject2.equals(messageContentTextObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageContentTextObject messageContentTextObject1 = OASMessageContentTextObject.getExample();
        OASMessageContentTextObject messageContentTextObject2 = new OASMessageContentTextObject();

        System.assertEquals(messageContentTextObject1.hashCode(), messageContentTextObject1.hashCode());
        System.assertEquals(messageContentTextObject2.hashCode(), messageContentTextObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageContentTextObject messageContentTextObject1 = OASMessageContentTextObject.getExample();
        OASMessageContentTextObject messageContentTextObject2 = OASMessageContentTextObject.getExample();
        OASMessageContentTextObject messageContentTextObject3 = new OASMessageContentTextObject();
        OASMessageContentTextObject messageContentTextObject4 = new OASMessageContentTextObject();

        System.assert(messageContentTextObject1.equals(messageContentTextObject2));
        System.assert(messageContentTextObject3.equals(messageContentTextObject4));
        System.assertEquals(messageContentTextObject1.hashCode(), messageContentTextObject2.hashCode());
        System.assertEquals(messageContentTextObject3.hashCode(), messageContentTextObject4.hashCode());
    }
}
