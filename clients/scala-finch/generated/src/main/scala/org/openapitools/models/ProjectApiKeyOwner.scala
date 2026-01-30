package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ProjectServiceAccount
import org.openapitools.models.ProjectUser

/**
 * 
 * @param _type `user` or `service_account`
 * @param user 
 * @param serviceUnderscoreaccount 
 */
case class ProjectApiKeyOwner(_type: Option[String],
                user: Option[ProjectUser],
                serviceUnderscoreaccount: Option[ProjectServiceAccount]
                )

object ProjectApiKeyOwner {
    /**
     * Creates the codec for converting ProjectApiKeyOwner from and to JSON.
     */
    implicit val decoder: Decoder[ProjectApiKeyOwner] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProjectApiKeyOwner] = deriveEncoder
}
