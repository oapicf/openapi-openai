//
// MessageDeltaContentTextObjectText.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct MessageDeltaContentTextObjectText: Codable, JSONEncodable, Hashable {

    /** The data that makes up the text. */
    public var value: String?
    public var annotations: [MessageDeltaContentTextObjectTextAnnotationsInner]?

    public init(value: String? = nil, annotations: [MessageDeltaContentTextObjectTextAnnotationsInner]? = nil) {
        self.value = value
        self.annotations = annotations
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case value
        case annotations
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(value, forKey: .value)
        try container.encodeIfPresent(annotations, forKey: .annotations)
    }
}

