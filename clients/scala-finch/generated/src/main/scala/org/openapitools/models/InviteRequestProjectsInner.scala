package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id Project's public ID
 * @param role Project membership role
 */
case class InviteRequestProjectsInner(id: String,
                role: String
                )

object InviteRequestProjectsInner {
    /**
     * Creates the codec for converting InviteRequestProjectsInner from and to JSON.
     */
    implicit val decoder: Decoder[InviteRequestProjectsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[InviteRequestProjectsInner] = deriveEncoder
}
