package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuneDPOMethodHyperparametersBeta._

case class FineTuneDPOMethodHyperparametersBeta (
  
object FineTuneDPOMethodHyperparametersBeta {
  import DateTimeCodecs._

  implicit val FineTuneDPOMethodHyperparametersBetaCodecJson: CodecJson[FineTuneDPOMethodHyperparametersBeta] = CodecJson.derive[FineTuneDPOMethodHyperparametersBeta]
  implicit val FineTuneDPOMethodHyperparametersBetaDecoder: EntityDecoder[FineTuneDPOMethodHyperparametersBeta] = jsonOf[FineTuneDPOMethodHyperparametersBeta]
  implicit val FineTuneDPOMethodHyperparametersBetaEncoder: EntityEncoder[FineTuneDPOMethodHyperparametersBeta] = jsonEncoderOf[FineTuneDPOMethodHyperparametersBeta]
}
