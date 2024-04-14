package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateFineTuningJobRequestHyperparametersNEpochs._

case class CreateFineTuningJobRequestHyperparametersNEpochs (
  
object CreateFineTuningJobRequestHyperparametersNEpochs {
  import DateTimeCodecs._

  implicit val CreateFineTuningJobRequestHyperparametersNEpochsCodecJson: CodecJson[CreateFineTuningJobRequestHyperparametersNEpochs] = CodecJson.derive[CreateFineTuningJobRequestHyperparametersNEpochs]
  implicit val CreateFineTuningJobRequestHyperparametersNEpochsDecoder: EntityDecoder[CreateFineTuningJobRequestHyperparametersNEpochs] = jsonOf[CreateFineTuningJobRequestHyperparametersNEpochs]
  implicit val CreateFineTuningJobRequestHyperparametersNEpochsEncoder: EntityEncoder[CreateFineTuningJobRequestHyperparametersNEpochs] = jsonEncoderOf[CreateFineTuningJobRequestHyperparametersNEpochs]
}
