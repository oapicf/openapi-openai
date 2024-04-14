@isTest
private class OASListAssistantFilesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASListAssistantFilesResponse listAssistantFilesResponse1 = OASListAssistantFilesResponse.getExample();
        OASListAssistantFilesResponse listAssistantFilesResponse2 = listAssistantFilesResponse1;
        OASListAssistantFilesResponse listAssistantFilesResponse3 = new OASListAssistantFilesResponse();
        OASListAssistantFilesResponse listAssistantFilesResponse4 = listAssistantFilesResponse3;

        System.assert(listAssistantFilesResponse1.equals(listAssistantFilesResponse2));
        System.assert(listAssistantFilesResponse2.equals(listAssistantFilesResponse1));
        System.assert(listAssistantFilesResponse1.equals(listAssistantFilesResponse1));
        System.assert(listAssistantFilesResponse3.equals(listAssistantFilesResponse4));
        System.assert(listAssistantFilesResponse4.equals(listAssistantFilesResponse3));
        System.assert(listAssistantFilesResponse3.equals(listAssistantFilesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListAssistantFilesResponse listAssistantFilesResponse1 = OASListAssistantFilesResponse.getExample();
        OASListAssistantFilesResponse listAssistantFilesResponse2 = OASListAssistantFilesResponse.getExample();
        OASListAssistantFilesResponse listAssistantFilesResponse3 = new OASListAssistantFilesResponse();
        OASListAssistantFilesResponse listAssistantFilesResponse4 = new OASListAssistantFilesResponse();

        System.assert(listAssistantFilesResponse1.equals(listAssistantFilesResponse2));
        System.assert(listAssistantFilesResponse2.equals(listAssistantFilesResponse1));
        System.assert(listAssistantFilesResponse3.equals(listAssistantFilesResponse4));
        System.assert(listAssistantFilesResponse4.equals(listAssistantFilesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListAssistantFilesResponse listAssistantFilesResponse1 = OASListAssistantFilesResponse.getExample();
        OASListAssistantFilesResponse listAssistantFilesResponse2 = new OASListAssistantFilesResponse();

        System.assertEquals(false, listAssistantFilesResponse1.equals('foo'));
        System.assertEquals(false, listAssistantFilesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListAssistantFilesResponse listAssistantFilesResponse1 = OASListAssistantFilesResponse.getExample();
        OASListAssistantFilesResponse listAssistantFilesResponse2 = new OASListAssistantFilesResponse();
        OASListAssistantFilesResponse listAssistantFilesResponse3;

        System.assertEquals(false, listAssistantFilesResponse1.equals(listAssistantFilesResponse3));
        System.assertEquals(false, listAssistantFilesResponse2.equals(listAssistantFilesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListAssistantFilesResponse listAssistantFilesResponse1 = OASListAssistantFilesResponse.getExample();
        OASListAssistantFilesResponse listAssistantFilesResponse2 = new OASListAssistantFilesResponse();

        System.assertEquals(listAssistantFilesResponse1.hashCode(), listAssistantFilesResponse1.hashCode());
        System.assertEquals(listAssistantFilesResponse2.hashCode(), listAssistantFilesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListAssistantFilesResponse listAssistantFilesResponse1 = OASListAssistantFilesResponse.getExample();
        OASListAssistantFilesResponse listAssistantFilesResponse2 = OASListAssistantFilesResponse.getExample();
        OASListAssistantFilesResponse listAssistantFilesResponse3 = new OASListAssistantFilesResponse();
        OASListAssistantFilesResponse listAssistantFilesResponse4 = new OASListAssistantFilesResponse();

        System.assert(listAssistantFilesResponse1.equals(listAssistantFilesResponse2));
        System.assert(listAssistantFilesResponse3.equals(listAssistantFilesResponse4));
        System.assertEquals(listAssistantFilesResponse1.hashCode(), listAssistantFilesResponse2.hashCode());
        System.assertEquals(listAssistantFilesResponse3.hashCode(), listAssistantFilesResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListAssistantFilesResponse listAssistantFilesResponse = new OASListAssistantFilesResponse();
        Map<String, String> x-property-mappings = listAssistantFilesResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListAssistantFilesResponse listAssistantFilesResponse = new OASListAssistantFilesResponse();
        System.assertEquals(new List<OASAssistantFileObject>(), listAssistantFilesResponse.data);
        System.assertEquals(null, listAssistantFilesResponse.r_object);
        System.assertEquals(null, listAssistantFilesResponse.firstId);
        System.assertEquals(null, listAssistantFilesResponse.lastId);
        System.assertEquals(null, listAssistantFilesResponse.hasMore);
    }
}
