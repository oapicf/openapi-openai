package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import CreateModerationRequestInputOneOfInnerOneOfImageUrl._

case class CreateModerationRequestInputOneOfInnerOneOfImageUrl (
  /* Either a URL of the image or the base64 encoded image data. */
  url: URI)

object CreateModerationRequestInputOneOfInnerOneOfImageUrl {
  import DateTimeCodecs._

  implicit val CreateModerationRequestInputOneOfInnerOneOfImageUrlCodecJson: CodecJson[CreateModerationRequestInputOneOfInnerOneOfImageUrl] = CodecJson.derive[CreateModerationRequestInputOneOfInnerOneOfImageUrl]
  implicit val CreateModerationRequestInputOneOfInnerOneOfImageUrlDecoder: EntityDecoder[CreateModerationRequestInputOneOfInnerOneOfImageUrl] = jsonOf[CreateModerationRequestInputOneOfInnerOneOfImageUrl]
  implicit val CreateModerationRequestInputOneOfInnerOneOfImageUrlEncoder: EntityEncoder[CreateModerationRequestInputOneOfInnerOneOfImageUrl] = jsonEncoderOf[CreateModerationRequestInputOneOfInnerOneOfImageUrl]
}
