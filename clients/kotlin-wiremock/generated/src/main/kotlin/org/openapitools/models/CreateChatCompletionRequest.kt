@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateChatCompletionRequest(
    @field:JsonProperty("messages")
    val messages: kotlin.collections.List<ChatCompletionRequestMessage>,

    @field:JsonProperty("model")
    val model: CreateChatCompletionRequestModel,

    @field:JsonProperty("store")
    val store: kotlin.Boolean? = false,

    @field:JsonProperty("reasoning_effort")
    val reasoningEffort: kotlin.String? = ReasoningEffort.medium,

    @field:JsonProperty("metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @field:JsonProperty("frequency_penalty")
    val frequencyPenalty: java.math.BigDecimal? = 0,

    @field:JsonProperty("logit_bias")
    val logitBias: kotlin.collections.Map<kotlin.String, kotlin.Int>? = null,

    @field:JsonProperty("logprobs")
    val logprobs: kotlin.Boolean? = false,

    @field:JsonProperty("top_logprobs")
    val topLogprobs: kotlin.Int? = null,

    @field:JsonProperty("max_tokens")
    val maxTokens: kotlin.Int? = null,

    @field:JsonProperty("max_completion_tokens")
    val maxCompletionTokens: kotlin.Int? = null,

    @field:JsonProperty("n")
    val n: kotlin.Int? = 1,

    @field:JsonProperty("modalities")
    val modalities: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("prediction")
    val prediction: PredictionContent? = null,

    @field:JsonProperty("audio")
    val audio: CreateChatCompletionRequestAudio? = null,

    @field:JsonProperty("presence_penalty")
    val presencePenalty: java.math.BigDecimal? = 0,

    @field:JsonProperty("response_format")
    val responseFormat: CreateChatCompletionRequestResponseFormat? = null,

    @field:JsonProperty("seed")
    val seed: kotlin.Int? = null,

    @field:JsonProperty("service_tier")
    val serviceTier: kotlin.String? = ServiceTier.auto,

    @field:JsonProperty("stop")
    val stop: CreateChatCompletionRequestStop? = null,

    @field:JsonProperty("stream")
    val stream: kotlin.Boolean? = false,

    @field:JsonProperty("stream_options")
    val streamOptions: ChatCompletionStreamOptions? = null,

    @field:JsonProperty("temperature")
    val temperature: java.math.BigDecimal? = 1,

    @field:JsonProperty("top_p")
    val topP: java.math.BigDecimal? = 1,

    @field:JsonProperty("tools")
    val tools: kotlin.collections.List<ChatCompletionTool>? = null,

    @field:JsonProperty("tool_choice")
    val toolChoice: ChatCompletionToolChoiceOption? = null,

    @field:JsonProperty("parallel_tool_calls")
    val parallelToolCalls: kotlin.Boolean? = true,

    @field:JsonProperty("user")
    val user: kotlin.String? = null,

    @field:JsonProperty("function_call")
    val functionCall: CreateChatCompletionRequestFunctionCall? = null,

    @field:JsonProperty("functions")
    val functions: kotlin.collections.List<ChatCompletionFunctions>? = null,

)
