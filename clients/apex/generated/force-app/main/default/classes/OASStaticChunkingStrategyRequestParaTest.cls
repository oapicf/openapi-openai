@isTest
private class OASStaticChunkingStrategyRequestParaTest {
    @isTest
    private static void equalsSameInstance() {
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam1 = OASStaticChunkingStrategyRequestPara.getExample();
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam2 = staticChunkingStrategyRequestParam1;
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam3 = new OASStaticChunkingStrategyRequestPara();
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam4 = staticChunkingStrategyRequestParam3;

        System.assert(staticChunkingStrategyRequestParam1.equals(staticChunkingStrategyRequestParam2));
        System.assert(staticChunkingStrategyRequestParam2.equals(staticChunkingStrategyRequestParam1));
        System.assert(staticChunkingStrategyRequestParam1.equals(staticChunkingStrategyRequestParam1));
        System.assert(staticChunkingStrategyRequestParam3.equals(staticChunkingStrategyRequestParam4));
        System.assert(staticChunkingStrategyRequestParam4.equals(staticChunkingStrategyRequestParam3));
        System.assert(staticChunkingStrategyRequestParam3.equals(staticChunkingStrategyRequestParam3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam1 = OASStaticChunkingStrategyRequestPara.getExample();
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam2 = OASStaticChunkingStrategyRequestPara.getExample();
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam3 = new OASStaticChunkingStrategyRequestPara();
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam4 = new OASStaticChunkingStrategyRequestPara();

        System.assert(staticChunkingStrategyRequestParam1.equals(staticChunkingStrategyRequestParam2));
        System.assert(staticChunkingStrategyRequestParam2.equals(staticChunkingStrategyRequestParam1));
        System.assert(staticChunkingStrategyRequestParam3.equals(staticChunkingStrategyRequestParam4));
        System.assert(staticChunkingStrategyRequestParam4.equals(staticChunkingStrategyRequestParam3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam1 = OASStaticChunkingStrategyRequestPara.getExample();
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam2 = new OASStaticChunkingStrategyRequestPara();

        System.assertEquals(false, staticChunkingStrategyRequestParam1.equals('foo'));
        System.assertEquals(false, staticChunkingStrategyRequestParam2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam1 = OASStaticChunkingStrategyRequestPara.getExample();
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam2 = new OASStaticChunkingStrategyRequestPara();
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam3;

        System.assertEquals(false, staticChunkingStrategyRequestParam1.equals(staticChunkingStrategyRequestParam3));
        System.assertEquals(false, staticChunkingStrategyRequestParam2.equals(staticChunkingStrategyRequestParam3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam1 = OASStaticChunkingStrategyRequestPara.getExample();
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam2 = new OASStaticChunkingStrategyRequestPara();

        System.assertEquals(staticChunkingStrategyRequestParam1.hashCode(), staticChunkingStrategyRequestParam1.hashCode());
        System.assertEquals(staticChunkingStrategyRequestParam2.hashCode(), staticChunkingStrategyRequestParam2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam1 = OASStaticChunkingStrategyRequestPara.getExample();
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam2 = OASStaticChunkingStrategyRequestPara.getExample();
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam3 = new OASStaticChunkingStrategyRequestPara();
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam4 = new OASStaticChunkingStrategyRequestPara();

        System.assert(staticChunkingStrategyRequestParam1.equals(staticChunkingStrategyRequestParam2));
        System.assert(staticChunkingStrategyRequestParam3.equals(staticChunkingStrategyRequestParam4));
        System.assertEquals(staticChunkingStrategyRequestParam1.hashCode(), staticChunkingStrategyRequestParam2.hashCode());
        System.assertEquals(staticChunkingStrategyRequestParam3.hashCode(), staticChunkingStrategyRequestParam4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASStaticChunkingStrategyRequestPara staticChunkingStrategyRequestParam = new OASStaticChunkingStrategyRequestPara();
        Map<String, String> x-property-mappings = staticChunkingStrategyRequestParam.getx-property-mappings();
        System.assertEquals('r_static', x-property-mappings.get('static'));
    }
}
