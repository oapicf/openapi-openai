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

    public enum Object: String, Codable, CaseIterable {
        case list = "list"
    }
    /** The list of embeddings generated by the model. */
    public var data: [Embedding]
    /** The name of the model used to generate the embedding. */
    public var model: String
    /** The object type, which is always \"list\". */
    public var object: Object
    public var usage: CreateEmbeddingResponseUsage

    public init(data: [Embedding], model: String, object: Object, usage: CreateEmbeddingResponseUsage) {
        self.data = data
        self.model = model
        self.object = object
        self.usage = usage
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case data
        case model
        case object
        case usage
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(data, forKey: .data)
        try container.encode(model, forKey: .model)
        try container.encode(object, forKey: .object)
        try container.encode(usage, forKey: .usage)
    }
}
