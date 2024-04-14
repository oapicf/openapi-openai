@isTest
private class OASListThreadsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASListThreadsResponse listThreadsResponse1 = OASListThreadsResponse.getExample();
        OASListThreadsResponse listThreadsResponse2 = listThreadsResponse1;
        OASListThreadsResponse listThreadsResponse3 = new OASListThreadsResponse();
        OASListThreadsResponse listThreadsResponse4 = listThreadsResponse3;

        System.assert(listThreadsResponse1.equals(listThreadsResponse2));
        System.assert(listThreadsResponse2.equals(listThreadsResponse1));
        System.assert(listThreadsResponse1.equals(listThreadsResponse1));
        System.assert(listThreadsResponse3.equals(listThreadsResponse4));
        System.assert(listThreadsResponse4.equals(listThreadsResponse3));
        System.assert(listThreadsResponse3.equals(listThreadsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListThreadsResponse listThreadsResponse1 = OASListThreadsResponse.getExample();
        OASListThreadsResponse listThreadsResponse2 = OASListThreadsResponse.getExample();
        OASListThreadsResponse listThreadsResponse3 = new OASListThreadsResponse();
        OASListThreadsResponse listThreadsResponse4 = new OASListThreadsResponse();

        System.assert(listThreadsResponse1.equals(listThreadsResponse2));
        System.assert(listThreadsResponse2.equals(listThreadsResponse1));
        System.assert(listThreadsResponse3.equals(listThreadsResponse4));
        System.assert(listThreadsResponse4.equals(listThreadsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListThreadsResponse listThreadsResponse1 = OASListThreadsResponse.getExample();
        OASListThreadsResponse listThreadsResponse2 = new OASListThreadsResponse();

        System.assertEquals(false, listThreadsResponse1.equals('foo'));
        System.assertEquals(false, listThreadsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListThreadsResponse listThreadsResponse1 = OASListThreadsResponse.getExample();
        OASListThreadsResponse listThreadsResponse2 = new OASListThreadsResponse();
        OASListThreadsResponse listThreadsResponse3;

        System.assertEquals(false, listThreadsResponse1.equals(listThreadsResponse3));
        System.assertEquals(false, listThreadsResponse2.equals(listThreadsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListThreadsResponse listThreadsResponse1 = OASListThreadsResponse.getExample();
        OASListThreadsResponse listThreadsResponse2 = new OASListThreadsResponse();

        System.assertEquals(listThreadsResponse1.hashCode(), listThreadsResponse1.hashCode());
        System.assertEquals(listThreadsResponse2.hashCode(), listThreadsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListThreadsResponse listThreadsResponse1 = OASListThreadsResponse.getExample();
        OASListThreadsResponse listThreadsResponse2 = OASListThreadsResponse.getExample();
        OASListThreadsResponse listThreadsResponse3 = new OASListThreadsResponse();
        OASListThreadsResponse listThreadsResponse4 = new OASListThreadsResponse();

        System.assert(listThreadsResponse1.equals(listThreadsResponse2));
        System.assert(listThreadsResponse3.equals(listThreadsResponse4));
        System.assertEquals(listThreadsResponse1.hashCode(), listThreadsResponse2.hashCode());
        System.assertEquals(listThreadsResponse3.hashCode(), listThreadsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListThreadsResponse listThreadsResponse = new OASListThreadsResponse();
        Map<String, String> x-property-mappings = listThreadsResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListThreadsResponse listThreadsResponse = new OASListThreadsResponse();
        System.assertEquals(new List<OASThreadObject>(), listThreadsResponse.data);
        System.assertEquals(null, listThreadsResponse.r_object);
        System.assertEquals(null, listThreadsResponse.firstId);
        System.assertEquals(null, listThreadsResponse.lastId);
        System.assertEquals(null, listThreadsResponse.hasMore);
    }
}
