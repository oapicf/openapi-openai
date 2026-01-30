@isTest
private class OASMessageContentImageFileObjectImagTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile1 = OASMessageContentImageFileObjectImag.getExample();
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile2 = messageContentImageFileObjectImageFile1;
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile3 = new OASMessageContentImageFileObjectImag();
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile4 = messageContentImageFileObjectImageFile3;

        System.assert(messageContentImageFileObjectImageFile1.equals(messageContentImageFileObjectImageFile2));
        System.assert(messageContentImageFileObjectImageFile2.equals(messageContentImageFileObjectImageFile1));
        System.assert(messageContentImageFileObjectImageFile1.equals(messageContentImageFileObjectImageFile1));
        System.assert(messageContentImageFileObjectImageFile3.equals(messageContentImageFileObjectImageFile4));
        System.assert(messageContentImageFileObjectImageFile4.equals(messageContentImageFileObjectImageFile3));
        System.assert(messageContentImageFileObjectImageFile3.equals(messageContentImageFileObjectImageFile3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile1 = OASMessageContentImageFileObjectImag.getExample();
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile2 = OASMessageContentImageFileObjectImag.getExample();
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile3 = new OASMessageContentImageFileObjectImag();
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile4 = new OASMessageContentImageFileObjectImag();

        System.assert(messageContentImageFileObjectImageFile1.equals(messageContentImageFileObjectImageFile2));
        System.assert(messageContentImageFileObjectImageFile2.equals(messageContentImageFileObjectImageFile1));
        System.assert(messageContentImageFileObjectImageFile3.equals(messageContentImageFileObjectImageFile4));
        System.assert(messageContentImageFileObjectImageFile4.equals(messageContentImageFileObjectImageFile3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile1 = OASMessageContentImageFileObjectImag.getExample();
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile2 = new OASMessageContentImageFileObjectImag();

        System.assertEquals(false, messageContentImageFileObjectImageFile1.equals('foo'));
        System.assertEquals(false, messageContentImageFileObjectImageFile2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile1 = OASMessageContentImageFileObjectImag.getExample();
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile2 = new OASMessageContentImageFileObjectImag();
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile3;

        System.assertEquals(false, messageContentImageFileObjectImageFile1.equals(messageContentImageFileObjectImageFile3));
        System.assertEquals(false, messageContentImageFileObjectImageFile2.equals(messageContentImageFileObjectImageFile3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile1 = OASMessageContentImageFileObjectImag.getExample();
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile2 = new OASMessageContentImageFileObjectImag();

        System.assertEquals(messageContentImageFileObjectImageFile1.hashCode(), messageContentImageFileObjectImageFile1.hashCode());
        System.assertEquals(messageContentImageFileObjectImageFile2.hashCode(), messageContentImageFileObjectImageFile2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile1 = OASMessageContentImageFileObjectImag.getExample();
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile2 = OASMessageContentImageFileObjectImag.getExample();
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile3 = new OASMessageContentImageFileObjectImag();
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile4 = new OASMessageContentImageFileObjectImag();

        System.assert(messageContentImageFileObjectImageFile1.equals(messageContentImageFileObjectImageFile2));
        System.assert(messageContentImageFileObjectImageFile3.equals(messageContentImageFileObjectImageFile4));
        System.assertEquals(messageContentImageFileObjectImageFile1.hashCode(), messageContentImageFileObjectImageFile2.hashCode());
        System.assertEquals(messageContentImageFileObjectImageFile3.hashCode(), messageContentImageFileObjectImageFile4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile = new OASMessageContentImageFileObjectImag();
        Map<String, String> x-property-mappings = messageContentImageFileObjectImageFile.getx-property-mappings();
        System.assertEquals('fileId', x-property-mappings.get('file_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMessageContentImageFileObjectImag messageContentImageFileObjectImageFile = new OASMessageContentImageFileObjectImag();
        System.assertEquals(DetailEnum.AUTO, messageContentImageFileObjectImageFile.detail);
        System.assertEquals(null, messageContentImageFileObjectImageFile.fileId);
    }
}
