package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateVectorStoreRequest._

case class CreateVectorStoreRequest (
  /* A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files. */
  fileIds: Option[List[String]],
/* The name of the vector store. */
  name: Option[String],
expiresAfter: Option[VectorStoreExpirationAfter],
chunkingStrategy: Option[CreateVectorStoreRequestChunkingStrategy],
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
  metadata: Option[Any])

object CreateVectorStoreRequest {
  import DateTimeCodecs._

  implicit val CreateVectorStoreRequestCodecJson: CodecJson[CreateVectorStoreRequest] = CodecJson.derive[CreateVectorStoreRequest]
  implicit val CreateVectorStoreRequestDecoder: EntityDecoder[CreateVectorStoreRequest] = jsonOf[CreateVectorStoreRequest]
  implicit val CreateVectorStoreRequestEncoder: EntityEncoder[CreateVectorStoreRequest] = jsonEncoderOf[CreateVectorStoreRequest]
}
