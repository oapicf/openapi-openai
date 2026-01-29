@isTest
private class OASCreateEmbeddingRequestInputTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput1 = OASCreateEmbeddingRequestInput.getExample();
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput2 = createEmbeddingRequestInput1;
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput3 = new OASCreateEmbeddingRequestInput();
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput4 = createEmbeddingRequestInput3;

        System.assert(createEmbeddingRequestInput1.equals(createEmbeddingRequestInput2));
        System.assert(createEmbeddingRequestInput2.equals(createEmbeddingRequestInput1));
        System.assert(createEmbeddingRequestInput1.equals(createEmbeddingRequestInput1));
        System.assert(createEmbeddingRequestInput3.equals(createEmbeddingRequestInput4));
        System.assert(createEmbeddingRequestInput4.equals(createEmbeddingRequestInput3));
        System.assert(createEmbeddingRequestInput3.equals(createEmbeddingRequestInput3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput1 = OASCreateEmbeddingRequestInput.getExample();
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput2 = OASCreateEmbeddingRequestInput.getExample();
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput3 = new OASCreateEmbeddingRequestInput();
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput4 = new OASCreateEmbeddingRequestInput();

        System.assert(createEmbeddingRequestInput1.equals(createEmbeddingRequestInput2));
        System.assert(createEmbeddingRequestInput2.equals(createEmbeddingRequestInput1));
        System.assert(createEmbeddingRequestInput3.equals(createEmbeddingRequestInput4));
        System.assert(createEmbeddingRequestInput4.equals(createEmbeddingRequestInput3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput1 = OASCreateEmbeddingRequestInput.getExample();
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput2 = new OASCreateEmbeddingRequestInput();

        System.assertEquals(false, createEmbeddingRequestInput1.equals('foo'));
        System.assertEquals(false, createEmbeddingRequestInput2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput1 = OASCreateEmbeddingRequestInput.getExample();
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput2 = new OASCreateEmbeddingRequestInput();
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput3;

        System.assertEquals(false, createEmbeddingRequestInput1.equals(createEmbeddingRequestInput3));
        System.assertEquals(false, createEmbeddingRequestInput2.equals(createEmbeddingRequestInput3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput1 = OASCreateEmbeddingRequestInput.getExample();
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput2 = new OASCreateEmbeddingRequestInput();

        System.assertEquals(createEmbeddingRequestInput1.hashCode(), createEmbeddingRequestInput1.hashCode());
        System.assertEquals(createEmbeddingRequestInput2.hashCode(), createEmbeddingRequestInput2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput1 = OASCreateEmbeddingRequestInput.getExample();
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput2 = OASCreateEmbeddingRequestInput.getExample();
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput3 = new OASCreateEmbeddingRequestInput();
        OASCreateEmbeddingRequestInput createEmbeddingRequestInput4 = new OASCreateEmbeddingRequestInput();

        System.assert(createEmbeddingRequestInput1.equals(createEmbeddingRequestInput2));
        System.assert(createEmbeddingRequestInput3.equals(createEmbeddingRequestInput4));
        System.assertEquals(createEmbeddingRequestInput1.hashCode(), createEmbeddingRequestInput2.hashCode());
        System.assertEquals(createEmbeddingRequestInput3.hashCode(), createEmbeddingRequestInput4.hashCode());
    }
}
