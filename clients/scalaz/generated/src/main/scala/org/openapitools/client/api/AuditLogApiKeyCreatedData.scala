package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogApiKeyCreatedData._

case class AuditLogApiKeyCreatedData (
  /* A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]` */
  scopes: Option[List[String]])

object AuditLogApiKeyCreatedData {
  import DateTimeCodecs._

  implicit val AuditLogApiKeyCreatedDataCodecJson: CodecJson[AuditLogApiKeyCreatedData] = CodecJson.derive[AuditLogApiKeyCreatedData]
  implicit val AuditLogApiKeyCreatedDataDecoder: EntityDecoder[AuditLogApiKeyCreatedData] = jsonOf[AuditLogApiKeyCreatedData]
  implicit val AuditLogApiKeyCreatedDataEncoder: EntityEncoder[AuditLogApiKeyCreatedData] = jsonEncoderOf[AuditLogApiKeyCreatedData]
}
