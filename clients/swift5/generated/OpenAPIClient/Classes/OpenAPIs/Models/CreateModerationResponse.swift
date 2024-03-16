//
// CreateModerationResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CreateModerationResponse: Codable, JSONEncodable, Hashable {

    public var id: String
    public var model: String
    public var results: [CreateModerationResponseResultsInner]

    public init(id: String, model: String, results: [CreateModerationResponseResultsInner]) {
        self.id = id
        self.model = model
        self.results = results
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case model
        case results
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(id, forKey: .id)
        try container.encode(model, forKey: .model)
        try container.encode(results, forKey: .results)
    }
}

