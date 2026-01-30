@isTest
private class OASFineTuneSupervisedMethodHyperparaTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters1 = OASFineTuneSupervisedMethodHyperpara.getExample();
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters2 = fineTuneSupervisedMethodHyperparameters1;
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters3 = new OASFineTuneSupervisedMethodHyperpara();
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters4 = fineTuneSupervisedMethodHyperparameters3;

        System.assert(fineTuneSupervisedMethodHyperparameters1.equals(fineTuneSupervisedMethodHyperparameters2));
        System.assert(fineTuneSupervisedMethodHyperparameters2.equals(fineTuneSupervisedMethodHyperparameters1));
        System.assert(fineTuneSupervisedMethodHyperparameters1.equals(fineTuneSupervisedMethodHyperparameters1));
        System.assert(fineTuneSupervisedMethodHyperparameters3.equals(fineTuneSupervisedMethodHyperparameters4));
        System.assert(fineTuneSupervisedMethodHyperparameters4.equals(fineTuneSupervisedMethodHyperparameters3));
        System.assert(fineTuneSupervisedMethodHyperparameters3.equals(fineTuneSupervisedMethodHyperparameters3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters1 = OASFineTuneSupervisedMethodHyperpara.getExample();
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters2 = OASFineTuneSupervisedMethodHyperpara.getExample();
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters3 = new OASFineTuneSupervisedMethodHyperpara();
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters4 = new OASFineTuneSupervisedMethodHyperpara();

        System.assert(fineTuneSupervisedMethodHyperparameters1.equals(fineTuneSupervisedMethodHyperparameters2));
        System.assert(fineTuneSupervisedMethodHyperparameters2.equals(fineTuneSupervisedMethodHyperparameters1));
        System.assert(fineTuneSupervisedMethodHyperparameters3.equals(fineTuneSupervisedMethodHyperparameters4));
        System.assert(fineTuneSupervisedMethodHyperparameters4.equals(fineTuneSupervisedMethodHyperparameters3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters1 = OASFineTuneSupervisedMethodHyperpara.getExample();
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters2 = new OASFineTuneSupervisedMethodHyperpara();

        System.assertEquals(false, fineTuneSupervisedMethodHyperparameters1.equals('foo'));
        System.assertEquals(false, fineTuneSupervisedMethodHyperparameters2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters1 = OASFineTuneSupervisedMethodHyperpara.getExample();
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters2 = new OASFineTuneSupervisedMethodHyperpara();
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters3;

        System.assertEquals(false, fineTuneSupervisedMethodHyperparameters1.equals(fineTuneSupervisedMethodHyperparameters3));
        System.assertEquals(false, fineTuneSupervisedMethodHyperparameters2.equals(fineTuneSupervisedMethodHyperparameters3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters1 = OASFineTuneSupervisedMethodHyperpara.getExample();
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters2 = new OASFineTuneSupervisedMethodHyperpara();

        System.assertEquals(fineTuneSupervisedMethodHyperparameters1.hashCode(), fineTuneSupervisedMethodHyperparameters1.hashCode());
        System.assertEquals(fineTuneSupervisedMethodHyperparameters2.hashCode(), fineTuneSupervisedMethodHyperparameters2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters1 = OASFineTuneSupervisedMethodHyperpara.getExample();
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters2 = OASFineTuneSupervisedMethodHyperpara.getExample();
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters3 = new OASFineTuneSupervisedMethodHyperpara();
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters4 = new OASFineTuneSupervisedMethodHyperpara();

        System.assert(fineTuneSupervisedMethodHyperparameters1.equals(fineTuneSupervisedMethodHyperparameters2));
        System.assert(fineTuneSupervisedMethodHyperparameters3.equals(fineTuneSupervisedMethodHyperparameters4));
        System.assertEquals(fineTuneSupervisedMethodHyperparameters1.hashCode(), fineTuneSupervisedMethodHyperparameters2.hashCode());
        System.assertEquals(fineTuneSupervisedMethodHyperparameters3.hashCode(), fineTuneSupervisedMethodHyperparameters4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFineTuneSupervisedMethodHyperpara fineTuneSupervisedMethodHyperparameters = new OASFineTuneSupervisedMethodHyperpara();
        Map<String, String> x-property-mappings = fineTuneSupervisedMethodHyperparameters.getx-property-mappings();
        System.assertEquals('batchSize', x-property-mappings.get('batch_size'));
        System.assertEquals('learningRateMultiplier', x-property-mappings.get('learning_rate_multiplier'));
        System.assertEquals('nEpochs', x-property-mappings.get('n_epochs'));
    }
}
