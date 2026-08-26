package org.openapitools.server.api.model

enum class AuditLogEventType {
    api_keyPeriodCreated,
    api_keyPeriodUpdated,
    api_keyPeriodDeleted,
    invitePeriodSent,
    invitePeriodAccepted,
    invitePeriodDeleted,
    loginPeriodSucceeded,
    loginPeriodFailed,
    logoutPeriodSucceeded,
    logoutPeriodFailed,
    organizationPeriodUpdated,
    projectPeriodCreated,
    projectPeriodUpdated,
    projectPeriodArchived,
    service_accountPeriodCreated,
    service_accountPeriodUpdated,
    service_accountPeriodDeleted,
    rate_limitPeriodUpdated,
    rate_limitPeriodDeleted,
    userPeriodAdded,
    userPeriodUpdated,
    userPeriodDeleted
}
