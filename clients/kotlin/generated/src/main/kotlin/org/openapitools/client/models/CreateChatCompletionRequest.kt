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

import org.openapitools.client.models.ChatCompletionFunctions
import org.openapitools.client.models.ChatCompletionRequestMessage
import org.openapitools.client.models.ChatCompletionTool
import org.openapitools.client.models.ChatCompletionToolChoiceOption
import org.openapitools.client.models.CreateChatCompletionRequestFunctionCall
import org.openapitools.client.models.CreateChatCompletionRequestModel
import org.openapitools.client.models.CreateChatCompletionRequestResponseFormat
import org.openapitools.client.models.CreateChatCompletionRequestStop

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param messages A list of messages comprising the conversation so far. [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models).
 * @param model 
 * @param frequencyPenalty Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
 * @param logitBias Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
 * @param logprobs Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`.
 * @param topLogprobs An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used.
 * @param maxTokens The maximum number of [tokens](/tokenizer) that can be generated in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
 * @param n How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs.
 * @param presencePenalty Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
 * @param responseFormat 
 * @param seed This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
 * @param stop 
 * @param stream If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
 * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
 * @param topP An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
 * @param tools A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. 
 * @param toolChoice 
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 * @param functionCall 
 * @param functions Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for. 
 */


data class CreateChatCompletionRequest (

    /* A list of messages comprising the conversation so far. [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models). */
    @Json(name = "messages")
    val messages: kotlin.collections.List<ChatCompletionRequestMessage>,

    @Json(name = "model")
    val model: CreateChatCompletionRequestModel,

    /* Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details)  */
    @Json(name = "frequency_penalty")
    val frequencyPenalty: java.math.BigDecimal? = java.math.BigDecimal("0"),

    /* Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  */
    @Json(name = "logit_bias")
    val logitBias: kotlin.collections.Map<kotlin.String, kotlin.Int>? = null,

    /* Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`. */
    @Json(name = "logprobs")
    val logprobs: kotlin.Boolean? = false,

    /* An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used. */
    @Json(name = "top_logprobs")
    val topLogprobs: kotlin.Int? = null,

    /* The maximum number of [tokens](/tokenizer) that can be generated in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens.  */
    @Json(name = "max_tokens")
    val maxTokens: kotlin.Int? = null,

    /* How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs. */
    @Json(name = "n")
    val n: kotlin.Int? = 1,

    /* Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details)  */
    @Json(name = "presence_penalty")
    val presencePenalty: java.math.BigDecimal? = java.math.BigDecimal("0"),

    @Json(name = "response_format")
    val responseFormat: CreateChatCompletionRequestResponseFormat? = null,

    /* This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend.  */
    @Json(name = "seed")
    val seed: kotlin.Int? = null,

    @Json(name = "stop")
    val stop: CreateChatCompletionRequestStop? = null,

    /* If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions).  */
    @Json(name = "stream")
    val stream: kotlin.Boolean? = false,

    /* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both.  */
    @Json(name = "temperature")
    val temperature: java.math.BigDecimal? = java.math.BigDecimal("1"),

    /* An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both.  */
    @Json(name = "top_p")
    val topP: java.math.BigDecimal? = java.math.BigDecimal("1"),

    /* A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported.  */
    @Json(name = "tools")
    val tools: kotlin.collections.List<ChatCompletionTool>? = null,

    @Json(name = "tool_choice")
    val toolChoice: ChatCompletionToolChoiceOption? = null,

    /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
    @Json(name = "user")
    val user: kotlin.String? = null,

    @Json(name = "function_call")
    @Deprecated(message = "This property is deprecated.")
    val functionCall: CreateChatCompletionRequestFunctionCall? = null,

    /* Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for.  */
    @Json(name = "functions")
    @Deprecated(message = "This property is deprecated.")
    val functions: kotlin.collections.List<ChatCompletionFunctions>? = null

) {


}

