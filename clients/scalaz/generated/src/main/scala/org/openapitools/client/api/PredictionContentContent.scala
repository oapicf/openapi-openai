package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PredictionContentContent._

case class PredictionContentContent (
  
object PredictionContentContent {
  import DateTimeCodecs._

  implicit val PredictionContentContentCodecJson: CodecJson[PredictionContentContent] = CodecJson.derive[PredictionContentContent]
  implicit val PredictionContentContentDecoder: EntityDecoder[PredictionContentContent] = jsonOf[PredictionContentContent]
  implicit val PredictionContentContentEncoder: EntityEncoder[PredictionContentContent] = jsonEncoderOf[PredictionContentContent]
}
