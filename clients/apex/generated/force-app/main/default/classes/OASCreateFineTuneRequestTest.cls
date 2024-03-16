@isTest
private class OASCreateFineTuneRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateFineTuneRequest createFineTuneRequest1 = OASCreateFineTuneRequest.getExample();
        OASCreateFineTuneRequest createFineTuneRequest2 = createFineTuneRequest1;
        OASCreateFineTuneRequest createFineTuneRequest3 = new OASCreateFineTuneRequest();
        OASCreateFineTuneRequest createFineTuneRequest4 = createFineTuneRequest3;

        System.assert(createFineTuneRequest1.equals(createFineTuneRequest2));
        System.assert(createFineTuneRequest2.equals(createFineTuneRequest1));
        System.assert(createFineTuneRequest1.equals(createFineTuneRequest1));
        System.assert(createFineTuneRequest3.equals(createFineTuneRequest4));
        System.assert(createFineTuneRequest4.equals(createFineTuneRequest3));
        System.assert(createFineTuneRequest3.equals(createFineTuneRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateFineTuneRequest createFineTuneRequest1 = OASCreateFineTuneRequest.getExample();
        OASCreateFineTuneRequest createFineTuneRequest2 = OASCreateFineTuneRequest.getExample();
        OASCreateFineTuneRequest createFineTuneRequest3 = new OASCreateFineTuneRequest();
        OASCreateFineTuneRequest createFineTuneRequest4 = new OASCreateFineTuneRequest();

        System.assert(createFineTuneRequest1.equals(createFineTuneRequest2));
        System.assert(createFineTuneRequest2.equals(createFineTuneRequest1));
        System.assert(createFineTuneRequest3.equals(createFineTuneRequest4));
        System.assert(createFineTuneRequest4.equals(createFineTuneRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateFineTuneRequest createFineTuneRequest1 = OASCreateFineTuneRequest.getExample();
        OASCreateFineTuneRequest createFineTuneRequest2 = new OASCreateFineTuneRequest();

        System.assertEquals(false, createFineTuneRequest1.equals('foo'));
        System.assertEquals(false, createFineTuneRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateFineTuneRequest createFineTuneRequest1 = OASCreateFineTuneRequest.getExample();
        OASCreateFineTuneRequest createFineTuneRequest2 = new OASCreateFineTuneRequest();
        OASCreateFineTuneRequest createFineTuneRequest3;

        System.assertEquals(false, createFineTuneRequest1.equals(createFineTuneRequest3));
        System.assertEquals(false, createFineTuneRequest2.equals(createFineTuneRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateFineTuneRequest createFineTuneRequest1 = OASCreateFineTuneRequest.getExample();
        OASCreateFineTuneRequest createFineTuneRequest2 = new OASCreateFineTuneRequest();

        System.assertEquals(createFineTuneRequest1.hashCode(), createFineTuneRequest1.hashCode());
        System.assertEquals(createFineTuneRequest2.hashCode(), createFineTuneRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateFineTuneRequest createFineTuneRequest1 = OASCreateFineTuneRequest.getExample();
        OASCreateFineTuneRequest createFineTuneRequest2 = OASCreateFineTuneRequest.getExample();
        OASCreateFineTuneRequest createFineTuneRequest3 = new OASCreateFineTuneRequest();
        OASCreateFineTuneRequest createFineTuneRequest4 = new OASCreateFineTuneRequest();

        System.assert(createFineTuneRequest1.equals(createFineTuneRequest2));
        System.assert(createFineTuneRequest3.equals(createFineTuneRequest4));
        System.assertEquals(createFineTuneRequest1.hashCode(), createFineTuneRequest2.hashCode());
        System.assertEquals(createFineTuneRequest3.hashCode(), createFineTuneRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateFineTuneRequest createFineTuneRequest = new OASCreateFineTuneRequest();
        Map<String, String> x-property-mappings = createFineTuneRequest.getx-property-mappings();
        System.assertEquals('trainingFile', x-property-mappings.get('training_file'));
        System.assertEquals('validationFile', x-property-mappings.get('validation_file'));
        System.assertEquals('nEpochs', x-property-mappings.get('n_epochs'));
        System.assertEquals('batchSize', x-property-mappings.get('batch_size'));
        System.assertEquals('learningRateMultiplier', x-property-mappings.get('learning_rate_multiplier'));
        System.assertEquals('promptLossWeight', x-property-mappings.get('prompt_loss_weight'));
        System.assertEquals('computeClassificationMetrics', x-property-mappings.get('compute_classification_metrics'));
        System.assertEquals('classificationNClasses', x-property-mappings.get('classification_n_classes'));
        System.assertEquals('classificationPositiveClass', x-property-mappings.get('classification_positive_class'));
        System.assertEquals('classificationBetas', x-property-mappings.get('classification_betas'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateFineTuneRequest createFineTuneRequest = new OASCreateFineTuneRequest();
        System.assertEquals(4, createFineTuneRequest.nEpochs);
        System.assertEquals(0.01, createFineTuneRequest.promptLossWeight);
        System.assertEquals(false, createFineTuneRequest.computeClassificationMetrics);
        System.assertEquals(new List<Double>(), createFineTuneRequest.classificationBetas);
        System.assertEquals(null, createFineTuneRequest.trainingFile);
        System.assertEquals(null, createFineTuneRequest.validationFile);
        System.assertEquals(null, createFineTuneRequest.model);
        System.assertEquals(null, createFineTuneRequest.batchSize);
        System.assertEquals(null, createFineTuneRequest.learningRateMultiplier);
        System.assertEquals(null, createFineTuneRequest.classificationNClasses);
        System.assertEquals(null, createFineTuneRequest.classificationPositiveClass);
        System.assertEquals(null, createFineTuneRequest.suffix);
    }
}
