package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogEventType._

case class AuditLogEventType (
  
object AuditLogEventType {
  import DateTimeCodecs._

  implicit val AuditLogEventTypeCodecJson: CodecJson[AuditLogEventType] = CodecJson.derive[AuditLogEventType]
  implicit val AuditLogEventTypeDecoder: EntityDecoder[AuditLogEventType] = jsonOf[AuditLogEventType]
  implicit val AuditLogEventTypeEncoder: EntityEncoder[AuditLogEventType] = jsonEncoderOf[AuditLogEventType]
}
