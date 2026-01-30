@isTest
private class OASFineTuneDPOMethodHyperparametersNTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs1 = OASFineTuneDPOMethodHyperparametersN.getExample();
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs2 = fineTuneDPOMethodHyperparametersNEpochs1;
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs3 = new OASFineTuneDPOMethodHyperparametersN();
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs4 = fineTuneDPOMethodHyperparametersNEpochs3;

        System.assert(fineTuneDPOMethodHyperparametersNEpochs1.equals(fineTuneDPOMethodHyperparametersNEpochs2));
        System.assert(fineTuneDPOMethodHyperparametersNEpochs2.equals(fineTuneDPOMethodHyperparametersNEpochs1));
        System.assert(fineTuneDPOMethodHyperparametersNEpochs1.equals(fineTuneDPOMethodHyperparametersNEpochs1));
        System.assert(fineTuneDPOMethodHyperparametersNEpochs3.equals(fineTuneDPOMethodHyperparametersNEpochs4));
        System.assert(fineTuneDPOMethodHyperparametersNEpochs4.equals(fineTuneDPOMethodHyperparametersNEpochs3));
        System.assert(fineTuneDPOMethodHyperparametersNEpochs3.equals(fineTuneDPOMethodHyperparametersNEpochs3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs1 = OASFineTuneDPOMethodHyperparametersN.getExample();
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs2 = OASFineTuneDPOMethodHyperparametersN.getExample();
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs3 = new OASFineTuneDPOMethodHyperparametersN();
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs4 = new OASFineTuneDPOMethodHyperparametersN();

        System.assert(fineTuneDPOMethodHyperparametersNEpochs1.equals(fineTuneDPOMethodHyperparametersNEpochs2));
        System.assert(fineTuneDPOMethodHyperparametersNEpochs2.equals(fineTuneDPOMethodHyperparametersNEpochs1));
        System.assert(fineTuneDPOMethodHyperparametersNEpochs3.equals(fineTuneDPOMethodHyperparametersNEpochs4));
        System.assert(fineTuneDPOMethodHyperparametersNEpochs4.equals(fineTuneDPOMethodHyperparametersNEpochs3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs1 = OASFineTuneDPOMethodHyperparametersN.getExample();
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs2 = new OASFineTuneDPOMethodHyperparametersN();

        System.assertEquals(false, fineTuneDPOMethodHyperparametersNEpochs1.equals('foo'));
        System.assertEquals(false, fineTuneDPOMethodHyperparametersNEpochs2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs1 = OASFineTuneDPOMethodHyperparametersN.getExample();
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs2 = new OASFineTuneDPOMethodHyperparametersN();
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs3;

        System.assertEquals(false, fineTuneDPOMethodHyperparametersNEpochs1.equals(fineTuneDPOMethodHyperparametersNEpochs3));
        System.assertEquals(false, fineTuneDPOMethodHyperparametersNEpochs2.equals(fineTuneDPOMethodHyperparametersNEpochs3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs1 = OASFineTuneDPOMethodHyperparametersN.getExample();
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs2 = new OASFineTuneDPOMethodHyperparametersN();

        System.assertEquals(fineTuneDPOMethodHyperparametersNEpochs1.hashCode(), fineTuneDPOMethodHyperparametersNEpochs1.hashCode());
        System.assertEquals(fineTuneDPOMethodHyperparametersNEpochs2.hashCode(), fineTuneDPOMethodHyperparametersNEpochs2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs1 = OASFineTuneDPOMethodHyperparametersN.getExample();
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs2 = OASFineTuneDPOMethodHyperparametersN.getExample();
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs3 = new OASFineTuneDPOMethodHyperparametersN();
        OASFineTuneDPOMethodHyperparametersN fineTuneDPOMethodHyperparametersNEpochs4 = new OASFineTuneDPOMethodHyperparametersN();

        System.assert(fineTuneDPOMethodHyperparametersNEpochs1.equals(fineTuneDPOMethodHyperparametersNEpochs2));
        System.assert(fineTuneDPOMethodHyperparametersNEpochs3.equals(fineTuneDPOMethodHyperparametersNEpochs4));
        System.assertEquals(fineTuneDPOMethodHyperparametersNEpochs1.hashCode(), fineTuneDPOMethodHyperparametersNEpochs2.hashCode());
        System.assertEquals(fineTuneDPOMethodHyperparametersNEpochs3.hashCode(), fineTuneDPOMethodHyperparametersNEpochs4.hashCode());
    }
}
