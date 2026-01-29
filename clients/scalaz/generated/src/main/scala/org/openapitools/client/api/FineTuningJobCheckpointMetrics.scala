package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuningJobCheckpointMetrics._

case class FineTuningJobCheckpointMetrics (
  step: Option[BigDecimal],
trainLoss: Option[BigDecimal],
trainMeanTokenAccuracy: Option[BigDecimal],
validLoss: Option[BigDecimal],
validMeanTokenAccuracy: Option[BigDecimal],
fullValidLoss: Option[BigDecimal],
fullValidMeanTokenAccuracy: Option[BigDecimal])

object FineTuningJobCheckpointMetrics {
  import DateTimeCodecs._

  implicit val FineTuningJobCheckpointMetricsCodecJson: CodecJson[FineTuningJobCheckpointMetrics] = CodecJson.derive[FineTuningJobCheckpointMetrics]
  implicit val FineTuningJobCheckpointMetricsDecoder: EntityDecoder[FineTuningJobCheckpointMetrics] = jsonOf[FineTuningJobCheckpointMetrics]
  implicit val FineTuningJobCheckpointMetricsEncoder: EntityEncoder[FineTuningJobCheckpointMetrics] = jsonEncoderOf[FineTuningJobCheckpointMetrics]
}
