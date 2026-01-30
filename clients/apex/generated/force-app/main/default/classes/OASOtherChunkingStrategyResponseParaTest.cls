@isTest
private class OASOtherChunkingStrategyResponseParaTest {
    @isTest
    private static void equalsSameInstance() {
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam1 = OASOtherChunkingStrategyResponsePara.getExample();
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam2 = otherChunkingStrategyResponseParam1;
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam3 = new OASOtherChunkingStrategyResponsePara();
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam4 = otherChunkingStrategyResponseParam3;

        System.assert(otherChunkingStrategyResponseParam1.equals(otherChunkingStrategyResponseParam2));
        System.assert(otherChunkingStrategyResponseParam2.equals(otherChunkingStrategyResponseParam1));
        System.assert(otherChunkingStrategyResponseParam1.equals(otherChunkingStrategyResponseParam1));
        System.assert(otherChunkingStrategyResponseParam3.equals(otherChunkingStrategyResponseParam4));
        System.assert(otherChunkingStrategyResponseParam4.equals(otherChunkingStrategyResponseParam3));
        System.assert(otherChunkingStrategyResponseParam3.equals(otherChunkingStrategyResponseParam3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam1 = OASOtherChunkingStrategyResponsePara.getExample();
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam2 = OASOtherChunkingStrategyResponsePara.getExample();
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam3 = new OASOtherChunkingStrategyResponsePara();
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam4 = new OASOtherChunkingStrategyResponsePara();

        System.assert(otherChunkingStrategyResponseParam1.equals(otherChunkingStrategyResponseParam2));
        System.assert(otherChunkingStrategyResponseParam2.equals(otherChunkingStrategyResponseParam1));
        System.assert(otherChunkingStrategyResponseParam3.equals(otherChunkingStrategyResponseParam4));
        System.assert(otherChunkingStrategyResponseParam4.equals(otherChunkingStrategyResponseParam3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam1 = OASOtherChunkingStrategyResponsePara.getExample();
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam2 = new OASOtherChunkingStrategyResponsePara();

        System.assertEquals(false, otherChunkingStrategyResponseParam1.equals('foo'));
        System.assertEquals(false, otherChunkingStrategyResponseParam2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam1 = OASOtherChunkingStrategyResponsePara.getExample();
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam2 = new OASOtherChunkingStrategyResponsePara();
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam3;

        System.assertEquals(false, otherChunkingStrategyResponseParam1.equals(otherChunkingStrategyResponseParam3));
        System.assertEquals(false, otherChunkingStrategyResponseParam2.equals(otherChunkingStrategyResponseParam3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam1 = OASOtherChunkingStrategyResponsePara.getExample();
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam2 = new OASOtherChunkingStrategyResponsePara();

        System.assertEquals(otherChunkingStrategyResponseParam1.hashCode(), otherChunkingStrategyResponseParam1.hashCode());
        System.assertEquals(otherChunkingStrategyResponseParam2.hashCode(), otherChunkingStrategyResponseParam2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam1 = OASOtherChunkingStrategyResponsePara.getExample();
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam2 = OASOtherChunkingStrategyResponsePara.getExample();
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam3 = new OASOtherChunkingStrategyResponsePara();
        OASOtherChunkingStrategyResponsePara otherChunkingStrategyResponseParam4 = new OASOtherChunkingStrategyResponsePara();

        System.assert(otherChunkingStrategyResponseParam1.equals(otherChunkingStrategyResponseParam2));
        System.assert(otherChunkingStrategyResponseParam3.equals(otherChunkingStrategyResponseParam4));
        System.assertEquals(otherChunkingStrategyResponseParam1.hashCode(), otherChunkingStrategyResponseParam2.hashCode());
        System.assertEquals(otherChunkingStrategyResponseParam3.hashCode(), otherChunkingStrategyResponseParam4.hashCode());
    }
}
