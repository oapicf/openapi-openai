//
// CreateCompletionRequestPrompt.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that &lt;|endoftext|&gt; is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document.  */
public enum CreateCompletionRequestPrompt: Codable, JSONEncodable, Hashable {
    case typeString(String)
    case type[Int]([Int])
    case type[String]([String])
    case type[[Int]]([[Int]])

    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        switch self {
        case .typeString(let value):
            try container.encode(value)
        case .type[Int](let value):
            try container.encode(value)
        case .type[String](let value):
            try container.encode(value)
        case .type[[Int]](let value):
            try container.encode(value)
        }
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        if let value = try? container.decode(String.self) {
            self = .typeString(value)
        } else if let value = try? container.decode([Int].self) {
            self = .type[Int](value)
        } else if let value = try? container.decode([String].self) {
            self = .type[String](value)
        } else if let value = try? container.decode([[Int]].self) {
            self = .type[[Int]](value)
        } else {
            throw DecodingError.typeMismatch(Self.Type.self, .init(codingPath: decoder.codingPath, debugDescription: "Unable to decode instance of CreateCompletionRequestPrompt"))
        }
    }
}

