package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateAssistantRequestToolResourcesFileSearchVectorStoresInner._

case class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner (
  /* A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.  */
  fileIds: Option[List[String]],
chunkingStrategy: Option[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy],
/* Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
  metadata: Option[Any])

object CreateAssistantRequestToolResourcesFileSearchVectorStoresInner {
  import DateTimeCodecs._

  implicit val CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerCodecJson: CodecJson[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner] = CodecJson.derive[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner]
  implicit val CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerDecoder: EntityDecoder[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner] = jsonOf[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner]
  implicit val CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerEncoder: EntityEncoder[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner] = jsonEncoderOf[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner]
}
