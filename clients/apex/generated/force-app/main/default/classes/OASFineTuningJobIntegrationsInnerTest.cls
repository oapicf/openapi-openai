@isTest
private class OASFineTuningJobIntegrationsInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner1 = OASFineTuningJobIntegrationsInner.getExample();
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner2 = fineTuningJobIntegrationsInner1;
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner3 = new OASFineTuningJobIntegrationsInner();
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner4 = fineTuningJobIntegrationsInner3;

        System.assert(fineTuningJobIntegrationsInner1.equals(fineTuningJobIntegrationsInner2));
        System.assert(fineTuningJobIntegrationsInner2.equals(fineTuningJobIntegrationsInner1));
        System.assert(fineTuningJobIntegrationsInner1.equals(fineTuningJobIntegrationsInner1));
        System.assert(fineTuningJobIntegrationsInner3.equals(fineTuningJobIntegrationsInner4));
        System.assert(fineTuningJobIntegrationsInner4.equals(fineTuningJobIntegrationsInner3));
        System.assert(fineTuningJobIntegrationsInner3.equals(fineTuningJobIntegrationsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner1 = OASFineTuningJobIntegrationsInner.getExample();
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner2 = OASFineTuningJobIntegrationsInner.getExample();
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner3 = new OASFineTuningJobIntegrationsInner();
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner4 = new OASFineTuningJobIntegrationsInner();

        System.assert(fineTuningJobIntegrationsInner1.equals(fineTuningJobIntegrationsInner2));
        System.assert(fineTuningJobIntegrationsInner2.equals(fineTuningJobIntegrationsInner1));
        System.assert(fineTuningJobIntegrationsInner3.equals(fineTuningJobIntegrationsInner4));
        System.assert(fineTuningJobIntegrationsInner4.equals(fineTuningJobIntegrationsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner1 = OASFineTuningJobIntegrationsInner.getExample();
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner2 = new OASFineTuningJobIntegrationsInner();

        System.assertEquals(false, fineTuningJobIntegrationsInner1.equals('foo'));
        System.assertEquals(false, fineTuningJobIntegrationsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner1 = OASFineTuningJobIntegrationsInner.getExample();
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner2 = new OASFineTuningJobIntegrationsInner();
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner3;

        System.assertEquals(false, fineTuningJobIntegrationsInner1.equals(fineTuningJobIntegrationsInner3));
        System.assertEquals(false, fineTuningJobIntegrationsInner2.equals(fineTuningJobIntegrationsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner1 = OASFineTuningJobIntegrationsInner.getExample();
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner2 = new OASFineTuningJobIntegrationsInner();

        System.assertEquals(fineTuningJobIntegrationsInner1.hashCode(), fineTuningJobIntegrationsInner1.hashCode());
        System.assertEquals(fineTuningJobIntegrationsInner2.hashCode(), fineTuningJobIntegrationsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner1 = OASFineTuningJobIntegrationsInner.getExample();
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner2 = OASFineTuningJobIntegrationsInner.getExample();
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner3 = new OASFineTuningJobIntegrationsInner();
        OASFineTuningJobIntegrationsInner fineTuningJobIntegrationsInner4 = new OASFineTuningJobIntegrationsInner();

        System.assert(fineTuningJobIntegrationsInner1.equals(fineTuningJobIntegrationsInner2));
        System.assert(fineTuningJobIntegrationsInner3.equals(fineTuningJobIntegrationsInner4));
        System.assertEquals(fineTuningJobIntegrationsInner1.hashCode(), fineTuningJobIntegrationsInner2.hashCode());
        System.assertEquals(fineTuningJobIntegrationsInner3.hashCode(), fineTuningJobIntegrationsInner4.hashCode());
    }
}
