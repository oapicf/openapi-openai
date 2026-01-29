package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateImageRequest._

case class CreateImageRequest (
  /* A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`. */
  prompt: String,
model: Option[CreateImageRequestModel],
/* The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. */
  n: Option[Integer],
/* The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`. */
  quality: Option[Quality],
/* The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. */
  responseFormat: Option[ResponseFormat],
/* The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models. */
  size: Option[Size],
/* The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`. */
  style: Option[Style],
/* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
  user: Option[String])

object CreateImageRequest {
  import DateTimeCodecs._
  sealed trait Quality
  case object Standard extends Quality
  case object Hd extends Quality

  object Quality {
    def toQuality(s: String): Option[Quality] = s match {
      case "Standard" => Some(Standard)
      case "Hd" => Some(Hd)
      case _ => None
    }

    def fromQuality(x: Quality): String = x match {
      case Standard => "Standard"
      case Hd => "Hd"
    }
  }

  implicit val QualityEnumEncoder: EncodeJson[Quality] =
    EncodeJson[Quality](is => StringEncodeJson(Quality.fromQuality(is)))

  implicit val QualityEnumDecoder: DecodeJson[Quality] =
    DecodeJson.optionDecoder[Quality](n => n.string.flatMap(jStr => Quality.toQuality(jStr)), "Quality failed to de-serialize")
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
  sealed trait Size
  case object `256x256` extends Size
  case object `512x512` extends Size
  case object `1024x1024` extends Size
  case object `1792x1024` extends Size
  case object `1024x1792` extends Size

  object Size {
    def toSize(s: String): Option[Size] = s match {
      case "`256x256`" => Some(`256x256`)
      case "`512x512`" => Some(`512x512`)
      case "`1024x1024`" => Some(`1024x1024`)
      case "`1792x1024`" => Some(`1792x1024`)
      case "`1024x1792`" => Some(`1024x1792`)
      case _ => None
    }

    def fromSize(x: Size): String = x match {
      case `256x256` => "`256x256`"
      case `512x512` => "`512x512`"
      case `1024x1024` => "`1024x1024`"
      case `1792x1024` => "`1792x1024`"
      case `1024x1792` => "`1024x1792`"
    }
  }

  implicit val SizeEnumEncoder: EncodeJson[Size] =
    EncodeJson[Size](is => StringEncodeJson(Size.fromSize(is)))

  implicit val SizeEnumDecoder: DecodeJson[Size] =
    DecodeJson.optionDecoder[Size](n => n.string.flatMap(jStr => Size.toSize(jStr)), "Size failed to de-serialize")
  sealed trait Style
  case object Vivid extends Style
  case object Natural extends Style

  object Style {
    def toStyle(s: String): Option[Style] = s match {
      case "Vivid" => Some(Vivid)
      case "Natural" => Some(Natural)
      case _ => None
    }

    def fromStyle(x: Style): String = x match {
      case Vivid => "Vivid"
      case Natural => "Natural"
    }
  }

  implicit val StyleEnumEncoder: EncodeJson[Style] =
    EncodeJson[Style](is => StringEncodeJson(Style.fromStyle(is)))

  implicit val StyleEnumDecoder: DecodeJson[Style] =
    DecodeJson.optionDecoder[Style](n => n.string.flatMap(jStr => Style.toStyle(jStr)), "Style failed to de-serialize")

  implicit val CreateImageRequestCodecJson: CodecJson[CreateImageRequest] = CodecJson.derive[CreateImageRequest]
  implicit val CreateImageRequestDecoder: EntityDecoder[CreateImageRequest] = jsonOf[CreateImageRequest]
  implicit val CreateImageRequestEncoder: EntityEncoder[CreateImageRequest] = jsonEncoderOf[CreateImageRequest]
}
