//
// CreateEditResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CreateEditResponse: Codable, JSONEncodable, Hashable {

    public var object: String
    public var created: Int
    public var choices: [CreateEditResponseChoicesInner]
    public var usage: CreateCompletionResponseUsage

    public init(object: String, created: Int, choices: [CreateEditResponseChoicesInner], usage: CreateCompletionResponseUsage) {
        self.object = object
        self.created = created
        self.choices = choices
        self.usage = usage
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case object
        case created
        case choices
        case usage
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(object, forKey: .object)
        try container.encode(created, forKey: .created)
        try container.encode(choices, forKey: .choices)
        try container.encode(usage, forKey: .usage)
    }
}
