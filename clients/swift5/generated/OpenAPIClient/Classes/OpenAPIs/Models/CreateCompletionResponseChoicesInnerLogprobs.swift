//
// CreateCompletionResponseChoicesInnerLogprobs.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CreateCompletionResponseChoicesInnerLogprobs: Codable, JSONEncodable, Hashable {

    public var tokens: [String]?
    public var tokenLogprobs: [Double]?
    public var topLogprobs: [AnyCodable]?
    public var textOffset: [Int]?

    public init(tokens: [String]? = nil, tokenLogprobs: [Double]? = nil, topLogprobs: [AnyCodable]? = nil, textOffset: [Int]? = nil) {
        self.tokens = tokens
        self.tokenLogprobs = tokenLogprobs
        self.topLogprobs = topLogprobs
        self.textOffset = textOffset
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case tokens
        case tokenLogprobs = "token_logprobs"
        case topLogprobs = "top_logprobs"
        case textOffset = "text_offset"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(tokens, forKey: .tokens)
        try container.encodeIfPresent(tokenLogprobs, forKey: .tokenLogprobs)
        try container.encodeIfPresent(topLogprobs, forKey: .topLogprobs)
        try container.encodeIfPresent(textOffset, forKey: .textOffset)
    }
}

