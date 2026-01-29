@isTest
private class OASMessageContentImageFileObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageContentImageFileObject messageContentImageFileObject1 = OASMessageContentImageFileObject.getExample();
        OASMessageContentImageFileObject messageContentImageFileObject2 = messageContentImageFileObject1;
        OASMessageContentImageFileObject messageContentImageFileObject3 = new OASMessageContentImageFileObject();
        OASMessageContentImageFileObject messageContentImageFileObject4 = messageContentImageFileObject3;

        System.assert(messageContentImageFileObject1.equals(messageContentImageFileObject2));
        System.assert(messageContentImageFileObject2.equals(messageContentImageFileObject1));
        System.assert(messageContentImageFileObject1.equals(messageContentImageFileObject1));
        System.assert(messageContentImageFileObject3.equals(messageContentImageFileObject4));
        System.assert(messageContentImageFileObject4.equals(messageContentImageFileObject3));
        System.assert(messageContentImageFileObject3.equals(messageContentImageFileObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageContentImageFileObject messageContentImageFileObject1 = OASMessageContentImageFileObject.getExample();
        OASMessageContentImageFileObject messageContentImageFileObject2 = OASMessageContentImageFileObject.getExample();
        OASMessageContentImageFileObject messageContentImageFileObject3 = new OASMessageContentImageFileObject();
        OASMessageContentImageFileObject messageContentImageFileObject4 = new OASMessageContentImageFileObject();

        System.assert(messageContentImageFileObject1.equals(messageContentImageFileObject2));
        System.assert(messageContentImageFileObject2.equals(messageContentImageFileObject1));
        System.assert(messageContentImageFileObject3.equals(messageContentImageFileObject4));
        System.assert(messageContentImageFileObject4.equals(messageContentImageFileObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageContentImageFileObject messageContentImageFileObject1 = OASMessageContentImageFileObject.getExample();
        OASMessageContentImageFileObject messageContentImageFileObject2 = new OASMessageContentImageFileObject();

        System.assertEquals(false, messageContentImageFileObject1.equals('foo'));
        System.assertEquals(false, messageContentImageFileObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageContentImageFileObject messageContentImageFileObject1 = OASMessageContentImageFileObject.getExample();
        OASMessageContentImageFileObject messageContentImageFileObject2 = new OASMessageContentImageFileObject();
        OASMessageContentImageFileObject messageContentImageFileObject3;

        System.assertEquals(false, messageContentImageFileObject1.equals(messageContentImageFileObject3));
        System.assertEquals(false, messageContentImageFileObject2.equals(messageContentImageFileObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageContentImageFileObject messageContentImageFileObject1 = OASMessageContentImageFileObject.getExample();
        OASMessageContentImageFileObject messageContentImageFileObject2 = new OASMessageContentImageFileObject();

        System.assertEquals(messageContentImageFileObject1.hashCode(), messageContentImageFileObject1.hashCode());
        System.assertEquals(messageContentImageFileObject2.hashCode(), messageContentImageFileObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageContentImageFileObject messageContentImageFileObject1 = OASMessageContentImageFileObject.getExample();
        OASMessageContentImageFileObject messageContentImageFileObject2 = OASMessageContentImageFileObject.getExample();
        OASMessageContentImageFileObject messageContentImageFileObject3 = new OASMessageContentImageFileObject();
        OASMessageContentImageFileObject messageContentImageFileObject4 = new OASMessageContentImageFileObject();

        System.assert(messageContentImageFileObject1.equals(messageContentImageFileObject2));
        System.assert(messageContentImageFileObject3.equals(messageContentImageFileObject4));
        System.assertEquals(messageContentImageFileObject1.hashCode(), messageContentImageFileObject2.hashCode());
        System.assertEquals(messageContentImageFileObject3.hashCode(), messageContentImageFileObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMessageContentImageFileObject messageContentImageFileObject = new OASMessageContentImageFileObject();
        Map<String, String> x-property-mappings = messageContentImageFileObject.getx-property-mappings();
        System.assertEquals('imageFile', x-property-mappings.get('image_file'));
    }
}
