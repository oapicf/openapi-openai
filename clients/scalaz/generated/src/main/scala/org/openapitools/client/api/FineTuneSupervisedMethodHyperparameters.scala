package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuneSupervisedMethodHyperparameters._

case class FineTuneSupervisedMethodHyperparameters (
  batchSize: Option[FineTuneDPOMethodHyperparametersBatchSize],
learningRateMultiplier: Option[FineTuneDPOMethodHyperparametersLearningRateMultiplier],
nEpochs: Option[FineTuneDPOMethodHyperparametersNEpochs])

object FineTuneSupervisedMethodHyperparameters {
  import DateTimeCodecs._

  implicit val FineTuneSupervisedMethodHyperparametersCodecJson: CodecJson[FineTuneSupervisedMethodHyperparameters] = CodecJson.derive[FineTuneSupervisedMethodHyperparameters]
  implicit val FineTuneSupervisedMethodHyperparametersDecoder: EntityDecoder[FineTuneSupervisedMethodHyperparameters] = jsonOf[FineTuneSupervisedMethodHyperparameters]
  implicit val FineTuneSupervisedMethodHyperparametersEncoder: EntityEncoder[FineTuneSupervisedMethodHyperparameters] = jsonEncoderOf[FineTuneSupervisedMethodHyperparameters]
}
