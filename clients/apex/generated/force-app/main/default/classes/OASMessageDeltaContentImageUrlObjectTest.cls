@isTest
private class OASMessageDeltaContentImageUrlObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl1 = OASMessageDeltaContentImageUrlObject.getExample();
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl2 = messageDeltaContentImageUrlObjectImageUrl1;
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl3 = new OASMessageDeltaContentImageUrlObject();
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl4 = messageDeltaContentImageUrlObjectImageUrl3;

        System.assert(messageDeltaContentImageUrlObjectImageUrl1.equals(messageDeltaContentImageUrlObjectImageUrl2));
        System.assert(messageDeltaContentImageUrlObjectImageUrl2.equals(messageDeltaContentImageUrlObjectImageUrl1));
        System.assert(messageDeltaContentImageUrlObjectImageUrl1.equals(messageDeltaContentImageUrlObjectImageUrl1));
        System.assert(messageDeltaContentImageUrlObjectImageUrl3.equals(messageDeltaContentImageUrlObjectImageUrl4));
        System.assert(messageDeltaContentImageUrlObjectImageUrl4.equals(messageDeltaContentImageUrlObjectImageUrl3));
        System.assert(messageDeltaContentImageUrlObjectImageUrl3.equals(messageDeltaContentImageUrlObjectImageUrl3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl1 = OASMessageDeltaContentImageUrlObject.getExample();
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl2 = OASMessageDeltaContentImageUrlObject.getExample();
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl3 = new OASMessageDeltaContentImageUrlObject();
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl4 = new OASMessageDeltaContentImageUrlObject();

        System.assert(messageDeltaContentImageUrlObjectImageUrl1.equals(messageDeltaContentImageUrlObjectImageUrl2));
        System.assert(messageDeltaContentImageUrlObjectImageUrl2.equals(messageDeltaContentImageUrlObjectImageUrl1));
        System.assert(messageDeltaContentImageUrlObjectImageUrl3.equals(messageDeltaContentImageUrlObjectImageUrl4));
        System.assert(messageDeltaContentImageUrlObjectImageUrl4.equals(messageDeltaContentImageUrlObjectImageUrl3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl1 = OASMessageDeltaContentImageUrlObject.getExample();
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl2 = new OASMessageDeltaContentImageUrlObject();

        System.assertEquals(false, messageDeltaContentImageUrlObjectImageUrl1.equals('foo'));
        System.assertEquals(false, messageDeltaContentImageUrlObjectImageUrl2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl1 = OASMessageDeltaContentImageUrlObject.getExample();
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl2 = new OASMessageDeltaContentImageUrlObject();
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl3;

        System.assertEquals(false, messageDeltaContentImageUrlObjectImageUrl1.equals(messageDeltaContentImageUrlObjectImageUrl3));
        System.assertEquals(false, messageDeltaContentImageUrlObjectImageUrl2.equals(messageDeltaContentImageUrlObjectImageUrl3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl1 = OASMessageDeltaContentImageUrlObject.getExample();
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl2 = new OASMessageDeltaContentImageUrlObject();

        System.assertEquals(messageDeltaContentImageUrlObjectImageUrl1.hashCode(), messageDeltaContentImageUrlObjectImageUrl1.hashCode());
        System.assertEquals(messageDeltaContentImageUrlObjectImageUrl2.hashCode(), messageDeltaContentImageUrlObjectImageUrl2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl1 = OASMessageDeltaContentImageUrlObject.getExample();
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl2 = OASMessageDeltaContentImageUrlObject.getExample();
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl3 = new OASMessageDeltaContentImageUrlObject();
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl4 = new OASMessageDeltaContentImageUrlObject();

        System.assert(messageDeltaContentImageUrlObjectImageUrl1.equals(messageDeltaContentImageUrlObjectImageUrl2));
        System.assert(messageDeltaContentImageUrlObjectImageUrl3.equals(messageDeltaContentImageUrlObjectImageUrl4));
        System.assertEquals(messageDeltaContentImageUrlObjectImageUrl1.hashCode(), messageDeltaContentImageUrlObjectImageUrl2.hashCode());
        System.assertEquals(messageDeltaContentImageUrlObjectImageUrl3.hashCode(), messageDeltaContentImageUrlObjectImageUrl4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMessageDeltaContentImageUrlObject messageDeltaContentImageUrlObjectImageUrl = new OASMessageDeltaContentImageUrlObject();
        System.assertEquals(DetailEnum.AUTO, messageDeltaContentImageUrlObjectImageUrl.detail);
        System.assertEquals(null, messageDeltaContentImageUrlObjectImageUrl.url);
    }
}
