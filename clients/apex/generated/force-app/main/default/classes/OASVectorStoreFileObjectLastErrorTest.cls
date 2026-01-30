@isTest
private class OASVectorStoreFileObjectLastErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError1 = OASVectorStoreFileObjectLastError.getExample();
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError2 = vectorStoreFileObjectLastError1;
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError3 = new OASVectorStoreFileObjectLastError();
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError4 = vectorStoreFileObjectLastError3;

        System.assert(vectorStoreFileObjectLastError1.equals(vectorStoreFileObjectLastError2));
        System.assert(vectorStoreFileObjectLastError2.equals(vectorStoreFileObjectLastError1));
        System.assert(vectorStoreFileObjectLastError1.equals(vectorStoreFileObjectLastError1));
        System.assert(vectorStoreFileObjectLastError3.equals(vectorStoreFileObjectLastError4));
        System.assert(vectorStoreFileObjectLastError4.equals(vectorStoreFileObjectLastError3));
        System.assert(vectorStoreFileObjectLastError3.equals(vectorStoreFileObjectLastError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError1 = OASVectorStoreFileObjectLastError.getExample();
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError2 = OASVectorStoreFileObjectLastError.getExample();
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError3 = new OASVectorStoreFileObjectLastError();
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError4 = new OASVectorStoreFileObjectLastError();

        System.assert(vectorStoreFileObjectLastError1.equals(vectorStoreFileObjectLastError2));
        System.assert(vectorStoreFileObjectLastError2.equals(vectorStoreFileObjectLastError1));
        System.assert(vectorStoreFileObjectLastError3.equals(vectorStoreFileObjectLastError4));
        System.assert(vectorStoreFileObjectLastError4.equals(vectorStoreFileObjectLastError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError1 = OASVectorStoreFileObjectLastError.getExample();
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError2 = new OASVectorStoreFileObjectLastError();

        System.assertEquals(false, vectorStoreFileObjectLastError1.equals('foo'));
        System.assertEquals(false, vectorStoreFileObjectLastError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError1 = OASVectorStoreFileObjectLastError.getExample();
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError2 = new OASVectorStoreFileObjectLastError();
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError3;

        System.assertEquals(false, vectorStoreFileObjectLastError1.equals(vectorStoreFileObjectLastError3));
        System.assertEquals(false, vectorStoreFileObjectLastError2.equals(vectorStoreFileObjectLastError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError1 = OASVectorStoreFileObjectLastError.getExample();
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError2 = new OASVectorStoreFileObjectLastError();

        System.assertEquals(vectorStoreFileObjectLastError1.hashCode(), vectorStoreFileObjectLastError1.hashCode());
        System.assertEquals(vectorStoreFileObjectLastError2.hashCode(), vectorStoreFileObjectLastError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError1 = OASVectorStoreFileObjectLastError.getExample();
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError2 = OASVectorStoreFileObjectLastError.getExample();
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError3 = new OASVectorStoreFileObjectLastError();
        OASVectorStoreFileObjectLastError vectorStoreFileObjectLastError4 = new OASVectorStoreFileObjectLastError();

        System.assert(vectorStoreFileObjectLastError1.equals(vectorStoreFileObjectLastError2));
        System.assert(vectorStoreFileObjectLastError3.equals(vectorStoreFileObjectLastError4));
        System.assertEquals(vectorStoreFileObjectLastError1.hashCode(), vectorStoreFileObjectLastError2.hashCode());
        System.assertEquals(vectorStoreFileObjectLastError3.hashCode(), vectorStoreFileObjectLastError4.hashCode());
    }
}
