@isTest
private class OASCreateMessageRequestContentTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateMessageRequestContent createMessageRequestContent1 = OASCreateMessageRequestContent.getExample();
        OASCreateMessageRequestContent createMessageRequestContent2 = createMessageRequestContent1;
        OASCreateMessageRequestContent createMessageRequestContent3 = new OASCreateMessageRequestContent();
        OASCreateMessageRequestContent createMessageRequestContent4 = createMessageRequestContent3;

        System.assert(createMessageRequestContent1.equals(createMessageRequestContent2));
        System.assert(createMessageRequestContent2.equals(createMessageRequestContent1));
        System.assert(createMessageRequestContent1.equals(createMessageRequestContent1));
        System.assert(createMessageRequestContent3.equals(createMessageRequestContent4));
        System.assert(createMessageRequestContent4.equals(createMessageRequestContent3));
        System.assert(createMessageRequestContent3.equals(createMessageRequestContent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateMessageRequestContent createMessageRequestContent1 = OASCreateMessageRequestContent.getExample();
        OASCreateMessageRequestContent createMessageRequestContent2 = OASCreateMessageRequestContent.getExample();
        OASCreateMessageRequestContent createMessageRequestContent3 = new OASCreateMessageRequestContent();
        OASCreateMessageRequestContent createMessageRequestContent4 = new OASCreateMessageRequestContent();

        System.assert(createMessageRequestContent1.equals(createMessageRequestContent2));
        System.assert(createMessageRequestContent2.equals(createMessageRequestContent1));
        System.assert(createMessageRequestContent3.equals(createMessageRequestContent4));
        System.assert(createMessageRequestContent4.equals(createMessageRequestContent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateMessageRequestContent createMessageRequestContent1 = OASCreateMessageRequestContent.getExample();
        OASCreateMessageRequestContent createMessageRequestContent2 = new OASCreateMessageRequestContent();

        System.assertEquals(false, createMessageRequestContent1.equals('foo'));
        System.assertEquals(false, createMessageRequestContent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateMessageRequestContent createMessageRequestContent1 = OASCreateMessageRequestContent.getExample();
        OASCreateMessageRequestContent createMessageRequestContent2 = new OASCreateMessageRequestContent();
        OASCreateMessageRequestContent createMessageRequestContent3;

        System.assertEquals(false, createMessageRequestContent1.equals(createMessageRequestContent3));
        System.assertEquals(false, createMessageRequestContent2.equals(createMessageRequestContent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateMessageRequestContent createMessageRequestContent1 = OASCreateMessageRequestContent.getExample();
        OASCreateMessageRequestContent createMessageRequestContent2 = new OASCreateMessageRequestContent();

        System.assertEquals(createMessageRequestContent1.hashCode(), createMessageRequestContent1.hashCode());
        System.assertEquals(createMessageRequestContent2.hashCode(), createMessageRequestContent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateMessageRequestContent createMessageRequestContent1 = OASCreateMessageRequestContent.getExample();
        OASCreateMessageRequestContent createMessageRequestContent2 = OASCreateMessageRequestContent.getExample();
        OASCreateMessageRequestContent createMessageRequestContent3 = new OASCreateMessageRequestContent();
        OASCreateMessageRequestContent createMessageRequestContent4 = new OASCreateMessageRequestContent();

        System.assert(createMessageRequestContent1.equals(createMessageRequestContent2));
        System.assert(createMessageRequestContent3.equals(createMessageRequestContent4));
        System.assertEquals(createMessageRequestContent1.hashCode(), createMessageRequestContent2.hashCode());
        System.assertEquals(createMessageRequestContent3.hashCode(), createMessageRequestContent4.hashCode());
    }
}
