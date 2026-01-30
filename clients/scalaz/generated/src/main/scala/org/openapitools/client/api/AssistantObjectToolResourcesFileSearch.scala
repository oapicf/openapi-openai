package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssistantObjectToolResourcesFileSearch._

case class AssistantObjectToolResourcesFileSearch (
  /* The ID of the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  */
  vectorStoreIds: Option[List[String]])

object AssistantObjectToolResourcesFileSearch {
  import DateTimeCodecs._

  implicit val AssistantObjectToolResourcesFileSearchCodecJson: CodecJson[AssistantObjectToolResourcesFileSearch] = CodecJson.derive[AssistantObjectToolResourcesFileSearch]
  implicit val AssistantObjectToolResourcesFileSearchDecoder: EntityDecoder[AssistantObjectToolResourcesFileSearch] = jsonOf[AssistantObjectToolResourcesFileSearch]
  implicit val AssistantObjectToolResourcesFileSearchEncoder: EntityEncoder[AssistantObjectToolResourcesFileSearch] = jsonEncoderOf[AssistantObjectToolResourcesFileSearch]
}
