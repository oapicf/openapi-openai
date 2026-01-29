@isTest
private class OASCreateFineTuningJobRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateFineTuningJobRequest createFineTuningJobRequest1 = OASCreateFineTuningJobRequest.getExample();
        OASCreateFineTuningJobRequest createFineTuningJobRequest2 = createFineTuningJobRequest1;
        OASCreateFineTuningJobRequest createFineTuningJobRequest3 = new OASCreateFineTuningJobRequest();
        OASCreateFineTuningJobRequest createFineTuningJobRequest4 = createFineTuningJobRequest3;

        System.assert(createFineTuningJobRequest1.equals(createFineTuningJobRequest2));
        System.assert(createFineTuningJobRequest2.equals(createFineTuningJobRequest1));
        System.assert(createFineTuningJobRequest1.equals(createFineTuningJobRequest1));
        System.assert(createFineTuningJobRequest3.equals(createFineTuningJobRequest4));
        System.assert(createFineTuningJobRequest4.equals(createFineTuningJobRequest3));
        System.assert(createFineTuningJobRequest3.equals(createFineTuningJobRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateFineTuningJobRequest createFineTuningJobRequest1 = OASCreateFineTuningJobRequest.getExample();
        OASCreateFineTuningJobRequest createFineTuningJobRequest2 = OASCreateFineTuningJobRequest.getExample();
        OASCreateFineTuningJobRequest createFineTuningJobRequest3 = new OASCreateFineTuningJobRequest();
        OASCreateFineTuningJobRequest createFineTuningJobRequest4 = new OASCreateFineTuningJobRequest();

        System.assert(createFineTuningJobRequest1.equals(createFineTuningJobRequest2));
        System.assert(createFineTuningJobRequest2.equals(createFineTuningJobRequest1));
        System.assert(createFineTuningJobRequest3.equals(createFineTuningJobRequest4));
        System.assert(createFineTuningJobRequest4.equals(createFineTuningJobRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateFineTuningJobRequest createFineTuningJobRequest1 = OASCreateFineTuningJobRequest.getExample();
        OASCreateFineTuningJobRequest createFineTuningJobRequest2 = new OASCreateFineTuningJobRequest();

        System.assertEquals(false, createFineTuningJobRequest1.equals('foo'));
        System.assertEquals(false, createFineTuningJobRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateFineTuningJobRequest createFineTuningJobRequest1 = OASCreateFineTuningJobRequest.getExample();
        OASCreateFineTuningJobRequest createFineTuningJobRequest2 = new OASCreateFineTuningJobRequest();
        OASCreateFineTuningJobRequest createFineTuningJobRequest3;

        System.assertEquals(false, createFineTuningJobRequest1.equals(createFineTuningJobRequest3));
        System.assertEquals(false, createFineTuningJobRequest2.equals(createFineTuningJobRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateFineTuningJobRequest createFineTuningJobRequest1 = OASCreateFineTuningJobRequest.getExample();
        OASCreateFineTuningJobRequest createFineTuningJobRequest2 = new OASCreateFineTuningJobRequest();

        System.assertEquals(createFineTuningJobRequest1.hashCode(), createFineTuningJobRequest1.hashCode());
        System.assertEquals(createFineTuningJobRequest2.hashCode(), createFineTuningJobRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateFineTuningJobRequest createFineTuningJobRequest1 = OASCreateFineTuningJobRequest.getExample();
        OASCreateFineTuningJobRequest createFineTuningJobRequest2 = OASCreateFineTuningJobRequest.getExample();
        OASCreateFineTuningJobRequest createFineTuningJobRequest3 = new OASCreateFineTuningJobRequest();
        OASCreateFineTuningJobRequest createFineTuningJobRequest4 = new OASCreateFineTuningJobRequest();

        System.assert(createFineTuningJobRequest1.equals(createFineTuningJobRequest2));
        System.assert(createFineTuningJobRequest3.equals(createFineTuningJobRequest4));
        System.assertEquals(createFineTuningJobRequest1.hashCode(), createFineTuningJobRequest2.hashCode());
        System.assertEquals(createFineTuningJobRequest3.hashCode(), createFineTuningJobRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateFineTuningJobRequest createFineTuningJobRequest = new OASCreateFineTuningJobRequest();
        Map<String, String> x-property-mappings = createFineTuningJobRequest.getx-property-mappings();
        System.assertEquals('trainingFile', x-property-mappings.get('training_file'));
        System.assertEquals('validationFile', x-property-mappings.get('validation_file'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateFineTuningJobRequest createFineTuningJobRequest = new OASCreateFineTuningJobRequest();
        System.assertEquals(new List<OASCreateFineTuningJobRequestIntegra>(), createFineTuningJobRequest.integrations);
        System.assertEquals(null, createFineTuningJobRequest.model);
        System.assertEquals(null, createFineTuningJobRequest.trainingFile);
        System.assertEquals(null, createFineTuningJobRequest.hyperparameters);
        System.assertEquals(null, createFineTuningJobRequest.suffix);
        System.assertEquals(null, createFineTuningJobRequest.validationFile);
        System.assertEquals(null, createFineTuningJobRequest.seed);
    }
}
