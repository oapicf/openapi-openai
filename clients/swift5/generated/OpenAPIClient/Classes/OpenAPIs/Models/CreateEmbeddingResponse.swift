//
// CreateEmbeddingResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CreateEmbeddingResponse: Codable, JSONEncodable, Hashable {

    public var object: String
    public var model: String
    public var data: [CreateEmbeddingResponseDataInner]
    public var usage: CreateEmbeddingResponseUsage

    public init(object: String, model: String, data: [CreateEmbeddingResponseDataInner], usage: CreateEmbeddingResponseUsage) {
        self.object = object
        self.model = model
        self.data = data
        self.usage = usage
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case object
        case model
        case data
        case usage
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(object, forKey: .object)
        try container.encode(model, forKey: .model)
        try container.encode(data, forKey: .data)
        try container.encode(usage, forKey: .usage)
    }
}
