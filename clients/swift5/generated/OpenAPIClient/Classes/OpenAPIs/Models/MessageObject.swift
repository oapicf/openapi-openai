//
// MessageObject.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Represents a message within a [thread](/docs/api-reference/threads). */
public struct MessageObject: Codable, JSONEncodable, Hashable {

    public enum Object: String, Codable, CaseIterable {
        case threadPeriodMessage = "thread.message"
    }
    public enum Status: String, Codable, CaseIterable {
        case inProgress = "in_progress"
        case incomplete = "incomplete"
        case completed = "completed"
    }
    public enum Role: String, Codable, CaseIterable {
        case user = "user"
        case assistant = "assistant"
    }
    static let fileIdsRule = ArrayRule(minItems: nil, maxItems: 10, uniqueItems: false)
    /** The identifier, which can be referenced in API endpoints. */
    public var id: String
    /** The object type, which is always `thread.message`. */
    public var object: Object
    /** The Unix timestamp (in seconds) for when the message was created. */
    public var createdAt: Int
    /** The [thread](/docs/api-reference/threads) ID that this message belongs to. */
    public var threadId: String
    /** The status of the message, which can be either `in_progress`, `incomplete`, or `completed`. */
    public var status: Status
    public var incompleteDetails: MessageObjectIncompleteDetails?
    /** The Unix timestamp (in seconds) for when the message was completed. */
    public var completedAt: Int?
    /** The Unix timestamp (in seconds) for when the message was marked as incomplete. */
    public var incompleteAt: Int?
    /** The entity that produced the message. One of `user` or `assistant`. */
    public var role: Role
    /** The content of the message in array of text and/or images. */
    public var content: [MessageObjectContentInner]
    /** If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. */
    public var assistantId: String?
    /** The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints. */
    public var runId: String?
    /** A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. */
    public var fileIds: [String]
    /** Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    public var metadata: AnyCodable?

    public init(id: String, object: Object, createdAt: Int, threadId: String, status: Status, incompleteDetails: MessageObjectIncompleteDetails?, completedAt: Int?, incompleteAt: Int?, role: Role, content: [MessageObjectContentInner], assistantId: String?, runId: String?, fileIds: [String], metadata: AnyCodable?) {
        self.id = id
        self.object = object
        self.createdAt = createdAt
        self.threadId = threadId
        self.status = status
        self.incompleteDetails = incompleteDetails
        self.completedAt = completedAt
        self.incompleteAt = incompleteAt
        self.role = role
        self.content = content
        self.assistantId = assistantId
        self.runId = runId
        self.fileIds = fileIds
        self.metadata = metadata
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case object
        case createdAt = "created_at"
        case threadId = "thread_id"
        case status
        case incompleteDetails = "incomplete_details"
        case completedAt = "completed_at"
        case incompleteAt = "incomplete_at"
        case role
        case content
        case assistantId = "assistant_id"
        case runId = "run_id"
        case fileIds = "file_ids"
        case metadata
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(id, forKey: .id)
        try container.encode(object, forKey: .object)
        try container.encode(createdAt, forKey: .createdAt)
        try container.encode(threadId, forKey: .threadId)
        try container.encode(status, forKey: .status)
        try container.encode(incompleteDetails, forKey: .incompleteDetails)
        try container.encode(completedAt, forKey: .completedAt)
        try container.encode(incompleteAt, forKey: .incompleteAt)
        try container.encode(role, forKey: .role)
        try container.encode(content, forKey: .content)
        try container.encode(assistantId, forKey: .assistantId)
        try container.encode(runId, forKey: .runId)
        try container.encode(fileIds, forKey: .fileIds)
        try container.encode(metadata, forKey: .metadata)
    }
}

