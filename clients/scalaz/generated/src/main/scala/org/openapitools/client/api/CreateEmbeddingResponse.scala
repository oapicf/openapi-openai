package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateEmbeddingResponse._

case class CreateEmbeddingResponse (
  `object`: String,
model: String,
data: List[CreateEmbeddingResponseDataInner],
usage: CreateEmbeddingResponseUsage)

object CreateEmbeddingResponse {
  import DateTimeCodecs._

  implicit val CreateEmbeddingResponseCodecJson: CodecJson[CreateEmbeddingResponse] = CodecJson.derive[CreateEmbeddingResponse]
  implicit val CreateEmbeddingResponseDecoder: EntityDecoder[CreateEmbeddingResponse] = jsonOf[CreateEmbeddingResponse]
  implicit val CreateEmbeddingResponseEncoder: EntityEncoder[CreateEmbeddingResponse] = jsonEncoderOf[CreateEmbeddingResponse]
}
