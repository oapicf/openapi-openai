@isTest
private class OASMessageDeltaContentTextAnnotationTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath1 = OASMessageDeltaContentTextAnnotation.getExample();
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath2 = messageDeltaContentTextAnnotationsFilePathObjectFilePath1;
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath3 = new OASMessageDeltaContentTextAnnotation();
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath4 = messageDeltaContentTextAnnotationsFilePathObjectFilePath3;

        System.assert(messageDeltaContentTextAnnotationsFilePathObjectFilePath1.equals(messageDeltaContentTextAnnotationsFilePathObjectFilePath2));
        System.assert(messageDeltaContentTextAnnotationsFilePathObjectFilePath2.equals(messageDeltaContentTextAnnotationsFilePathObjectFilePath1));
        System.assert(messageDeltaContentTextAnnotationsFilePathObjectFilePath1.equals(messageDeltaContentTextAnnotationsFilePathObjectFilePath1));
        System.assert(messageDeltaContentTextAnnotationsFilePathObjectFilePath3.equals(messageDeltaContentTextAnnotationsFilePathObjectFilePath4));
        System.assert(messageDeltaContentTextAnnotationsFilePathObjectFilePath4.equals(messageDeltaContentTextAnnotationsFilePathObjectFilePath3));
        System.assert(messageDeltaContentTextAnnotationsFilePathObjectFilePath3.equals(messageDeltaContentTextAnnotationsFilePathObjectFilePath3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath1 = OASMessageDeltaContentTextAnnotation.getExample();
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath2 = OASMessageDeltaContentTextAnnotation.getExample();
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath3 = new OASMessageDeltaContentTextAnnotation();
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath4 = new OASMessageDeltaContentTextAnnotation();

        System.assert(messageDeltaContentTextAnnotationsFilePathObjectFilePath1.equals(messageDeltaContentTextAnnotationsFilePathObjectFilePath2));
        System.assert(messageDeltaContentTextAnnotationsFilePathObjectFilePath2.equals(messageDeltaContentTextAnnotationsFilePathObjectFilePath1));
        System.assert(messageDeltaContentTextAnnotationsFilePathObjectFilePath3.equals(messageDeltaContentTextAnnotationsFilePathObjectFilePath4));
        System.assert(messageDeltaContentTextAnnotationsFilePathObjectFilePath4.equals(messageDeltaContentTextAnnotationsFilePathObjectFilePath3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath1 = OASMessageDeltaContentTextAnnotation.getExample();
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath2 = new OASMessageDeltaContentTextAnnotation();

        System.assertEquals(false, messageDeltaContentTextAnnotationsFilePathObjectFilePath1.equals('foo'));
        System.assertEquals(false, messageDeltaContentTextAnnotationsFilePathObjectFilePath2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath1 = OASMessageDeltaContentTextAnnotation.getExample();
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath2 = new OASMessageDeltaContentTextAnnotation();
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath3;

        System.assertEquals(false, messageDeltaContentTextAnnotationsFilePathObjectFilePath1.equals(messageDeltaContentTextAnnotationsFilePathObjectFilePath3));
        System.assertEquals(false, messageDeltaContentTextAnnotationsFilePathObjectFilePath2.equals(messageDeltaContentTextAnnotationsFilePathObjectFilePath3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath1 = OASMessageDeltaContentTextAnnotation.getExample();
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath2 = new OASMessageDeltaContentTextAnnotation();

        System.assertEquals(messageDeltaContentTextAnnotationsFilePathObjectFilePath1.hashCode(), messageDeltaContentTextAnnotationsFilePathObjectFilePath1.hashCode());
        System.assertEquals(messageDeltaContentTextAnnotationsFilePathObjectFilePath2.hashCode(), messageDeltaContentTextAnnotationsFilePathObjectFilePath2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath1 = OASMessageDeltaContentTextAnnotation.getExample();
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath2 = OASMessageDeltaContentTextAnnotation.getExample();
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath3 = new OASMessageDeltaContentTextAnnotation();
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath4 = new OASMessageDeltaContentTextAnnotation();

        System.assert(messageDeltaContentTextAnnotationsFilePathObjectFilePath1.equals(messageDeltaContentTextAnnotationsFilePathObjectFilePath2));
        System.assert(messageDeltaContentTextAnnotationsFilePathObjectFilePath3.equals(messageDeltaContentTextAnnotationsFilePathObjectFilePath4));
        System.assertEquals(messageDeltaContentTextAnnotationsFilePathObjectFilePath1.hashCode(), messageDeltaContentTextAnnotationsFilePathObjectFilePath2.hashCode());
        System.assertEquals(messageDeltaContentTextAnnotationsFilePathObjectFilePath3.hashCode(), messageDeltaContentTextAnnotationsFilePathObjectFilePath4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath = new OASMessageDeltaContentTextAnnotation();
        Map<String, String> x-property-mappings = messageDeltaContentTextAnnotationsFilePathObjectFilePath.getx-property-mappings();
        System.assertEquals('fileId', x-property-mappings.get('file_id'));
    }
}
