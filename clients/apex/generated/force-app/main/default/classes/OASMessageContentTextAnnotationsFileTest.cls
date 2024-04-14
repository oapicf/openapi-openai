@isTest
private class OASMessageContentTextAnnotationsFileTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath1 = OASMessageContentTextAnnotationsFile.getExample();
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath2 = messageContentTextAnnotationsFilePathObjectFilePath1;
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath3 = new OASMessageContentTextAnnotationsFile();
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath4 = messageContentTextAnnotationsFilePathObjectFilePath3;

        System.assert(messageContentTextAnnotationsFilePathObjectFilePath1.equals(messageContentTextAnnotationsFilePathObjectFilePath2));
        System.assert(messageContentTextAnnotationsFilePathObjectFilePath2.equals(messageContentTextAnnotationsFilePathObjectFilePath1));
        System.assert(messageContentTextAnnotationsFilePathObjectFilePath1.equals(messageContentTextAnnotationsFilePathObjectFilePath1));
        System.assert(messageContentTextAnnotationsFilePathObjectFilePath3.equals(messageContentTextAnnotationsFilePathObjectFilePath4));
        System.assert(messageContentTextAnnotationsFilePathObjectFilePath4.equals(messageContentTextAnnotationsFilePathObjectFilePath3));
        System.assert(messageContentTextAnnotationsFilePathObjectFilePath3.equals(messageContentTextAnnotationsFilePathObjectFilePath3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath1 = OASMessageContentTextAnnotationsFile.getExample();
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath2 = OASMessageContentTextAnnotationsFile.getExample();
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath3 = new OASMessageContentTextAnnotationsFile();
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath4 = new OASMessageContentTextAnnotationsFile();

        System.assert(messageContentTextAnnotationsFilePathObjectFilePath1.equals(messageContentTextAnnotationsFilePathObjectFilePath2));
        System.assert(messageContentTextAnnotationsFilePathObjectFilePath2.equals(messageContentTextAnnotationsFilePathObjectFilePath1));
        System.assert(messageContentTextAnnotationsFilePathObjectFilePath3.equals(messageContentTextAnnotationsFilePathObjectFilePath4));
        System.assert(messageContentTextAnnotationsFilePathObjectFilePath4.equals(messageContentTextAnnotationsFilePathObjectFilePath3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath1 = OASMessageContentTextAnnotationsFile.getExample();
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath2 = new OASMessageContentTextAnnotationsFile();

        System.assertEquals(false, messageContentTextAnnotationsFilePathObjectFilePath1.equals('foo'));
        System.assertEquals(false, messageContentTextAnnotationsFilePathObjectFilePath2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath1 = OASMessageContentTextAnnotationsFile.getExample();
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath2 = new OASMessageContentTextAnnotationsFile();
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath3;

        System.assertEquals(false, messageContentTextAnnotationsFilePathObjectFilePath1.equals(messageContentTextAnnotationsFilePathObjectFilePath3));
        System.assertEquals(false, messageContentTextAnnotationsFilePathObjectFilePath2.equals(messageContentTextAnnotationsFilePathObjectFilePath3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath1 = OASMessageContentTextAnnotationsFile.getExample();
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath2 = new OASMessageContentTextAnnotationsFile();

        System.assertEquals(messageContentTextAnnotationsFilePathObjectFilePath1.hashCode(), messageContentTextAnnotationsFilePathObjectFilePath1.hashCode());
        System.assertEquals(messageContentTextAnnotationsFilePathObjectFilePath2.hashCode(), messageContentTextAnnotationsFilePathObjectFilePath2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath1 = OASMessageContentTextAnnotationsFile.getExample();
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath2 = OASMessageContentTextAnnotationsFile.getExample();
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath3 = new OASMessageContentTextAnnotationsFile();
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath4 = new OASMessageContentTextAnnotationsFile();

        System.assert(messageContentTextAnnotationsFilePathObjectFilePath1.equals(messageContentTextAnnotationsFilePathObjectFilePath2));
        System.assert(messageContentTextAnnotationsFilePathObjectFilePath3.equals(messageContentTextAnnotationsFilePathObjectFilePath4));
        System.assertEquals(messageContentTextAnnotationsFilePathObjectFilePath1.hashCode(), messageContentTextAnnotationsFilePathObjectFilePath2.hashCode());
        System.assertEquals(messageContentTextAnnotationsFilePathObjectFilePath3.hashCode(), messageContentTextAnnotationsFilePathObjectFilePath4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMessageContentTextAnnotationsFile messageContentTextAnnotationsFilePathObjectFilePath = new OASMessageContentTextAnnotationsFile();
        Map<String, String> x-property-mappings = messageContentTextAnnotationsFilePathObjectFilePath.getx-property-mappings();
        System.assertEquals('fileId', x-property-mappings.get('file_id'));
    }
}
