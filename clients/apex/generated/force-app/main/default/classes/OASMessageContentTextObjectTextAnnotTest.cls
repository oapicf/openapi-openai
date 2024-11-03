@isTest
private class OASMessageContentTextObjectTextAnnotTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner1 = OASMessageContentTextObjectTextAnnot.getExample();
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner2 = messageContentTextObjectTextAnnotationsInner1;
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner3 = new OASMessageContentTextObjectTextAnnot();
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner4 = messageContentTextObjectTextAnnotationsInner3;

        System.assert(messageContentTextObjectTextAnnotationsInner1.equals(messageContentTextObjectTextAnnotationsInner2));
        System.assert(messageContentTextObjectTextAnnotationsInner2.equals(messageContentTextObjectTextAnnotationsInner1));
        System.assert(messageContentTextObjectTextAnnotationsInner1.equals(messageContentTextObjectTextAnnotationsInner1));
        System.assert(messageContentTextObjectTextAnnotationsInner3.equals(messageContentTextObjectTextAnnotationsInner4));
        System.assert(messageContentTextObjectTextAnnotationsInner4.equals(messageContentTextObjectTextAnnotationsInner3));
        System.assert(messageContentTextObjectTextAnnotationsInner3.equals(messageContentTextObjectTextAnnotationsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner1 = OASMessageContentTextObjectTextAnnot.getExample();
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner2 = OASMessageContentTextObjectTextAnnot.getExample();
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner3 = new OASMessageContentTextObjectTextAnnot();
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner4 = new OASMessageContentTextObjectTextAnnot();

        System.assert(messageContentTextObjectTextAnnotationsInner1.equals(messageContentTextObjectTextAnnotationsInner2));
        System.assert(messageContentTextObjectTextAnnotationsInner2.equals(messageContentTextObjectTextAnnotationsInner1));
        System.assert(messageContentTextObjectTextAnnotationsInner3.equals(messageContentTextObjectTextAnnotationsInner4));
        System.assert(messageContentTextObjectTextAnnotationsInner4.equals(messageContentTextObjectTextAnnotationsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner1 = OASMessageContentTextObjectTextAnnot.getExample();
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner2 = new OASMessageContentTextObjectTextAnnot();

        System.assertEquals(false, messageContentTextObjectTextAnnotationsInner1.equals('foo'));
        System.assertEquals(false, messageContentTextObjectTextAnnotationsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner1 = OASMessageContentTextObjectTextAnnot.getExample();
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner2 = new OASMessageContentTextObjectTextAnnot();
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner3;

        System.assertEquals(false, messageContentTextObjectTextAnnotationsInner1.equals(messageContentTextObjectTextAnnotationsInner3));
        System.assertEquals(false, messageContentTextObjectTextAnnotationsInner2.equals(messageContentTextObjectTextAnnotationsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner1 = OASMessageContentTextObjectTextAnnot.getExample();
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner2 = new OASMessageContentTextObjectTextAnnot();

        System.assertEquals(messageContentTextObjectTextAnnotationsInner1.hashCode(), messageContentTextObjectTextAnnotationsInner1.hashCode());
        System.assertEquals(messageContentTextObjectTextAnnotationsInner2.hashCode(), messageContentTextObjectTextAnnotationsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner1 = OASMessageContentTextObjectTextAnnot.getExample();
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner2 = OASMessageContentTextObjectTextAnnot.getExample();
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner3 = new OASMessageContentTextObjectTextAnnot();
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner4 = new OASMessageContentTextObjectTextAnnot();

        System.assert(messageContentTextObjectTextAnnotationsInner1.equals(messageContentTextObjectTextAnnotationsInner2));
        System.assert(messageContentTextObjectTextAnnotationsInner3.equals(messageContentTextObjectTextAnnotationsInner4));
        System.assertEquals(messageContentTextObjectTextAnnotationsInner1.hashCode(), messageContentTextObjectTextAnnotationsInner2.hashCode());
        System.assertEquals(messageContentTextObjectTextAnnotationsInner3.hashCode(), messageContentTextObjectTextAnnotationsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMessageContentTextObjectTextAnnot messageContentTextObjectTextAnnotationsInner = new OASMessageContentTextObjectTextAnnot();
        Map<String, String> x-property-mappings = messageContentTextObjectTextAnnotationsInner.getx-property-mappings();
        System.assertEquals('fileCitation', x-property-mappings.get('file_citation'));
        System.assertEquals('startIndex', x-property-mappings.get('start_index'));
        System.assertEquals('endIndex', x-property-mappings.get('end_index'));
        System.assertEquals('filePath', x-property-mappings.get('file_path'));
    }
}
