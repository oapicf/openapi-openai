@isTest
private class OASCreateFineTuningJobRequestHyperpaTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters1 = OASCreateFineTuningJobRequestHyperpa.getExample();
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters2 = createFineTuningJobRequestHyperparameters1;
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters3 = new OASCreateFineTuningJobRequestHyperpa();
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters4 = createFineTuningJobRequestHyperparameters3;

        System.assert(createFineTuningJobRequestHyperparameters1.equals(createFineTuningJobRequestHyperparameters2));
        System.assert(createFineTuningJobRequestHyperparameters2.equals(createFineTuningJobRequestHyperparameters1));
        System.assert(createFineTuningJobRequestHyperparameters1.equals(createFineTuningJobRequestHyperparameters1));
        System.assert(createFineTuningJobRequestHyperparameters3.equals(createFineTuningJobRequestHyperparameters4));
        System.assert(createFineTuningJobRequestHyperparameters4.equals(createFineTuningJobRequestHyperparameters3));
        System.assert(createFineTuningJobRequestHyperparameters3.equals(createFineTuningJobRequestHyperparameters3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters1 = OASCreateFineTuningJobRequestHyperpa.getExample();
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters2 = OASCreateFineTuningJobRequestHyperpa.getExample();
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters3 = new OASCreateFineTuningJobRequestHyperpa();
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters4 = new OASCreateFineTuningJobRequestHyperpa();

        System.assert(createFineTuningJobRequestHyperparameters1.equals(createFineTuningJobRequestHyperparameters2));
        System.assert(createFineTuningJobRequestHyperparameters2.equals(createFineTuningJobRequestHyperparameters1));
        System.assert(createFineTuningJobRequestHyperparameters3.equals(createFineTuningJobRequestHyperparameters4));
        System.assert(createFineTuningJobRequestHyperparameters4.equals(createFineTuningJobRequestHyperparameters3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters1 = OASCreateFineTuningJobRequestHyperpa.getExample();
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters2 = new OASCreateFineTuningJobRequestHyperpa();

        System.assertEquals(false, createFineTuningJobRequestHyperparameters1.equals('foo'));
        System.assertEquals(false, createFineTuningJobRequestHyperparameters2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters1 = OASCreateFineTuningJobRequestHyperpa.getExample();
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters2 = new OASCreateFineTuningJobRequestHyperpa();
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters3;

        System.assertEquals(false, createFineTuningJobRequestHyperparameters1.equals(createFineTuningJobRequestHyperparameters3));
        System.assertEquals(false, createFineTuningJobRequestHyperparameters2.equals(createFineTuningJobRequestHyperparameters3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters1 = OASCreateFineTuningJobRequestHyperpa.getExample();
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters2 = new OASCreateFineTuningJobRequestHyperpa();

        System.assertEquals(createFineTuningJobRequestHyperparameters1.hashCode(), createFineTuningJobRequestHyperparameters1.hashCode());
        System.assertEquals(createFineTuningJobRequestHyperparameters2.hashCode(), createFineTuningJobRequestHyperparameters2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters1 = OASCreateFineTuningJobRequestHyperpa.getExample();
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters2 = OASCreateFineTuningJobRequestHyperpa.getExample();
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters3 = new OASCreateFineTuningJobRequestHyperpa();
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters4 = new OASCreateFineTuningJobRequestHyperpa();

        System.assert(createFineTuningJobRequestHyperparameters1.equals(createFineTuningJobRequestHyperparameters2));
        System.assert(createFineTuningJobRequestHyperparameters3.equals(createFineTuningJobRequestHyperparameters4));
        System.assertEquals(createFineTuningJobRequestHyperparameters1.hashCode(), createFineTuningJobRequestHyperparameters2.hashCode());
        System.assertEquals(createFineTuningJobRequestHyperparameters3.hashCode(), createFineTuningJobRequestHyperparameters4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateFineTuningJobRequestHyperpa createFineTuningJobRequestHyperparameters = new OASCreateFineTuningJobRequestHyperpa();
        Map<String, String> x-property-mappings = createFineTuningJobRequestHyperparameters.getx-property-mappings();
        System.assertEquals('batchSize', x-property-mappings.get('batch_size'));
        System.assertEquals('learningRateMultiplier', x-property-mappings.get('learning_rate_multiplier'));
        System.assertEquals('nEpochs', x-property-mappings.get('n_epochs'));
    }
}
