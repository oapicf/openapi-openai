@isTest
private class OASMessageDeltaContentImageFileObjecTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile1 = OASMessageDeltaContentImageFileObjec.getExample();
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile2 = messageDeltaContentImageFileObjectImageFile1;
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile3 = new OASMessageDeltaContentImageFileObjec();
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile4 = messageDeltaContentImageFileObjectImageFile3;

        System.assert(messageDeltaContentImageFileObjectImageFile1.equals(messageDeltaContentImageFileObjectImageFile2));
        System.assert(messageDeltaContentImageFileObjectImageFile2.equals(messageDeltaContentImageFileObjectImageFile1));
        System.assert(messageDeltaContentImageFileObjectImageFile1.equals(messageDeltaContentImageFileObjectImageFile1));
        System.assert(messageDeltaContentImageFileObjectImageFile3.equals(messageDeltaContentImageFileObjectImageFile4));
        System.assert(messageDeltaContentImageFileObjectImageFile4.equals(messageDeltaContentImageFileObjectImageFile3));
        System.assert(messageDeltaContentImageFileObjectImageFile3.equals(messageDeltaContentImageFileObjectImageFile3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile1 = OASMessageDeltaContentImageFileObjec.getExample();
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile2 = OASMessageDeltaContentImageFileObjec.getExample();
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile3 = new OASMessageDeltaContentImageFileObjec();
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile4 = new OASMessageDeltaContentImageFileObjec();

        System.assert(messageDeltaContentImageFileObjectImageFile1.equals(messageDeltaContentImageFileObjectImageFile2));
        System.assert(messageDeltaContentImageFileObjectImageFile2.equals(messageDeltaContentImageFileObjectImageFile1));
        System.assert(messageDeltaContentImageFileObjectImageFile3.equals(messageDeltaContentImageFileObjectImageFile4));
        System.assert(messageDeltaContentImageFileObjectImageFile4.equals(messageDeltaContentImageFileObjectImageFile3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile1 = OASMessageDeltaContentImageFileObjec.getExample();
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile2 = new OASMessageDeltaContentImageFileObjec();

        System.assertEquals(false, messageDeltaContentImageFileObjectImageFile1.equals('foo'));
        System.assertEquals(false, messageDeltaContentImageFileObjectImageFile2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile1 = OASMessageDeltaContentImageFileObjec.getExample();
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile2 = new OASMessageDeltaContentImageFileObjec();
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile3;

        System.assertEquals(false, messageDeltaContentImageFileObjectImageFile1.equals(messageDeltaContentImageFileObjectImageFile3));
        System.assertEquals(false, messageDeltaContentImageFileObjectImageFile2.equals(messageDeltaContentImageFileObjectImageFile3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile1 = OASMessageDeltaContentImageFileObjec.getExample();
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile2 = new OASMessageDeltaContentImageFileObjec();

        System.assertEquals(messageDeltaContentImageFileObjectImageFile1.hashCode(), messageDeltaContentImageFileObjectImageFile1.hashCode());
        System.assertEquals(messageDeltaContentImageFileObjectImageFile2.hashCode(), messageDeltaContentImageFileObjectImageFile2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile1 = OASMessageDeltaContentImageFileObjec.getExample();
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile2 = OASMessageDeltaContentImageFileObjec.getExample();
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile3 = new OASMessageDeltaContentImageFileObjec();
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile4 = new OASMessageDeltaContentImageFileObjec();

        System.assert(messageDeltaContentImageFileObjectImageFile1.equals(messageDeltaContentImageFileObjectImageFile2));
        System.assert(messageDeltaContentImageFileObjectImageFile3.equals(messageDeltaContentImageFileObjectImageFile4));
        System.assertEquals(messageDeltaContentImageFileObjectImageFile1.hashCode(), messageDeltaContentImageFileObjectImageFile2.hashCode());
        System.assertEquals(messageDeltaContentImageFileObjectImageFile3.hashCode(), messageDeltaContentImageFileObjectImageFile4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile = new OASMessageDeltaContentImageFileObjec();
        Map<String, String> x-property-mappings = messageDeltaContentImageFileObjectImageFile.getx-property-mappings();
        System.assertEquals('fileId', x-property-mappings.get('file_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile = new OASMessageDeltaContentImageFileObjec();
        System.assertEquals(DetailEnum.AUTO, messageDeltaContentImageFileObjectImageFile.detail);
        System.assertEquals(null, messageDeltaContentImageFileObjectImageFile.fileId);
    }
}
