//
// CreateChatCompletionRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CreateChatCompletionRequest: Codable, JSONEncodable, Hashable {

    static let messagesRule = ArrayRule(minItems: 1, maxItems: nil, uniqueItems: false)
    static let frequencyPenaltyRule = NumericRule<Double>(minimum: -2, exclusiveMinimum: false, maximum: 2, exclusiveMaximum: false, multipleOf: nil)
    static let topLogprobsRule = NumericRule<Int>(minimum: 0, exclusiveMinimum: false, maximum: 20, exclusiveMaximum: false, multipleOf: nil)
    static let nRule = NumericRule<Int>(minimum: 1, exclusiveMinimum: false, maximum: 128, exclusiveMaximum: false, multipleOf: nil)
    static let presencePenaltyRule = NumericRule<Double>(minimum: -2, exclusiveMinimum: false, maximum: 2, exclusiveMaximum: false, multipleOf: nil)
    static let seedRule = NumericRule<Int>(minimum: -9223372036854775808, exclusiveMinimum: false, maximum: 9223372036854775807, exclusiveMaximum: false, multipleOf: nil)
    static let temperatureRule = NumericRule<Double>(minimum: 0, exclusiveMinimum: false, maximum: 2, exclusiveMaximum: false, multipleOf: nil)
    static let topPRule = NumericRule<Double>(minimum: 0, exclusiveMinimum: false, maximum: 1, exclusiveMaximum: false, multipleOf: nil)
    static let functionsRule = ArrayRule(minItems: 1, maxItems: 128, uniqueItems: false)
    /** A list of messages comprising the conversation so far. [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models). */
    public var messages: [ChatCompletionRequestMessage]
    public var model: CreateChatCompletionRequestModel
    /** Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details)  */
    public var frequencyPenalty: Double? = 0
    /** Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  */
    public var logitBias: [String: Int]?
    /** Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`. */
    public var logprobs: Bool? = false
    /** An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used. */
    public var topLogprobs: Int?
    /** The maximum number of [tokens](/tokenizer) that can be generated in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens.  */
    public var maxTokens: Int?
    /** How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs. */
    public var n: Int? = 1
    /** Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details)  */
    public var presencePenalty: Double? = 0
    public var responseFormat: CreateChatCompletionRequestResponseFormat?
    /** This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend.  */
    public var seed: Int?
    public var stop: CreateChatCompletionRequestStop?
    /** If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions).  */
    public var stream: Bool? = false
    /** What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both.  */
    public var temperature: Double? = 1
    /** An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both.  */
    public var topP: Double? = 1
    /** A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported.  */
    public var tools: [ChatCompletionTool]?
    public var toolChoice: ChatCompletionToolChoiceOption?
    /** A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
    public var user: String?
    @available(*, deprecated, message: "This property is deprecated.")
    public var functionCall: CreateChatCompletionRequestFunctionCall?
    /** Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for.  */
    @available(*, deprecated, message: "This property is deprecated.")
    public var functions: [ChatCompletionFunctions]?

    public init(messages: [ChatCompletionRequestMessage], model: CreateChatCompletionRequestModel, frequencyPenalty: Double? = 0, logitBias: [String: Int]? = nil, logprobs: Bool? = false, topLogprobs: Int? = nil, maxTokens: Int? = nil, n: Int? = 1, presencePenalty: Double? = 0, responseFormat: CreateChatCompletionRequestResponseFormat? = nil, seed: Int? = nil, stop: CreateChatCompletionRequestStop? = nil, stream: Bool? = false, temperature: Double? = 1, topP: Double? = 1, tools: [ChatCompletionTool]? = nil, toolChoice: ChatCompletionToolChoiceOption? = nil, user: String? = nil, functionCall: CreateChatCompletionRequestFunctionCall? = nil, functions: [ChatCompletionFunctions]? = nil) {
        self.messages = messages
        self.model = model
        self.frequencyPenalty = frequencyPenalty
        self.logitBias = logitBias
        self.logprobs = logprobs
        self.topLogprobs = topLogprobs
        self.maxTokens = maxTokens
        self.n = n
        self.presencePenalty = presencePenalty
        self.responseFormat = responseFormat
        self.seed = seed
        self.stop = stop
        self.stream = stream
        self.temperature = temperature
        self.topP = topP
        self.tools = tools
        self.toolChoice = toolChoice
        self.user = user
        self.functionCall = functionCall
        self.functions = functions
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case messages
        case model
        case frequencyPenalty = "frequency_penalty"
        case logitBias = "logit_bias"
        case logprobs
        case topLogprobs = "top_logprobs"
        case maxTokens = "max_tokens"
        case n
        case presencePenalty = "presence_penalty"
        case responseFormat = "response_format"
        case seed
        case stop
        case stream
        case temperature
        case topP = "top_p"
        case tools
        case toolChoice = "tool_choice"
        case user
        case functionCall = "function_call"
        case functions
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(messages, forKey: .messages)
        try container.encode(model, forKey: .model)
        try container.encodeIfPresent(frequencyPenalty, forKey: .frequencyPenalty)
        try container.encodeIfPresent(logitBias, forKey: .logitBias)
        try container.encodeIfPresent(logprobs, forKey: .logprobs)
        try container.encodeIfPresent(topLogprobs, forKey: .topLogprobs)
        try container.encodeIfPresent(maxTokens, forKey: .maxTokens)
        try container.encodeIfPresent(n, forKey: .n)
        try container.encodeIfPresent(presencePenalty, forKey: .presencePenalty)
        try container.encodeIfPresent(responseFormat, forKey: .responseFormat)
        try container.encodeIfPresent(seed, forKey: .seed)
        try container.encodeIfPresent(stop, forKey: .stop)
        try container.encodeIfPresent(stream, forKey: .stream)
        try container.encodeIfPresent(temperature, forKey: .temperature)
        try container.encodeIfPresent(topP, forKey: .topP)
        try container.encodeIfPresent(tools, forKey: .tools)
        try container.encodeIfPresent(toolChoice, forKey: .toolChoice)
        try container.encodeIfPresent(user, forKey: .user)
        try container.encodeIfPresent(functionCall, forKey: .functionCall)
        try container.encodeIfPresent(functions, forKey: .functions)
    }
}

