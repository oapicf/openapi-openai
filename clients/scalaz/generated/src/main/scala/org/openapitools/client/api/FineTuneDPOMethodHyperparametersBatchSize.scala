package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuneDPOMethodHyperparametersBatchSize._

case class FineTuneDPOMethodHyperparametersBatchSize (
  
object FineTuneDPOMethodHyperparametersBatchSize {
  import DateTimeCodecs._

  implicit val FineTuneDPOMethodHyperparametersBatchSizeCodecJson: CodecJson[FineTuneDPOMethodHyperparametersBatchSize] = CodecJson.derive[FineTuneDPOMethodHyperparametersBatchSize]
  implicit val FineTuneDPOMethodHyperparametersBatchSizeDecoder: EntityDecoder[FineTuneDPOMethodHyperparametersBatchSize] = jsonOf[FineTuneDPOMethodHyperparametersBatchSize]
  implicit val FineTuneDPOMethodHyperparametersBatchSizeEncoder: EntityEncoder[FineTuneDPOMethodHyperparametersBatchSize] = jsonEncoderOf[FineTuneDPOMethodHyperparametersBatchSize]
}
