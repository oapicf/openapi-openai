package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuningJobHyperparametersNEpochs._

case class FineTuningJobHyperparametersNEpochs (
  
object FineTuningJobHyperparametersNEpochs {
  import DateTimeCodecs._

  implicit val FineTuningJobHyperparametersNEpochsCodecJson: CodecJson[FineTuningJobHyperparametersNEpochs] = CodecJson.derive[FineTuningJobHyperparametersNEpochs]
  implicit val FineTuningJobHyperparametersNEpochsDecoder: EntityDecoder[FineTuningJobHyperparametersNEpochs] = jsonOf[FineTuningJobHyperparametersNEpochs]
  implicit val FineTuningJobHyperparametersNEpochsEncoder: EntityEncoder[FineTuningJobHyperparametersNEpochs] = jsonEncoderOf[FineTuningJobHyperparametersNEpochs]
}
