@isTest
private class OASVectorStoreExpirationAfterTest {
    @isTest
    private static void equalsSameInstance() {
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter1 = OASVectorStoreExpirationAfter.getExample();
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter2 = vectorStoreExpirationAfter1;
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter3 = new OASVectorStoreExpirationAfter();
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter4 = vectorStoreExpirationAfter3;

        System.assert(vectorStoreExpirationAfter1.equals(vectorStoreExpirationAfter2));
        System.assert(vectorStoreExpirationAfter2.equals(vectorStoreExpirationAfter1));
        System.assert(vectorStoreExpirationAfter1.equals(vectorStoreExpirationAfter1));
        System.assert(vectorStoreExpirationAfter3.equals(vectorStoreExpirationAfter4));
        System.assert(vectorStoreExpirationAfter4.equals(vectorStoreExpirationAfter3));
        System.assert(vectorStoreExpirationAfter3.equals(vectorStoreExpirationAfter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter1 = OASVectorStoreExpirationAfter.getExample();
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter2 = OASVectorStoreExpirationAfter.getExample();
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter3 = new OASVectorStoreExpirationAfter();
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter4 = new OASVectorStoreExpirationAfter();

        System.assert(vectorStoreExpirationAfter1.equals(vectorStoreExpirationAfter2));
        System.assert(vectorStoreExpirationAfter2.equals(vectorStoreExpirationAfter1));
        System.assert(vectorStoreExpirationAfter3.equals(vectorStoreExpirationAfter4));
        System.assert(vectorStoreExpirationAfter4.equals(vectorStoreExpirationAfter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter1 = OASVectorStoreExpirationAfter.getExample();
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter2 = new OASVectorStoreExpirationAfter();

        System.assertEquals(false, vectorStoreExpirationAfter1.equals('foo'));
        System.assertEquals(false, vectorStoreExpirationAfter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter1 = OASVectorStoreExpirationAfter.getExample();
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter2 = new OASVectorStoreExpirationAfter();
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter3;

        System.assertEquals(false, vectorStoreExpirationAfter1.equals(vectorStoreExpirationAfter3));
        System.assertEquals(false, vectorStoreExpirationAfter2.equals(vectorStoreExpirationAfter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter1 = OASVectorStoreExpirationAfter.getExample();
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter2 = new OASVectorStoreExpirationAfter();

        System.assertEquals(vectorStoreExpirationAfter1.hashCode(), vectorStoreExpirationAfter1.hashCode());
        System.assertEquals(vectorStoreExpirationAfter2.hashCode(), vectorStoreExpirationAfter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter1 = OASVectorStoreExpirationAfter.getExample();
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter2 = OASVectorStoreExpirationAfter.getExample();
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter3 = new OASVectorStoreExpirationAfter();
        OASVectorStoreExpirationAfter vectorStoreExpirationAfter4 = new OASVectorStoreExpirationAfter();

        System.assert(vectorStoreExpirationAfter1.equals(vectorStoreExpirationAfter2));
        System.assert(vectorStoreExpirationAfter3.equals(vectorStoreExpirationAfter4));
        System.assertEquals(vectorStoreExpirationAfter1.hashCode(), vectorStoreExpirationAfter2.hashCode());
        System.assertEquals(vectorStoreExpirationAfter3.hashCode(), vectorStoreExpirationAfter4.hashCode());
    }
}
