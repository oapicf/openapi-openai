package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ModifyAssistantRequestToolResourcesFileSearch._

case class ModifyAssistantRequestToolResourcesFileSearch (
  /* Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  */
  vectorStoreIds: Option[List[String]])

object ModifyAssistantRequestToolResourcesFileSearch {
  import DateTimeCodecs._

  implicit val ModifyAssistantRequestToolResourcesFileSearchCodecJson: CodecJson[ModifyAssistantRequestToolResourcesFileSearch] = CodecJson.derive[ModifyAssistantRequestToolResourcesFileSearch]
  implicit val ModifyAssistantRequestToolResourcesFileSearchDecoder: EntityDecoder[ModifyAssistantRequestToolResourcesFileSearch] = jsonOf[ModifyAssistantRequestToolResourcesFileSearch]
  implicit val ModifyAssistantRequestToolResourcesFileSearchEncoder: EntityEncoder[ModifyAssistantRequestToolResourcesFileSearch] = jsonEncoderOf[ModifyAssistantRequestToolResourcesFileSearch]
}
