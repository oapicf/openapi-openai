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
case class InviteProjectsInner(id: Option[String],
                role: Option[String]
                )

object InviteProjectsInner {
    /**
     * Creates the codec for converting InviteProjectsInner from and to JSON.
     */
    implicit val decoder: Decoder[InviteProjectsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[InviteProjectsInner] = deriveEncoder
}
