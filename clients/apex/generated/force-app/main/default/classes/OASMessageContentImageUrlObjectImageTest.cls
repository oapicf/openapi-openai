@isTest
private class OASMessageContentImageUrlObjectImageTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl1 = OASMessageContentImageUrlObjectImage.getExample();
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl2 = messageContentImageUrlObjectImageUrl1;
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl3 = new OASMessageContentImageUrlObjectImage();
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl4 = messageContentImageUrlObjectImageUrl3;

        System.assert(messageContentImageUrlObjectImageUrl1.equals(messageContentImageUrlObjectImageUrl2));
        System.assert(messageContentImageUrlObjectImageUrl2.equals(messageContentImageUrlObjectImageUrl1));
        System.assert(messageContentImageUrlObjectImageUrl1.equals(messageContentImageUrlObjectImageUrl1));
        System.assert(messageContentImageUrlObjectImageUrl3.equals(messageContentImageUrlObjectImageUrl4));
        System.assert(messageContentImageUrlObjectImageUrl4.equals(messageContentImageUrlObjectImageUrl3));
        System.assert(messageContentImageUrlObjectImageUrl3.equals(messageContentImageUrlObjectImageUrl3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl1 = OASMessageContentImageUrlObjectImage.getExample();
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl2 = OASMessageContentImageUrlObjectImage.getExample();
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl3 = new OASMessageContentImageUrlObjectImage();
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl4 = new OASMessageContentImageUrlObjectImage();

        System.assert(messageContentImageUrlObjectImageUrl1.equals(messageContentImageUrlObjectImageUrl2));
        System.assert(messageContentImageUrlObjectImageUrl2.equals(messageContentImageUrlObjectImageUrl1));
        System.assert(messageContentImageUrlObjectImageUrl3.equals(messageContentImageUrlObjectImageUrl4));
        System.assert(messageContentImageUrlObjectImageUrl4.equals(messageContentImageUrlObjectImageUrl3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl1 = OASMessageContentImageUrlObjectImage.getExample();
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl2 = new OASMessageContentImageUrlObjectImage();

        System.assertEquals(false, messageContentImageUrlObjectImageUrl1.equals('foo'));
        System.assertEquals(false, messageContentImageUrlObjectImageUrl2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl1 = OASMessageContentImageUrlObjectImage.getExample();
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl2 = new OASMessageContentImageUrlObjectImage();
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl3;

        System.assertEquals(false, messageContentImageUrlObjectImageUrl1.equals(messageContentImageUrlObjectImageUrl3));
        System.assertEquals(false, messageContentImageUrlObjectImageUrl2.equals(messageContentImageUrlObjectImageUrl3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl1 = OASMessageContentImageUrlObjectImage.getExample();
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl2 = new OASMessageContentImageUrlObjectImage();

        System.assertEquals(messageContentImageUrlObjectImageUrl1.hashCode(), messageContentImageUrlObjectImageUrl1.hashCode());
        System.assertEquals(messageContentImageUrlObjectImageUrl2.hashCode(), messageContentImageUrlObjectImageUrl2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl1 = OASMessageContentImageUrlObjectImage.getExample();
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl2 = OASMessageContentImageUrlObjectImage.getExample();
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl3 = new OASMessageContentImageUrlObjectImage();
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl4 = new OASMessageContentImageUrlObjectImage();

        System.assert(messageContentImageUrlObjectImageUrl1.equals(messageContentImageUrlObjectImageUrl2));
        System.assert(messageContentImageUrlObjectImageUrl3.equals(messageContentImageUrlObjectImageUrl4));
        System.assertEquals(messageContentImageUrlObjectImageUrl1.hashCode(), messageContentImageUrlObjectImageUrl2.hashCode());
        System.assertEquals(messageContentImageUrlObjectImageUrl3.hashCode(), messageContentImageUrlObjectImageUrl4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMessageContentImageUrlObjectImage messageContentImageUrlObjectImageUrl = new OASMessageContentImageUrlObjectImage();
        System.assertEquals(DetailEnum.AUTO, messageContentImageUrlObjectImageUrl.detail);
        System.assertEquals(null, messageContentImageUrlObjectImageUrl.url);
    }
}
