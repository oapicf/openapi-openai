@isTest
private class OASListFineTuningJobEventsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse1 = OASListFineTuningJobEventsResponse.getExample();
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse2 = listFineTuningJobEventsResponse1;
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse3 = new OASListFineTuningJobEventsResponse();
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse4 = listFineTuningJobEventsResponse3;

        System.assert(listFineTuningJobEventsResponse1.equals(listFineTuningJobEventsResponse2));
        System.assert(listFineTuningJobEventsResponse2.equals(listFineTuningJobEventsResponse1));
        System.assert(listFineTuningJobEventsResponse1.equals(listFineTuningJobEventsResponse1));
        System.assert(listFineTuningJobEventsResponse3.equals(listFineTuningJobEventsResponse4));
        System.assert(listFineTuningJobEventsResponse4.equals(listFineTuningJobEventsResponse3));
        System.assert(listFineTuningJobEventsResponse3.equals(listFineTuningJobEventsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse1 = OASListFineTuningJobEventsResponse.getExample();
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse2 = OASListFineTuningJobEventsResponse.getExample();
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse3 = new OASListFineTuningJobEventsResponse();
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse4 = new OASListFineTuningJobEventsResponse();

        System.assert(listFineTuningJobEventsResponse1.equals(listFineTuningJobEventsResponse2));
        System.assert(listFineTuningJobEventsResponse2.equals(listFineTuningJobEventsResponse1));
        System.assert(listFineTuningJobEventsResponse3.equals(listFineTuningJobEventsResponse4));
        System.assert(listFineTuningJobEventsResponse4.equals(listFineTuningJobEventsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse1 = OASListFineTuningJobEventsResponse.getExample();
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse2 = new OASListFineTuningJobEventsResponse();

        System.assertEquals(false, listFineTuningJobEventsResponse1.equals('foo'));
        System.assertEquals(false, listFineTuningJobEventsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse1 = OASListFineTuningJobEventsResponse.getExample();
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse2 = new OASListFineTuningJobEventsResponse();
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse3;

        System.assertEquals(false, listFineTuningJobEventsResponse1.equals(listFineTuningJobEventsResponse3));
        System.assertEquals(false, listFineTuningJobEventsResponse2.equals(listFineTuningJobEventsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse1 = OASListFineTuningJobEventsResponse.getExample();
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse2 = new OASListFineTuningJobEventsResponse();

        System.assertEquals(listFineTuningJobEventsResponse1.hashCode(), listFineTuningJobEventsResponse1.hashCode());
        System.assertEquals(listFineTuningJobEventsResponse2.hashCode(), listFineTuningJobEventsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse1 = OASListFineTuningJobEventsResponse.getExample();
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse2 = OASListFineTuningJobEventsResponse.getExample();
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse3 = new OASListFineTuningJobEventsResponse();
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse4 = new OASListFineTuningJobEventsResponse();

        System.assert(listFineTuningJobEventsResponse1.equals(listFineTuningJobEventsResponse2));
        System.assert(listFineTuningJobEventsResponse3.equals(listFineTuningJobEventsResponse4));
        System.assertEquals(listFineTuningJobEventsResponse1.hashCode(), listFineTuningJobEventsResponse2.hashCode());
        System.assertEquals(listFineTuningJobEventsResponse3.hashCode(), listFineTuningJobEventsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse = new OASListFineTuningJobEventsResponse();
        Map<String, String> x-property-mappings = listFineTuningJobEventsResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListFineTuningJobEventsResponse listFineTuningJobEventsResponse = new OASListFineTuningJobEventsResponse();
        System.assertEquals(new List<OASFineTuningJobEvent>(), listFineTuningJobEventsResponse.data);
        System.assertEquals(null, listFineTuningJobEventsResponse.r_object);
    }
}
