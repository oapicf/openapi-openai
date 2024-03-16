package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateCompletionResponseUsage
import org.openapitools.models.CreateEditResponseChoicesInner
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param created 
 * @param choices 
 * @param usage 
 */
case class CreateEditResponse(_object: String,
                created: Int,
                choices: Seq[CreateEditResponseChoicesInner],
                usage: CreateCompletionResponseUsage
                )

object CreateEditResponse {
    /**
     * Creates the codec for converting CreateEditResponse from and to JSON.
     */
    implicit val decoder: Decoder[CreateEditResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateEditResponse] = deriveEncoder
}
