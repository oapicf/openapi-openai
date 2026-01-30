package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param vectorUnderscorestoreUnderscoreids The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
 */
case class ModifyThreadRequestToolResourcesFileSearch(vectorUnderscorestoreUnderscoreids: Option[Seq[String]]
                )

object ModifyThreadRequestToolResourcesFileSearch {
    /**
     * Creates the codec for converting ModifyThreadRequestToolResourcesFileSearch from and to JSON.
     */
    implicit val decoder: Decoder[ModifyThreadRequestToolResourcesFileSearch] = deriveDecoder
    implicit val encoder: ObjectEncoder[ModifyThreadRequestToolResourcesFileSearch] = deriveEncoder
}
