@isTest
private class OASChunkingStrategyRequestParamTest {
    @isTest
    private static void equalsSameInstance() {
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam1 = OASChunkingStrategyRequestParam.getExample();
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam2 = chunkingStrategyRequestParam1;
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam3 = new OASChunkingStrategyRequestParam();
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam4 = chunkingStrategyRequestParam3;

        System.assert(chunkingStrategyRequestParam1.equals(chunkingStrategyRequestParam2));
        System.assert(chunkingStrategyRequestParam2.equals(chunkingStrategyRequestParam1));
        System.assert(chunkingStrategyRequestParam1.equals(chunkingStrategyRequestParam1));
        System.assert(chunkingStrategyRequestParam3.equals(chunkingStrategyRequestParam4));
        System.assert(chunkingStrategyRequestParam4.equals(chunkingStrategyRequestParam3));
        System.assert(chunkingStrategyRequestParam3.equals(chunkingStrategyRequestParam3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam1 = OASChunkingStrategyRequestParam.getExample();
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam2 = OASChunkingStrategyRequestParam.getExample();
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam3 = new OASChunkingStrategyRequestParam();
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam4 = new OASChunkingStrategyRequestParam();

        System.assert(chunkingStrategyRequestParam1.equals(chunkingStrategyRequestParam2));
        System.assert(chunkingStrategyRequestParam2.equals(chunkingStrategyRequestParam1));
        System.assert(chunkingStrategyRequestParam3.equals(chunkingStrategyRequestParam4));
        System.assert(chunkingStrategyRequestParam4.equals(chunkingStrategyRequestParam3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam1 = OASChunkingStrategyRequestParam.getExample();
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam2 = new OASChunkingStrategyRequestParam();

        System.assertEquals(false, chunkingStrategyRequestParam1.equals('foo'));
        System.assertEquals(false, chunkingStrategyRequestParam2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam1 = OASChunkingStrategyRequestParam.getExample();
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam2 = new OASChunkingStrategyRequestParam();
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam3;

        System.assertEquals(false, chunkingStrategyRequestParam1.equals(chunkingStrategyRequestParam3));
        System.assertEquals(false, chunkingStrategyRequestParam2.equals(chunkingStrategyRequestParam3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam1 = OASChunkingStrategyRequestParam.getExample();
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam2 = new OASChunkingStrategyRequestParam();

        System.assertEquals(chunkingStrategyRequestParam1.hashCode(), chunkingStrategyRequestParam1.hashCode());
        System.assertEquals(chunkingStrategyRequestParam2.hashCode(), chunkingStrategyRequestParam2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam1 = OASChunkingStrategyRequestParam.getExample();
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam2 = OASChunkingStrategyRequestParam.getExample();
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam3 = new OASChunkingStrategyRequestParam();
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam4 = new OASChunkingStrategyRequestParam();

        System.assert(chunkingStrategyRequestParam1.equals(chunkingStrategyRequestParam2));
        System.assert(chunkingStrategyRequestParam3.equals(chunkingStrategyRequestParam4));
        System.assertEquals(chunkingStrategyRequestParam1.hashCode(), chunkingStrategyRequestParam2.hashCode());
        System.assertEquals(chunkingStrategyRequestParam3.hashCode(), chunkingStrategyRequestParam4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASChunkingStrategyRequestParam chunkingStrategyRequestParam = new OASChunkingStrategyRequestParam();
        Map<String, String> x-property-mappings = chunkingStrategyRequestParam.getx-property-mappings();
        System.assertEquals('r_static', x-property-mappings.get('static'));
    }
}
