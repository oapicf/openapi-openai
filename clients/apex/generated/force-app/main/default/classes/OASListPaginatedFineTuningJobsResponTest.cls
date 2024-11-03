@isTest
private class OASListPaginatedFineTuningJobsResponTest {
    @isTest
    private static void equalsSameInstance() {
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse1 = OASListPaginatedFineTuningJobsRespon.getExample();
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse2 = listPaginatedFineTuningJobsResponse1;
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse3 = new OASListPaginatedFineTuningJobsRespon();
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse4 = listPaginatedFineTuningJobsResponse3;

        System.assert(listPaginatedFineTuningJobsResponse1.equals(listPaginatedFineTuningJobsResponse2));
        System.assert(listPaginatedFineTuningJobsResponse2.equals(listPaginatedFineTuningJobsResponse1));
        System.assert(listPaginatedFineTuningJobsResponse1.equals(listPaginatedFineTuningJobsResponse1));
        System.assert(listPaginatedFineTuningJobsResponse3.equals(listPaginatedFineTuningJobsResponse4));
        System.assert(listPaginatedFineTuningJobsResponse4.equals(listPaginatedFineTuningJobsResponse3));
        System.assert(listPaginatedFineTuningJobsResponse3.equals(listPaginatedFineTuningJobsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse1 = OASListPaginatedFineTuningJobsRespon.getExample();
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse2 = OASListPaginatedFineTuningJobsRespon.getExample();
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse3 = new OASListPaginatedFineTuningJobsRespon();
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse4 = new OASListPaginatedFineTuningJobsRespon();

        System.assert(listPaginatedFineTuningJobsResponse1.equals(listPaginatedFineTuningJobsResponse2));
        System.assert(listPaginatedFineTuningJobsResponse2.equals(listPaginatedFineTuningJobsResponse1));
        System.assert(listPaginatedFineTuningJobsResponse3.equals(listPaginatedFineTuningJobsResponse4));
        System.assert(listPaginatedFineTuningJobsResponse4.equals(listPaginatedFineTuningJobsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse1 = OASListPaginatedFineTuningJobsRespon.getExample();
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse2 = new OASListPaginatedFineTuningJobsRespon();

        System.assertEquals(false, listPaginatedFineTuningJobsResponse1.equals('foo'));
        System.assertEquals(false, listPaginatedFineTuningJobsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse1 = OASListPaginatedFineTuningJobsRespon.getExample();
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse2 = new OASListPaginatedFineTuningJobsRespon();
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse3;

        System.assertEquals(false, listPaginatedFineTuningJobsResponse1.equals(listPaginatedFineTuningJobsResponse3));
        System.assertEquals(false, listPaginatedFineTuningJobsResponse2.equals(listPaginatedFineTuningJobsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse1 = OASListPaginatedFineTuningJobsRespon.getExample();
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse2 = new OASListPaginatedFineTuningJobsRespon();

        System.assertEquals(listPaginatedFineTuningJobsResponse1.hashCode(), listPaginatedFineTuningJobsResponse1.hashCode());
        System.assertEquals(listPaginatedFineTuningJobsResponse2.hashCode(), listPaginatedFineTuningJobsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse1 = OASListPaginatedFineTuningJobsRespon.getExample();
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse2 = OASListPaginatedFineTuningJobsRespon.getExample();
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse3 = new OASListPaginatedFineTuningJobsRespon();
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse4 = new OASListPaginatedFineTuningJobsRespon();

        System.assert(listPaginatedFineTuningJobsResponse1.equals(listPaginatedFineTuningJobsResponse2));
        System.assert(listPaginatedFineTuningJobsResponse3.equals(listPaginatedFineTuningJobsResponse4));
        System.assertEquals(listPaginatedFineTuningJobsResponse1.hashCode(), listPaginatedFineTuningJobsResponse2.hashCode());
        System.assertEquals(listPaginatedFineTuningJobsResponse3.hashCode(), listPaginatedFineTuningJobsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse = new OASListPaginatedFineTuningJobsRespon();
        Map<String, String> x-property-mappings = listPaginatedFineTuningJobsResponse.getx-property-mappings();
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListPaginatedFineTuningJobsRespon listPaginatedFineTuningJobsResponse = new OASListPaginatedFineTuningJobsRespon();
        System.assertEquals(new List<OASFineTuningJob>(), listPaginatedFineTuningJobsResponse.data);
        System.assertEquals(null, listPaginatedFineTuningJobsResponse.hasMore);
        System.assertEquals(null, listPaginatedFineTuningJobsResponse.r_object);
    }
}
