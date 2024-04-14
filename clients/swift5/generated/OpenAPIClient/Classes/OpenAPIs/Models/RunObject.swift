//
// RunObject.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Represents an execution run on a [thread](/docs/api-reference/threads). */
public struct RunObject: Codable, JSONEncodable, Hashable {

    public enum Object: String, Codable, CaseIterable {
        case threadPeriodRun = "thread.run"
    }
    public enum Status: String, Codable, CaseIterable {
        case queued = "queued"
        case inProgress = "in_progress"
        case requiresAction = "requires_action"
        case cancelling = "cancelling"
        case cancelled = "cancelled"
        case failed = "failed"
        case completed = "completed"
        case expired = "expired"
    }
    static let maxPromptTokensRule = NumericRule<Int>(minimum: 256, exclusiveMinimum: false, maximum: nil, exclusiveMaximum: false, multipleOf: nil)
    static let maxCompletionTokensRule = NumericRule<Int>(minimum: 256, exclusiveMinimum: false, maximum: nil, exclusiveMaximum: false, multipleOf: nil)
    /** The identifier, which can be referenced in API endpoints. */
    public var id: String
    /** The object type, which is always `thread.run`. */
    public var object: Object
    /** The Unix timestamp (in seconds) for when the run was created. */
    public var createdAt: Int
    /** The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. */
    public var threadId: String
    /** The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. */
    public var assistantId: String
    /** The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`. */
    public var status: Status
    public var requiredAction: RunObjectRequiredAction?
    public var lastError: RunObjectLastError?
    /** The Unix timestamp (in seconds) for when the run will expire. */
    public var expiresAt: Int?
    /** The Unix timestamp (in seconds) for when the run was started. */
    public var startedAt: Int?
    /** The Unix timestamp (in seconds) for when the run was cancelled. */
    public var cancelledAt: Int?
    /** The Unix timestamp (in seconds) for when the run failed. */
    public var failedAt: Int?
    /** The Unix timestamp (in seconds) for when the run was completed. */
    public var completedAt: Int?
    public var incompleteDetails: RunObjectIncompleteDetails?
    /** The model that the [assistant](/docs/api-reference/assistants) used for this run. */
    public var model: String
    /** The instructions that the [assistant](/docs/api-reference/assistants) used for this run. */
    public var instructions: String
    /** The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. */
    public var tools: [AssistantObjectToolsInner]
    /** The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run. */
    public var fileIds: [String]
    /** Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    public var metadata: AnyCodable?
    public var usage: RunCompletionUsage?
    /** The sampling temperature used for this run. If not set, defaults to 1. */
    public var temperature: Double?
    /** The maximum number of prompt tokens specified to have been used over the course of the run.  */
    public var maxPromptTokens: Int?
    /** The maximum number of completion tokens specified to have been used over the course of the run.  */
    public var maxCompletionTokens: Int?
    public var truncationStrategy: TruncationObject
    public var toolChoice: AssistantsApiToolChoiceOption
    public var responseFormat: AssistantsApiResponseFormatOption

    public init(id: String, object: Object, createdAt: Int, threadId: String, assistantId: String, status: Status, requiredAction: RunObjectRequiredAction?, lastError: RunObjectLastError?, expiresAt: Int?, startedAt: Int?, cancelledAt: Int?, failedAt: Int?, completedAt: Int?, incompleteDetails: RunObjectIncompleteDetails?, model: String, instructions: String, tools: [AssistantObjectToolsInner], fileIds: [String], metadata: AnyCodable?, usage: RunCompletionUsage?, temperature: Double? = nil, maxPromptTokens: Int?, maxCompletionTokens: Int?, truncationStrategy: TruncationObject, toolChoice: AssistantsApiToolChoiceOption, responseFormat: AssistantsApiResponseFormatOption) {
        self.id = id
        self.object = object
        self.createdAt = createdAt
        self.threadId = threadId
        self.assistantId = assistantId
        self.status = status
        self.requiredAction = requiredAction
        self.lastError = lastError
        self.expiresAt = expiresAt
        self.startedAt = startedAt
        self.cancelledAt = cancelledAt
        self.failedAt = failedAt
        self.completedAt = completedAt
        self.incompleteDetails = incompleteDetails
        self.model = model
        self.instructions = instructions
        self.tools = tools
        self.fileIds = fileIds
        self.metadata = metadata
        self.usage = usage
        self.temperature = temperature
        self.maxPromptTokens = maxPromptTokens
        self.maxCompletionTokens = maxCompletionTokens
        self.truncationStrategy = truncationStrategy
        self.toolChoice = toolChoice
        self.responseFormat = responseFormat
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case object
        case createdAt = "created_at"
        case threadId = "thread_id"
        case assistantId = "assistant_id"
        case status
        case requiredAction = "required_action"
        case lastError = "last_error"
        case expiresAt = "expires_at"
        case startedAt = "started_at"
        case cancelledAt = "cancelled_at"
        case failedAt = "failed_at"
        case completedAt = "completed_at"
        case incompleteDetails = "incomplete_details"
        case model
        case instructions
        case tools
        case fileIds = "file_ids"
        case metadata
        case usage
        case temperature
        case maxPromptTokens = "max_prompt_tokens"
        case maxCompletionTokens = "max_completion_tokens"
        case truncationStrategy = "truncation_strategy"
        case toolChoice = "tool_choice"
        case responseFormat = "response_format"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(id, forKey: .id)
        try container.encode(object, forKey: .object)
        try container.encode(createdAt, forKey: .createdAt)
        try container.encode(threadId, forKey: .threadId)
        try container.encode(assistantId, forKey: .assistantId)
        try container.encode(status, forKey: .status)
        try container.encode(requiredAction, forKey: .requiredAction)
        try container.encode(lastError, forKey: .lastError)
        try container.encode(expiresAt, forKey: .expiresAt)
        try container.encode(startedAt, forKey: .startedAt)
        try container.encode(cancelledAt, forKey: .cancelledAt)
        try container.encode(failedAt, forKey: .failedAt)
        try container.encode(completedAt, forKey: .completedAt)
        try container.encode(incompleteDetails, forKey: .incompleteDetails)
        try container.encode(model, forKey: .model)
        try container.encode(instructions, forKey: .instructions)
        try container.encode(tools, forKey: .tools)
        try container.encode(fileIds, forKey: .fileIds)
        try container.encode(metadata, forKey: .metadata)
        try container.encode(usage, forKey: .usage)
        try container.encodeIfPresent(temperature, forKey: .temperature)
        try container.encode(maxPromptTokens, forKey: .maxPromptTokens)
        try container.encode(maxCompletionTokens, forKey: .maxCompletionTokens)
        try container.encode(truncationStrategy, forKey: .truncationStrategy)
        try container.encode(toolChoice, forKey: .toolChoice)
        try container.encode(responseFormat, forKey: .responseFormat)
    }
}

