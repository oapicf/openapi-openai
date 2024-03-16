//
// ImagesResponseDataInner.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct ImagesResponseDataInner: Codable, JSONEncodable, Hashable {

    public var url: String?
    public var b64Json: String?

    public init(url: String? = nil, b64Json: String? = nil) {
        self.url = url
        self.b64Json = b64Json
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case url
        case b64Json = "b64_json"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(url, forKey: .url)
        try container.encodeIfPresent(b64Json, forKey: .b64Json)
    }
}
