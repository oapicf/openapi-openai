@isTest
private class OASListRunsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASListRunsResponse listRunsResponse1 = OASListRunsResponse.getExample();
        OASListRunsResponse listRunsResponse2 = listRunsResponse1;
        OASListRunsResponse listRunsResponse3 = new OASListRunsResponse();
        OASListRunsResponse listRunsResponse4 = listRunsResponse3;

        System.assert(listRunsResponse1.equals(listRunsResponse2));
        System.assert(listRunsResponse2.equals(listRunsResponse1));
        System.assert(listRunsResponse1.equals(listRunsResponse1));
        System.assert(listRunsResponse3.equals(listRunsResponse4));
        System.assert(listRunsResponse4.equals(listRunsResponse3));
        System.assert(listRunsResponse3.equals(listRunsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListRunsResponse listRunsResponse1 = OASListRunsResponse.getExample();
        OASListRunsResponse listRunsResponse2 = OASListRunsResponse.getExample();
        OASListRunsResponse listRunsResponse3 = new OASListRunsResponse();
        OASListRunsResponse listRunsResponse4 = new OASListRunsResponse();

        System.assert(listRunsResponse1.equals(listRunsResponse2));
        System.assert(listRunsResponse2.equals(listRunsResponse1));
        System.assert(listRunsResponse3.equals(listRunsResponse4));
        System.assert(listRunsResponse4.equals(listRunsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListRunsResponse listRunsResponse1 = OASListRunsResponse.getExample();
        OASListRunsResponse listRunsResponse2 = new OASListRunsResponse();

        System.assertEquals(false, listRunsResponse1.equals('foo'));
        System.assertEquals(false, listRunsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListRunsResponse listRunsResponse1 = OASListRunsResponse.getExample();
        OASListRunsResponse listRunsResponse2 = new OASListRunsResponse();
        OASListRunsResponse listRunsResponse3;

        System.assertEquals(false, listRunsResponse1.equals(listRunsResponse3));
        System.assertEquals(false, listRunsResponse2.equals(listRunsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListRunsResponse listRunsResponse1 = OASListRunsResponse.getExample();
        OASListRunsResponse listRunsResponse2 = new OASListRunsResponse();

        System.assertEquals(listRunsResponse1.hashCode(), listRunsResponse1.hashCode());
        System.assertEquals(listRunsResponse2.hashCode(), listRunsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListRunsResponse listRunsResponse1 = OASListRunsResponse.getExample();
        OASListRunsResponse listRunsResponse2 = OASListRunsResponse.getExample();
        OASListRunsResponse listRunsResponse3 = new OASListRunsResponse();
        OASListRunsResponse listRunsResponse4 = new OASListRunsResponse();

        System.assert(listRunsResponse1.equals(listRunsResponse2));
        System.assert(listRunsResponse3.equals(listRunsResponse4));
        System.assertEquals(listRunsResponse1.hashCode(), listRunsResponse2.hashCode());
        System.assertEquals(listRunsResponse3.hashCode(), listRunsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListRunsResponse listRunsResponse = new OASListRunsResponse();
        Map<String, String> x-property-mappings = listRunsResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListRunsResponse listRunsResponse = new OASListRunsResponse();
        System.assertEquals(new List<OASRunObject>(), listRunsResponse.data);
        System.assertEquals(null, listRunsResponse.r_object);
        System.assertEquals(null, listRunsResponse.firstId);
        System.assertEquals(null, listRunsResponse.lastId);
        System.assertEquals(null, listRunsResponse.hasMore);
    }
}
