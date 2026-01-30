package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Represents an individual `user` within an organization.
 * @param _object The object type, which is always `organization.user`
 * @param id The identifier, which can be referenced in API endpoints
 * @param name The name of the user
 * @param email The email address of the user
 * @param role `owner` or `reader`
 * @param addedUnderscoreat The Unix timestamp (in seconds) of when the user was added.
 */
case class User(_object: String,
                id: String,
                name: String,
                email: String,
                role: String,
                addedUnderscoreat: Int
                )

object User {
    /**
     * Creates the codec for converting User from and to JSON.
     */
    implicit val decoder: Decoder[User] = deriveDecoder
    implicit val encoder: ObjectEncoder[User] = deriveEncoder
}
