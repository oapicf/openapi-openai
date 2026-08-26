@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateCompletionRequest(
    @field:JsonProperty("model")
    val model: CreateCompletionRequestModel,

    @field:JsonProperty("prompt")
    val prompt: CreateCompletionRequestPrompt,

    @field:JsonProperty("best_of")
    val bestOf: kotlin.Int? = 1,

    @field:JsonProperty("echo")
    val echo: kotlin.Boolean? = false,

    @field:JsonProperty("frequency_penalty")
    val frequencyPenalty: java.math.BigDecimal? = 0,

    @field:JsonProperty("logit_bias")
    val logitBias: kotlin.collections.Map<kotlin.String, kotlin.Int>? = null,

    @field:JsonProperty("logprobs")
    val logprobs: kotlin.Int? = null,

    @field:JsonProperty("max_tokens")
    val maxTokens: kotlin.Int? = 16,

    @field:JsonProperty("n")
    val n: kotlin.Int? = 1,

    @field:JsonProperty("presence_penalty")
    val presencePenalty: java.math.BigDecimal? = 0,

    @field:JsonProperty("seed")
    val seed: kotlin.Int? = null,

    @field:JsonProperty("stop")
    val stop: CreateCompletionRequestStop? = null,

    @field:JsonProperty("stream")
    val stream: kotlin.Boolean? = false,

    @field:JsonProperty("stream_options")
    val streamOptions: ChatCompletionStreamOptions? = null,

    @field:JsonProperty("suffix")
    val suffix: kotlin.String? = null,

    @field:JsonProperty("temperature")
    val temperature: java.math.BigDecimal? = 1,

    @field:JsonProperty("top_p")
    val topP: java.math.BigDecimal? = 1,

    @field:JsonProperty("user")
    val user: kotlin.String? = null,

)
