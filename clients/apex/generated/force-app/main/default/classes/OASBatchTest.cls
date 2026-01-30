@isTest
private class OASBatchTest {
    @isTest
    private static void equalsSameInstance() {
        OASBatch batch1 = OASBatch.getExample();
        OASBatch batch2 = batch1;
        OASBatch batch3 = new OASBatch();
        OASBatch batch4 = batch3;

        System.assert(batch1.equals(batch2));
        System.assert(batch2.equals(batch1));
        System.assert(batch1.equals(batch1));
        System.assert(batch3.equals(batch4));
        System.assert(batch4.equals(batch3));
        System.assert(batch3.equals(batch3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBatch batch1 = OASBatch.getExample();
        OASBatch batch2 = OASBatch.getExample();
        OASBatch batch3 = new OASBatch();
        OASBatch batch4 = new OASBatch();

        System.assert(batch1.equals(batch2));
        System.assert(batch2.equals(batch1));
        System.assert(batch3.equals(batch4));
        System.assert(batch4.equals(batch3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBatch batch1 = OASBatch.getExample();
        OASBatch batch2 = new OASBatch();

        System.assertEquals(false, batch1.equals('foo'));
        System.assertEquals(false, batch2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBatch batch1 = OASBatch.getExample();
        OASBatch batch2 = new OASBatch();
        OASBatch batch3;

        System.assertEquals(false, batch1.equals(batch3));
        System.assertEquals(false, batch2.equals(batch3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBatch batch1 = OASBatch.getExample();
        OASBatch batch2 = new OASBatch();

        System.assertEquals(batch1.hashCode(), batch1.hashCode());
        System.assertEquals(batch2.hashCode(), batch2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBatch batch1 = OASBatch.getExample();
        OASBatch batch2 = OASBatch.getExample();
        OASBatch batch3 = new OASBatch();
        OASBatch batch4 = new OASBatch();

        System.assert(batch1.equals(batch2));
        System.assert(batch3.equals(batch4));
        System.assertEquals(batch1.hashCode(), batch2.hashCode());
        System.assertEquals(batch3.hashCode(), batch4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBatch batch = new OASBatch();
        Map<String, String> x-property-mappings = batch.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('inputFileId', x-property-mappings.get('input_file_id'));
        System.assertEquals('completionWindow', x-property-mappings.get('completion_window'));
        System.assertEquals('outputFileId', x-property-mappings.get('output_file_id'));
        System.assertEquals('errorFileId', x-property-mappings.get('error_file_id'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('inProgressAt', x-property-mappings.get('in_progress_at'));
        System.assertEquals('expiresAt', x-property-mappings.get('expires_at'));
        System.assertEquals('finalizingAt', x-property-mappings.get('finalizing_at'));
        System.assertEquals('completedAt', x-property-mappings.get('completed_at'));
        System.assertEquals('failedAt', x-property-mappings.get('failed_at'));
        System.assertEquals('expiredAt', x-property-mappings.get('expired_at'));
        System.assertEquals('cancellingAt', x-property-mappings.get('cancelling_at'));
        System.assertEquals('cancelledAt', x-property-mappings.get('cancelled_at'));
        System.assertEquals('requestCounts', x-property-mappings.get('request_counts'));
    }
}
