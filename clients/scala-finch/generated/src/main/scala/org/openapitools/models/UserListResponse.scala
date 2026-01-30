package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.User
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 */
case class UserListResponse(_object: String,
                data: Seq[User],
                firstUnderscoreid: String,
                lastUnderscoreid: String,
                hasUnderscoremore: Boolean
                )

object UserListResponse {
    /**
     * Creates the codec for converting UserListResponse from and to JSON.
     */
    implicit val decoder: Decoder[UserListResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserListResponse] = deriveEncoder
}
