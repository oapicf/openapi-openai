package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssistantsApiResponseFormatOption
import org.openapitools.models.AssistantsApiToolChoiceOption
import org.openapitools.models.BigDecimal
import org.openapitools.models.CreateRunRequestModel
import org.openapitools.models.CreateThreadAndRunRequestToolsInner
import org.openapitools.models.CreateThreadRequest
import org.openapitools.models.TruncationObject
import scala.collection.immutable.Seq

/**
 * 
 * @param assistantUnderscoreid The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
 * @param thread 
 * @param model 
 * @param instructions Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
 * @param tools Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
 * @param stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
 * @param maxUnderscorepromptUnderscoretokens The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
 * @param maxUnderscorecompletionUnderscoretokens The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
 * @param truncationUnderscorestrategy 
 * @param toolUnderscorechoice 
 * @param responseUnderscoreformat 
 */
case class CreateThreadAndRunRequest(assistantUnderscoreid: String,
                thread: Option[CreateThreadRequest],
                model: Option[CreateRunRequestModel],
                instructions: Option[String],
                tools: Option[Seq[CreateThreadAndRunRequestToolsInner]],
                metadata: Option[Object],
                temperature: Option[BigDecimal],
                stream: Option[Boolean],
                maxUnderscorepromptUnderscoretokens: Option[Int],
                maxUnderscorecompletionUnderscoretokens: Option[Int],
                truncationUnderscorestrategy: Option[TruncationObject],
                toolUnderscorechoice: Option[AssistantsApiToolChoiceOption],
                responseUnderscoreformat: Option[AssistantsApiResponseFormatOption]
                )

object CreateThreadAndRunRequest {
    /**
     * Creates the codec for converting CreateThreadAndRunRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateThreadAndRunRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateThreadAndRunRequest] = deriveEncoder
}
