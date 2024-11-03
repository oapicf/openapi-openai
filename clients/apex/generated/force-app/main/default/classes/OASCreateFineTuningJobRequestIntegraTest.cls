@isTest
private class OASCreateFineTuningJobRequestIntegraTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner1 = OASCreateFineTuningJobRequestIntegra.getExample();
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner2 = createFineTuningJobRequestIntegrationsInner1;
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner3 = new OASCreateFineTuningJobRequestIntegra();
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner4 = createFineTuningJobRequestIntegrationsInner3;

        System.assert(createFineTuningJobRequestIntegrationsInner1.equals(createFineTuningJobRequestIntegrationsInner2));
        System.assert(createFineTuningJobRequestIntegrationsInner2.equals(createFineTuningJobRequestIntegrationsInner1));
        System.assert(createFineTuningJobRequestIntegrationsInner1.equals(createFineTuningJobRequestIntegrationsInner1));
        System.assert(createFineTuningJobRequestIntegrationsInner3.equals(createFineTuningJobRequestIntegrationsInner4));
        System.assert(createFineTuningJobRequestIntegrationsInner4.equals(createFineTuningJobRequestIntegrationsInner3));
        System.assert(createFineTuningJobRequestIntegrationsInner3.equals(createFineTuningJobRequestIntegrationsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner1 = OASCreateFineTuningJobRequestIntegra.getExample();
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner2 = OASCreateFineTuningJobRequestIntegra.getExample();
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner3 = new OASCreateFineTuningJobRequestIntegra();
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner4 = new OASCreateFineTuningJobRequestIntegra();

        System.assert(createFineTuningJobRequestIntegrationsInner1.equals(createFineTuningJobRequestIntegrationsInner2));
        System.assert(createFineTuningJobRequestIntegrationsInner2.equals(createFineTuningJobRequestIntegrationsInner1));
        System.assert(createFineTuningJobRequestIntegrationsInner3.equals(createFineTuningJobRequestIntegrationsInner4));
        System.assert(createFineTuningJobRequestIntegrationsInner4.equals(createFineTuningJobRequestIntegrationsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner1 = OASCreateFineTuningJobRequestIntegra.getExample();
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner2 = new OASCreateFineTuningJobRequestIntegra();

        System.assertEquals(false, createFineTuningJobRequestIntegrationsInner1.equals('foo'));
        System.assertEquals(false, createFineTuningJobRequestIntegrationsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner1 = OASCreateFineTuningJobRequestIntegra.getExample();
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner2 = new OASCreateFineTuningJobRequestIntegra();
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner3;

        System.assertEquals(false, createFineTuningJobRequestIntegrationsInner1.equals(createFineTuningJobRequestIntegrationsInner3));
        System.assertEquals(false, createFineTuningJobRequestIntegrationsInner2.equals(createFineTuningJobRequestIntegrationsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner1 = OASCreateFineTuningJobRequestIntegra.getExample();
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner2 = new OASCreateFineTuningJobRequestIntegra();

        System.assertEquals(createFineTuningJobRequestIntegrationsInner1.hashCode(), createFineTuningJobRequestIntegrationsInner1.hashCode());
        System.assertEquals(createFineTuningJobRequestIntegrationsInner2.hashCode(), createFineTuningJobRequestIntegrationsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner1 = OASCreateFineTuningJobRequestIntegra.getExample();
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner2 = OASCreateFineTuningJobRequestIntegra.getExample();
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner3 = new OASCreateFineTuningJobRequestIntegra();
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner4 = new OASCreateFineTuningJobRequestIntegra();

        System.assert(createFineTuningJobRequestIntegrationsInner1.equals(createFineTuningJobRequestIntegrationsInner2));
        System.assert(createFineTuningJobRequestIntegrationsInner3.equals(createFineTuningJobRequestIntegrationsInner4));
        System.assertEquals(createFineTuningJobRequestIntegrationsInner1.hashCode(), createFineTuningJobRequestIntegrationsInner2.hashCode());
        System.assertEquals(createFineTuningJobRequestIntegrationsInner3.hashCode(), createFineTuningJobRequestIntegrationsInner4.hashCode());
    }
}
