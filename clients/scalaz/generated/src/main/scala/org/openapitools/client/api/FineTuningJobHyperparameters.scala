package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuningJobHyperparameters._

case class FineTuningJobHyperparameters (
  nEpochs: FineTuningJobHyperparametersNEpochs)

object FineTuningJobHyperparameters {
  import DateTimeCodecs._

  implicit val FineTuningJobHyperparametersCodecJson: CodecJson[FineTuningJobHyperparameters] = CodecJson.derive[FineTuningJobHyperparameters]
  implicit val FineTuningJobHyperparametersDecoder: EntityDecoder[FineTuningJobHyperparameters] = jsonOf[FineTuningJobHyperparameters]
  implicit val FineTuningJobHyperparametersEncoder: EntityEncoder[FineTuningJobHyperparameters] = jsonEncoderOf[FineTuningJobHyperparameters]
}
