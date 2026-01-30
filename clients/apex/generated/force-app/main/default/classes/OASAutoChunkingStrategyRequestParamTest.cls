@isTest
private class OASAutoChunkingStrategyRequestParamTest {
    @isTest
    private static void equalsSameInstance() {
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam1 = OASAutoChunkingStrategyRequestParam.getExample();
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam2 = autoChunkingStrategyRequestParam1;
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam3 = new OASAutoChunkingStrategyRequestParam();
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam4 = autoChunkingStrategyRequestParam3;

        System.assert(autoChunkingStrategyRequestParam1.equals(autoChunkingStrategyRequestParam2));
        System.assert(autoChunkingStrategyRequestParam2.equals(autoChunkingStrategyRequestParam1));
        System.assert(autoChunkingStrategyRequestParam1.equals(autoChunkingStrategyRequestParam1));
        System.assert(autoChunkingStrategyRequestParam3.equals(autoChunkingStrategyRequestParam4));
        System.assert(autoChunkingStrategyRequestParam4.equals(autoChunkingStrategyRequestParam3));
        System.assert(autoChunkingStrategyRequestParam3.equals(autoChunkingStrategyRequestParam3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam1 = OASAutoChunkingStrategyRequestParam.getExample();
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam2 = OASAutoChunkingStrategyRequestParam.getExample();
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam3 = new OASAutoChunkingStrategyRequestParam();
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam4 = new OASAutoChunkingStrategyRequestParam();

        System.assert(autoChunkingStrategyRequestParam1.equals(autoChunkingStrategyRequestParam2));
        System.assert(autoChunkingStrategyRequestParam2.equals(autoChunkingStrategyRequestParam1));
        System.assert(autoChunkingStrategyRequestParam3.equals(autoChunkingStrategyRequestParam4));
        System.assert(autoChunkingStrategyRequestParam4.equals(autoChunkingStrategyRequestParam3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam1 = OASAutoChunkingStrategyRequestParam.getExample();
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam2 = new OASAutoChunkingStrategyRequestParam();

        System.assertEquals(false, autoChunkingStrategyRequestParam1.equals('foo'));
        System.assertEquals(false, autoChunkingStrategyRequestParam2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam1 = OASAutoChunkingStrategyRequestParam.getExample();
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam2 = new OASAutoChunkingStrategyRequestParam();
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam3;

        System.assertEquals(false, autoChunkingStrategyRequestParam1.equals(autoChunkingStrategyRequestParam3));
        System.assertEquals(false, autoChunkingStrategyRequestParam2.equals(autoChunkingStrategyRequestParam3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam1 = OASAutoChunkingStrategyRequestParam.getExample();
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam2 = new OASAutoChunkingStrategyRequestParam();

        System.assertEquals(autoChunkingStrategyRequestParam1.hashCode(), autoChunkingStrategyRequestParam1.hashCode());
        System.assertEquals(autoChunkingStrategyRequestParam2.hashCode(), autoChunkingStrategyRequestParam2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam1 = OASAutoChunkingStrategyRequestParam.getExample();
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam2 = OASAutoChunkingStrategyRequestParam.getExample();
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam3 = new OASAutoChunkingStrategyRequestParam();
        OASAutoChunkingStrategyRequestParam autoChunkingStrategyRequestParam4 = new OASAutoChunkingStrategyRequestParam();

        System.assert(autoChunkingStrategyRequestParam1.equals(autoChunkingStrategyRequestParam2));
        System.assert(autoChunkingStrategyRequestParam3.equals(autoChunkingStrategyRequestParam4));
        System.assertEquals(autoChunkingStrategyRequestParam1.hashCode(), autoChunkingStrategyRequestParam2.hashCode());
        System.assertEquals(autoChunkingStrategyRequestParam3.hashCode(), autoChunkingStrategyRequestParam4.hashCode());
    }
}
