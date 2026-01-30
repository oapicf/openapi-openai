@isTest
private class OASFineTuneDPOMethodHyperparametersBTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize1 = OASFineTuneDPOMethodHyperparametersB.getExample();
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize2 = fineTuneDPOMethodHyperparametersBatchSize1;
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize3 = new OASFineTuneDPOMethodHyperparametersB();
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize4 = fineTuneDPOMethodHyperparametersBatchSize3;

        System.assert(fineTuneDPOMethodHyperparametersBatchSize1.equals(fineTuneDPOMethodHyperparametersBatchSize2));
        System.assert(fineTuneDPOMethodHyperparametersBatchSize2.equals(fineTuneDPOMethodHyperparametersBatchSize1));
        System.assert(fineTuneDPOMethodHyperparametersBatchSize1.equals(fineTuneDPOMethodHyperparametersBatchSize1));
        System.assert(fineTuneDPOMethodHyperparametersBatchSize3.equals(fineTuneDPOMethodHyperparametersBatchSize4));
        System.assert(fineTuneDPOMethodHyperparametersBatchSize4.equals(fineTuneDPOMethodHyperparametersBatchSize3));
        System.assert(fineTuneDPOMethodHyperparametersBatchSize3.equals(fineTuneDPOMethodHyperparametersBatchSize3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize1 = OASFineTuneDPOMethodHyperparametersB.getExample();
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize2 = OASFineTuneDPOMethodHyperparametersB.getExample();
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize3 = new OASFineTuneDPOMethodHyperparametersB();
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize4 = new OASFineTuneDPOMethodHyperparametersB();

        System.assert(fineTuneDPOMethodHyperparametersBatchSize1.equals(fineTuneDPOMethodHyperparametersBatchSize2));
        System.assert(fineTuneDPOMethodHyperparametersBatchSize2.equals(fineTuneDPOMethodHyperparametersBatchSize1));
        System.assert(fineTuneDPOMethodHyperparametersBatchSize3.equals(fineTuneDPOMethodHyperparametersBatchSize4));
        System.assert(fineTuneDPOMethodHyperparametersBatchSize4.equals(fineTuneDPOMethodHyperparametersBatchSize3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize1 = OASFineTuneDPOMethodHyperparametersB.getExample();
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize2 = new OASFineTuneDPOMethodHyperparametersB();

        System.assertEquals(false, fineTuneDPOMethodHyperparametersBatchSize1.equals('foo'));
        System.assertEquals(false, fineTuneDPOMethodHyperparametersBatchSize2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize1 = OASFineTuneDPOMethodHyperparametersB.getExample();
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize2 = new OASFineTuneDPOMethodHyperparametersB();
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize3;

        System.assertEquals(false, fineTuneDPOMethodHyperparametersBatchSize1.equals(fineTuneDPOMethodHyperparametersBatchSize3));
        System.assertEquals(false, fineTuneDPOMethodHyperparametersBatchSize2.equals(fineTuneDPOMethodHyperparametersBatchSize3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize1 = OASFineTuneDPOMethodHyperparametersB.getExample();
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize2 = new OASFineTuneDPOMethodHyperparametersB();

        System.assertEquals(fineTuneDPOMethodHyperparametersBatchSize1.hashCode(), fineTuneDPOMethodHyperparametersBatchSize1.hashCode());
        System.assertEquals(fineTuneDPOMethodHyperparametersBatchSize2.hashCode(), fineTuneDPOMethodHyperparametersBatchSize2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize1 = OASFineTuneDPOMethodHyperparametersB.getExample();
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize2 = OASFineTuneDPOMethodHyperparametersB.getExample();
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize3 = new OASFineTuneDPOMethodHyperparametersB();
        OASFineTuneDPOMethodHyperparametersB fineTuneDPOMethodHyperparametersBatchSize4 = new OASFineTuneDPOMethodHyperparametersB();

        System.assert(fineTuneDPOMethodHyperparametersBatchSize1.equals(fineTuneDPOMethodHyperparametersBatchSize2));
        System.assert(fineTuneDPOMethodHyperparametersBatchSize3.equals(fineTuneDPOMethodHyperparametersBatchSize4));
        System.assertEquals(fineTuneDPOMethodHyperparametersBatchSize1.hashCode(), fineTuneDPOMethodHyperparametersBatchSize2.hashCode());
        System.assertEquals(fineTuneDPOMethodHyperparametersBatchSize3.hashCode(), fineTuneDPOMethodHyperparametersBatchSize4.hashCode());
    }
}
