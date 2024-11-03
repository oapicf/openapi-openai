//
// RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct RunStepDeltaStepDetailsToolCallsCodeOutputImageObject: Codable, JSONEncodable, Hashable {

    public enum ModelType: String, Codable, CaseIterable {
        case image = "image"
    }
    /** The index of the output in the outputs array. */
    public var index: Int
    /** Always `image`. */
    public var type: ModelType
    public var image: RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage?

    public init(index: Int, type: ModelType, image: RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage? = nil) {
        self.index = index
        self.type = type
        self.image = image
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case index
        case type
        case image
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(index, forKey: .index)
        try container.encode(type, forKey: .type)
        try container.encodeIfPresent(image, forKey: .image)
    }
}

