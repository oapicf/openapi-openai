package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateEmbeddingRequestModel._

case class CreateEmbeddingRequestModel (
  
object CreateEmbeddingRequestModel {
  import DateTimeCodecs._

  implicit val CreateEmbeddingRequestModelCodecJson: CodecJson[CreateEmbeddingRequestModel] = CodecJson.derive[CreateEmbeddingRequestModel]
  implicit val CreateEmbeddingRequestModelDecoder: EntityDecoder[CreateEmbeddingRequestModel] = jsonOf[CreateEmbeddingRequestModel]
  implicit val CreateEmbeddingRequestModelEncoder: EntityEncoder[CreateEmbeddingRequestModel] = jsonEncoderOf[CreateEmbeddingRequestModel]
}
