@isTest
private class OASMessageContentImageUrlObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageContentImageUrlObject messageContentImageUrlObject1 = OASMessageContentImageUrlObject.getExample();
        OASMessageContentImageUrlObject messageContentImageUrlObject2 = messageContentImageUrlObject1;
        OASMessageContentImageUrlObject messageContentImageUrlObject3 = new OASMessageContentImageUrlObject();
        OASMessageContentImageUrlObject messageContentImageUrlObject4 = messageContentImageUrlObject3;

        System.assert(messageContentImageUrlObject1.equals(messageContentImageUrlObject2));
        System.assert(messageContentImageUrlObject2.equals(messageContentImageUrlObject1));
        System.assert(messageContentImageUrlObject1.equals(messageContentImageUrlObject1));
        System.assert(messageContentImageUrlObject3.equals(messageContentImageUrlObject4));
        System.assert(messageContentImageUrlObject4.equals(messageContentImageUrlObject3));
        System.assert(messageContentImageUrlObject3.equals(messageContentImageUrlObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageContentImageUrlObject messageContentImageUrlObject1 = OASMessageContentImageUrlObject.getExample();
        OASMessageContentImageUrlObject messageContentImageUrlObject2 = OASMessageContentImageUrlObject.getExample();
        OASMessageContentImageUrlObject messageContentImageUrlObject3 = new OASMessageContentImageUrlObject();
        OASMessageContentImageUrlObject messageContentImageUrlObject4 = new OASMessageContentImageUrlObject();

        System.assert(messageContentImageUrlObject1.equals(messageContentImageUrlObject2));
        System.assert(messageContentImageUrlObject2.equals(messageContentImageUrlObject1));
        System.assert(messageContentImageUrlObject3.equals(messageContentImageUrlObject4));
        System.assert(messageContentImageUrlObject4.equals(messageContentImageUrlObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageContentImageUrlObject messageContentImageUrlObject1 = OASMessageContentImageUrlObject.getExample();
        OASMessageContentImageUrlObject messageContentImageUrlObject2 = new OASMessageContentImageUrlObject();

        System.assertEquals(false, messageContentImageUrlObject1.equals('foo'));
        System.assertEquals(false, messageContentImageUrlObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageContentImageUrlObject messageContentImageUrlObject1 = OASMessageContentImageUrlObject.getExample();
        OASMessageContentImageUrlObject messageContentImageUrlObject2 = new OASMessageContentImageUrlObject();
        OASMessageContentImageUrlObject messageContentImageUrlObject3;

        System.assertEquals(false, messageContentImageUrlObject1.equals(messageContentImageUrlObject3));
        System.assertEquals(false, messageContentImageUrlObject2.equals(messageContentImageUrlObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageContentImageUrlObject messageContentImageUrlObject1 = OASMessageContentImageUrlObject.getExample();
        OASMessageContentImageUrlObject messageContentImageUrlObject2 = new OASMessageContentImageUrlObject();

        System.assertEquals(messageContentImageUrlObject1.hashCode(), messageContentImageUrlObject1.hashCode());
        System.assertEquals(messageContentImageUrlObject2.hashCode(), messageContentImageUrlObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageContentImageUrlObject messageContentImageUrlObject1 = OASMessageContentImageUrlObject.getExample();
        OASMessageContentImageUrlObject messageContentImageUrlObject2 = OASMessageContentImageUrlObject.getExample();
        OASMessageContentImageUrlObject messageContentImageUrlObject3 = new OASMessageContentImageUrlObject();
        OASMessageContentImageUrlObject messageContentImageUrlObject4 = new OASMessageContentImageUrlObject();

        System.assert(messageContentImageUrlObject1.equals(messageContentImageUrlObject2));
        System.assert(messageContentImageUrlObject3.equals(messageContentImageUrlObject4));
        System.assertEquals(messageContentImageUrlObject1.hashCode(), messageContentImageUrlObject2.hashCode());
        System.assertEquals(messageContentImageUrlObject3.hashCode(), messageContentImageUrlObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMessageContentImageUrlObject messageContentImageUrlObject = new OASMessageContentImageUrlObject();
        Map<String, String> x-property-mappings = messageContentImageUrlObject.getx-property-mappings();
        System.assertEquals('imageUrl', x-property-mappings.get('image_url'));
    }
}
