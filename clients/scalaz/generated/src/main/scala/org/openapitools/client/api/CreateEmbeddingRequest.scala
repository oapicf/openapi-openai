package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateEmbeddingRequest._

case class CreateEmbeddingRequest (
  model: CreateEmbeddingRequestModel,
input: CreateEmbeddingRequestInput,
/* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
  user: Option[String])

object CreateEmbeddingRequest {
  import DateTimeCodecs._

  implicit val CreateEmbeddingRequestCodecJson: CodecJson[CreateEmbeddingRequest] = CodecJson.derive[CreateEmbeddingRequest]
  implicit val CreateEmbeddingRequestDecoder: EntityDecoder[CreateEmbeddingRequest] = jsonOf[CreateEmbeddingRequest]
  implicit val CreateEmbeddingRequestEncoder: EntityEncoder[CreateEmbeddingRequest] = jsonEncoderOf[CreateEmbeddingRequest]
}
