@isTest
private class OASAuditLogTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuditLog auditLog1 = OASAuditLog.getExample();
        OASAuditLog auditLog2 = auditLog1;
        OASAuditLog auditLog3 = new OASAuditLog();
        OASAuditLog auditLog4 = auditLog3;

        System.assert(auditLog1.equals(auditLog2));
        System.assert(auditLog2.equals(auditLog1));
        System.assert(auditLog1.equals(auditLog1));
        System.assert(auditLog3.equals(auditLog4));
        System.assert(auditLog4.equals(auditLog3));
        System.assert(auditLog3.equals(auditLog3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuditLog auditLog1 = OASAuditLog.getExample();
        OASAuditLog auditLog2 = OASAuditLog.getExample();
        OASAuditLog auditLog3 = new OASAuditLog();
        OASAuditLog auditLog4 = new OASAuditLog();

        System.assert(auditLog1.equals(auditLog2));
        System.assert(auditLog2.equals(auditLog1));
        System.assert(auditLog3.equals(auditLog4));
        System.assert(auditLog4.equals(auditLog3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuditLog auditLog1 = OASAuditLog.getExample();
        OASAuditLog auditLog2 = new OASAuditLog();

        System.assertEquals(false, auditLog1.equals('foo'));
        System.assertEquals(false, auditLog2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuditLog auditLog1 = OASAuditLog.getExample();
        OASAuditLog auditLog2 = new OASAuditLog();
        OASAuditLog auditLog3;

        System.assertEquals(false, auditLog1.equals(auditLog3));
        System.assertEquals(false, auditLog2.equals(auditLog3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuditLog auditLog1 = OASAuditLog.getExample();
        OASAuditLog auditLog2 = new OASAuditLog();

        System.assertEquals(auditLog1.hashCode(), auditLog1.hashCode());
        System.assertEquals(auditLog2.hashCode(), auditLog2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuditLog auditLog1 = OASAuditLog.getExample();
        OASAuditLog auditLog2 = OASAuditLog.getExample();
        OASAuditLog auditLog3 = new OASAuditLog();
        OASAuditLog auditLog4 = new OASAuditLog();

        System.assert(auditLog1.equals(auditLog2));
        System.assert(auditLog3.equals(auditLog4));
        System.assertEquals(auditLog1.hashCode(), auditLog2.hashCode());
        System.assertEquals(auditLog3.hashCode(), auditLog4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAuditLog auditLog = new OASAuditLog();
        Map<String, String> x-property-mappings = auditLog.getx-property-mappings();
        System.assertEquals('effectiveAt', x-property-mappings.get('effective_at'));
        System.assertEquals('apiKeyCreated', x-property-mappings.get('api_key.created'));
        System.assertEquals('apiKeyUpdated', x-property-mappings.get('api_key.updated'));
        System.assertEquals('apiKeyDeleted', x-property-mappings.get('api_key.deleted'));
        System.assertEquals('inviteSent', x-property-mappings.get('invite.sent'));
        System.assertEquals('inviteAccepted', x-property-mappings.get('invite.accepted'));
        System.assertEquals('inviteDeleted', x-property-mappings.get('invite.deleted'));
        System.assertEquals('loginFailed', x-property-mappings.get('login.failed'));
        System.assertEquals('logoutFailed', x-property-mappings.get('logout.failed'));
        System.assertEquals('organizationUpdated', x-property-mappings.get('organization.updated'));
        System.assertEquals('projectCreated', x-property-mappings.get('project.created'));
        System.assertEquals('projectUpdated', x-property-mappings.get('project.updated'));
        System.assertEquals('projectArchived', x-property-mappings.get('project.archived'));
        System.assertEquals('rateLimitUpdated', x-property-mappings.get('rate_limit.updated'));
        System.assertEquals('rateLimitDeleted', x-property-mappings.get('rate_limit.deleted'));
        System.assertEquals('serviceAccountCreated', x-property-mappings.get('service_account.created'));
        System.assertEquals('serviceAccountUpdated', x-property-mappings.get('service_account.updated'));
        System.assertEquals('serviceAccountDeleted', x-property-mappings.get('service_account.deleted'));
        System.assertEquals('userAdded', x-property-mappings.get('user.added'));
        System.assertEquals('userUpdated', x-property-mappings.get('user.updated'));
        System.assertEquals('userDeleted', x-property-mappings.get('user.deleted'));
    }
}
