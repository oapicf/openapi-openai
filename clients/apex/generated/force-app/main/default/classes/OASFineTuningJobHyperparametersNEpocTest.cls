@isTest
private class OASFineTuningJobHyperparametersNEpocTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs1 = OASFineTuningJobHyperparametersNEpoc.getExample();
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs2 = fineTuningJobHyperparametersNEpochs1;
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs3 = new OASFineTuningJobHyperparametersNEpoc();
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs4 = fineTuningJobHyperparametersNEpochs3;

        System.assert(fineTuningJobHyperparametersNEpochs1.equals(fineTuningJobHyperparametersNEpochs2));
        System.assert(fineTuningJobHyperparametersNEpochs2.equals(fineTuningJobHyperparametersNEpochs1));
        System.assert(fineTuningJobHyperparametersNEpochs1.equals(fineTuningJobHyperparametersNEpochs1));
        System.assert(fineTuningJobHyperparametersNEpochs3.equals(fineTuningJobHyperparametersNEpochs4));
        System.assert(fineTuningJobHyperparametersNEpochs4.equals(fineTuningJobHyperparametersNEpochs3));
        System.assert(fineTuningJobHyperparametersNEpochs3.equals(fineTuningJobHyperparametersNEpochs3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs1 = OASFineTuningJobHyperparametersNEpoc.getExample();
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs2 = OASFineTuningJobHyperparametersNEpoc.getExample();
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs3 = new OASFineTuningJobHyperparametersNEpoc();
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs4 = new OASFineTuningJobHyperparametersNEpoc();

        System.assert(fineTuningJobHyperparametersNEpochs1.equals(fineTuningJobHyperparametersNEpochs2));
        System.assert(fineTuningJobHyperparametersNEpochs2.equals(fineTuningJobHyperparametersNEpochs1));
        System.assert(fineTuningJobHyperparametersNEpochs3.equals(fineTuningJobHyperparametersNEpochs4));
        System.assert(fineTuningJobHyperparametersNEpochs4.equals(fineTuningJobHyperparametersNEpochs3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs1 = OASFineTuningJobHyperparametersNEpoc.getExample();
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs2 = new OASFineTuningJobHyperparametersNEpoc();

        System.assertEquals(false, fineTuningJobHyperparametersNEpochs1.equals('foo'));
        System.assertEquals(false, fineTuningJobHyperparametersNEpochs2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs1 = OASFineTuningJobHyperparametersNEpoc.getExample();
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs2 = new OASFineTuningJobHyperparametersNEpoc();
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs3;

        System.assertEquals(false, fineTuningJobHyperparametersNEpochs1.equals(fineTuningJobHyperparametersNEpochs3));
        System.assertEquals(false, fineTuningJobHyperparametersNEpochs2.equals(fineTuningJobHyperparametersNEpochs3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs1 = OASFineTuningJobHyperparametersNEpoc.getExample();
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs2 = new OASFineTuningJobHyperparametersNEpoc();

        System.assertEquals(fineTuningJobHyperparametersNEpochs1.hashCode(), fineTuningJobHyperparametersNEpochs1.hashCode());
        System.assertEquals(fineTuningJobHyperparametersNEpochs2.hashCode(), fineTuningJobHyperparametersNEpochs2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs1 = OASFineTuningJobHyperparametersNEpoc.getExample();
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs2 = OASFineTuningJobHyperparametersNEpoc.getExample();
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs3 = new OASFineTuningJobHyperparametersNEpoc();
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs4 = new OASFineTuningJobHyperparametersNEpoc();

        System.assert(fineTuningJobHyperparametersNEpochs1.equals(fineTuningJobHyperparametersNEpochs2));
        System.assert(fineTuningJobHyperparametersNEpochs3.equals(fineTuningJobHyperparametersNEpochs4));
        System.assertEquals(fineTuningJobHyperparametersNEpochs1.hashCode(), fineTuningJobHyperparametersNEpochs2.hashCode());
        System.assertEquals(fineTuningJobHyperparametersNEpochs3.hashCode(), fineTuningJobHyperparametersNEpochs4.hashCode());
    }
}
