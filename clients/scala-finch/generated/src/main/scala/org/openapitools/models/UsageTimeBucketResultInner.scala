package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CostsResult
import org.openapitools.models.CostsResultAmount
import org.openapitools.models.UsageAudioSpeechesResult
import org.openapitools.models.UsageAudioTranscriptionsResult
import org.openapitools.models.UsageCodeInterpreterSessionsResult
import org.openapitools.models.UsageCompletionsResult
import org.openapitools.models.UsageEmbeddingsResult
import org.openapitools.models.UsageImagesResult
import org.openapitools.models.UsageModerationsResult
import org.openapitools.models.UsageVectorStoresResult

/**
 * 
 * @param _object 
 * @param inputUnderscoretokens The aggregated number of input tokens used.
 * @param inputUnderscorecachedUnderscoretokens The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
 * @param outputUnderscoretokens The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
 * @param inputUnderscoreaudioUnderscoretokens The aggregated number of audio input tokens used, including cached tokens.
 * @param outputUnderscoreaudioUnderscoretokens The aggregated number of audio output tokens used.
 * @param numUnderscoremodelUnderscorerequests The count of requests made to the model.
 * @param projectUnderscoreid When `group_by=project_id`, this field provides the project ID of the grouped costs result.
 * @param userUnderscoreid When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @param apiUnderscorekeyUnderscoreid When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @param model When `group_by=model`, this field provides the model name of the grouped usage result.
 * @param batch When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
 * @param images The number of images processed.
 * @param source When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
 * @param size When `group_by=size`, this field provides the image size of the grouped usage result.
 * @param characters The number of characters processed.
 * @param seconds The number of seconds processed.
 * @param usageUnderscorebytes The vector stores usage in bytes.
 * @param sessions The number of code interpreter sessions.
 * @param amount 
 * @param lineUnderscoreitem When `group_by=line_item`, this field provides the line item of the grouped costs result.
 */
case class UsageTimeBucketResultInner(_object: String,
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
                batch: Option[Boolean],
                images: Int,
                source: Option[String],
                size: Option[String],
                characters: Int,
                seconds: Int,
                usageUnderscorebytes: Int,
                sessions: Int,
                amount: Option[CostsResultAmount],
                lineUnderscoreitem: Option[String]
                )

object UsageTimeBucketResultInner {
    /**
     * Creates the codec for converting UsageTimeBucketResultInner from and to JSON.
     */
    implicit val decoder: Decoder[UsageTimeBucketResultInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[UsageTimeBucketResultInner] = deriveEncoder
}
