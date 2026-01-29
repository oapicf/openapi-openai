@isTest
private class OASListMessagesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASListMessagesResponse listMessagesResponse1 = OASListMessagesResponse.getExample();
        OASListMessagesResponse listMessagesResponse2 = listMessagesResponse1;
        OASListMessagesResponse listMessagesResponse3 = new OASListMessagesResponse();
        OASListMessagesResponse listMessagesResponse4 = listMessagesResponse3;

        System.assert(listMessagesResponse1.equals(listMessagesResponse2));
        System.assert(listMessagesResponse2.equals(listMessagesResponse1));
        System.assert(listMessagesResponse1.equals(listMessagesResponse1));
        System.assert(listMessagesResponse3.equals(listMessagesResponse4));
        System.assert(listMessagesResponse4.equals(listMessagesResponse3));
        System.assert(listMessagesResponse3.equals(listMessagesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListMessagesResponse listMessagesResponse1 = OASListMessagesResponse.getExample();
        OASListMessagesResponse listMessagesResponse2 = OASListMessagesResponse.getExample();
        OASListMessagesResponse listMessagesResponse3 = new OASListMessagesResponse();
        OASListMessagesResponse listMessagesResponse4 = new OASListMessagesResponse();

        System.assert(listMessagesResponse1.equals(listMessagesResponse2));
        System.assert(listMessagesResponse2.equals(listMessagesResponse1));
        System.assert(listMessagesResponse3.equals(listMessagesResponse4));
        System.assert(listMessagesResponse4.equals(listMessagesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListMessagesResponse listMessagesResponse1 = OASListMessagesResponse.getExample();
        OASListMessagesResponse listMessagesResponse2 = new OASListMessagesResponse();

        System.assertEquals(false, listMessagesResponse1.equals('foo'));
        System.assertEquals(false, listMessagesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListMessagesResponse listMessagesResponse1 = OASListMessagesResponse.getExample();
        OASListMessagesResponse listMessagesResponse2 = new OASListMessagesResponse();
        OASListMessagesResponse listMessagesResponse3;

        System.assertEquals(false, listMessagesResponse1.equals(listMessagesResponse3));
        System.assertEquals(false, listMessagesResponse2.equals(listMessagesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListMessagesResponse listMessagesResponse1 = OASListMessagesResponse.getExample();
        OASListMessagesResponse listMessagesResponse2 = new OASListMessagesResponse();

        System.assertEquals(listMessagesResponse1.hashCode(), listMessagesResponse1.hashCode());
        System.assertEquals(listMessagesResponse2.hashCode(), listMessagesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListMessagesResponse listMessagesResponse1 = OASListMessagesResponse.getExample();
        OASListMessagesResponse listMessagesResponse2 = OASListMessagesResponse.getExample();
        OASListMessagesResponse listMessagesResponse3 = new OASListMessagesResponse();
        OASListMessagesResponse listMessagesResponse4 = new OASListMessagesResponse();

        System.assert(listMessagesResponse1.equals(listMessagesResponse2));
        System.assert(listMessagesResponse3.equals(listMessagesResponse4));
        System.assertEquals(listMessagesResponse1.hashCode(), listMessagesResponse2.hashCode());
        System.assertEquals(listMessagesResponse3.hashCode(), listMessagesResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListMessagesResponse listMessagesResponse = new OASListMessagesResponse();
        Map<String, String> x-property-mappings = listMessagesResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListMessagesResponse listMessagesResponse = new OASListMessagesResponse();
        System.assertEquals(new List<OASMessageObject>(), listMessagesResponse.data);
        System.assertEquals(null, listMessagesResponse.r_object);
        System.assertEquals(null, listMessagesResponse.firstId);
        System.assertEquals(null, listMessagesResponse.lastId);
        System.assertEquals(null, listMessagesResponse.hasMore);
    }
}
