package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateImageRequest._

case class CreateImageRequest (
  /* A text description of the desired image(s). The maximum length is 1000 characters. */
  prompt: String,
/* The number of images to generate. Must be between 1 and 10. */
  n: Option[Integer],
/* The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. */
  size: Option[Size],
/* The format in which the generated images are returned. Must be one of `url` or `b64_json`. */
  responseFormat: Option[ResponseFormat],
/* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
  user: Option[String])

object CreateImageRequest {
  import DateTimeCodecs._
  sealed trait Size
  case object `256x256` extends Size
  case object `512x512` extends Size
  case object `1024x1024` extends Size

  object Size {
    def toSize(s: String): Option[Size] = s match {
      case "`256x256`" => Some(`256x256`)
      case "`512x512`" => Some(`512x512`)
      case "`1024x1024`" => Some(`1024x1024`)
      case _ => None
    }

    def fromSize(x: Size): String = x match {
      case `256x256` => "`256x256`"
      case `512x512` => "`512x512`"
      case `1024x1024` => "`1024x1024`"
    }
  }

  implicit val SizeEnumEncoder: EncodeJson[Size] =
    EncodeJson[Size](is => StringEncodeJson(Size.fromSize(is)))

  implicit val SizeEnumDecoder: DecodeJson[Size] =
    DecodeJson.optionDecoder[Size](n => n.string.flatMap(jStr => Size.toSize(jStr)), "Size failed to de-serialize")
  sealed trait ResponseFormat
  case object Url extends ResponseFormat
  case object B64Json extends ResponseFormat

  object ResponseFormat {
    def toResponseFormat(s: String): Option[ResponseFormat] = s match {
      case "Url" => Some(Url)
      case "B64Json" => Some(B64Json)
      case _ => None
    }

    def fromResponseFormat(x: ResponseFormat): String = x match {
      case Url => "Url"
      case B64Json => "B64Json"
    }
  }

  implicit val ResponseFormatEnumEncoder: EncodeJson[ResponseFormat] =
    EncodeJson[ResponseFormat](is => StringEncodeJson(ResponseFormat.fromResponseFormat(is)))

  implicit val ResponseFormatEnumDecoder: DecodeJson[ResponseFormat] =
    DecodeJson.optionDecoder[ResponseFormat](n => n.string.flatMap(jStr => ResponseFormat.toResponseFormat(jStr)), "ResponseFormat failed to de-serialize")

  implicit val CreateImageRequestCodecJson: CodecJson[CreateImageRequest] = CodecJson.derive[CreateImageRequest]
  implicit val CreateImageRequestDecoder: EntityDecoder[CreateImageRequest] = jsonOf[CreateImageRequest]
  implicit val CreateImageRequestEncoder: EntityEncoder[CreateImageRequest] = jsonEncoderOf[CreateImageRequest]
}
