@isTest
private class OASFineTuneDPOMethodHyperparametersTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters1 = OASFineTuneDPOMethodHyperparameters.getExample();
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters2 = fineTuneDPOMethodHyperparameters1;
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters3 = new OASFineTuneDPOMethodHyperparameters();
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters4 = fineTuneDPOMethodHyperparameters3;

        System.assert(fineTuneDPOMethodHyperparameters1.equals(fineTuneDPOMethodHyperparameters2));
        System.assert(fineTuneDPOMethodHyperparameters2.equals(fineTuneDPOMethodHyperparameters1));
        System.assert(fineTuneDPOMethodHyperparameters1.equals(fineTuneDPOMethodHyperparameters1));
        System.assert(fineTuneDPOMethodHyperparameters3.equals(fineTuneDPOMethodHyperparameters4));
        System.assert(fineTuneDPOMethodHyperparameters4.equals(fineTuneDPOMethodHyperparameters3));
        System.assert(fineTuneDPOMethodHyperparameters3.equals(fineTuneDPOMethodHyperparameters3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters1 = OASFineTuneDPOMethodHyperparameters.getExample();
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters2 = OASFineTuneDPOMethodHyperparameters.getExample();
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters3 = new OASFineTuneDPOMethodHyperparameters();
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters4 = new OASFineTuneDPOMethodHyperparameters();

        System.assert(fineTuneDPOMethodHyperparameters1.equals(fineTuneDPOMethodHyperparameters2));
        System.assert(fineTuneDPOMethodHyperparameters2.equals(fineTuneDPOMethodHyperparameters1));
        System.assert(fineTuneDPOMethodHyperparameters3.equals(fineTuneDPOMethodHyperparameters4));
        System.assert(fineTuneDPOMethodHyperparameters4.equals(fineTuneDPOMethodHyperparameters3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters1 = OASFineTuneDPOMethodHyperparameters.getExample();
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters2 = new OASFineTuneDPOMethodHyperparameters();

        System.assertEquals(false, fineTuneDPOMethodHyperparameters1.equals('foo'));
        System.assertEquals(false, fineTuneDPOMethodHyperparameters2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters1 = OASFineTuneDPOMethodHyperparameters.getExample();
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters2 = new OASFineTuneDPOMethodHyperparameters();
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters3;

        System.assertEquals(false, fineTuneDPOMethodHyperparameters1.equals(fineTuneDPOMethodHyperparameters3));
        System.assertEquals(false, fineTuneDPOMethodHyperparameters2.equals(fineTuneDPOMethodHyperparameters3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters1 = OASFineTuneDPOMethodHyperparameters.getExample();
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters2 = new OASFineTuneDPOMethodHyperparameters();

        System.assertEquals(fineTuneDPOMethodHyperparameters1.hashCode(), fineTuneDPOMethodHyperparameters1.hashCode());
        System.assertEquals(fineTuneDPOMethodHyperparameters2.hashCode(), fineTuneDPOMethodHyperparameters2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters1 = OASFineTuneDPOMethodHyperparameters.getExample();
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters2 = OASFineTuneDPOMethodHyperparameters.getExample();
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters3 = new OASFineTuneDPOMethodHyperparameters();
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters4 = new OASFineTuneDPOMethodHyperparameters();

        System.assert(fineTuneDPOMethodHyperparameters1.equals(fineTuneDPOMethodHyperparameters2));
        System.assert(fineTuneDPOMethodHyperparameters3.equals(fineTuneDPOMethodHyperparameters4));
        System.assertEquals(fineTuneDPOMethodHyperparameters1.hashCode(), fineTuneDPOMethodHyperparameters2.hashCode());
        System.assertEquals(fineTuneDPOMethodHyperparameters3.hashCode(), fineTuneDPOMethodHyperparameters4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFineTuneDPOMethodHyperparameters fineTuneDPOMethodHyperparameters = new OASFineTuneDPOMethodHyperparameters();
        Map<String, String> x-property-mappings = fineTuneDPOMethodHyperparameters.getx-property-mappings();
        System.assertEquals('batchSize', x-property-mappings.get('batch_size'));
        System.assertEquals('learningRateMultiplier', x-property-mappings.get('learning_rate_multiplier'));
        System.assertEquals('nEpochs', x-property-mappings.get('n_epochs'));
    }
}
