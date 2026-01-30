@isTest
private class OASRealtimeResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeResponse realtimeResponse1 = OASRealtimeResponse.getExample();
        OASRealtimeResponse realtimeResponse2 = realtimeResponse1;
        OASRealtimeResponse realtimeResponse3 = new OASRealtimeResponse();
        OASRealtimeResponse realtimeResponse4 = realtimeResponse3;

        System.assert(realtimeResponse1.equals(realtimeResponse2));
        System.assert(realtimeResponse2.equals(realtimeResponse1));
        System.assert(realtimeResponse1.equals(realtimeResponse1));
        System.assert(realtimeResponse3.equals(realtimeResponse4));
        System.assert(realtimeResponse4.equals(realtimeResponse3));
        System.assert(realtimeResponse3.equals(realtimeResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeResponse realtimeResponse1 = OASRealtimeResponse.getExample();
        OASRealtimeResponse realtimeResponse2 = OASRealtimeResponse.getExample();
        OASRealtimeResponse realtimeResponse3 = new OASRealtimeResponse();
        OASRealtimeResponse realtimeResponse4 = new OASRealtimeResponse();

        System.assert(realtimeResponse1.equals(realtimeResponse2));
        System.assert(realtimeResponse2.equals(realtimeResponse1));
        System.assert(realtimeResponse3.equals(realtimeResponse4));
        System.assert(realtimeResponse4.equals(realtimeResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeResponse realtimeResponse1 = OASRealtimeResponse.getExample();
        OASRealtimeResponse realtimeResponse2 = new OASRealtimeResponse();

        System.assertEquals(false, realtimeResponse1.equals('foo'));
        System.assertEquals(false, realtimeResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeResponse realtimeResponse1 = OASRealtimeResponse.getExample();
        OASRealtimeResponse realtimeResponse2 = new OASRealtimeResponse();
        OASRealtimeResponse realtimeResponse3;

        System.assertEquals(false, realtimeResponse1.equals(realtimeResponse3));
        System.assertEquals(false, realtimeResponse2.equals(realtimeResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeResponse realtimeResponse1 = OASRealtimeResponse.getExample();
        OASRealtimeResponse realtimeResponse2 = new OASRealtimeResponse();

        System.assertEquals(realtimeResponse1.hashCode(), realtimeResponse1.hashCode());
        System.assertEquals(realtimeResponse2.hashCode(), realtimeResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeResponse realtimeResponse1 = OASRealtimeResponse.getExample();
        OASRealtimeResponse realtimeResponse2 = OASRealtimeResponse.getExample();
        OASRealtimeResponse realtimeResponse3 = new OASRealtimeResponse();
        OASRealtimeResponse realtimeResponse4 = new OASRealtimeResponse();

        System.assert(realtimeResponse1.equals(realtimeResponse2));
        System.assert(realtimeResponse3.equals(realtimeResponse4));
        System.assertEquals(realtimeResponse1.hashCode(), realtimeResponse2.hashCode());
        System.assertEquals(realtimeResponse3.hashCode(), realtimeResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeResponse realtimeResponse = new OASRealtimeResponse();
        Map<String, String> x-property-mappings = realtimeResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('statusDetails', x-property-mappings.get('status_details'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRealtimeResponse realtimeResponse = new OASRealtimeResponse();
        System.assertEquals(new List<OASRealtimeConversationItem>(), realtimeResponse.output);
        System.assertEquals(null, realtimeResponse.id);
        System.assertEquals(null, realtimeResponse.r_object);
        System.assertEquals(null, realtimeResponse.status);
        System.assertEquals(null, realtimeResponse.statusDetails);
        System.assertEquals(null, realtimeResponse.metadata);
        System.assertEquals(null, realtimeResponse.usage);
    }
}
