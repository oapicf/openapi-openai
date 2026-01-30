@isTest
private class OASAutoChunkingStrategyTest {
    @isTest
    private static void equalsSameInstance() {
        OASAutoChunkingStrategy autoChunkingStrategy1 = OASAutoChunkingStrategy.getExample();
        OASAutoChunkingStrategy autoChunkingStrategy2 = autoChunkingStrategy1;
        OASAutoChunkingStrategy autoChunkingStrategy3 = new OASAutoChunkingStrategy();
        OASAutoChunkingStrategy autoChunkingStrategy4 = autoChunkingStrategy3;

        System.assert(autoChunkingStrategy1.equals(autoChunkingStrategy2));
        System.assert(autoChunkingStrategy2.equals(autoChunkingStrategy1));
        System.assert(autoChunkingStrategy1.equals(autoChunkingStrategy1));
        System.assert(autoChunkingStrategy3.equals(autoChunkingStrategy4));
        System.assert(autoChunkingStrategy4.equals(autoChunkingStrategy3));
        System.assert(autoChunkingStrategy3.equals(autoChunkingStrategy3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAutoChunkingStrategy autoChunkingStrategy1 = OASAutoChunkingStrategy.getExample();
        OASAutoChunkingStrategy autoChunkingStrategy2 = OASAutoChunkingStrategy.getExample();
        OASAutoChunkingStrategy autoChunkingStrategy3 = new OASAutoChunkingStrategy();
        OASAutoChunkingStrategy autoChunkingStrategy4 = new OASAutoChunkingStrategy();

        System.assert(autoChunkingStrategy1.equals(autoChunkingStrategy2));
        System.assert(autoChunkingStrategy2.equals(autoChunkingStrategy1));
        System.assert(autoChunkingStrategy3.equals(autoChunkingStrategy4));
        System.assert(autoChunkingStrategy4.equals(autoChunkingStrategy3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAutoChunkingStrategy autoChunkingStrategy1 = OASAutoChunkingStrategy.getExample();
        OASAutoChunkingStrategy autoChunkingStrategy2 = new OASAutoChunkingStrategy();

        System.assertEquals(false, autoChunkingStrategy1.equals('foo'));
        System.assertEquals(false, autoChunkingStrategy2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAutoChunkingStrategy autoChunkingStrategy1 = OASAutoChunkingStrategy.getExample();
        OASAutoChunkingStrategy autoChunkingStrategy2 = new OASAutoChunkingStrategy();
        OASAutoChunkingStrategy autoChunkingStrategy3;

        System.assertEquals(false, autoChunkingStrategy1.equals(autoChunkingStrategy3));
        System.assertEquals(false, autoChunkingStrategy2.equals(autoChunkingStrategy3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAutoChunkingStrategy autoChunkingStrategy1 = OASAutoChunkingStrategy.getExample();
        OASAutoChunkingStrategy autoChunkingStrategy2 = new OASAutoChunkingStrategy();

        System.assertEquals(autoChunkingStrategy1.hashCode(), autoChunkingStrategy1.hashCode());
        System.assertEquals(autoChunkingStrategy2.hashCode(), autoChunkingStrategy2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAutoChunkingStrategy autoChunkingStrategy1 = OASAutoChunkingStrategy.getExample();
        OASAutoChunkingStrategy autoChunkingStrategy2 = OASAutoChunkingStrategy.getExample();
        OASAutoChunkingStrategy autoChunkingStrategy3 = new OASAutoChunkingStrategy();
        OASAutoChunkingStrategy autoChunkingStrategy4 = new OASAutoChunkingStrategy();

        System.assert(autoChunkingStrategy1.equals(autoChunkingStrategy2));
        System.assert(autoChunkingStrategy3.equals(autoChunkingStrategy4));
        System.assertEquals(autoChunkingStrategy1.hashCode(), autoChunkingStrategy2.hashCode());
        System.assertEquals(autoChunkingStrategy3.hashCode(), autoChunkingStrategy4.hashCode());
    }
}
