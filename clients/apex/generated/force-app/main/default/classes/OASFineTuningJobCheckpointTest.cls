@isTest
private class OASFineTuningJobCheckpointTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint1 = OASFineTuningJobCheckpoint.getExample();
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint2 = fineTuningJobCheckpoint1;
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint3 = new OASFineTuningJobCheckpoint();
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint4 = fineTuningJobCheckpoint3;

        System.assert(fineTuningJobCheckpoint1.equals(fineTuningJobCheckpoint2));
        System.assert(fineTuningJobCheckpoint2.equals(fineTuningJobCheckpoint1));
        System.assert(fineTuningJobCheckpoint1.equals(fineTuningJobCheckpoint1));
        System.assert(fineTuningJobCheckpoint3.equals(fineTuningJobCheckpoint4));
        System.assert(fineTuningJobCheckpoint4.equals(fineTuningJobCheckpoint3));
        System.assert(fineTuningJobCheckpoint3.equals(fineTuningJobCheckpoint3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint1 = OASFineTuningJobCheckpoint.getExample();
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint2 = OASFineTuningJobCheckpoint.getExample();
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint3 = new OASFineTuningJobCheckpoint();
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint4 = new OASFineTuningJobCheckpoint();

        System.assert(fineTuningJobCheckpoint1.equals(fineTuningJobCheckpoint2));
        System.assert(fineTuningJobCheckpoint2.equals(fineTuningJobCheckpoint1));
        System.assert(fineTuningJobCheckpoint3.equals(fineTuningJobCheckpoint4));
        System.assert(fineTuningJobCheckpoint4.equals(fineTuningJobCheckpoint3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint1 = OASFineTuningJobCheckpoint.getExample();
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint2 = new OASFineTuningJobCheckpoint();

        System.assertEquals(false, fineTuningJobCheckpoint1.equals('foo'));
        System.assertEquals(false, fineTuningJobCheckpoint2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint1 = OASFineTuningJobCheckpoint.getExample();
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint2 = new OASFineTuningJobCheckpoint();
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint3;

        System.assertEquals(false, fineTuningJobCheckpoint1.equals(fineTuningJobCheckpoint3));
        System.assertEquals(false, fineTuningJobCheckpoint2.equals(fineTuningJobCheckpoint3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint1 = OASFineTuningJobCheckpoint.getExample();
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint2 = new OASFineTuningJobCheckpoint();

        System.assertEquals(fineTuningJobCheckpoint1.hashCode(), fineTuningJobCheckpoint1.hashCode());
        System.assertEquals(fineTuningJobCheckpoint2.hashCode(), fineTuningJobCheckpoint2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint1 = OASFineTuningJobCheckpoint.getExample();
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint2 = OASFineTuningJobCheckpoint.getExample();
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint3 = new OASFineTuningJobCheckpoint();
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint4 = new OASFineTuningJobCheckpoint();

        System.assert(fineTuningJobCheckpoint1.equals(fineTuningJobCheckpoint2));
        System.assert(fineTuningJobCheckpoint3.equals(fineTuningJobCheckpoint4));
        System.assertEquals(fineTuningJobCheckpoint1.hashCode(), fineTuningJobCheckpoint2.hashCode());
        System.assertEquals(fineTuningJobCheckpoint3.hashCode(), fineTuningJobCheckpoint4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFineTuningJobCheckpoint fineTuningJobCheckpoint = new OASFineTuningJobCheckpoint();
        Map<String, String> x-property-mappings = fineTuningJobCheckpoint.getx-property-mappings();
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('fineTunedModelCheckpoint', x-property-mappings.get('fine_tuned_model_checkpoint'));
        System.assertEquals('stepNumber', x-property-mappings.get('step_number'));
        System.assertEquals('fineTuningJobId', x-property-mappings.get('fine_tuning_job_id'));
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
