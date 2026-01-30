@isTest
private class OASStaticChunkingStrategyResponseParTest {
    @isTest
    private static void equalsSameInstance() {
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam1 = OASStaticChunkingStrategyResponsePar.getExample();
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam2 = staticChunkingStrategyResponseParam1;
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam3 = new OASStaticChunkingStrategyResponsePar();
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam4 = staticChunkingStrategyResponseParam3;

        System.assert(staticChunkingStrategyResponseParam1.equals(staticChunkingStrategyResponseParam2));
        System.assert(staticChunkingStrategyResponseParam2.equals(staticChunkingStrategyResponseParam1));
        System.assert(staticChunkingStrategyResponseParam1.equals(staticChunkingStrategyResponseParam1));
        System.assert(staticChunkingStrategyResponseParam3.equals(staticChunkingStrategyResponseParam4));
        System.assert(staticChunkingStrategyResponseParam4.equals(staticChunkingStrategyResponseParam3));
        System.assert(staticChunkingStrategyResponseParam3.equals(staticChunkingStrategyResponseParam3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam1 = OASStaticChunkingStrategyResponsePar.getExample();
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam2 = OASStaticChunkingStrategyResponsePar.getExample();
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam3 = new OASStaticChunkingStrategyResponsePar();
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam4 = new OASStaticChunkingStrategyResponsePar();

        System.assert(staticChunkingStrategyResponseParam1.equals(staticChunkingStrategyResponseParam2));
        System.assert(staticChunkingStrategyResponseParam2.equals(staticChunkingStrategyResponseParam1));
        System.assert(staticChunkingStrategyResponseParam3.equals(staticChunkingStrategyResponseParam4));
        System.assert(staticChunkingStrategyResponseParam4.equals(staticChunkingStrategyResponseParam3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam1 = OASStaticChunkingStrategyResponsePar.getExample();
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam2 = new OASStaticChunkingStrategyResponsePar();

        System.assertEquals(false, staticChunkingStrategyResponseParam1.equals('foo'));
        System.assertEquals(false, staticChunkingStrategyResponseParam2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam1 = OASStaticChunkingStrategyResponsePar.getExample();
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam2 = new OASStaticChunkingStrategyResponsePar();
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam3;

        System.assertEquals(false, staticChunkingStrategyResponseParam1.equals(staticChunkingStrategyResponseParam3));
        System.assertEquals(false, staticChunkingStrategyResponseParam2.equals(staticChunkingStrategyResponseParam3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam1 = OASStaticChunkingStrategyResponsePar.getExample();
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam2 = new OASStaticChunkingStrategyResponsePar();

        System.assertEquals(staticChunkingStrategyResponseParam1.hashCode(), staticChunkingStrategyResponseParam1.hashCode());
        System.assertEquals(staticChunkingStrategyResponseParam2.hashCode(), staticChunkingStrategyResponseParam2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam1 = OASStaticChunkingStrategyResponsePar.getExample();
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam2 = OASStaticChunkingStrategyResponsePar.getExample();
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam3 = new OASStaticChunkingStrategyResponsePar();
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam4 = new OASStaticChunkingStrategyResponsePar();

        System.assert(staticChunkingStrategyResponseParam1.equals(staticChunkingStrategyResponseParam2));
        System.assert(staticChunkingStrategyResponseParam3.equals(staticChunkingStrategyResponseParam4));
        System.assertEquals(staticChunkingStrategyResponseParam1.hashCode(), staticChunkingStrategyResponseParam2.hashCode());
        System.assertEquals(staticChunkingStrategyResponseParam3.hashCode(), staticChunkingStrategyResponseParam4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASStaticChunkingStrategyResponsePar staticChunkingStrategyResponseParam = new OASStaticChunkingStrategyResponsePar();
        Map<String, String> x-property-mappings = staticChunkingStrategyResponseParam.getx-property-mappings();
        System.assertEquals('r_static', x-property-mappings.get('static'));
    }
}
