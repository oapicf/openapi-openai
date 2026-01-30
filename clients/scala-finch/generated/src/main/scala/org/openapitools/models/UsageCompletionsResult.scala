package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The aggregated completions usage details of the specific time bucket.
 * @param _object 
 * @param inputUnderscoretokens The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
 * @param inputUnderscorecachedUnderscoretokens The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
 * @param outputUnderscoretokens The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
 * @param inputUnderscoreaudioUnderscoretokens The aggregated number of audio input tokens used, including cached tokens.
 * @param outputUnderscoreaudioUnderscoretokens The aggregated number of audio output tokens used.
 * @param numUnderscoremodelUnderscorerequests The count of requests made to the model.
 * @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 * @param userUnderscoreid When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @param apiUnderscorekeyUnderscoreid When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @param model When `group_by=model`, this field provides the model name of the grouped usage result.
 * @param batch When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
 */
case class UsageCompletionsResult(_object: String,
                inputUnderscoretokens: Int,
                inputUnderscorecachedUnderscoretokens: Option[Int],
                outputUnderscoretokens: Int,
                inputUnderscoreaudioUnderscoretokens: Option[Int],
                outputUnderscoreaudioUnderscoretokens: Option[Int],
                numUnderscoremodelUnderscorerequests: Int,
                projectUnderscoreid: Option[String],
                userUnderscoreid: Option[String],
                apiUnderscorekeyUnderscoreid: Option[String],
                model: Option[String],
                batch: Option[Boolean]
                )

object UsageCompletionsResult {
    /**
     * Creates the codec for converting UsageCompletionsResult from and to JSON.
     */
    implicit val decoder: Decoder[UsageCompletionsResult] = deriveDecoder
    implicit val encoder: ObjectEncoder[UsageCompletionsResult] = deriveEncoder
}
