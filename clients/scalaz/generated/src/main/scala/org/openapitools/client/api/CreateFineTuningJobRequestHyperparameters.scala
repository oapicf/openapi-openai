package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateFineTuningJobRequestHyperparameters._

case class CreateFineTuningJobRequestHyperparameters (
  batchSize: Option[CreateFineTuningJobRequestHyperparametersBatchSize],
learningRateMultiplier: Option[CreateFineTuningJobRequestHyperparametersLearningRateMultiplier],
nEpochs: Option[CreateFineTuningJobRequestHyperparametersNEpochs])

object CreateFineTuningJobRequestHyperparameters {
  import DateTimeCodecs._

  implicit val CreateFineTuningJobRequestHyperparametersCodecJson: CodecJson[CreateFineTuningJobRequestHyperparameters] = CodecJson.derive[CreateFineTuningJobRequestHyperparameters]
  implicit val CreateFineTuningJobRequestHyperparametersDecoder: EntityDecoder[CreateFineTuningJobRequestHyperparameters] = jsonOf[CreateFineTuningJobRequestHyperparameters]
  implicit val CreateFineTuningJobRequestHyperparametersEncoder: EntityEncoder[CreateFineTuningJobRequestHyperparameters] = jsonEncoderOf[CreateFineTuningJobRequestHyperparameters]
}
