package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The aggregated audio speeches usage details of the specific time bucket.
 * @param _object 
 * @param characters The number of characters processed.
 * @param numUnderscoremodelUnderscorerequests The count of requests made to the model.
 * @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 * @param userUnderscoreid When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @param apiUnderscorekeyUnderscoreid When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @param model When `group_by=model`, this field provides the model name of the grouped usage result.
 */
case class UsageAudioSpeechesResult(_object: String,
                characters: Int,
                numUnderscoremodelUnderscorerequests: Int,
                projectUnderscoreid: Option[String],
                userUnderscoreid: Option[String],
                apiUnderscorekeyUnderscoreid: Option[String],
                model: Option[String]
                )

object UsageAudioSpeechesResult {
    /**
     * Creates the codec for converting UsageAudioSpeechesResult from and to JSON.
     */
    implicit val decoder: Decoder[UsageAudioSpeechesResult] = deriveDecoder
    implicit val encoder: ObjectEncoder[UsageAudioSpeechesResult] = deriveEncoder
}
