package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateEmbeddingResponseDataInner._

case class CreateEmbeddingResponseDataInner (
  index: Integer,
`object`: String,
embedding: List[BigDecimal])

object CreateEmbeddingResponseDataInner {
  import DateTimeCodecs._

  implicit val CreateEmbeddingResponseDataInnerCodecJson: CodecJson[CreateEmbeddingResponseDataInner] = CodecJson.derive[CreateEmbeddingResponseDataInner]
  implicit val CreateEmbeddingResponseDataInnerDecoder: EntityDecoder[CreateEmbeddingResponseDataInner] = jsonOf[CreateEmbeddingResponseDataInner]
  implicit val CreateEmbeddingResponseDataInnerEncoder: EntityEncoder[CreateEmbeddingResponseDataInner] = jsonEncoderOf[CreateEmbeddingResponseDataInner]
}
