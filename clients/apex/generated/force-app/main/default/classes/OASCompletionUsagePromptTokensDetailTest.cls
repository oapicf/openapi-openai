@isTest
private class OASCompletionUsagePromptTokensDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails1 = OASCompletionUsagePromptTokensDetail.getExample();
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails2 = completionUsagePromptTokensDetails1;
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails3 = new OASCompletionUsagePromptTokensDetail();
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails4 = completionUsagePromptTokensDetails3;

        System.assert(completionUsagePromptTokensDetails1.equals(completionUsagePromptTokensDetails2));
        System.assert(completionUsagePromptTokensDetails2.equals(completionUsagePromptTokensDetails1));
        System.assert(completionUsagePromptTokensDetails1.equals(completionUsagePromptTokensDetails1));
        System.assert(completionUsagePromptTokensDetails3.equals(completionUsagePromptTokensDetails4));
        System.assert(completionUsagePromptTokensDetails4.equals(completionUsagePromptTokensDetails3));
        System.assert(completionUsagePromptTokensDetails3.equals(completionUsagePromptTokensDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails1 = OASCompletionUsagePromptTokensDetail.getExample();
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails2 = OASCompletionUsagePromptTokensDetail.getExample();
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails3 = new OASCompletionUsagePromptTokensDetail();
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails4 = new OASCompletionUsagePromptTokensDetail();

        System.assert(completionUsagePromptTokensDetails1.equals(completionUsagePromptTokensDetails2));
        System.assert(completionUsagePromptTokensDetails2.equals(completionUsagePromptTokensDetails1));
        System.assert(completionUsagePromptTokensDetails3.equals(completionUsagePromptTokensDetails4));
        System.assert(completionUsagePromptTokensDetails4.equals(completionUsagePromptTokensDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails1 = OASCompletionUsagePromptTokensDetail.getExample();
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails2 = new OASCompletionUsagePromptTokensDetail();

        System.assertEquals(false, completionUsagePromptTokensDetails1.equals('foo'));
        System.assertEquals(false, completionUsagePromptTokensDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails1 = OASCompletionUsagePromptTokensDetail.getExample();
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails2 = new OASCompletionUsagePromptTokensDetail();
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails3;

        System.assertEquals(false, completionUsagePromptTokensDetails1.equals(completionUsagePromptTokensDetails3));
        System.assertEquals(false, completionUsagePromptTokensDetails2.equals(completionUsagePromptTokensDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails1 = OASCompletionUsagePromptTokensDetail.getExample();
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails2 = new OASCompletionUsagePromptTokensDetail();

        System.assertEquals(completionUsagePromptTokensDetails1.hashCode(), completionUsagePromptTokensDetails1.hashCode());
        System.assertEquals(completionUsagePromptTokensDetails2.hashCode(), completionUsagePromptTokensDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails1 = OASCompletionUsagePromptTokensDetail.getExample();
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails2 = OASCompletionUsagePromptTokensDetail.getExample();
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails3 = new OASCompletionUsagePromptTokensDetail();
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails4 = new OASCompletionUsagePromptTokensDetail();

        System.assert(completionUsagePromptTokensDetails1.equals(completionUsagePromptTokensDetails2));
        System.assert(completionUsagePromptTokensDetails3.equals(completionUsagePromptTokensDetails4));
        System.assertEquals(completionUsagePromptTokensDetails1.hashCode(), completionUsagePromptTokensDetails2.hashCode());
        System.assertEquals(completionUsagePromptTokensDetails3.hashCode(), completionUsagePromptTokensDetails4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCompletionUsagePromptTokensDetail completionUsagePromptTokensDetails = new OASCompletionUsagePromptTokensDetail();
        Map<String, String> x-property-mappings = completionUsagePromptTokensDetails.getx-property-mappings();
        System.assertEquals('audioTokens', x-property-mappings.get('audio_tokens'));
        System.assertEquals('cachedTokens', x-property-mappings.get('cached_tokens'));
    }
}
