@isTest
private class OASListFineTuningJobCheckpointsRespoTest {
    @isTest
    private static void equalsSameInstance() {
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse1 = OASListFineTuningJobCheckpointsRespo.getExample();
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse2 = listFineTuningJobCheckpointsResponse1;
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse3 = new OASListFineTuningJobCheckpointsRespo();
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse4 = listFineTuningJobCheckpointsResponse3;

        System.assert(listFineTuningJobCheckpointsResponse1.equals(listFineTuningJobCheckpointsResponse2));
        System.assert(listFineTuningJobCheckpointsResponse2.equals(listFineTuningJobCheckpointsResponse1));
        System.assert(listFineTuningJobCheckpointsResponse1.equals(listFineTuningJobCheckpointsResponse1));
        System.assert(listFineTuningJobCheckpointsResponse3.equals(listFineTuningJobCheckpointsResponse4));
        System.assert(listFineTuningJobCheckpointsResponse4.equals(listFineTuningJobCheckpointsResponse3));
        System.assert(listFineTuningJobCheckpointsResponse3.equals(listFineTuningJobCheckpointsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse1 = OASListFineTuningJobCheckpointsRespo.getExample();
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse2 = OASListFineTuningJobCheckpointsRespo.getExample();
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse3 = new OASListFineTuningJobCheckpointsRespo();
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse4 = new OASListFineTuningJobCheckpointsRespo();

        System.assert(listFineTuningJobCheckpointsResponse1.equals(listFineTuningJobCheckpointsResponse2));
        System.assert(listFineTuningJobCheckpointsResponse2.equals(listFineTuningJobCheckpointsResponse1));
        System.assert(listFineTuningJobCheckpointsResponse3.equals(listFineTuningJobCheckpointsResponse4));
        System.assert(listFineTuningJobCheckpointsResponse4.equals(listFineTuningJobCheckpointsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse1 = OASListFineTuningJobCheckpointsRespo.getExample();
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse2 = new OASListFineTuningJobCheckpointsRespo();

        System.assertEquals(false, listFineTuningJobCheckpointsResponse1.equals('foo'));
        System.assertEquals(false, listFineTuningJobCheckpointsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse1 = OASListFineTuningJobCheckpointsRespo.getExample();
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse2 = new OASListFineTuningJobCheckpointsRespo();
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse3;

        System.assertEquals(false, listFineTuningJobCheckpointsResponse1.equals(listFineTuningJobCheckpointsResponse3));
        System.assertEquals(false, listFineTuningJobCheckpointsResponse2.equals(listFineTuningJobCheckpointsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse1 = OASListFineTuningJobCheckpointsRespo.getExample();
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse2 = new OASListFineTuningJobCheckpointsRespo();

        System.assertEquals(listFineTuningJobCheckpointsResponse1.hashCode(), listFineTuningJobCheckpointsResponse1.hashCode());
        System.assertEquals(listFineTuningJobCheckpointsResponse2.hashCode(), listFineTuningJobCheckpointsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse1 = OASListFineTuningJobCheckpointsRespo.getExample();
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse2 = OASListFineTuningJobCheckpointsRespo.getExample();
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse3 = new OASListFineTuningJobCheckpointsRespo();
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse4 = new OASListFineTuningJobCheckpointsRespo();

        System.assert(listFineTuningJobCheckpointsResponse1.equals(listFineTuningJobCheckpointsResponse2));
        System.assert(listFineTuningJobCheckpointsResponse3.equals(listFineTuningJobCheckpointsResponse4));
        System.assertEquals(listFineTuningJobCheckpointsResponse1.hashCode(), listFineTuningJobCheckpointsResponse2.hashCode());
        System.assertEquals(listFineTuningJobCheckpointsResponse3.hashCode(), listFineTuningJobCheckpointsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse = new OASListFineTuningJobCheckpointsRespo();
        Map<String, String> x-property-mappings = listFineTuningJobCheckpointsResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListFineTuningJobCheckpointsRespo listFineTuningJobCheckpointsResponse = new OASListFineTuningJobCheckpointsRespo();
        System.assertEquals(new List<OASFineTuningJobCheckpoint>(), listFineTuningJobCheckpointsResponse.data);
        System.assertEquals(null, listFineTuningJobCheckpointsResponse.r_object);
        System.assertEquals(null, listFineTuningJobCheckpointsResponse.firstId);
        System.assertEquals(null, listFineTuningJobCheckpointsResponse.lastId);
        System.assertEquals(null, listFineTuningJobCheckpointsResponse.hasMore);
    }
}
