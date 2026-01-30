@isTest
private class OASMessageContentRefusalObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageContentRefusalObject messageContentRefusalObject1 = OASMessageContentRefusalObject.getExample();
        OASMessageContentRefusalObject messageContentRefusalObject2 = messageContentRefusalObject1;
        OASMessageContentRefusalObject messageContentRefusalObject3 = new OASMessageContentRefusalObject();
        OASMessageContentRefusalObject messageContentRefusalObject4 = messageContentRefusalObject3;

        System.assert(messageContentRefusalObject1.equals(messageContentRefusalObject2));
        System.assert(messageContentRefusalObject2.equals(messageContentRefusalObject1));
        System.assert(messageContentRefusalObject1.equals(messageContentRefusalObject1));
        System.assert(messageContentRefusalObject3.equals(messageContentRefusalObject4));
        System.assert(messageContentRefusalObject4.equals(messageContentRefusalObject3));
        System.assert(messageContentRefusalObject3.equals(messageContentRefusalObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageContentRefusalObject messageContentRefusalObject1 = OASMessageContentRefusalObject.getExample();
        OASMessageContentRefusalObject messageContentRefusalObject2 = OASMessageContentRefusalObject.getExample();
        OASMessageContentRefusalObject messageContentRefusalObject3 = new OASMessageContentRefusalObject();
        OASMessageContentRefusalObject messageContentRefusalObject4 = new OASMessageContentRefusalObject();

        System.assert(messageContentRefusalObject1.equals(messageContentRefusalObject2));
        System.assert(messageContentRefusalObject2.equals(messageContentRefusalObject1));
        System.assert(messageContentRefusalObject3.equals(messageContentRefusalObject4));
        System.assert(messageContentRefusalObject4.equals(messageContentRefusalObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageContentRefusalObject messageContentRefusalObject1 = OASMessageContentRefusalObject.getExample();
        OASMessageContentRefusalObject messageContentRefusalObject2 = new OASMessageContentRefusalObject();

        System.assertEquals(false, messageContentRefusalObject1.equals('foo'));
        System.assertEquals(false, messageContentRefusalObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageContentRefusalObject messageContentRefusalObject1 = OASMessageContentRefusalObject.getExample();
        OASMessageContentRefusalObject messageContentRefusalObject2 = new OASMessageContentRefusalObject();
        OASMessageContentRefusalObject messageContentRefusalObject3;

        System.assertEquals(false, messageContentRefusalObject1.equals(messageContentRefusalObject3));
        System.assertEquals(false, messageContentRefusalObject2.equals(messageContentRefusalObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageContentRefusalObject messageContentRefusalObject1 = OASMessageContentRefusalObject.getExample();
        OASMessageContentRefusalObject messageContentRefusalObject2 = new OASMessageContentRefusalObject();

        System.assertEquals(messageContentRefusalObject1.hashCode(), messageContentRefusalObject1.hashCode());
        System.assertEquals(messageContentRefusalObject2.hashCode(), messageContentRefusalObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageContentRefusalObject messageContentRefusalObject1 = OASMessageContentRefusalObject.getExample();
        OASMessageContentRefusalObject messageContentRefusalObject2 = OASMessageContentRefusalObject.getExample();
        OASMessageContentRefusalObject messageContentRefusalObject3 = new OASMessageContentRefusalObject();
        OASMessageContentRefusalObject messageContentRefusalObject4 = new OASMessageContentRefusalObject();

        System.assert(messageContentRefusalObject1.equals(messageContentRefusalObject2));
        System.assert(messageContentRefusalObject3.equals(messageContentRefusalObject4));
        System.assertEquals(messageContentRefusalObject1.hashCode(), messageContentRefusalObject2.hashCode());
        System.assertEquals(messageContentRefusalObject3.hashCode(), messageContentRefusalObject4.hashCode());
    }
}
