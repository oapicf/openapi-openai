@isTest
private class OASFineTuneDPOMethodHyperparametersLTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier1 = OASFineTuneDPOMethodHyperparametersL.getExample();
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier2 = fineTuneDPOMethodHyperparametersLearningRateMultiplier1;
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier3 = new OASFineTuneDPOMethodHyperparametersL();
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier4 = fineTuneDPOMethodHyperparametersLearningRateMultiplier3;

        System.assert(fineTuneDPOMethodHyperparametersLearningRateMultiplier1.equals(fineTuneDPOMethodHyperparametersLearningRateMultiplier2));
        System.assert(fineTuneDPOMethodHyperparametersLearningRateMultiplier2.equals(fineTuneDPOMethodHyperparametersLearningRateMultiplier1));
        System.assert(fineTuneDPOMethodHyperparametersLearningRateMultiplier1.equals(fineTuneDPOMethodHyperparametersLearningRateMultiplier1));
        System.assert(fineTuneDPOMethodHyperparametersLearningRateMultiplier3.equals(fineTuneDPOMethodHyperparametersLearningRateMultiplier4));
        System.assert(fineTuneDPOMethodHyperparametersLearningRateMultiplier4.equals(fineTuneDPOMethodHyperparametersLearningRateMultiplier3));
        System.assert(fineTuneDPOMethodHyperparametersLearningRateMultiplier3.equals(fineTuneDPOMethodHyperparametersLearningRateMultiplier3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier1 = OASFineTuneDPOMethodHyperparametersL.getExample();
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier2 = OASFineTuneDPOMethodHyperparametersL.getExample();
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier3 = new OASFineTuneDPOMethodHyperparametersL();
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier4 = new OASFineTuneDPOMethodHyperparametersL();

        System.assert(fineTuneDPOMethodHyperparametersLearningRateMultiplier1.equals(fineTuneDPOMethodHyperparametersLearningRateMultiplier2));
        System.assert(fineTuneDPOMethodHyperparametersLearningRateMultiplier2.equals(fineTuneDPOMethodHyperparametersLearningRateMultiplier1));
        System.assert(fineTuneDPOMethodHyperparametersLearningRateMultiplier3.equals(fineTuneDPOMethodHyperparametersLearningRateMultiplier4));
        System.assert(fineTuneDPOMethodHyperparametersLearningRateMultiplier4.equals(fineTuneDPOMethodHyperparametersLearningRateMultiplier3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier1 = OASFineTuneDPOMethodHyperparametersL.getExample();
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier2 = new OASFineTuneDPOMethodHyperparametersL();

        System.assertEquals(false, fineTuneDPOMethodHyperparametersLearningRateMultiplier1.equals('foo'));
        System.assertEquals(false, fineTuneDPOMethodHyperparametersLearningRateMultiplier2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier1 = OASFineTuneDPOMethodHyperparametersL.getExample();
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier2 = new OASFineTuneDPOMethodHyperparametersL();
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier3;

        System.assertEquals(false, fineTuneDPOMethodHyperparametersLearningRateMultiplier1.equals(fineTuneDPOMethodHyperparametersLearningRateMultiplier3));
        System.assertEquals(false, fineTuneDPOMethodHyperparametersLearningRateMultiplier2.equals(fineTuneDPOMethodHyperparametersLearningRateMultiplier3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier1 = OASFineTuneDPOMethodHyperparametersL.getExample();
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier2 = new OASFineTuneDPOMethodHyperparametersL();

        System.assertEquals(fineTuneDPOMethodHyperparametersLearningRateMultiplier1.hashCode(), fineTuneDPOMethodHyperparametersLearningRateMultiplier1.hashCode());
        System.assertEquals(fineTuneDPOMethodHyperparametersLearningRateMultiplier2.hashCode(), fineTuneDPOMethodHyperparametersLearningRateMultiplier2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier1 = OASFineTuneDPOMethodHyperparametersL.getExample();
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier2 = OASFineTuneDPOMethodHyperparametersL.getExample();
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier3 = new OASFineTuneDPOMethodHyperparametersL();
        OASFineTuneDPOMethodHyperparametersL fineTuneDPOMethodHyperparametersLearningRateMultiplier4 = new OASFineTuneDPOMethodHyperparametersL();

        System.assert(fineTuneDPOMethodHyperparametersLearningRateMultiplier1.equals(fineTuneDPOMethodHyperparametersLearningRateMultiplier2));
        System.assert(fineTuneDPOMethodHyperparametersLearningRateMultiplier3.equals(fineTuneDPOMethodHyperparametersLearningRateMultiplier4));
        System.assertEquals(fineTuneDPOMethodHyperparametersLearningRateMultiplier1.hashCode(), fineTuneDPOMethodHyperparametersLearningRateMultiplier2.hashCode());
        System.assertEquals(fineTuneDPOMethodHyperparametersLearningRateMultiplier3.hashCode(), fineTuneDPOMethodHyperparametersLearningRateMultiplier4.hashCode());
    }
}
