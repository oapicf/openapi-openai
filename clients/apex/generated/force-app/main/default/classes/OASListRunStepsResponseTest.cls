@isTest
private class OASListRunStepsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASListRunStepsResponse listRunStepsResponse1 = OASListRunStepsResponse.getExample();
        OASListRunStepsResponse listRunStepsResponse2 = listRunStepsResponse1;
        OASListRunStepsResponse listRunStepsResponse3 = new OASListRunStepsResponse();
        OASListRunStepsResponse listRunStepsResponse4 = listRunStepsResponse3;

        System.assert(listRunStepsResponse1.equals(listRunStepsResponse2));
        System.assert(listRunStepsResponse2.equals(listRunStepsResponse1));
        System.assert(listRunStepsResponse1.equals(listRunStepsResponse1));
        System.assert(listRunStepsResponse3.equals(listRunStepsResponse4));
        System.assert(listRunStepsResponse4.equals(listRunStepsResponse3));
        System.assert(listRunStepsResponse3.equals(listRunStepsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListRunStepsResponse listRunStepsResponse1 = OASListRunStepsResponse.getExample();
        OASListRunStepsResponse listRunStepsResponse2 = OASListRunStepsResponse.getExample();
        OASListRunStepsResponse listRunStepsResponse3 = new OASListRunStepsResponse();
        OASListRunStepsResponse listRunStepsResponse4 = new OASListRunStepsResponse();

        System.assert(listRunStepsResponse1.equals(listRunStepsResponse2));
        System.assert(listRunStepsResponse2.equals(listRunStepsResponse1));
        System.assert(listRunStepsResponse3.equals(listRunStepsResponse4));
        System.assert(listRunStepsResponse4.equals(listRunStepsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListRunStepsResponse listRunStepsResponse1 = OASListRunStepsResponse.getExample();
        OASListRunStepsResponse listRunStepsResponse2 = new OASListRunStepsResponse();

        System.assertEquals(false, listRunStepsResponse1.equals('foo'));
        System.assertEquals(false, listRunStepsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListRunStepsResponse listRunStepsResponse1 = OASListRunStepsResponse.getExample();
        OASListRunStepsResponse listRunStepsResponse2 = new OASListRunStepsResponse();
        OASListRunStepsResponse listRunStepsResponse3;

        System.assertEquals(false, listRunStepsResponse1.equals(listRunStepsResponse3));
        System.assertEquals(false, listRunStepsResponse2.equals(listRunStepsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListRunStepsResponse listRunStepsResponse1 = OASListRunStepsResponse.getExample();
        OASListRunStepsResponse listRunStepsResponse2 = new OASListRunStepsResponse();

        System.assertEquals(listRunStepsResponse1.hashCode(), listRunStepsResponse1.hashCode());
        System.assertEquals(listRunStepsResponse2.hashCode(), listRunStepsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListRunStepsResponse listRunStepsResponse1 = OASListRunStepsResponse.getExample();
        OASListRunStepsResponse listRunStepsResponse2 = OASListRunStepsResponse.getExample();
        OASListRunStepsResponse listRunStepsResponse3 = new OASListRunStepsResponse();
        OASListRunStepsResponse listRunStepsResponse4 = new OASListRunStepsResponse();

        System.assert(listRunStepsResponse1.equals(listRunStepsResponse2));
        System.assert(listRunStepsResponse3.equals(listRunStepsResponse4));
        System.assertEquals(listRunStepsResponse1.hashCode(), listRunStepsResponse2.hashCode());
        System.assertEquals(listRunStepsResponse3.hashCode(), listRunStepsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListRunStepsResponse listRunStepsResponse = new OASListRunStepsResponse();
        Map<String, String> x-property-mappings = listRunStepsResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListRunStepsResponse listRunStepsResponse = new OASListRunStepsResponse();
        System.assertEquals(new List<OASRunStepObject>(), listRunStepsResponse.data);
        System.assertEquals(null, listRunStepsResponse.r_object);
        System.assertEquals(null, listRunStepsResponse.firstId);
        System.assertEquals(null, listRunStepsResponse.lastId);
        System.assertEquals(null, listRunStepsResponse.hasMore);
    }
}
