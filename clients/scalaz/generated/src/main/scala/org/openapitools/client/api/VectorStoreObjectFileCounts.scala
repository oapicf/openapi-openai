package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VectorStoreObjectFileCounts._

case class VectorStoreObjectFileCounts (
  /* The number of files that are currently being processed. */
  inProgress: Integer,
/* The number of files that have been successfully processed. */
  completed: Integer,
/* The number of files that have failed to process. */
  failed: Integer,
/* The number of files that were cancelled. */
  cancelled: Integer,
/* The total number of files. */
  total: Integer)

object VectorStoreObjectFileCounts {
  import DateTimeCodecs._

  implicit val VectorStoreObjectFileCountsCodecJson: CodecJson[VectorStoreObjectFileCounts] = CodecJson.derive[VectorStoreObjectFileCounts]
  implicit val VectorStoreObjectFileCountsDecoder: EntityDecoder[VectorStoreObjectFileCounts] = jsonOf[VectorStoreObjectFileCounts]
  implicit val VectorStoreObjectFileCountsEncoder: EntityEncoder[VectorStoreObjectFileCounts] = jsonEncoderOf[VectorStoreObjectFileCounts]
}
