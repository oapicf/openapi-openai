package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VectorStoreFileBatchObjectFileCounts._

case class VectorStoreFileBatchObjectFileCounts (
  /* The number of files that are currently being processed. */
  inProgress: Integer,
/* The number of files that have been processed. */
  completed: Integer,
/* The number of files that have failed to process. */
  failed: Integer,
/* The number of files that where cancelled. */
  cancelled: Integer,
/* The total number of files. */
  total: Integer)

object VectorStoreFileBatchObjectFileCounts {
  import DateTimeCodecs._

  implicit val VectorStoreFileBatchObjectFileCountsCodecJson: CodecJson[VectorStoreFileBatchObjectFileCounts] = CodecJson.derive[VectorStoreFileBatchObjectFileCounts]
  implicit val VectorStoreFileBatchObjectFileCountsDecoder: EntityDecoder[VectorStoreFileBatchObjectFileCounts] = jsonOf[VectorStoreFileBatchObjectFileCounts]
  implicit val VectorStoreFileBatchObjectFileCountsEncoder: EntityEncoder[VectorStoreFileBatchObjectFileCounts] = jsonEncoderOf[VectorStoreFileBatchObjectFileCounts]
}
