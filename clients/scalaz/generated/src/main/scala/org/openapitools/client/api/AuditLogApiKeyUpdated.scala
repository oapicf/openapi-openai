package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogApiKeyUpdated._

case class AuditLogApiKeyUpdated (
  /* The tracking ID of the API key. */
  id: Option[String],
changesRequested: Option[AuditLogApiKeyUpdatedChangesRequested])

object AuditLogApiKeyUpdated {
  import DateTimeCodecs._

  implicit val AuditLogApiKeyUpdatedCodecJson: CodecJson[AuditLogApiKeyUpdated] = CodecJson.derive[AuditLogApiKeyUpdated]
  implicit val AuditLogApiKeyUpdatedDecoder: EntityDecoder[AuditLogApiKeyUpdated] = jsonOf[AuditLogApiKeyUpdated]
  implicit val AuditLogApiKeyUpdatedEncoder: EntityEncoder[AuditLogApiKeyUpdated] = jsonEncoderOf[AuditLogApiKeyUpdated]
}
