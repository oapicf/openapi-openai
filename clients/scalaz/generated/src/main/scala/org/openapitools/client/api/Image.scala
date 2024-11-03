package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Image._

case class Image (
  /* The base64-encoded JSON of the generated image, if `response_format` is `b64_json`. */
  b64Json: Option[String],
/* The URL of the generated image, if `response_format` is `url` (default). */
  url: Option[String],
/* The prompt that was used to generate the image, if there was any revision to the prompt. */
  revisedPrompt: Option[String])

object Image {
  import DateTimeCodecs._

  implicit val ImageCodecJson: CodecJson[Image] = CodecJson.derive[Image]
  implicit val ImageDecoder: EntityDecoder[Image] = jsonOf[Image]
  implicit val ImageEncoder: EntityEncoder[Image] = jsonEncoderOf[Image]
}
