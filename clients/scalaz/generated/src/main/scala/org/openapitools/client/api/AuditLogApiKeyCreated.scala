package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogApiKeyCreated._

case class AuditLogApiKeyCreated (
  /* The tracking ID of the API key. */
  id: Option[String],
data: Option[AuditLogApiKeyCreatedData])

object AuditLogApiKeyCreated {
  import DateTimeCodecs._

  implicit val AuditLogApiKeyCreatedCodecJson: CodecJson[AuditLogApiKeyCreated] = CodecJson.derive[AuditLogApiKeyCreated]
  implicit val AuditLogApiKeyCreatedDecoder: EntityDecoder[AuditLogApiKeyCreated] = jsonOf[AuditLogApiKeyCreated]
  implicit val AuditLogApiKeyCreatedEncoder: EntityEncoder[AuditLogApiKeyCreated] = jsonEncoderOf[AuditLogApiKeyCreated]
}
