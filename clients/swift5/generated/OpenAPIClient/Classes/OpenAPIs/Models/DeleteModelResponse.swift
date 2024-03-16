//
// DeleteModelResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct DeleteModelResponse: Codable, JSONEncodable, Hashable {

    public var id: String
    public var object: String
    public var deleted: Bool

    public init(id: String, object: String, deleted: Bool) {
        self.id = id
        self.object = object
        self.deleted = deleted
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case object
        case deleted
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(id, forKey: .id)
        try container.encode(object, forKey: .object)
        try container.encode(deleted, forKey: .deleted)
    }
}

