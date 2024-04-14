@isTest
private class OASMessageFileObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageFileObject messageFileObject1 = OASMessageFileObject.getExample();
        OASMessageFileObject messageFileObject2 = messageFileObject1;
        OASMessageFileObject messageFileObject3 = new OASMessageFileObject();
        OASMessageFileObject messageFileObject4 = messageFileObject3;

        System.assert(messageFileObject1.equals(messageFileObject2));
        System.assert(messageFileObject2.equals(messageFileObject1));
        System.assert(messageFileObject1.equals(messageFileObject1));
        System.assert(messageFileObject3.equals(messageFileObject4));
        System.assert(messageFileObject4.equals(messageFileObject3));
        System.assert(messageFileObject3.equals(messageFileObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageFileObject messageFileObject1 = OASMessageFileObject.getExample();
        OASMessageFileObject messageFileObject2 = OASMessageFileObject.getExample();
        OASMessageFileObject messageFileObject3 = new OASMessageFileObject();
        OASMessageFileObject messageFileObject4 = new OASMessageFileObject();

        System.assert(messageFileObject1.equals(messageFileObject2));
        System.assert(messageFileObject2.equals(messageFileObject1));
        System.assert(messageFileObject3.equals(messageFileObject4));
        System.assert(messageFileObject4.equals(messageFileObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageFileObject messageFileObject1 = OASMessageFileObject.getExample();
        OASMessageFileObject messageFileObject2 = new OASMessageFileObject();

        System.assertEquals(false, messageFileObject1.equals('foo'));
        System.assertEquals(false, messageFileObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageFileObject messageFileObject1 = OASMessageFileObject.getExample();
        OASMessageFileObject messageFileObject2 = new OASMessageFileObject();
        OASMessageFileObject messageFileObject3;

        System.assertEquals(false, messageFileObject1.equals(messageFileObject3));
        System.assertEquals(false, messageFileObject2.equals(messageFileObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageFileObject messageFileObject1 = OASMessageFileObject.getExample();
        OASMessageFileObject messageFileObject2 = new OASMessageFileObject();

        System.assertEquals(messageFileObject1.hashCode(), messageFileObject1.hashCode());
        System.assertEquals(messageFileObject2.hashCode(), messageFileObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageFileObject messageFileObject1 = OASMessageFileObject.getExample();
        OASMessageFileObject messageFileObject2 = OASMessageFileObject.getExample();
        OASMessageFileObject messageFileObject3 = new OASMessageFileObject();
        OASMessageFileObject messageFileObject4 = new OASMessageFileObject();

        System.assert(messageFileObject1.equals(messageFileObject2));
        System.assert(messageFileObject3.equals(messageFileObject4));
        System.assertEquals(messageFileObject1.hashCode(), messageFileObject2.hashCode());
        System.assertEquals(messageFileObject3.hashCode(), messageFileObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMessageFileObject messageFileObject = new OASMessageFileObject();
        Map<String, String> x-property-mappings = messageFileObject.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('messageId', x-property-mappings.get('message_id'));
    }
}
