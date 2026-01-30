@isTest
private class OASVectorStoreObjectFileCountsTest {
    @isTest
    private static void equalsSameInstance() {
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts1 = OASVectorStoreObjectFileCounts.getExample();
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts2 = vectorStoreObjectFileCounts1;
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts3 = new OASVectorStoreObjectFileCounts();
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts4 = vectorStoreObjectFileCounts3;

        System.assert(vectorStoreObjectFileCounts1.equals(vectorStoreObjectFileCounts2));
        System.assert(vectorStoreObjectFileCounts2.equals(vectorStoreObjectFileCounts1));
        System.assert(vectorStoreObjectFileCounts1.equals(vectorStoreObjectFileCounts1));
        System.assert(vectorStoreObjectFileCounts3.equals(vectorStoreObjectFileCounts4));
        System.assert(vectorStoreObjectFileCounts4.equals(vectorStoreObjectFileCounts3));
        System.assert(vectorStoreObjectFileCounts3.equals(vectorStoreObjectFileCounts3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts1 = OASVectorStoreObjectFileCounts.getExample();
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts2 = OASVectorStoreObjectFileCounts.getExample();
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts3 = new OASVectorStoreObjectFileCounts();
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts4 = new OASVectorStoreObjectFileCounts();

        System.assert(vectorStoreObjectFileCounts1.equals(vectorStoreObjectFileCounts2));
        System.assert(vectorStoreObjectFileCounts2.equals(vectorStoreObjectFileCounts1));
        System.assert(vectorStoreObjectFileCounts3.equals(vectorStoreObjectFileCounts4));
        System.assert(vectorStoreObjectFileCounts4.equals(vectorStoreObjectFileCounts3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts1 = OASVectorStoreObjectFileCounts.getExample();
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts2 = new OASVectorStoreObjectFileCounts();

        System.assertEquals(false, vectorStoreObjectFileCounts1.equals('foo'));
        System.assertEquals(false, vectorStoreObjectFileCounts2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts1 = OASVectorStoreObjectFileCounts.getExample();
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts2 = new OASVectorStoreObjectFileCounts();
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts3;

        System.assertEquals(false, vectorStoreObjectFileCounts1.equals(vectorStoreObjectFileCounts3));
        System.assertEquals(false, vectorStoreObjectFileCounts2.equals(vectorStoreObjectFileCounts3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts1 = OASVectorStoreObjectFileCounts.getExample();
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts2 = new OASVectorStoreObjectFileCounts();

        System.assertEquals(vectorStoreObjectFileCounts1.hashCode(), vectorStoreObjectFileCounts1.hashCode());
        System.assertEquals(vectorStoreObjectFileCounts2.hashCode(), vectorStoreObjectFileCounts2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts1 = OASVectorStoreObjectFileCounts.getExample();
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts2 = OASVectorStoreObjectFileCounts.getExample();
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts3 = new OASVectorStoreObjectFileCounts();
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts4 = new OASVectorStoreObjectFileCounts();

        System.assert(vectorStoreObjectFileCounts1.equals(vectorStoreObjectFileCounts2));
        System.assert(vectorStoreObjectFileCounts3.equals(vectorStoreObjectFileCounts4));
        System.assertEquals(vectorStoreObjectFileCounts1.hashCode(), vectorStoreObjectFileCounts2.hashCode());
        System.assertEquals(vectorStoreObjectFileCounts3.hashCode(), vectorStoreObjectFileCounts4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVectorStoreObjectFileCounts vectorStoreObjectFileCounts = new OASVectorStoreObjectFileCounts();
        Map<String, String> x-property-mappings = vectorStoreObjectFileCounts.getx-property-mappings();
        System.assertEquals('inProgress', x-property-mappings.get('in_progress'));
    }
}
