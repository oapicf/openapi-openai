@isTest
private class OASListAuditLogsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASListAuditLogsResponse listAuditLogsResponse1 = OASListAuditLogsResponse.getExample();
        OASListAuditLogsResponse listAuditLogsResponse2 = listAuditLogsResponse1;
        OASListAuditLogsResponse listAuditLogsResponse3 = new OASListAuditLogsResponse();
        OASListAuditLogsResponse listAuditLogsResponse4 = listAuditLogsResponse3;

        System.assert(listAuditLogsResponse1.equals(listAuditLogsResponse2));
        System.assert(listAuditLogsResponse2.equals(listAuditLogsResponse1));
        System.assert(listAuditLogsResponse1.equals(listAuditLogsResponse1));
        System.assert(listAuditLogsResponse3.equals(listAuditLogsResponse4));
        System.assert(listAuditLogsResponse4.equals(listAuditLogsResponse3));
        System.assert(listAuditLogsResponse3.equals(listAuditLogsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListAuditLogsResponse listAuditLogsResponse1 = OASListAuditLogsResponse.getExample();
        OASListAuditLogsResponse listAuditLogsResponse2 = OASListAuditLogsResponse.getExample();
        OASListAuditLogsResponse listAuditLogsResponse3 = new OASListAuditLogsResponse();
        OASListAuditLogsResponse listAuditLogsResponse4 = new OASListAuditLogsResponse();

        System.assert(listAuditLogsResponse1.equals(listAuditLogsResponse2));
        System.assert(listAuditLogsResponse2.equals(listAuditLogsResponse1));
        System.assert(listAuditLogsResponse3.equals(listAuditLogsResponse4));
        System.assert(listAuditLogsResponse4.equals(listAuditLogsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListAuditLogsResponse listAuditLogsResponse1 = OASListAuditLogsResponse.getExample();
        OASListAuditLogsResponse listAuditLogsResponse2 = new OASListAuditLogsResponse();

        System.assertEquals(false, listAuditLogsResponse1.equals('foo'));
        System.assertEquals(false, listAuditLogsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListAuditLogsResponse listAuditLogsResponse1 = OASListAuditLogsResponse.getExample();
        OASListAuditLogsResponse listAuditLogsResponse2 = new OASListAuditLogsResponse();
        OASListAuditLogsResponse listAuditLogsResponse3;

        System.assertEquals(false, listAuditLogsResponse1.equals(listAuditLogsResponse3));
        System.assertEquals(false, listAuditLogsResponse2.equals(listAuditLogsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListAuditLogsResponse listAuditLogsResponse1 = OASListAuditLogsResponse.getExample();
        OASListAuditLogsResponse listAuditLogsResponse2 = new OASListAuditLogsResponse();

        System.assertEquals(listAuditLogsResponse1.hashCode(), listAuditLogsResponse1.hashCode());
        System.assertEquals(listAuditLogsResponse2.hashCode(), listAuditLogsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListAuditLogsResponse listAuditLogsResponse1 = OASListAuditLogsResponse.getExample();
        OASListAuditLogsResponse listAuditLogsResponse2 = OASListAuditLogsResponse.getExample();
        OASListAuditLogsResponse listAuditLogsResponse3 = new OASListAuditLogsResponse();
        OASListAuditLogsResponse listAuditLogsResponse4 = new OASListAuditLogsResponse();

        System.assert(listAuditLogsResponse1.equals(listAuditLogsResponse2));
        System.assert(listAuditLogsResponse3.equals(listAuditLogsResponse4));
        System.assertEquals(listAuditLogsResponse1.hashCode(), listAuditLogsResponse2.hashCode());
        System.assertEquals(listAuditLogsResponse3.hashCode(), listAuditLogsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListAuditLogsResponse listAuditLogsResponse = new OASListAuditLogsResponse();
        Map<String, String> x-property-mappings = listAuditLogsResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListAuditLogsResponse listAuditLogsResponse = new OASListAuditLogsResponse();
        System.assertEquals(new List<OASAuditLog>(), listAuditLogsResponse.data);
        System.assertEquals(null, listAuditLogsResponse.r_object);
        System.assertEquals(null, listAuditLogsResponse.firstId);
        System.assertEquals(null, listAuditLogsResponse.lastId);
        System.assertEquals(null, listAuditLogsResponse.hasMore);
    }
}
