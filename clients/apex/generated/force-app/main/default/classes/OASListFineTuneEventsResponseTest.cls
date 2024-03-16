@isTest
private class OASListFineTuneEventsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASListFineTuneEventsResponse listFineTuneEventsResponse1 = OASListFineTuneEventsResponse.getExample();
        OASListFineTuneEventsResponse listFineTuneEventsResponse2 = listFineTuneEventsResponse1;
        OASListFineTuneEventsResponse listFineTuneEventsResponse3 = new OASListFineTuneEventsResponse();
        OASListFineTuneEventsResponse listFineTuneEventsResponse4 = listFineTuneEventsResponse3;

        System.assert(listFineTuneEventsResponse1.equals(listFineTuneEventsResponse2));
        System.assert(listFineTuneEventsResponse2.equals(listFineTuneEventsResponse1));
        System.assert(listFineTuneEventsResponse1.equals(listFineTuneEventsResponse1));
        System.assert(listFineTuneEventsResponse3.equals(listFineTuneEventsResponse4));
        System.assert(listFineTuneEventsResponse4.equals(listFineTuneEventsResponse3));
        System.assert(listFineTuneEventsResponse3.equals(listFineTuneEventsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListFineTuneEventsResponse listFineTuneEventsResponse1 = OASListFineTuneEventsResponse.getExample();
        OASListFineTuneEventsResponse listFineTuneEventsResponse2 = OASListFineTuneEventsResponse.getExample();
        OASListFineTuneEventsResponse listFineTuneEventsResponse3 = new OASListFineTuneEventsResponse();
        OASListFineTuneEventsResponse listFineTuneEventsResponse4 = new OASListFineTuneEventsResponse();

        System.assert(listFineTuneEventsResponse1.equals(listFineTuneEventsResponse2));
        System.assert(listFineTuneEventsResponse2.equals(listFineTuneEventsResponse1));
        System.assert(listFineTuneEventsResponse3.equals(listFineTuneEventsResponse4));
        System.assert(listFineTuneEventsResponse4.equals(listFineTuneEventsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListFineTuneEventsResponse listFineTuneEventsResponse1 = OASListFineTuneEventsResponse.getExample();
        OASListFineTuneEventsResponse listFineTuneEventsResponse2 = new OASListFineTuneEventsResponse();

        System.assertEquals(false, listFineTuneEventsResponse1.equals('foo'));
        System.assertEquals(false, listFineTuneEventsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListFineTuneEventsResponse listFineTuneEventsResponse1 = OASListFineTuneEventsResponse.getExample();
        OASListFineTuneEventsResponse listFineTuneEventsResponse2 = new OASListFineTuneEventsResponse();
        OASListFineTuneEventsResponse listFineTuneEventsResponse3;

        System.assertEquals(false, listFineTuneEventsResponse1.equals(listFineTuneEventsResponse3));
        System.assertEquals(false, listFineTuneEventsResponse2.equals(listFineTuneEventsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListFineTuneEventsResponse listFineTuneEventsResponse1 = OASListFineTuneEventsResponse.getExample();
        OASListFineTuneEventsResponse listFineTuneEventsResponse2 = new OASListFineTuneEventsResponse();

        System.assertEquals(listFineTuneEventsResponse1.hashCode(), listFineTuneEventsResponse1.hashCode());
        System.assertEquals(listFineTuneEventsResponse2.hashCode(), listFineTuneEventsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListFineTuneEventsResponse listFineTuneEventsResponse1 = OASListFineTuneEventsResponse.getExample();
        OASListFineTuneEventsResponse listFineTuneEventsResponse2 = OASListFineTuneEventsResponse.getExample();
        OASListFineTuneEventsResponse listFineTuneEventsResponse3 = new OASListFineTuneEventsResponse();
        OASListFineTuneEventsResponse listFineTuneEventsResponse4 = new OASListFineTuneEventsResponse();

        System.assert(listFineTuneEventsResponse1.equals(listFineTuneEventsResponse2));
        System.assert(listFineTuneEventsResponse3.equals(listFineTuneEventsResponse4));
        System.assertEquals(listFineTuneEventsResponse1.hashCode(), listFineTuneEventsResponse2.hashCode());
        System.assertEquals(listFineTuneEventsResponse3.hashCode(), listFineTuneEventsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListFineTuneEventsResponse listFineTuneEventsResponse = new OASListFineTuneEventsResponse();
        Map<String, String> x-property-mappings = listFineTuneEventsResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListFineTuneEventsResponse listFineTuneEventsResponse = new OASListFineTuneEventsResponse();
        System.assertEquals(new List<OASFineTuneEvent>(), listFineTuneEventsResponse.data);
        System.assertEquals(null, listFineTuneEventsResponse.r_object);
    }
}
