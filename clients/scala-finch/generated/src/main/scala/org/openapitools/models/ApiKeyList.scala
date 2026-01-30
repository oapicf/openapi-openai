package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdminApiKey
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param hasUnderscoremore 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 */
case class ApiKeyList(_object: Option[String],
                data: Option[Seq[AdminApiKey]],
                hasUnderscoremore: Option[Boolean],
                firstUnderscoreid: Option[String],
                lastUnderscoreid: Option[String]
                )

object ApiKeyList {
    /**
     * Creates the codec for converting ApiKeyList from and to JSON.
     */
    implicit val decoder: Decoder[ApiKeyList] = deriveDecoder
    implicit val encoder: ObjectEncoder[ApiKeyList] = deriveEncoder
}
