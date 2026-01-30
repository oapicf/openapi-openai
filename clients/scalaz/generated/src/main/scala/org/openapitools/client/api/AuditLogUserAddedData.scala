package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogUserAddedData._

case class AuditLogUserAddedData (
  /* The role of the user. Is either `owner` or `member`. */
  role: Option[String])

object AuditLogUserAddedData {
  import DateTimeCodecs._

  implicit val AuditLogUserAddedDataCodecJson: CodecJson[AuditLogUserAddedData] = CodecJson.derive[AuditLogUserAddedData]
  implicit val AuditLogUserAddedDataDecoder: EntityDecoder[AuditLogUserAddedData] = jsonOf[AuditLogUserAddedData]
  implicit val AuditLogUserAddedDataEncoder: EntityEncoder[AuditLogUserAddedData] = jsonEncoderOf[AuditLogUserAddedData]
}
