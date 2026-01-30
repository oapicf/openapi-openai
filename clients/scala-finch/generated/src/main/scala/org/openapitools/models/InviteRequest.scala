package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.InviteRequestProjectsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param email Send an email to this address
 * @param role `owner` or `reader`
 * @param projects An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
 */
case class InviteRequest(email: String,
                role: String,
                projects: Option[Seq[InviteRequestProjectsInner]]
                )

object InviteRequest {
    /**
     * Creates the codec for converting InviteRequest from and to JSON.
     */
    implicit val decoder: Decoder[InviteRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[InviteRequest] = deriveEncoder
}
