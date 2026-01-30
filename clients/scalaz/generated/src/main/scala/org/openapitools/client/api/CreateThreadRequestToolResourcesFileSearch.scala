package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateThreadRequestToolResourcesFileSearch._

case class CreateThreadRequestToolResourcesFileSearch (
  /* The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  */
  vectorStoreIds: Option[List[String]],
/* A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread.  */
  vectorStores: Option[List[CreateThreadRequestToolResourcesFileSearchVectorStoresInner]])

object CreateThreadRequestToolResourcesFileSearch {
  import DateTimeCodecs._

  implicit val CreateThreadRequestToolResourcesFileSearchCodecJson: CodecJson[CreateThreadRequestToolResourcesFileSearch] = CodecJson.derive[CreateThreadRequestToolResourcesFileSearch]
  implicit val CreateThreadRequestToolResourcesFileSearchDecoder: EntityDecoder[CreateThreadRequestToolResourcesFileSearch] = jsonOf[CreateThreadRequestToolResourcesFileSearch]
  implicit val CreateThreadRequestToolResourcesFileSearchEncoder: EntityEncoder[CreateThreadRequestToolResourcesFileSearch] = jsonEncoderOf[CreateThreadRequestToolResourcesFileSearch]
}
