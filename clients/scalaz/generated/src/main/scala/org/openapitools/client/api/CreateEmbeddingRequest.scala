package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateEmbeddingRequest._

case class CreateEmbeddingRequest (
  input: CreateEmbeddingRequestInput,
model: CreateEmbeddingRequestModel,
/* The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/). */
  encodingFormat: Option[EncodingFormat],
/* The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.  */
  dimensions: Option[Integer],
/* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  */
  user: Option[String])

object CreateEmbeddingRequest {
  import DateTimeCodecs._
  sealed trait EncodingFormat
  case object Float extends EncodingFormat
  case object Base64 extends EncodingFormat

  object EncodingFormat {
    def toEncodingFormat(s: String): Option[EncodingFormat] = s match {
      case "Float" => Some(Float)
      case "Base64" => Some(Base64)
      case _ => None
    }

    def fromEncodingFormat(x: EncodingFormat): String = x match {
      case Float => "Float"
      case Base64 => "Base64"
    }
  }

  implicit val EncodingFormatEnumEncoder: EncodeJson[EncodingFormat] =
    EncodeJson[EncodingFormat](is => StringEncodeJson(EncodingFormat.fromEncodingFormat(is)))

  implicit val EncodingFormatEnumDecoder: DecodeJson[EncodingFormat] =
    DecodeJson.optionDecoder[EncodingFormat](n => n.string.flatMap(jStr => EncodingFormat.toEncodingFormat(jStr)), "EncodingFormat failed to de-serialize")

  implicit val CreateEmbeddingRequestCodecJson: CodecJson[CreateEmbeddingRequest] = CodecJson.derive[CreateEmbeddingRequest]
  implicit val CreateEmbeddingRequestDecoder: EntityDecoder[CreateEmbeddingRequest] = jsonOf[CreateEmbeddingRequest]
  implicit val CreateEmbeddingRequestEncoder: EntityEncoder[CreateEmbeddingRequest] = jsonEncoderOf[CreateEmbeddingRequest]
}
