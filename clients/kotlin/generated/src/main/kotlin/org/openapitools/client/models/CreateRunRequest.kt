/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.AssistantObjectToolsInner
import org.openapitools.client.models.AssistantsApiResponseFormatOption
import org.openapitools.client.models.AssistantsApiToolChoiceOption
import org.openapitools.client.models.CreateMessageRequest
import org.openapitools.client.models.CreateRunRequestModel
import org.openapitools.client.models.TruncationObject

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param assistantId The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
 * @param model 
 * @param instructions Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
 * @param additionalInstructions Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
 * @param additionalMessages Adds additional messages to the thread before creating the run.
 * @param tools Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
 * @param stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
 * @param maxPromptTokens The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
 * @param maxCompletionTokens The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
 * @param truncationStrategy 
 * @param toolChoice 
 * @param responseFormat 
 */


data class CreateRunRequest (

    /* The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. */
    @Json(name = "assistant_id")
    val assistantId: kotlin.String,

    @Json(name = "model")
    val model: CreateRunRequestModel? = null,

    /* Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis. */
    @Json(name = "instructions")
    val instructions: kotlin.String? = null,

    /* Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions. */
    @Json(name = "additional_instructions")
    val additionalInstructions: kotlin.String? = null,

    /* Adds additional messages to the thread before creating the run. */
    @Json(name = "additional_messages")
    val additionalMessages: kotlin.collections.List<CreateMessageRequest>? = null,

    /* Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. */
    @Json(name = "tools")
    val tools: kotlin.collections.List<AssistantObjectToolsInner>? = null,

    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    @Json(name = "metadata")
    val metadata: kotlin.Any? = null,

    /* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  */
    @Json(name = "temperature")
    val temperature: java.math.BigDecimal? = java.math.BigDecimal("1"),

    /* If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.  */
    @Json(name = "stream")
    val stream: kotlin.Boolean? = null,

    /* The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.  */
    @Json(name = "max_prompt_tokens")
    val maxPromptTokens: kotlin.Int? = null,

    /* The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.  */
    @Json(name = "max_completion_tokens")
    val maxCompletionTokens: kotlin.Int? = null,

    @Json(name = "truncation_strategy")
    val truncationStrategy: TruncationObject? = null,

    @Json(name = "tool_choice")
    val toolChoice: AssistantsApiToolChoiceOption? = null,

    @Json(name = "response_format")
    val responseFormat: AssistantsApiResponseFormatOption? = null

)

