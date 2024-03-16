package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateEmbeddingResponseUsage._

case class CreateEmbeddingResponseUsage (
  promptTokens: Integer,
totalTokens: Integer)

object CreateEmbeddingResponseUsage {
  import DateTimeCodecs._

  implicit val CreateEmbeddingResponseUsageCodecJson: CodecJson[CreateEmbeddingResponseUsage] = CodecJson.derive[CreateEmbeddingResponseUsage]
  implicit val CreateEmbeddingResponseUsageDecoder: EntityDecoder[CreateEmbeddingResponseUsage] = jsonOf[CreateEmbeddingResponseUsage]
  implicit val CreateEmbeddingResponseUsageEncoder: EntityEncoder[CreateEmbeddingResponseUsage] = jsonEncoderOf[CreateEmbeddingResponseUsage]
}
