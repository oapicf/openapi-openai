package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateAssistantRequestToolResourcesFileSearch._

case class CreateAssistantRequestToolResourcesFileSearch (
  /* The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  */
  vectorStoreIds: Option[List[String]],
/* A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant.  */
  vectorStores: Option[List[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner]])

object CreateAssistantRequestToolResourcesFileSearch {
  import DateTimeCodecs._

  implicit val CreateAssistantRequestToolResourcesFileSearchCodecJson: CodecJson[CreateAssistantRequestToolResourcesFileSearch] = CodecJson.derive[CreateAssistantRequestToolResourcesFileSearch]
  implicit val CreateAssistantRequestToolResourcesFileSearchDecoder: EntityDecoder[CreateAssistantRequestToolResourcesFileSearch] = jsonOf[CreateAssistantRequestToolResourcesFileSearch]
  implicit val CreateAssistantRequestToolResourcesFileSearchEncoder: EntityEncoder[CreateAssistantRequestToolResourcesFileSearch] = jsonEncoderOf[CreateAssistantRequestToolResourcesFileSearch]
}
