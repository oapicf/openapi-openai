package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuneDPOMethodHyperparameters._

case class FineTuneDPOMethodHyperparameters (
  beta: Option[FineTuneDPOMethodHyperparametersBeta],
batchSize: Option[FineTuneDPOMethodHyperparametersBatchSize],
learningRateMultiplier: Option[FineTuneDPOMethodHyperparametersLearningRateMultiplier],
nEpochs: Option[FineTuneDPOMethodHyperparametersNEpochs])

object FineTuneDPOMethodHyperparameters {
  import DateTimeCodecs._

  implicit val FineTuneDPOMethodHyperparametersCodecJson: CodecJson[FineTuneDPOMethodHyperparameters] = CodecJson.derive[FineTuneDPOMethodHyperparameters]
  implicit val FineTuneDPOMethodHyperparametersDecoder: EntityDecoder[FineTuneDPOMethodHyperparameters] = jsonOf[FineTuneDPOMethodHyperparameters]
  implicit val FineTuneDPOMethodHyperparametersEncoder: EntityEncoder[FineTuneDPOMethodHyperparameters] = jsonEncoderOf[FineTuneDPOMethodHyperparameters]
}
