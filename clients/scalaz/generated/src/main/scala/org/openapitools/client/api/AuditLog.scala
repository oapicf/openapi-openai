package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLog._

case class AuditLog (
  /* The ID of this log. */
  id: String,
`type`: AuditLogEventType,
/* The Unix timestamp (in seconds) of the event. */
  effectiveAt: Integer,
project: Option[AuditLogProject],
actor: AuditLogActor,
apiKeyCreated: Option[AuditLogApiKeyCreated],
apiKeyUpdated: Option[AuditLogApiKeyUpdated],
apiKeyDeleted: Option[AuditLogApiKeyDeleted],
inviteSent: Option[AuditLogInviteSent],
inviteAccepted: Option[AuditLogInviteAccepted],
inviteDeleted: Option[AuditLogInviteAccepted],
loginFailed: Option[AuditLogLoginFailed],
logoutFailed: Option[AuditLogLoginFailed],
organizationUpdated: Option[AuditLogOrganizationUpdated],
projectCreated: Option[AuditLogProjectCreated],
projectUpdated: Option[AuditLogProjectUpdated],
projectArchived: Option[AuditLogProjectArchived],
rateLimitUpdated: Option[AuditLogRateLimitUpdated],
rateLimitDeleted: Option[AuditLogRateLimitDeleted],
serviceAccountCreated: Option[AuditLogServiceAccountCreated],
serviceAccountUpdated: Option[AuditLogServiceAccountUpdated],
serviceAccountDeleted: Option[AuditLogServiceAccountDeleted],
userAdded: Option[AuditLogUserAdded],
userUpdated: Option[AuditLogUserUpdated],
userDeleted: Option[AuditLogUserDeleted])

object AuditLog {
  import DateTimeCodecs._

  implicit val AuditLogCodecJson: CodecJson[AuditLog] = CodecJson.derive[AuditLog]
  implicit val AuditLogDecoder: EntityDecoder[AuditLog] = jsonOf[AuditLog]
  implicit val AuditLogEncoder: EntityEncoder[AuditLog] = jsonEncoderOf[AuditLog]
}
