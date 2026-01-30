package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateVectorStoreFileRequest._

case class CreateVectorStoreFileRequest (
  /* A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files. */
  fileId: String,
chunkingStrategy: Option[ChunkingStrategyRequestParam])

object CreateVectorStoreFileRequest {
  import DateTimeCodecs._

  implicit val CreateVectorStoreFileRequestCodecJson: CodecJson[CreateVectorStoreFileRequest] = CodecJson.derive[CreateVectorStoreFileRequest]
  implicit val CreateVectorStoreFileRequestDecoder: EntityDecoder[CreateVectorStoreFileRequest] = jsonOf[CreateVectorStoreFileRequest]
  implicit val CreateVectorStoreFileRequestEncoder: EntityEncoder[CreateVectorStoreFileRequest] = jsonEncoderOf[CreateVectorStoreFileRequest]
}
