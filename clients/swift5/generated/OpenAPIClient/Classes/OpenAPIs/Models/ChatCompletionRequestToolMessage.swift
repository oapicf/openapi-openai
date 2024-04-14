//
// ChatCompletionRequestToolMessage.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct ChatCompletionRequestToolMessage: Codable, JSONEncodable, Hashable {

    public enum Role: String, Codable, CaseIterable {
        case tool = "tool"
    }
    /** The role of the messages author, in this case `tool`. */
    public var role: Role
    /** The contents of the tool message. */
    public var content: String
    /** Tool call that this message is responding to. */
    public var toolCallId: String

    public init(role: Role, content: String, toolCallId: String) {
        self.role = role
        self.content = content
        self.toolCallId = toolCallId
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case role
        case content
        case toolCallId = "tool_call_id"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(role, forKey: .role)
        try container.encode(content, forKey: .content)
        try container.encode(toolCallId, forKey: .toolCallId)
    }
}

