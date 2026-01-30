package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The aggregated images usage details of the specific time bucket.
 * @param _object 
 * @param images The number of images processed.
 * @param numUnderscoremodelUnderscorerequests The count of requests made to the model.
 * @param source When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
 * @param size When `group_by=size`, this field provides the image size of the grouped usage result.
 * @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 * @param userUnderscoreid When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @param apiUnderscorekeyUnderscoreid When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @param model When `group_by=model`, this field provides the model name of the grouped usage result.
 */
case class UsageImagesResult(_object: String,
                images: Int,
                numUnderscoremodelUnderscorerequests: Int,
                source: Option[String],
                size: Option[String],
                projectUnderscoreid: Option[String],
                userUnderscoreid: Option[String],
                apiUnderscorekeyUnderscoreid: Option[String],
                model: Option[String]
                )

object UsageImagesResult {
    /**
     * Creates the codec for converting UsageImagesResult from and to JSON.
     */
    implicit val decoder: Decoder[UsageImagesResult] = deriveDecoder
    implicit val encoder: ObjectEncoder[UsageImagesResult] = deriveEncoder
}
