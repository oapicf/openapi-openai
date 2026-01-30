package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListAuditLogsEffectiveAtParameter._

case class ListAuditLogsEffectiveAtParameter (
  /* Return only events whose `effective_at` (Unix seconds) is greater than this value. */
  gt: Option[Integer],
/* Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value. */
  gte: Option[Integer],
/* Return only events whose `effective_at` (Unix seconds) is less than this value. */
  lt: Option[Integer],
/* Return only events whose `effective_at` (Unix seconds) is less than or equal to this value. */
  lte: Option[Integer])

object ListAuditLogsEffectiveAtParameter {
  import DateTimeCodecs._

  implicit val ListAuditLogsEffectiveAtParameterCodecJson: CodecJson[ListAuditLogsEffectiveAtParameter] = CodecJson.derive[ListAuditLogsEffectiveAtParameter]
  implicit val ListAuditLogsEffectiveAtParameterDecoder: EntityDecoder[ListAuditLogsEffectiveAtParameter] = jsonOf[ListAuditLogsEffectiveAtParameter]
  implicit val ListAuditLogsEffectiveAtParameterEncoder: EntityEncoder[ListAuditLogsEffectiveAtParameter] = jsonEncoderOf[ListAuditLogsEffectiveAtParameter]
}
