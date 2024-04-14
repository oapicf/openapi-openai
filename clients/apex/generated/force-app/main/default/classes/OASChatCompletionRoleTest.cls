@isTest
private class OASChatCompletionRoleTest {
    @isTest
    private static void allowableValues() {
        Set<OASChatCompletionRole> expected = new Set<OASChatCompletionRole>{
            OASChatCompletionRole.SYSTEM,
            OASChatCompletionRole.USER,
            OASChatCompletionRole.ASSISTANT,
            OASChatCompletionRole.TOOL,
            OASChatCompletionRole.FUNCTION
        };
        Set<OASChatCompletionRole> actual  = new Set<OASChatCompletionRole>(OASChatCompletionRole.values());
        System.assertEquals(expected, actual);
    }
}
