package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuneDPOMethodHyperparametersNEpochs._

case class FineTuneDPOMethodHyperparametersNEpochs (
  
object FineTuneDPOMethodHyperparametersNEpochs {
  import DateTimeCodecs._

  implicit val FineTuneDPOMethodHyperparametersNEpochsCodecJson: CodecJson[FineTuneDPOMethodHyperparametersNEpochs] = CodecJson.derive[FineTuneDPOMethodHyperparametersNEpochs]
  implicit val FineTuneDPOMethodHyperparametersNEpochsDecoder: EntityDecoder[FineTuneDPOMethodHyperparametersNEpochs] = jsonOf[FineTuneDPOMethodHyperparametersNEpochs]
  implicit val FineTuneDPOMethodHyperparametersNEpochsEncoder: EntityEncoder[FineTuneDPOMethodHyperparametersNEpochs] = jsonEncoderOf[FineTuneDPOMethodHyperparametersNEpochs]
}
