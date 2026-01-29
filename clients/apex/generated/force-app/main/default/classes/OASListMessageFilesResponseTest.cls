@isTest
private class OASListMessageFilesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASListMessageFilesResponse listMessageFilesResponse1 = OASListMessageFilesResponse.getExample();
        OASListMessageFilesResponse listMessageFilesResponse2 = listMessageFilesResponse1;
        OASListMessageFilesResponse listMessageFilesResponse3 = new OASListMessageFilesResponse();
        OASListMessageFilesResponse listMessageFilesResponse4 = listMessageFilesResponse3;

        System.assert(listMessageFilesResponse1.equals(listMessageFilesResponse2));
        System.assert(listMessageFilesResponse2.equals(listMessageFilesResponse1));
        System.assert(listMessageFilesResponse1.equals(listMessageFilesResponse1));
        System.assert(listMessageFilesResponse3.equals(listMessageFilesResponse4));
        System.assert(listMessageFilesResponse4.equals(listMessageFilesResponse3));
        System.assert(listMessageFilesResponse3.equals(listMessageFilesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListMessageFilesResponse listMessageFilesResponse1 = OASListMessageFilesResponse.getExample();
        OASListMessageFilesResponse listMessageFilesResponse2 = OASListMessageFilesResponse.getExample();
        OASListMessageFilesResponse listMessageFilesResponse3 = new OASListMessageFilesResponse();
        OASListMessageFilesResponse listMessageFilesResponse4 = new OASListMessageFilesResponse();

        System.assert(listMessageFilesResponse1.equals(listMessageFilesResponse2));
        System.assert(listMessageFilesResponse2.equals(listMessageFilesResponse1));
        System.assert(listMessageFilesResponse3.equals(listMessageFilesResponse4));
        System.assert(listMessageFilesResponse4.equals(listMessageFilesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListMessageFilesResponse listMessageFilesResponse1 = OASListMessageFilesResponse.getExample();
        OASListMessageFilesResponse listMessageFilesResponse2 = new OASListMessageFilesResponse();

        System.assertEquals(false, listMessageFilesResponse1.equals('foo'));
        System.assertEquals(false, listMessageFilesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListMessageFilesResponse listMessageFilesResponse1 = OASListMessageFilesResponse.getExample();
        OASListMessageFilesResponse listMessageFilesResponse2 = new OASListMessageFilesResponse();
        OASListMessageFilesResponse listMessageFilesResponse3;

        System.assertEquals(false, listMessageFilesResponse1.equals(listMessageFilesResponse3));
        System.assertEquals(false, listMessageFilesResponse2.equals(listMessageFilesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListMessageFilesResponse listMessageFilesResponse1 = OASListMessageFilesResponse.getExample();
        OASListMessageFilesResponse listMessageFilesResponse2 = new OASListMessageFilesResponse();

        System.assertEquals(listMessageFilesResponse1.hashCode(), listMessageFilesResponse1.hashCode());
        System.assertEquals(listMessageFilesResponse2.hashCode(), listMessageFilesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListMessageFilesResponse listMessageFilesResponse1 = OASListMessageFilesResponse.getExample();
        OASListMessageFilesResponse listMessageFilesResponse2 = OASListMessageFilesResponse.getExample();
        OASListMessageFilesResponse listMessageFilesResponse3 = new OASListMessageFilesResponse();
        OASListMessageFilesResponse listMessageFilesResponse4 = new OASListMessageFilesResponse();

        System.assert(listMessageFilesResponse1.equals(listMessageFilesResponse2));
        System.assert(listMessageFilesResponse3.equals(listMessageFilesResponse4));
        System.assertEquals(listMessageFilesResponse1.hashCode(), listMessageFilesResponse2.hashCode());
        System.assertEquals(listMessageFilesResponse3.hashCode(), listMessageFilesResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListMessageFilesResponse listMessageFilesResponse = new OASListMessageFilesResponse();
        Map<String, String> x-property-mappings = listMessageFilesResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListMessageFilesResponse listMessageFilesResponse = new OASListMessageFilesResponse();
        System.assertEquals(new List<OASMessageFileObject>(), listMessageFilesResponse.data);
        System.assertEquals(null, listMessageFilesResponse.r_object);
        System.assertEquals(null, listMessageFilesResponse.firstId);
        System.assertEquals(null, listMessageFilesResponse.lastId);
        System.assertEquals(null, listMessageFilesResponse.hasMore);
    }
}
