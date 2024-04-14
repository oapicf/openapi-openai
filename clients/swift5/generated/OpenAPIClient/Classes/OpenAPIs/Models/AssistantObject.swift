//
// AssistantObject.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Represents an &#x60;assistant&#x60; that can call the model and use tools. */
public struct AssistantObject: Codable, JSONEncodable, Hashable {

    public enum Object: String, Codable, CaseIterable {
        case assistant = "assistant"
    }
    static let nameRule = StringRule(minLength: nil, maxLength: 256, pattern: nil)
    static let descriptionRule = StringRule(minLength: nil, maxLength: 512, pattern: nil)
    static let instructionsRule = StringRule(minLength: nil, maxLength: 256000, pattern: nil)
    /** The identifier, which can be referenced in API endpoints. */
    public var id: String
    /** The object type, which is always `assistant`. */
    public var object: Object
    /** The Unix timestamp (in seconds) for when the assistant was created. */
    public var createdAt: Int
    /** The name of the assistant. The maximum length is 256 characters.  */
    public var name: String?
    /** The description of the assistant. The maximum length is 512 characters.  */
    public var description: String?
    /** ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.  */
    public var model: String
    /** The system instructions that the assistant uses. The maximum length is 256,000 characters.  */
    public var instructions: String?
    /** A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.  */
    public var tools: [AssistantObjectToolsInner]
    /** A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.  */
    public var fileIds: [String]
    /** Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    public var metadata: AnyCodable?

    public init(id: String, object: Object, createdAt: Int, name: String?, description: String?, model: String, instructions: String?, tools: [AssistantObjectToolsInner], fileIds: [String], metadata: AnyCodable?) {
        self.id = id
        self.object = object
        self.createdAt = createdAt
        self.name = name
        self.description = description
        self.model = model
        self.instructions = instructions
        self.tools = tools
        self.fileIds = fileIds
        self.metadata = metadata
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case object
        case createdAt = "created_at"
        case name
        case description
        case model
        case instructions
        case tools
        case fileIds = "file_ids"
        case metadata
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(id, forKey: .id)
        try container.encode(object, forKey: .object)
        try container.encode(createdAt, forKey: .createdAt)
        try container.encode(name, forKey: .name)
        try container.encode(description, forKey: .description)
        try container.encode(model, forKey: .model)
        try container.encode(instructions, forKey: .instructions)
        try container.encode(tools, forKey: .tools)
        try container.encode(fileIds, forKey: .fileIds)
        try container.encode(metadata, forKey: .metadata)
    }
}

