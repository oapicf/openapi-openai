//
// RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public enum RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner: Codable, JSONEncodable, Hashable {
    case typeRunStepDeltaStepDetailsToolCallsCodeOutputImageObject(RunStepDeltaStepDetailsToolCallsCodeOutputImageObject)
    case typeRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject)

    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        switch self {
        case .typeRunStepDeltaStepDetailsToolCallsCodeOutputImageObject(let value):
            try container.encode(value)
        case .typeRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(let value):
            try container.encode(value)
        }
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        if let value = try? container.decode(RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.self) {
            self = .typeRunStepDeltaStepDetailsToolCallsCodeOutputImageObject(value)
        } else if let value = try? container.decode(RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.self) {
            self = .typeRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(value)
        } else {
            throw DecodingError.typeMismatch(Self.Type.self, .init(codingPath: decoder.codingPath, debugDescription: "Unable to decode instance of RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner"))
        }
    }
}
