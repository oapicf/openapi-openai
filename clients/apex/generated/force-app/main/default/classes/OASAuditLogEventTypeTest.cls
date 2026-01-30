@isTest
private class OASAuditLogEventTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASAuditLogEventType> expected = new Set<OASAuditLogEventType>{
            OASAuditLogEventType.API_KEY_CREATED,
            OASAuditLogEventType.API_KEY_UPDATED,
            OASAuditLogEventType.API_KEY_DELETED,
            OASAuditLogEventType.INVITE_SENT,
            OASAuditLogEventType.INVITE_ACCEPTED,
            OASAuditLogEventType.INVITE_DELETED,
            OASAuditLogEventType.LOGIN_SUCCEEDED,
            OASAuditLogEventType.LOGIN_FAILED,
            OASAuditLogEventType.LOGOUT_SUCCEEDED,
            OASAuditLogEventType.LOGOUT_FAILED,
            OASAuditLogEventType.ORGANIZATION_UPDATED,
            OASAuditLogEventType.PROJECT_CREATED,
            OASAuditLogEventType.PROJECT_UPDATED,
            OASAuditLogEventType.PROJECT_ARCHIVED,
            OASAuditLogEventType.SERVICE_ACCOUNT_CREATED,
            OASAuditLogEventType.SERVICE_ACCOUNT_UPDATED,
            OASAuditLogEventType.SERVICE_ACCOUNT_DELETED,
            OASAuditLogEventType.RATE_LIMIT_UPDATED,
            OASAuditLogEventType.RATE_LIMIT_DELETED,
            OASAuditLogEventType.USER_ADDED,
            OASAuditLogEventType.USER_UPDATED,
            OASAuditLogEventType.USER_DELETED
        };
        Set<OASAuditLogEventType> actual  = new Set<OASAuditLogEventType>(OASAuditLogEventType.values());
        System.assertEquals(expected, actual);
    }
}
