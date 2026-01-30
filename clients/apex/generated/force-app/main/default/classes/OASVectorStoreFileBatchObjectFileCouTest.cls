@isTest
private class OASVectorStoreFileBatchObjectFileCouTest {
    @isTest
    private static void equalsSameInstance() {
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts1 = OASVectorStoreFileBatchObjectFileCou.getExample();
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts2 = vectorStoreFileBatchObjectFileCounts1;
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts3 = new OASVectorStoreFileBatchObjectFileCou();
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts4 = vectorStoreFileBatchObjectFileCounts3;

        System.assert(vectorStoreFileBatchObjectFileCounts1.equals(vectorStoreFileBatchObjectFileCounts2));
        System.assert(vectorStoreFileBatchObjectFileCounts2.equals(vectorStoreFileBatchObjectFileCounts1));
        System.assert(vectorStoreFileBatchObjectFileCounts1.equals(vectorStoreFileBatchObjectFileCounts1));
        System.assert(vectorStoreFileBatchObjectFileCounts3.equals(vectorStoreFileBatchObjectFileCounts4));
        System.assert(vectorStoreFileBatchObjectFileCounts4.equals(vectorStoreFileBatchObjectFileCounts3));
        System.assert(vectorStoreFileBatchObjectFileCounts3.equals(vectorStoreFileBatchObjectFileCounts3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts1 = OASVectorStoreFileBatchObjectFileCou.getExample();
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts2 = OASVectorStoreFileBatchObjectFileCou.getExample();
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts3 = new OASVectorStoreFileBatchObjectFileCou();
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts4 = new OASVectorStoreFileBatchObjectFileCou();

        System.assert(vectorStoreFileBatchObjectFileCounts1.equals(vectorStoreFileBatchObjectFileCounts2));
        System.assert(vectorStoreFileBatchObjectFileCounts2.equals(vectorStoreFileBatchObjectFileCounts1));
        System.assert(vectorStoreFileBatchObjectFileCounts3.equals(vectorStoreFileBatchObjectFileCounts4));
        System.assert(vectorStoreFileBatchObjectFileCounts4.equals(vectorStoreFileBatchObjectFileCounts3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts1 = OASVectorStoreFileBatchObjectFileCou.getExample();
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts2 = new OASVectorStoreFileBatchObjectFileCou();

        System.assertEquals(false, vectorStoreFileBatchObjectFileCounts1.equals('foo'));
        System.assertEquals(false, vectorStoreFileBatchObjectFileCounts2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts1 = OASVectorStoreFileBatchObjectFileCou.getExample();
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts2 = new OASVectorStoreFileBatchObjectFileCou();
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts3;

        System.assertEquals(false, vectorStoreFileBatchObjectFileCounts1.equals(vectorStoreFileBatchObjectFileCounts3));
        System.assertEquals(false, vectorStoreFileBatchObjectFileCounts2.equals(vectorStoreFileBatchObjectFileCounts3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts1 = OASVectorStoreFileBatchObjectFileCou.getExample();
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts2 = new OASVectorStoreFileBatchObjectFileCou();

        System.assertEquals(vectorStoreFileBatchObjectFileCounts1.hashCode(), vectorStoreFileBatchObjectFileCounts1.hashCode());
        System.assertEquals(vectorStoreFileBatchObjectFileCounts2.hashCode(), vectorStoreFileBatchObjectFileCounts2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts1 = OASVectorStoreFileBatchObjectFileCou.getExample();
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts2 = OASVectorStoreFileBatchObjectFileCou.getExample();
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts3 = new OASVectorStoreFileBatchObjectFileCou();
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts4 = new OASVectorStoreFileBatchObjectFileCou();

        System.assert(vectorStoreFileBatchObjectFileCounts1.equals(vectorStoreFileBatchObjectFileCounts2));
        System.assert(vectorStoreFileBatchObjectFileCounts3.equals(vectorStoreFileBatchObjectFileCounts4));
        System.assertEquals(vectorStoreFileBatchObjectFileCounts1.hashCode(), vectorStoreFileBatchObjectFileCounts2.hashCode());
        System.assertEquals(vectorStoreFileBatchObjectFileCounts3.hashCode(), vectorStoreFileBatchObjectFileCounts4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVectorStoreFileBatchObjectFileCou vectorStoreFileBatchObjectFileCounts = new OASVectorStoreFileBatchObjectFileCou();
        Map<String, String> x-property-mappings = vectorStoreFileBatchObjectFileCounts.getx-property-mappings();
        System.assertEquals('inProgress', x-property-mappings.get('in_progress'));
    }
}
