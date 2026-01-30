package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AuditLogActor
import org.openapitools.models.AuditLogApiKeyCreated
import org.openapitools.models.AuditLogApiKeyDeleted
import org.openapitools.models.AuditLogApiKeyUpdated
import org.openapitools.models.AuditLogEventType
import org.openapitools.models.AuditLogInviteAccepted
import org.openapitools.models.AuditLogInviteSent
import org.openapitools.models.AuditLogLoginFailed
import org.openapitools.models.AuditLogOrganizationUpdated
import org.openapitools.models.AuditLogProject
import org.openapitools.models.AuditLogProjectArchived
import org.openapitools.models.AuditLogProjectCreated
import org.openapitools.models.AuditLogProjectUpdated
import org.openapitools.models.AuditLogRateLimitDeleted
import org.openapitools.models.AuditLogRateLimitUpdated
import org.openapitools.models.AuditLogServiceAccountCreated
import org.openapitools.models.AuditLogServiceAccountDeleted
import org.openapitools.models.AuditLogServiceAccountUpdated
import org.openapitools.models.AuditLogUserAdded
import org.openapitools.models.AuditLogUserDeleted
import org.openapitools.models.AuditLogUserUpdated

/**
 * A log of a user action or configuration change within this organization.
 * @param id The ID of this log.
 * @param _type 
 * @param effectiveUnderscoreat The Unix timestamp (in seconds) of the event.
 * @param project 
 * @param actor 
 * @param apiUnderscorekeyPeriodcreated 
 * @param apiUnderscorekeyPeriodupdated 
 * @param apiUnderscorekeyPerioddeleted 
 * @param invitePeriodsent 
 * @param invitePeriodaccepted 
 * @param invitePerioddeleted 
 * @param loginPeriodfailed 
 * @param logoutPeriodfailed 
 * @param organizationPeriodupdated 
 * @param projectPeriodcreated 
 * @param projectPeriodupdated 
 * @param projectPeriodarchived 
 * @param rateUnderscorelimitPeriodupdated 
 * @param rateUnderscorelimitPerioddeleted 
 * @param serviceUnderscoreaccountPeriodcreated 
 * @param serviceUnderscoreaccountPeriodupdated 
 * @param serviceUnderscoreaccountPerioddeleted 
 * @param userPeriodadded 
 * @param userPeriodupdated 
 * @param userPerioddeleted 
 */
case class AuditLog(id: String,
                _type: AuditLogEventType,
                effectiveUnderscoreat: Int,
                project: Option[AuditLogProject],
                actor: AuditLogActor,
                apiUnderscorekeyPeriodcreated: Option[AuditLogApiKeyCreated],
                apiUnderscorekeyPeriodupdated: Option[AuditLogApiKeyUpdated],
                apiUnderscorekeyPerioddeleted: Option[AuditLogApiKeyDeleted],
                invitePeriodsent: Option[AuditLogInviteSent],
                invitePeriodaccepted: Option[AuditLogInviteAccepted],
                invitePerioddeleted: Option[AuditLogInviteAccepted],
                loginPeriodfailed: Option[AuditLogLoginFailed],
                logoutPeriodfailed: Option[AuditLogLoginFailed],
                organizationPeriodupdated: Option[AuditLogOrganizationUpdated],
                projectPeriodcreated: Option[AuditLogProjectCreated],
                projectPeriodupdated: Option[AuditLogProjectUpdated],
                projectPeriodarchived: Option[AuditLogProjectArchived],
                rateUnderscorelimitPeriodupdated: Option[AuditLogRateLimitUpdated],
                rateUnderscorelimitPerioddeleted: Option[AuditLogRateLimitDeleted],
                serviceUnderscoreaccountPeriodcreated: Option[AuditLogServiceAccountCreated],
                serviceUnderscoreaccountPeriodupdated: Option[AuditLogServiceAccountUpdated],
                serviceUnderscoreaccountPerioddeleted: Option[AuditLogServiceAccountDeleted],
                userPeriodadded: Option[AuditLogUserAdded],
                userPeriodupdated: Option[AuditLogUserUpdated],
                userPerioddeleted: Option[AuditLogUserDeleted]
                )

object AuditLog {
    /**
     * Creates the codec for converting AuditLog from and to JSON.
     */
    implicit val decoder: Decoder[AuditLog] = deriveDecoder
    implicit val encoder: ObjectEncoder[AuditLog] = deriveEncoder
}
