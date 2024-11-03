@isTest
private class OASFineTuningIntegrationTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuningIntegration fineTuningIntegration1 = OASFineTuningIntegration.getExample();
        OASFineTuningIntegration fineTuningIntegration2 = fineTuningIntegration1;
        OASFineTuningIntegration fineTuningIntegration3 = new OASFineTuningIntegration();
        OASFineTuningIntegration fineTuningIntegration4 = fineTuningIntegration3;

        System.assert(fineTuningIntegration1.equals(fineTuningIntegration2));
        System.assert(fineTuningIntegration2.equals(fineTuningIntegration1));
        System.assert(fineTuningIntegration1.equals(fineTuningIntegration1));
        System.assert(fineTuningIntegration3.equals(fineTuningIntegration4));
        System.assert(fineTuningIntegration4.equals(fineTuningIntegration3));
        System.assert(fineTuningIntegration3.equals(fineTuningIntegration3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuningIntegration fineTuningIntegration1 = OASFineTuningIntegration.getExample();
        OASFineTuningIntegration fineTuningIntegration2 = OASFineTuningIntegration.getExample();
        OASFineTuningIntegration fineTuningIntegration3 = new OASFineTuningIntegration();
        OASFineTuningIntegration fineTuningIntegration4 = new OASFineTuningIntegration();

        System.assert(fineTuningIntegration1.equals(fineTuningIntegration2));
        System.assert(fineTuningIntegration2.equals(fineTuningIntegration1));
        System.assert(fineTuningIntegration3.equals(fineTuningIntegration4));
        System.assert(fineTuningIntegration4.equals(fineTuningIntegration3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuningIntegration fineTuningIntegration1 = OASFineTuningIntegration.getExample();
        OASFineTuningIntegration fineTuningIntegration2 = new OASFineTuningIntegration();

        System.assertEquals(false, fineTuningIntegration1.equals('foo'));
        System.assertEquals(false, fineTuningIntegration2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuningIntegration fineTuningIntegration1 = OASFineTuningIntegration.getExample();
        OASFineTuningIntegration fineTuningIntegration2 = new OASFineTuningIntegration();
        OASFineTuningIntegration fineTuningIntegration3;

        System.assertEquals(false, fineTuningIntegration1.equals(fineTuningIntegration3));
        System.assertEquals(false, fineTuningIntegration2.equals(fineTuningIntegration3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuningIntegration fineTuningIntegration1 = OASFineTuningIntegration.getExample();
        OASFineTuningIntegration fineTuningIntegration2 = new OASFineTuningIntegration();

        System.assertEquals(fineTuningIntegration1.hashCode(), fineTuningIntegration1.hashCode());
        System.assertEquals(fineTuningIntegration2.hashCode(), fineTuningIntegration2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuningIntegration fineTuningIntegration1 = OASFineTuningIntegration.getExample();
        OASFineTuningIntegration fineTuningIntegration2 = OASFineTuningIntegration.getExample();
        OASFineTuningIntegration fineTuningIntegration3 = new OASFineTuningIntegration();
        OASFineTuningIntegration fineTuningIntegration4 = new OASFineTuningIntegration();

        System.assert(fineTuningIntegration1.equals(fineTuningIntegration2));
        System.assert(fineTuningIntegration3.equals(fineTuningIntegration4));
        System.assertEquals(fineTuningIntegration1.hashCode(), fineTuningIntegration2.hashCode());
        System.assertEquals(fineTuningIntegration3.hashCode(), fineTuningIntegration4.hashCode());
    }
}
