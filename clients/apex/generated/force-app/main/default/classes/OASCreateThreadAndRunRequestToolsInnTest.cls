@isTest
private class OASCreateThreadAndRunRequestToolsInnTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner1 = OASCreateThreadAndRunRequestToolsInn.getExample();
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner2 = createThreadAndRunRequestToolsInner1;
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner3 = new OASCreateThreadAndRunRequestToolsInn();
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner4 = createThreadAndRunRequestToolsInner3;

        System.assert(createThreadAndRunRequestToolsInner1.equals(createThreadAndRunRequestToolsInner2));
        System.assert(createThreadAndRunRequestToolsInner2.equals(createThreadAndRunRequestToolsInner1));
        System.assert(createThreadAndRunRequestToolsInner1.equals(createThreadAndRunRequestToolsInner1));
        System.assert(createThreadAndRunRequestToolsInner3.equals(createThreadAndRunRequestToolsInner4));
        System.assert(createThreadAndRunRequestToolsInner4.equals(createThreadAndRunRequestToolsInner3));
        System.assert(createThreadAndRunRequestToolsInner3.equals(createThreadAndRunRequestToolsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner1 = OASCreateThreadAndRunRequestToolsInn.getExample();
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner2 = OASCreateThreadAndRunRequestToolsInn.getExample();
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner3 = new OASCreateThreadAndRunRequestToolsInn();
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner4 = new OASCreateThreadAndRunRequestToolsInn();

        System.assert(createThreadAndRunRequestToolsInner1.equals(createThreadAndRunRequestToolsInner2));
        System.assert(createThreadAndRunRequestToolsInner2.equals(createThreadAndRunRequestToolsInner1));
        System.assert(createThreadAndRunRequestToolsInner3.equals(createThreadAndRunRequestToolsInner4));
        System.assert(createThreadAndRunRequestToolsInner4.equals(createThreadAndRunRequestToolsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner1 = OASCreateThreadAndRunRequestToolsInn.getExample();
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner2 = new OASCreateThreadAndRunRequestToolsInn();

        System.assertEquals(false, createThreadAndRunRequestToolsInner1.equals('foo'));
        System.assertEquals(false, createThreadAndRunRequestToolsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner1 = OASCreateThreadAndRunRequestToolsInn.getExample();
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner2 = new OASCreateThreadAndRunRequestToolsInn();
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner3;

        System.assertEquals(false, createThreadAndRunRequestToolsInner1.equals(createThreadAndRunRequestToolsInner3));
        System.assertEquals(false, createThreadAndRunRequestToolsInner2.equals(createThreadAndRunRequestToolsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner1 = OASCreateThreadAndRunRequestToolsInn.getExample();
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner2 = new OASCreateThreadAndRunRequestToolsInn();

        System.assertEquals(createThreadAndRunRequestToolsInner1.hashCode(), createThreadAndRunRequestToolsInner1.hashCode());
        System.assertEquals(createThreadAndRunRequestToolsInner2.hashCode(), createThreadAndRunRequestToolsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner1 = OASCreateThreadAndRunRequestToolsInn.getExample();
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner2 = OASCreateThreadAndRunRequestToolsInn.getExample();
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner3 = new OASCreateThreadAndRunRequestToolsInn();
        OASCreateThreadAndRunRequestToolsInn createThreadAndRunRequestToolsInner4 = new OASCreateThreadAndRunRequestToolsInn();

        System.assert(createThreadAndRunRequestToolsInner1.equals(createThreadAndRunRequestToolsInner2));
        System.assert(createThreadAndRunRequestToolsInner3.equals(createThreadAndRunRequestToolsInner4));
        System.assertEquals(createThreadAndRunRequestToolsInner1.hashCode(), createThreadAndRunRequestToolsInner2.hashCode());
        System.assertEquals(createThreadAndRunRequestToolsInner3.hashCode(), createThreadAndRunRequestToolsInner4.hashCode());
    }
}
