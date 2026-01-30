package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BatchRequestCounts._

case class BatchRequestCounts (
  /* Total number of requests in the batch. */
  total: Integer,
/* Number of requests that have been completed successfully. */
  completed: Integer,
/* Number of requests that have failed. */
  failed: Integer)

object BatchRequestCounts {
  import DateTimeCodecs._

  implicit val BatchRequestCountsCodecJson: CodecJson[BatchRequestCounts] = CodecJson.derive[BatchRequestCounts]
  implicit val BatchRequestCountsDecoder: EntityDecoder[BatchRequestCounts] = jsonOf[BatchRequestCounts]
  implicit val BatchRequestCountsEncoder: EntityEncoder[BatchRequestCounts] = jsonEncoderOf[BatchRequestCounts]
}
