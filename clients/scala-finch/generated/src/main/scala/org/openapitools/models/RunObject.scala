package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssistantObjectToolsInner
import org.openapitools.models.AssistantsApiResponseFormatOption
import org.openapitools.models.AssistantsApiToolChoiceOption
import org.openapitools.models.BigDecimal
import org.openapitools.models.RunCompletionUsage
import org.openapitools.models.RunObjectIncompleteDetails
import org.openapitools.models.RunObjectLastError
import org.openapitools.models.RunObjectRequiredAction
import org.openapitools.models.TruncationObject
import scala.collection.immutable.Seq

/**
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 * @param id The identifier, which can be referenced in API endpoints.
 * @param _object The object type, which is always `thread.run`.
 * @param createdUnderscoreat The Unix timestamp (in seconds) for when the run was created.
 * @param threadUnderscoreid The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
 * @param assistantUnderscoreid The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
 * @param status The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
 * @param requiredUnderscoreaction 
 * @param lastUnderscoreerror 
 * @param expiresUnderscoreat The Unix timestamp (in seconds) for when the run will expire.
 * @param startedUnderscoreat The Unix timestamp (in seconds) for when the run was started.
 * @param cancelledUnderscoreat The Unix timestamp (in seconds) for when the run was cancelled.
 * @param failedUnderscoreat The Unix timestamp (in seconds) for when the run failed.
 * @param completedUnderscoreat The Unix timestamp (in seconds) for when the run was completed.
 * @param incompleteUnderscoredetails 
 * @param model The model that the [assistant](/docs/api-reference/assistants) used for this run.
 * @param instructions The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
 * @param tools The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
 * @param fileUnderscoreids The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @param usage 
 * @param temperature The sampling temperature used for this run. If not set, defaults to 1.
 * @param maxUnderscorepromptUnderscoretokens The maximum number of prompt tokens specified to have been used over the course of the run. 
 * @param maxUnderscorecompletionUnderscoretokens The maximum number of completion tokens specified to have been used over the course of the run. 
 * @param truncationUnderscorestrategy 
 * @param toolUnderscorechoice 
 * @param responseUnderscoreformat 
 */
case class RunObject(id: String,
                _object: String,
                createdUnderscoreat: Int,
                threadUnderscoreid: String,
                assistantUnderscoreid: String,
                status: String,
                requiredUnderscoreaction: RunObjectRequiredAction,
                lastUnderscoreerror: RunObjectLastError,
                expiresUnderscoreat: Int,
                startedUnderscoreat: Int,
                cancelledUnderscoreat: Int,
                failedUnderscoreat: Int,
                completedUnderscoreat: Int,
                incompleteUnderscoredetails: RunObjectIncompleteDetails,
                model: String,
                instructions: String,
                tools: Seq[AssistantObjectToolsInner],
                fileUnderscoreids: Seq[String],
                metadata: Object,
                usage: RunCompletionUsage,
                temperature: Option[BigDecimal],
                maxUnderscorepromptUnderscoretokens: Int,
                maxUnderscorecompletionUnderscoretokens: Int,
                truncationUnderscorestrategy: TruncationObject,
                toolUnderscorechoice: AssistantsApiToolChoiceOption,
                responseUnderscoreformat: AssistantsApiResponseFormatOption
                )

object RunObject {
    /**
     * Creates the codec for converting RunObject from and to JSON.
     */
    implicit val decoder: Decoder[RunObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunObject] = deriveEncoder
}
