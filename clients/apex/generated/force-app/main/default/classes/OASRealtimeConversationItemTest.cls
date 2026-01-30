@isTest
private class OASRealtimeConversationItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeConversationItem realtimeConversationItem1 = OASRealtimeConversationItem.getExample();
        OASRealtimeConversationItem realtimeConversationItem2 = realtimeConversationItem1;
        OASRealtimeConversationItem realtimeConversationItem3 = new OASRealtimeConversationItem();
        OASRealtimeConversationItem realtimeConversationItem4 = realtimeConversationItem3;

        System.assert(realtimeConversationItem1.equals(realtimeConversationItem2));
        System.assert(realtimeConversationItem2.equals(realtimeConversationItem1));
        System.assert(realtimeConversationItem1.equals(realtimeConversationItem1));
        System.assert(realtimeConversationItem3.equals(realtimeConversationItem4));
        System.assert(realtimeConversationItem4.equals(realtimeConversationItem3));
        System.assert(realtimeConversationItem3.equals(realtimeConversationItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeConversationItem realtimeConversationItem1 = OASRealtimeConversationItem.getExample();
        OASRealtimeConversationItem realtimeConversationItem2 = OASRealtimeConversationItem.getExample();
        OASRealtimeConversationItem realtimeConversationItem3 = new OASRealtimeConversationItem();
        OASRealtimeConversationItem realtimeConversationItem4 = new OASRealtimeConversationItem();

        System.assert(realtimeConversationItem1.equals(realtimeConversationItem2));
        System.assert(realtimeConversationItem2.equals(realtimeConversationItem1));
        System.assert(realtimeConversationItem3.equals(realtimeConversationItem4));
        System.assert(realtimeConversationItem4.equals(realtimeConversationItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeConversationItem realtimeConversationItem1 = OASRealtimeConversationItem.getExample();
        OASRealtimeConversationItem realtimeConversationItem2 = new OASRealtimeConversationItem();

        System.assertEquals(false, realtimeConversationItem1.equals('foo'));
        System.assertEquals(false, realtimeConversationItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeConversationItem realtimeConversationItem1 = OASRealtimeConversationItem.getExample();
        OASRealtimeConversationItem realtimeConversationItem2 = new OASRealtimeConversationItem();
        OASRealtimeConversationItem realtimeConversationItem3;

        System.assertEquals(false, realtimeConversationItem1.equals(realtimeConversationItem3));
        System.assertEquals(false, realtimeConversationItem2.equals(realtimeConversationItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeConversationItem realtimeConversationItem1 = OASRealtimeConversationItem.getExample();
        OASRealtimeConversationItem realtimeConversationItem2 = new OASRealtimeConversationItem();

        System.assertEquals(realtimeConversationItem1.hashCode(), realtimeConversationItem1.hashCode());
        System.assertEquals(realtimeConversationItem2.hashCode(), realtimeConversationItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeConversationItem realtimeConversationItem1 = OASRealtimeConversationItem.getExample();
        OASRealtimeConversationItem realtimeConversationItem2 = OASRealtimeConversationItem.getExample();
        OASRealtimeConversationItem realtimeConversationItem3 = new OASRealtimeConversationItem();
        OASRealtimeConversationItem realtimeConversationItem4 = new OASRealtimeConversationItem();

        System.assert(realtimeConversationItem1.equals(realtimeConversationItem2));
        System.assert(realtimeConversationItem3.equals(realtimeConversationItem4));
        System.assertEquals(realtimeConversationItem1.hashCode(), realtimeConversationItem2.hashCode());
        System.assertEquals(realtimeConversationItem3.hashCode(), realtimeConversationItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeConversationItem realtimeConversationItem = new OASRealtimeConversationItem();
        Map<String, String> x-property-mappings = realtimeConversationItem.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('callId', x-property-mappings.get('call_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRealtimeConversationItem realtimeConversationItem = new OASRealtimeConversationItem();
        System.assertEquals(new List<OASRealtimeConversationItemContentIn>(), realtimeConversationItem.content);
        System.assertEquals(null, realtimeConversationItem.id);
        System.assertEquals(null, realtimeConversationItem.type);
        System.assertEquals(null, realtimeConversationItem.r_object);
        System.assertEquals(null, realtimeConversationItem.status);
        System.assertEquals(null, realtimeConversationItem.role);
        System.assertEquals(null, realtimeConversationItem.callId);
        System.assertEquals(null, realtimeConversationItem.name);
        System.assertEquals(null, realtimeConversationItem.arguments);
        System.assertEquals(null, realtimeConversationItem.output);
    }
}
