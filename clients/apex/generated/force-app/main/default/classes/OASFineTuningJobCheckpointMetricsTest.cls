@isTest
private class OASFineTuningJobCheckpointMetricsTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics1 = OASFineTuningJobCheckpointMetrics.getExample();
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics2 = fineTuningJobCheckpointMetrics1;
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics3 = new OASFineTuningJobCheckpointMetrics();
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics4 = fineTuningJobCheckpointMetrics3;

        System.assert(fineTuningJobCheckpointMetrics1.equals(fineTuningJobCheckpointMetrics2));
        System.assert(fineTuningJobCheckpointMetrics2.equals(fineTuningJobCheckpointMetrics1));
        System.assert(fineTuningJobCheckpointMetrics1.equals(fineTuningJobCheckpointMetrics1));
        System.assert(fineTuningJobCheckpointMetrics3.equals(fineTuningJobCheckpointMetrics4));
        System.assert(fineTuningJobCheckpointMetrics4.equals(fineTuningJobCheckpointMetrics3));
        System.assert(fineTuningJobCheckpointMetrics3.equals(fineTuningJobCheckpointMetrics3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics1 = OASFineTuningJobCheckpointMetrics.getExample();
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics2 = OASFineTuningJobCheckpointMetrics.getExample();
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics3 = new OASFineTuningJobCheckpointMetrics();
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics4 = new OASFineTuningJobCheckpointMetrics();

        System.assert(fineTuningJobCheckpointMetrics1.equals(fineTuningJobCheckpointMetrics2));
        System.assert(fineTuningJobCheckpointMetrics2.equals(fineTuningJobCheckpointMetrics1));
        System.assert(fineTuningJobCheckpointMetrics3.equals(fineTuningJobCheckpointMetrics4));
        System.assert(fineTuningJobCheckpointMetrics4.equals(fineTuningJobCheckpointMetrics3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics1 = OASFineTuningJobCheckpointMetrics.getExample();
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics2 = new OASFineTuningJobCheckpointMetrics();

        System.assertEquals(false, fineTuningJobCheckpointMetrics1.equals('foo'));
        System.assertEquals(false, fineTuningJobCheckpointMetrics2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics1 = OASFineTuningJobCheckpointMetrics.getExample();
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics2 = new OASFineTuningJobCheckpointMetrics();
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics3;

        System.assertEquals(false, fineTuningJobCheckpointMetrics1.equals(fineTuningJobCheckpointMetrics3));
        System.assertEquals(false, fineTuningJobCheckpointMetrics2.equals(fineTuningJobCheckpointMetrics3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics1 = OASFineTuningJobCheckpointMetrics.getExample();
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics2 = new OASFineTuningJobCheckpointMetrics();

        System.assertEquals(fineTuningJobCheckpointMetrics1.hashCode(), fineTuningJobCheckpointMetrics1.hashCode());
        System.assertEquals(fineTuningJobCheckpointMetrics2.hashCode(), fineTuningJobCheckpointMetrics2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics1 = OASFineTuningJobCheckpointMetrics.getExample();
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics2 = OASFineTuningJobCheckpointMetrics.getExample();
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics3 = new OASFineTuningJobCheckpointMetrics();
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics4 = new OASFineTuningJobCheckpointMetrics();

        System.assert(fineTuningJobCheckpointMetrics1.equals(fineTuningJobCheckpointMetrics2));
        System.assert(fineTuningJobCheckpointMetrics3.equals(fineTuningJobCheckpointMetrics4));
        System.assertEquals(fineTuningJobCheckpointMetrics1.hashCode(), fineTuningJobCheckpointMetrics2.hashCode());
        System.assertEquals(fineTuningJobCheckpointMetrics3.hashCode(), fineTuningJobCheckpointMetrics4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics = new OASFineTuningJobCheckpointMetrics();
        Map<String, String> x-property-mappings = fineTuningJobCheckpointMetrics.getx-property-mappings();
        System.assertEquals('trainLoss', x-property-mappings.get('train_loss'));
        System.assertEquals('trainMeanTokenAccuracy', x-property-mappings.get('train_mean_token_accuracy'));
        System.assertEquals('validLoss', x-property-mappings.get('valid_loss'));
        System.assertEquals('validMeanTokenAccuracy', x-property-mappings.get('valid_mean_token_accuracy'));
        System.assertEquals('fullValidLoss', x-property-mappings.get('full_valid_loss'));
        System.assertEquals('fullValidMeanTokenAccuracy', x-property-mappings.get('full_valid_mean_token_accuracy'));
    }
}
