package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogApiKeyUpdatedChangesRequested._

case class AuditLogApiKeyUpdatedChangesRequested (
  /* A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]` */
  scopes: Option[List[String]])

object AuditLogApiKeyUpdatedChangesRequested {
  import DateTimeCodecs._

  implicit val AuditLogApiKeyUpdatedChangesRequestedCodecJson: CodecJson[AuditLogApiKeyUpdatedChangesRequested] = CodecJson.derive[AuditLogApiKeyUpdatedChangesRequested]
  implicit val AuditLogApiKeyUpdatedChangesRequestedDecoder: EntityDecoder[AuditLogApiKeyUpdatedChangesRequested] = jsonOf[AuditLogApiKeyUpdatedChangesRequested]
  implicit val AuditLogApiKeyUpdatedChangesRequestedEncoder: EntityEncoder[AuditLogApiKeyUpdatedChangesRequested] = jsonEncoderOf[AuditLogApiKeyUpdatedChangesRequested]
}
