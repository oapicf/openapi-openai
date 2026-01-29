@isTest
private class OASListAssistantsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASListAssistantsResponse listAssistantsResponse1 = OASListAssistantsResponse.getExample();
        OASListAssistantsResponse listAssistantsResponse2 = listAssistantsResponse1;
        OASListAssistantsResponse listAssistantsResponse3 = new OASListAssistantsResponse();
        OASListAssistantsResponse listAssistantsResponse4 = listAssistantsResponse3;

        System.assert(listAssistantsResponse1.equals(listAssistantsResponse2));
        System.assert(listAssistantsResponse2.equals(listAssistantsResponse1));
        System.assert(listAssistantsResponse1.equals(listAssistantsResponse1));
        System.assert(listAssistantsResponse3.equals(listAssistantsResponse4));
        System.assert(listAssistantsResponse4.equals(listAssistantsResponse3));
        System.assert(listAssistantsResponse3.equals(listAssistantsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListAssistantsResponse listAssistantsResponse1 = OASListAssistantsResponse.getExample();
        OASListAssistantsResponse listAssistantsResponse2 = OASListAssistantsResponse.getExample();
        OASListAssistantsResponse listAssistantsResponse3 = new OASListAssistantsResponse();
        OASListAssistantsResponse listAssistantsResponse4 = new OASListAssistantsResponse();

        System.assert(listAssistantsResponse1.equals(listAssistantsResponse2));
        System.assert(listAssistantsResponse2.equals(listAssistantsResponse1));
        System.assert(listAssistantsResponse3.equals(listAssistantsResponse4));
        System.assert(listAssistantsResponse4.equals(listAssistantsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListAssistantsResponse listAssistantsResponse1 = OASListAssistantsResponse.getExample();
        OASListAssistantsResponse listAssistantsResponse2 = new OASListAssistantsResponse();

        System.assertEquals(false, listAssistantsResponse1.equals('foo'));
        System.assertEquals(false, listAssistantsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListAssistantsResponse listAssistantsResponse1 = OASListAssistantsResponse.getExample();
        OASListAssistantsResponse listAssistantsResponse2 = new OASListAssistantsResponse();
        OASListAssistantsResponse listAssistantsResponse3;

        System.assertEquals(false, listAssistantsResponse1.equals(listAssistantsResponse3));
        System.assertEquals(false, listAssistantsResponse2.equals(listAssistantsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListAssistantsResponse listAssistantsResponse1 = OASListAssistantsResponse.getExample();
        OASListAssistantsResponse listAssistantsResponse2 = new OASListAssistantsResponse();

        System.assertEquals(listAssistantsResponse1.hashCode(), listAssistantsResponse1.hashCode());
        System.assertEquals(listAssistantsResponse2.hashCode(), listAssistantsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListAssistantsResponse listAssistantsResponse1 = OASListAssistantsResponse.getExample();
        OASListAssistantsResponse listAssistantsResponse2 = OASListAssistantsResponse.getExample();
        OASListAssistantsResponse listAssistantsResponse3 = new OASListAssistantsResponse();
        OASListAssistantsResponse listAssistantsResponse4 = new OASListAssistantsResponse();

        System.assert(listAssistantsResponse1.equals(listAssistantsResponse2));
        System.assert(listAssistantsResponse3.equals(listAssistantsResponse4));
        System.assertEquals(listAssistantsResponse1.hashCode(), listAssistantsResponse2.hashCode());
        System.assertEquals(listAssistantsResponse3.hashCode(), listAssistantsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListAssistantsResponse listAssistantsResponse = new OASListAssistantsResponse();
        Map<String, String> x-property-mappings = listAssistantsResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListAssistantsResponse listAssistantsResponse = new OASListAssistantsResponse();
        System.assertEquals(new List<OASAssistantObject>(), listAssistantsResponse.data);
        System.assertEquals(null, listAssistantsResponse.r_object);
        System.assertEquals(null, listAssistantsResponse.firstId);
        System.assertEquals(null, listAssistantsResponse.lastId);
        System.assertEquals(null, listAssistantsResponse.hasMore);
    }
}
