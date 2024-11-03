//
// MessageDeltaContentImageFileObject.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** References an image [File](/docs/api-reference/files) in the content of a message. */
public struct MessageDeltaContentImageFileObject: Codable, JSONEncodable, Hashable {

    public enum ModelType: String, Codable, CaseIterable {
        case imageFile = "image_file"
    }
    /** The index of the content part in the message. */
    public var index: Int
    /** Always `image_file`. */
    public var type: ModelType
    public var imageFile: MessageDeltaContentImageFileObjectImageFile?

    public init(index: Int, type: ModelType, imageFile: MessageDeltaContentImageFileObjectImageFile? = nil) {
        self.index = index
        self.type = type
        self.imageFile = imageFile
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case index
        case type
        case imageFile = "image_file"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(index, forKey: .index)
        try container.encode(type, forKey: .type)
        try container.encodeIfPresent(imageFile, forKey: .imageFile)
    }
}

