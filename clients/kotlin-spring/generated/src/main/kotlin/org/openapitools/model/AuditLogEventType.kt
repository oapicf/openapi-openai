package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* The event type.
* Values: api_keyPeriodCreated,api_keyPeriodUpdated,api_keyPeriodDeleted,invitePeriodSent,invitePeriodAccepted,invitePeriodDeleted,loginPeriodSucceeded,loginPeriodFailed,logoutPeriodSucceeded,logoutPeriodFailed,organizationPeriodUpdated,projectPeriodCreated,projectPeriodUpdated,projectPeriodArchived,service_accountPeriodCreated,service_accountPeriodUpdated,service_accountPeriodDeleted,rate_limitPeriodUpdated,rate_limitPeriodDeleted,userPeriodAdded,userPeriodUpdated,userPeriodDeleted
*/
enum class AuditLogEventType(@get:JsonValue val value: kotlin.String) {

    api_keyPeriodCreated("api_key.created"),
    api_keyPeriodUpdated("api_key.updated"),
    api_keyPeriodDeleted("api_key.deleted"),
    invitePeriodSent("invite.sent"),
    invitePeriodAccepted("invite.accepted"),
    invitePeriodDeleted("invite.deleted"),
    loginPeriodSucceeded("login.succeeded"),
    loginPeriodFailed("login.failed"),
    logoutPeriodSucceeded("logout.succeeded"),
    logoutPeriodFailed("logout.failed"),
    organizationPeriodUpdated("organization.updated"),
    projectPeriodCreated("project.created"),
    projectPeriodUpdated("project.updated"),
    projectPeriodArchived("project.archived"),
    service_accountPeriodCreated("service_account.created"),
    service_accountPeriodUpdated("service_account.updated"),
    service_accountPeriodDeleted("service_account.deleted"),
    rate_limitPeriodUpdated("rate_limit.updated"),
    rate_limitPeriodDeleted("rate_limit.deleted"),
    userPeriodAdded("user.added"),
    userPeriodUpdated("user.updated"),
    userPeriodDeleted("user.deleted");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AuditLogEventType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AuditLogEventType'")
        }
    }
}

