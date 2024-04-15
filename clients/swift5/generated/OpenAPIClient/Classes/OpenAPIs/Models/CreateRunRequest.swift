//
// CreateRunRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CreateRunRequest: Codable, JSONEncodable, Hashable {

    static let temperatureRule = NumericRule<Double>(minimum: 0, exclusiveMinimum: false, maximum: 2, exclusiveMaximum: false, multipleOf: nil)
    static let maxPromptTokensRule = NumericRule<Int>(minimum: 256, exclusiveMinimum: false, maximum: nil, exclusiveMaximum: false, multipleOf: nil)
    static let maxCompletionTokensRule = NumericRule<Int>(minimum: 256, exclusiveMinimum: false, maximum: nil, exclusiveMaximum: false, multipleOf: nil)
    /** The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. */
    public var assistantId: String
    public var model: CreateRunRequestModel?
    /** Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis. */
    public var instructions: String?
    /** Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions. */
    public var additionalInstructions: String?
    /** Adds additional messages to the thread before creating the run. */
    public var additionalMessages: [CreateMessageRequest]?
    /** Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. */
    public var tools: [AssistantObjectToolsInner]?
    /** Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    public var metadata: AnyCodable?
    /** What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  */
    public var temperature: Double? = 1
    /** If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.  */
    public var stream: Bool?
    /** The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.  */
    public var maxPromptTokens: Int?
    /** The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.  */
    public var maxCompletionTokens: Int?
    public var truncationStrategy: TruncationObject?
    public var toolChoice: AssistantsApiToolChoiceOption?
    public var responseFormat: AssistantsApiResponseFormatOption?

    public init(assistantId: String, model: CreateRunRequestModel? = nil, instructions: String? = nil, additionalInstructions: String? = nil, additionalMessages: [CreateMessageRequest]? = nil, tools: [AssistantObjectToolsInner]? = nil, metadata: AnyCodable? = nil, temperature: Double? = 1, stream: Bool? = nil, maxPromptTokens: Int? = nil, maxCompletionTokens: Int? = nil, truncationStrategy: TruncationObject? = nil, toolChoice: AssistantsApiToolChoiceOption? = nil, responseFormat: AssistantsApiResponseFormatOption? = nil) {
        self.assistantId = assistantId
        self.model = model
        self.instructions = instructions
        self.additionalInstructions = additionalInstructions
        self.additionalMessages = additionalMessages
        self.tools = tools
        self.metadata = metadata
        self.temperature = temperature
        self.stream = stream
        self.maxPromptTokens = maxPromptTokens
        self.maxCompletionTokens = maxCompletionTokens
        self.truncationStrategy = truncationStrategy
        self.toolChoice = toolChoice
        self.responseFormat = responseFormat
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case assistantId = "assistant_id"
        case model
        case instructions
        case additionalInstructions = "additional_instructions"
        case additionalMessages = "additional_messages"
        case tools
        case metadata
        case temperature
        case stream
        case maxPromptTokens = "max_prompt_tokens"
        case maxCompletionTokens = "max_completion_tokens"
        case truncationStrategy = "truncation_strategy"
        case toolChoice = "tool_choice"
        case responseFormat = "response_format"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(assistantId, forKey: .assistantId)
        try container.encodeIfPresent(model, forKey: .model)
        try container.encodeIfPresent(instructions, forKey: .instructions)
        try container.encodeIfPresent(additionalInstructions, forKey: .additionalInstructions)
        try container.encodeIfPresent(additionalMessages, forKey: .additionalMessages)
        try container.encodeIfPresent(tools, forKey: .tools)
        try container.encodeIfPresent(metadata, forKey: .metadata)
        try container.encodeIfPresent(temperature, forKey: .temperature)
        try container.encodeIfPresent(stream, forKey: .stream)
        try container.encodeIfPresent(maxPromptTokens, forKey: .maxPromptTokens)
        try container.encodeIfPresent(maxCompletionTokens, forKey: .maxCompletionTokens)
        try container.encodeIfPresent(truncationStrategy, forKey: .truncationStrategy)
        try container.encodeIfPresent(toolChoice, forKey: .toolChoice)
        try container.encodeIfPresent(responseFormat, forKey: .responseFormat)
    }
}
