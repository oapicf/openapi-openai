//
// RunStepDeltaObjectDelta.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** The delta containing the fields that have changed on the run step. */
public struct RunStepDeltaObjectDelta: Codable, JSONEncodable, Hashable {

    public var stepDetails: RunStepDeltaObjectDeltaStepDetails?

    public init(stepDetails: RunStepDeltaObjectDeltaStepDetails? = nil) {
        self.stepDetails = stepDetails
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case stepDetails = "step_details"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(stepDetails, forKey: .stepDetails)
    }
}

