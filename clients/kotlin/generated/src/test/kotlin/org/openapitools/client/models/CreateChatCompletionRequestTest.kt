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

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.models.CreateChatCompletionRequest
import org.openapitools.client.models.ChatCompletionFunctions
import org.openapitools.client.models.ChatCompletionRequestMessage
import org.openapitools.client.models.ChatCompletionTool
import org.openapitools.client.models.ChatCompletionToolChoiceOption
import org.openapitools.client.models.CreateChatCompletionRequestFunctionCall
import org.openapitools.client.models.CreateChatCompletionRequestModel
import org.openapitools.client.models.CreateChatCompletionRequestResponseFormat
import org.openapitools.client.models.CreateChatCompletionRequestStop

class CreateChatCompletionRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateChatCompletionRequest
        //val modelInstance = CreateChatCompletionRequest()

        // to test the property `messages` - A list of messages comprising the conversation so far. [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models).
        should("test messages") {
            // uncomment below to test the property
            //modelInstance.messages shouldBe ("TODO")
        }

        // to test the property `model`
        should("test model") {
            // uncomment below to test the property
            //modelInstance.model shouldBe ("TODO")
        }

        // to test the property `frequencyPenalty` - Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
        should("test frequencyPenalty") {
            // uncomment below to test the property
            //modelInstance.frequencyPenalty shouldBe ("TODO")
        }

        // to test the property `logitBias` - Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
        should("test logitBias") {
            // uncomment below to test the property
            //modelInstance.logitBias shouldBe ("TODO")
        }

        // to test the property `logprobs` - Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`.
        should("test logprobs") {
            // uncomment below to test the property
            //modelInstance.logprobs shouldBe ("TODO")
        }

        // to test the property `topLogprobs` - An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used.
        should("test topLogprobs") {
            // uncomment below to test the property
            //modelInstance.topLogprobs shouldBe ("TODO")
        }

        // to test the property `maxTokens` - The maximum number of [tokens](/tokenizer) that can be generated in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
        should("test maxTokens") {
            // uncomment below to test the property
            //modelInstance.maxTokens shouldBe ("TODO")
        }

        // to test the property `n` - How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs.
        should("test n") {
            // uncomment below to test the property
            //modelInstance.n shouldBe ("TODO")
        }

        // to test the property `presencePenalty` - Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
        should("test presencePenalty") {
            // uncomment below to test the property
            //modelInstance.presencePenalty shouldBe ("TODO")
        }

        // to test the property `responseFormat`
        should("test responseFormat") {
            // uncomment below to test the property
            //modelInstance.responseFormat shouldBe ("TODO")
        }

        // to test the property `seed` - This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
        should("test seed") {
            // uncomment below to test the property
            //modelInstance.seed shouldBe ("TODO")
        }

        // to test the property `stop`
        should("test stop") {
            // uncomment below to test the property
            //modelInstance.stop shouldBe ("TODO")
        }

        // to test the property `stream` - If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
        should("test stream") {
            // uncomment below to test the property
            //modelInstance.stream shouldBe ("TODO")
        }

        // to test the property `temperature` - What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
        should("test temperature") {
            // uncomment below to test the property
            //modelInstance.temperature shouldBe ("TODO")
        }

        // to test the property `topP` - An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
        should("test topP") {
            // uncomment below to test the property
            //modelInstance.topP shouldBe ("TODO")
        }

        // to test the property `tools` - A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. 
        should("test tools") {
            // uncomment below to test the property
            //modelInstance.tools shouldBe ("TODO")
        }

        // to test the property `toolChoice`
        should("test toolChoice") {
            // uncomment below to test the property
            //modelInstance.toolChoice shouldBe ("TODO")
        }

        // to test the property `user` - A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
        should("test user") {
            // uncomment below to test the property
            //modelInstance.user shouldBe ("TODO")
        }

        // to test the property `functionCall`
        should("test functionCall") {
            // uncomment below to test the property
            //modelInstance.functionCall shouldBe ("TODO")
        }

        // to test the property `functions` - Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for. 
        should("test functions") {
            // uncomment below to test the property
            //modelInstance.functions shouldBe ("TODO")
        }

    }
}