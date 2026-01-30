package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateVectorStoreFileBatchRequest._

case class CreateVectorStoreFileBatchRequest (
  /* A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files. */
  fileIds: List[String],
chunkingStrategy: Option[ChunkingStrategyRequestParam])

object CreateVectorStoreFileBatchRequest {
  import DateTimeCodecs._

  implicit val CreateVectorStoreFileBatchRequestCodecJson: CodecJson[CreateVectorStoreFileBatchRequest] = CodecJson.derive[CreateVectorStoreFileBatchRequest]
  implicit val CreateVectorStoreFileBatchRequestDecoder: EntityDecoder[CreateVectorStoreFileBatchRequest] = jsonOf[CreateVectorStoreFileBatchRequest]
  implicit val CreateVectorStoreFileBatchRequestEncoder: EntityEncoder[CreateVectorStoreFileBatchRequest] = jsonEncoderOf[CreateVectorStoreFileBatchRequest]
}
