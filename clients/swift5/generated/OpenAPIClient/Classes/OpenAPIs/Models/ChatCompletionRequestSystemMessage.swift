//
// ChatCompletionRequestSystemMessage.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct ChatCompletionRequestSystemMessage: Codable, JSONEncodable, Hashable {

    public enum Role: String, Codable, CaseIterable {
        case system = "system"
    }
    /** The contents of the system message. */
    public var content: String
    /** The role of the messages author, in this case `system`. */
    public var role: Role
    /** An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
    public var name: String?

    public init(content: String, role: Role, name: String? = nil) {
        self.content = content
        self.role = role
        self.name = name
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case content
        case role
        case name
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(content, forKey: .content)
        try container.encode(role, forKey: .role)
        try container.encodeIfPresent(name, forKey: .name)
    }
}

