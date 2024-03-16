package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ImagesResponseDataInner._

case class ImagesResponseDataInner (
  url: Option[String],
b64Json: Option[String])

object ImagesResponseDataInner {
  import DateTimeCodecs._

  implicit val ImagesResponseDataInnerCodecJson: CodecJson[ImagesResponseDataInner] = CodecJson.derive[ImagesResponseDataInner]
  implicit val ImagesResponseDataInnerDecoder: EntityDecoder[ImagesResponseDataInner] = jsonOf[ImagesResponseDataInner]
  implicit val ImagesResponseDataInnerEncoder: EntityEncoder[ImagesResponseDataInner] = jsonEncoderOf[ImagesResponseDataInner]
}
