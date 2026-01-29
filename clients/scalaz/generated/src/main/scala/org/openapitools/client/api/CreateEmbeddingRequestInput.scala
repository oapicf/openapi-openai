package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateEmbeddingRequestInput._

case class CreateEmbeddingRequestInput (
  
object CreateEmbeddingRequestInput {
  import DateTimeCodecs._

  implicit val CreateEmbeddingRequestInputCodecJson: CodecJson[CreateEmbeddingRequestInput] = CodecJson.derive[CreateEmbeddingRequestInput]
  implicit val CreateEmbeddingRequestInputDecoder: EntityDecoder[CreateEmbeddingRequestInput] = jsonOf[CreateEmbeddingRequestInput]
  implicit val CreateEmbeddingRequestInputEncoder: EntityEncoder[CreateEmbeddingRequestInput] = jsonEncoderOf[CreateEmbeddingRequestInput]
}
