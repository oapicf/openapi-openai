@isTest
private class OASCreateMessageRequestAttachmentsInTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner1 = OASCreateMessageRequestAttachmentsIn.getExample();
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner2 = createMessageRequestAttachmentsInner1;
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner3 = new OASCreateMessageRequestAttachmentsIn();
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner4 = createMessageRequestAttachmentsInner3;

        System.assert(createMessageRequestAttachmentsInner1.equals(createMessageRequestAttachmentsInner2));
        System.assert(createMessageRequestAttachmentsInner2.equals(createMessageRequestAttachmentsInner1));
        System.assert(createMessageRequestAttachmentsInner1.equals(createMessageRequestAttachmentsInner1));
        System.assert(createMessageRequestAttachmentsInner3.equals(createMessageRequestAttachmentsInner4));
        System.assert(createMessageRequestAttachmentsInner4.equals(createMessageRequestAttachmentsInner3));
        System.assert(createMessageRequestAttachmentsInner3.equals(createMessageRequestAttachmentsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner1 = OASCreateMessageRequestAttachmentsIn.getExample();
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner2 = OASCreateMessageRequestAttachmentsIn.getExample();
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner3 = new OASCreateMessageRequestAttachmentsIn();
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner4 = new OASCreateMessageRequestAttachmentsIn();

        System.assert(createMessageRequestAttachmentsInner1.equals(createMessageRequestAttachmentsInner2));
        System.assert(createMessageRequestAttachmentsInner2.equals(createMessageRequestAttachmentsInner1));
        System.assert(createMessageRequestAttachmentsInner3.equals(createMessageRequestAttachmentsInner4));
        System.assert(createMessageRequestAttachmentsInner4.equals(createMessageRequestAttachmentsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner1 = OASCreateMessageRequestAttachmentsIn.getExample();
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner2 = new OASCreateMessageRequestAttachmentsIn();

        System.assertEquals(false, createMessageRequestAttachmentsInner1.equals('foo'));
        System.assertEquals(false, createMessageRequestAttachmentsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner1 = OASCreateMessageRequestAttachmentsIn.getExample();
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner2 = new OASCreateMessageRequestAttachmentsIn();
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner3;

        System.assertEquals(false, createMessageRequestAttachmentsInner1.equals(createMessageRequestAttachmentsInner3));
        System.assertEquals(false, createMessageRequestAttachmentsInner2.equals(createMessageRequestAttachmentsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner1 = OASCreateMessageRequestAttachmentsIn.getExample();
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner2 = new OASCreateMessageRequestAttachmentsIn();

        System.assertEquals(createMessageRequestAttachmentsInner1.hashCode(), createMessageRequestAttachmentsInner1.hashCode());
        System.assertEquals(createMessageRequestAttachmentsInner2.hashCode(), createMessageRequestAttachmentsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner1 = OASCreateMessageRequestAttachmentsIn.getExample();
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner2 = OASCreateMessageRequestAttachmentsIn.getExample();
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner3 = new OASCreateMessageRequestAttachmentsIn();
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner4 = new OASCreateMessageRequestAttachmentsIn();

        System.assert(createMessageRequestAttachmentsInner1.equals(createMessageRequestAttachmentsInner2));
        System.assert(createMessageRequestAttachmentsInner3.equals(createMessageRequestAttachmentsInner4));
        System.assertEquals(createMessageRequestAttachmentsInner1.hashCode(), createMessageRequestAttachmentsInner2.hashCode());
        System.assertEquals(createMessageRequestAttachmentsInner3.hashCode(), createMessageRequestAttachmentsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner = new OASCreateMessageRequestAttachmentsIn();
        Map<String, String> x-property-mappings = createMessageRequestAttachmentsInner.getx-property-mappings();
        System.assertEquals('fileId', x-property-mappings.get('file_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateMessageRequestAttachmentsIn createMessageRequestAttachmentsInner = new OASCreateMessageRequestAttachmentsIn();
        System.assertEquals(new List<OASCreateMessageRequestAttachmentsIn>(), createMessageRequestAttachmentsInner.tools);
        System.assertEquals(null, createMessageRequestAttachmentsInner.fileId);
    }
}
