package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogApiKeyDeleted._

case class AuditLogApiKeyDeleted (
  /* The tracking ID of the API key. */
  id: Option[String])

object AuditLogApiKeyDeleted {
  import DateTimeCodecs._

  implicit val AuditLogApiKeyDeletedCodecJson: CodecJson[AuditLogApiKeyDeleted] = CodecJson.derive[AuditLogApiKeyDeleted]
  implicit val AuditLogApiKeyDeletedDecoder: EntityDecoder[AuditLogApiKeyDeleted] = jsonOf[AuditLogApiKeyDeleted]
  implicit val AuditLogApiKeyDeletedEncoder: EntityEncoder[AuditLogApiKeyDeleted] = jsonEncoderOf[AuditLogApiKeyDeleted]
}
