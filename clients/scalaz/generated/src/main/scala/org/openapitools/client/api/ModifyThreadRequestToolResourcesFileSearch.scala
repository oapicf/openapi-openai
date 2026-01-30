package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ModifyThreadRequestToolResourcesFileSearch._

case class ModifyThreadRequestToolResourcesFileSearch (
  /* The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  */
  vectorStoreIds: Option[List[String]])

object ModifyThreadRequestToolResourcesFileSearch {
  import DateTimeCodecs._

  implicit val ModifyThreadRequestToolResourcesFileSearchCodecJson: CodecJson[ModifyThreadRequestToolResourcesFileSearch] = CodecJson.derive[ModifyThreadRequestToolResourcesFileSearch]
  implicit val ModifyThreadRequestToolResourcesFileSearchDecoder: EntityDecoder[ModifyThreadRequestToolResourcesFileSearch] = jsonOf[ModifyThreadRequestToolResourcesFileSearch]
  implicit val ModifyThreadRequestToolResourcesFileSearchEncoder: EntityEncoder[ModifyThreadRequestToolResourcesFileSearch] = jsonEncoderOf[ModifyThreadRequestToolResourcesFileSearch]
}
