//
// ChatCompletionFunctions.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct ChatCompletionFunctions: Codable, JSONEncodable, Hashable {

    /** The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. */
    public var name: String
    /** The description of what the function does. */
    public var description: String?
    /** The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format. */
    public var parameters: [String: AnyCodable]?

    public init(name: String, description: String? = nil, parameters: [String: AnyCodable]? = nil) {
        self.name = name
        self.description = description
        self.parameters = parameters
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case name
        case description
        case parameters
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(name, forKey: .name)
        try container.encodeIfPresent(description, forKey: .description)
        try container.encodeIfPresent(parameters, forKey: .parameters)
    }
}

