@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AuditLogEventType {
    @JsonProperty(value = "api_key.created") api_keyPeriodCreated,
    @JsonProperty(value = "api_key.updated") api_keyPeriodUpdated,
    @JsonProperty(value = "api_key.deleted") api_keyPeriodDeleted,
    @JsonProperty(value = "invite.sent") invitePeriodSent,
    @JsonProperty(value = "invite.accepted") invitePeriodAccepted,
    @JsonProperty(value = "invite.deleted") invitePeriodDeleted,
    @JsonProperty(value = "login.succeeded") loginPeriodSucceeded,
    @JsonProperty(value = "login.failed") loginPeriodFailed,
    @JsonProperty(value = "logout.succeeded") logoutPeriodSucceeded,
    @JsonProperty(value = "logout.failed") logoutPeriodFailed,
    @JsonProperty(value = "organization.updated") organizationPeriodUpdated,
    @JsonProperty(value = "project.created") projectPeriodCreated,
    @JsonProperty(value = "project.updated") projectPeriodUpdated,
    @JsonProperty(value = "project.archived") projectPeriodArchived,
    @JsonProperty(value = "service_account.created") service_accountPeriodCreated,
    @JsonProperty(value = "service_account.updated") service_accountPeriodUpdated,
    @JsonProperty(value = "service_account.deleted") service_accountPeriodDeleted,
    @JsonProperty(value = "rate_limit.updated") rate_limitPeriodUpdated,
    @JsonProperty(value = "rate_limit.deleted") rate_limitPeriodDeleted,
    @JsonProperty(value = "user.added") userPeriodAdded,
    @JsonProperty(value = "user.updated") userPeriodUpdated,
    @JsonProperty(value = "user.deleted") userPeriodDeleted,
}
