@isTest
private class OASFineTuningJobHyperparametersTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters1 = OASFineTuningJobHyperparameters.getExample();
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters2 = fineTuningJobHyperparameters1;
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters3 = new OASFineTuningJobHyperparameters();
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters4 = fineTuningJobHyperparameters3;

        System.assert(fineTuningJobHyperparameters1.equals(fineTuningJobHyperparameters2));
        System.assert(fineTuningJobHyperparameters2.equals(fineTuningJobHyperparameters1));
        System.assert(fineTuningJobHyperparameters1.equals(fineTuningJobHyperparameters1));
        System.assert(fineTuningJobHyperparameters3.equals(fineTuningJobHyperparameters4));
        System.assert(fineTuningJobHyperparameters4.equals(fineTuningJobHyperparameters3));
        System.assert(fineTuningJobHyperparameters3.equals(fineTuningJobHyperparameters3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters1 = OASFineTuningJobHyperparameters.getExample();
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters2 = OASFineTuningJobHyperparameters.getExample();
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters3 = new OASFineTuningJobHyperparameters();
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters4 = new OASFineTuningJobHyperparameters();

        System.assert(fineTuningJobHyperparameters1.equals(fineTuningJobHyperparameters2));
        System.assert(fineTuningJobHyperparameters2.equals(fineTuningJobHyperparameters1));
        System.assert(fineTuningJobHyperparameters3.equals(fineTuningJobHyperparameters4));
        System.assert(fineTuningJobHyperparameters4.equals(fineTuningJobHyperparameters3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters1 = OASFineTuningJobHyperparameters.getExample();
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters2 = new OASFineTuningJobHyperparameters();

        System.assertEquals(false, fineTuningJobHyperparameters1.equals('foo'));
        System.assertEquals(false, fineTuningJobHyperparameters2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters1 = OASFineTuningJobHyperparameters.getExample();
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters2 = new OASFineTuningJobHyperparameters();
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters3;

        System.assertEquals(false, fineTuningJobHyperparameters1.equals(fineTuningJobHyperparameters3));
        System.assertEquals(false, fineTuningJobHyperparameters2.equals(fineTuningJobHyperparameters3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters1 = OASFineTuningJobHyperparameters.getExample();
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters2 = new OASFineTuningJobHyperparameters();

        System.assertEquals(fineTuningJobHyperparameters1.hashCode(), fineTuningJobHyperparameters1.hashCode());
        System.assertEquals(fineTuningJobHyperparameters2.hashCode(), fineTuningJobHyperparameters2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters1 = OASFineTuningJobHyperparameters.getExample();
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters2 = OASFineTuningJobHyperparameters.getExample();
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters3 = new OASFineTuningJobHyperparameters();
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters4 = new OASFineTuningJobHyperparameters();

        System.assert(fineTuningJobHyperparameters1.equals(fineTuningJobHyperparameters2));
        System.assert(fineTuningJobHyperparameters3.equals(fineTuningJobHyperparameters4));
        System.assertEquals(fineTuningJobHyperparameters1.hashCode(), fineTuningJobHyperparameters2.hashCode());
        System.assertEquals(fineTuningJobHyperparameters3.hashCode(), fineTuningJobHyperparameters4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters = new OASFineTuningJobHyperparameters();
        Map<String, String> x-property-mappings = fineTuningJobHyperparameters.getx-property-mappings();
        System.assertEquals('nEpochs', x-property-mappings.get('n_epochs'));
    }
}
