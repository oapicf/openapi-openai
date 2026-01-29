@isTest
private class OASMessageDeltaObjectDeltaTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageDeltaObjectDelta messageDeltaObjectDelta1 = OASMessageDeltaObjectDelta.getExample();
        OASMessageDeltaObjectDelta messageDeltaObjectDelta2 = messageDeltaObjectDelta1;
        OASMessageDeltaObjectDelta messageDeltaObjectDelta3 = new OASMessageDeltaObjectDelta();
        OASMessageDeltaObjectDelta messageDeltaObjectDelta4 = messageDeltaObjectDelta3;

        System.assert(messageDeltaObjectDelta1.equals(messageDeltaObjectDelta2));
        System.assert(messageDeltaObjectDelta2.equals(messageDeltaObjectDelta1));
        System.assert(messageDeltaObjectDelta1.equals(messageDeltaObjectDelta1));
        System.assert(messageDeltaObjectDelta3.equals(messageDeltaObjectDelta4));
        System.assert(messageDeltaObjectDelta4.equals(messageDeltaObjectDelta3));
        System.assert(messageDeltaObjectDelta3.equals(messageDeltaObjectDelta3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageDeltaObjectDelta messageDeltaObjectDelta1 = OASMessageDeltaObjectDelta.getExample();
        OASMessageDeltaObjectDelta messageDeltaObjectDelta2 = OASMessageDeltaObjectDelta.getExample();
        OASMessageDeltaObjectDelta messageDeltaObjectDelta3 = new OASMessageDeltaObjectDelta();
        OASMessageDeltaObjectDelta messageDeltaObjectDelta4 = new OASMessageDeltaObjectDelta();

        System.assert(messageDeltaObjectDelta1.equals(messageDeltaObjectDelta2));
        System.assert(messageDeltaObjectDelta2.equals(messageDeltaObjectDelta1));
        System.assert(messageDeltaObjectDelta3.equals(messageDeltaObjectDelta4));
        System.assert(messageDeltaObjectDelta4.equals(messageDeltaObjectDelta3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageDeltaObjectDelta messageDeltaObjectDelta1 = OASMessageDeltaObjectDelta.getExample();
        OASMessageDeltaObjectDelta messageDeltaObjectDelta2 = new OASMessageDeltaObjectDelta();

        System.assertEquals(false, messageDeltaObjectDelta1.equals('foo'));
        System.assertEquals(false, messageDeltaObjectDelta2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageDeltaObjectDelta messageDeltaObjectDelta1 = OASMessageDeltaObjectDelta.getExample();
        OASMessageDeltaObjectDelta messageDeltaObjectDelta2 = new OASMessageDeltaObjectDelta();
        OASMessageDeltaObjectDelta messageDeltaObjectDelta3;

        System.assertEquals(false, messageDeltaObjectDelta1.equals(messageDeltaObjectDelta3));
        System.assertEquals(false, messageDeltaObjectDelta2.equals(messageDeltaObjectDelta3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageDeltaObjectDelta messageDeltaObjectDelta1 = OASMessageDeltaObjectDelta.getExample();
        OASMessageDeltaObjectDelta messageDeltaObjectDelta2 = new OASMessageDeltaObjectDelta();

        System.assertEquals(messageDeltaObjectDelta1.hashCode(), messageDeltaObjectDelta1.hashCode());
        System.assertEquals(messageDeltaObjectDelta2.hashCode(), messageDeltaObjectDelta2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageDeltaObjectDelta messageDeltaObjectDelta1 = OASMessageDeltaObjectDelta.getExample();
        OASMessageDeltaObjectDelta messageDeltaObjectDelta2 = OASMessageDeltaObjectDelta.getExample();
        OASMessageDeltaObjectDelta messageDeltaObjectDelta3 = new OASMessageDeltaObjectDelta();
        OASMessageDeltaObjectDelta messageDeltaObjectDelta4 = new OASMessageDeltaObjectDelta();

        System.assert(messageDeltaObjectDelta1.equals(messageDeltaObjectDelta2));
        System.assert(messageDeltaObjectDelta3.equals(messageDeltaObjectDelta4));
        System.assertEquals(messageDeltaObjectDelta1.hashCode(), messageDeltaObjectDelta2.hashCode());
        System.assertEquals(messageDeltaObjectDelta3.hashCode(), messageDeltaObjectDelta4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMessageDeltaObjectDelta messageDeltaObjectDelta = new OASMessageDeltaObjectDelta();
        Map<String, String> x-property-mappings = messageDeltaObjectDelta.getx-property-mappings();
        System.assertEquals('fileIds', x-property-mappings.get('file_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMessageDeltaObjectDelta messageDeltaObjectDelta = new OASMessageDeltaObjectDelta();
        System.assertEquals(new List<OASMessageDeltaObjectDeltaContentInn>(), messageDeltaObjectDelta.content);
        System.assertEquals(new List<String>(), messageDeltaObjectDelta.fileIds);
        System.assertEquals(null, messageDeltaObjectDelta.role);
    }
}
