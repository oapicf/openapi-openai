@isTest
private class OASMessageObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageObject messageObject1 = OASMessageObject.getExample();
        OASMessageObject messageObject2 = messageObject1;
        OASMessageObject messageObject3 = new OASMessageObject();
        OASMessageObject messageObject4 = messageObject3;

        System.assert(messageObject1.equals(messageObject2));
        System.assert(messageObject2.equals(messageObject1));
        System.assert(messageObject1.equals(messageObject1));
        System.assert(messageObject3.equals(messageObject4));
        System.assert(messageObject4.equals(messageObject3));
        System.assert(messageObject3.equals(messageObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageObject messageObject1 = OASMessageObject.getExample();
        OASMessageObject messageObject2 = OASMessageObject.getExample();
        OASMessageObject messageObject3 = new OASMessageObject();
        OASMessageObject messageObject4 = new OASMessageObject();

        System.assert(messageObject1.equals(messageObject2));
        System.assert(messageObject2.equals(messageObject1));
        System.assert(messageObject3.equals(messageObject4));
        System.assert(messageObject4.equals(messageObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageObject messageObject1 = OASMessageObject.getExample();
        OASMessageObject messageObject2 = new OASMessageObject();

        System.assertEquals(false, messageObject1.equals('foo'));
        System.assertEquals(false, messageObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageObject messageObject1 = OASMessageObject.getExample();
        OASMessageObject messageObject2 = new OASMessageObject();
        OASMessageObject messageObject3;

        System.assertEquals(false, messageObject1.equals(messageObject3));
        System.assertEquals(false, messageObject2.equals(messageObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageObject messageObject1 = OASMessageObject.getExample();
        OASMessageObject messageObject2 = new OASMessageObject();

        System.assertEquals(messageObject1.hashCode(), messageObject1.hashCode());
        System.assertEquals(messageObject2.hashCode(), messageObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageObject messageObject1 = OASMessageObject.getExample();
        OASMessageObject messageObject2 = OASMessageObject.getExample();
        OASMessageObject messageObject3 = new OASMessageObject();
        OASMessageObject messageObject4 = new OASMessageObject();

        System.assert(messageObject1.equals(messageObject2));
        System.assert(messageObject3.equals(messageObject4));
        System.assertEquals(messageObject1.hashCode(), messageObject2.hashCode());
        System.assertEquals(messageObject3.hashCode(), messageObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMessageObject messageObject = new OASMessageObject();
        Map<String, String> x-property-mappings = messageObject.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('threadId', x-property-mappings.get('thread_id'));
        System.assertEquals('incompleteDetails', x-property-mappings.get('incomplete_details'));
        System.assertEquals('completedAt', x-property-mappings.get('completed_at'));
        System.assertEquals('incompleteAt', x-property-mappings.get('incomplete_at'));
        System.assertEquals('assistantId', x-property-mappings.get('assistant_id'));
        System.assertEquals('runId', x-property-mappings.get('run_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMessageObject messageObject = new OASMessageObject();
        System.assertEquals(new List<OASMessageObjectContentInner>(), messageObject.content);
        System.assertEquals(new List<OASCreateMessageRequestAttachmentsIn>(), messageObject.attachments);
        System.assertEquals(null, messageObject.id);
        System.assertEquals(null, messageObject.r_object);
        System.assertEquals(null, messageObject.createdAt);
        System.assertEquals(null, messageObject.threadId);
        System.assertEquals(null, messageObject.status);
        System.assertEquals(null, messageObject.incompleteDetails);
        System.assertEquals(null, messageObject.completedAt);
        System.assertEquals(null, messageObject.incompleteAt);
        System.assertEquals(null, messageObject.role);
        System.assertEquals(null, messageObject.assistantId);
        System.assertEquals(null, messageObject.runId);
        System.assertEquals(null, messageObject.metadata);
    }
}
