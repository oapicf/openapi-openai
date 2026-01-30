package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateThreadRequestToolResourcesFileSearchVectorStoresInner._

case class CreateThreadRequestToolResourcesFileSearchVectorStoresInner (
  /* A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.  */
  fileIds: Option[List[String]],
chunkingStrategy: Option[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy],
/* Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
  metadata: Option[Any])

object CreateThreadRequestToolResourcesFileSearchVectorStoresInner {
  import DateTimeCodecs._

  implicit val CreateThreadRequestToolResourcesFileSearchVectorStoresInnerCodecJson: CodecJson[CreateThreadRequestToolResourcesFileSearchVectorStoresInner] = CodecJson.derive[CreateThreadRequestToolResourcesFileSearchVectorStoresInner]
  implicit val CreateThreadRequestToolResourcesFileSearchVectorStoresInnerDecoder: EntityDecoder[CreateThreadRequestToolResourcesFileSearchVectorStoresInner] = jsonOf[CreateThreadRequestToolResourcesFileSearchVectorStoresInner]
  implicit val CreateThreadRequestToolResourcesFileSearchVectorStoresInnerEncoder: EntityEncoder[CreateThreadRequestToolResourcesFileSearchVectorStoresInner] = jsonEncoderOf[CreateThreadRequestToolResourcesFileSearchVectorStoresInner]
}
