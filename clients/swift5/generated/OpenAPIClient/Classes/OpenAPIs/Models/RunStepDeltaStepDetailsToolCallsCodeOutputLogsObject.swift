//
// RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Text output from the Code Interpreter tool call as part of a run step. */
public struct RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject: Codable, JSONEncodable, Hashable {

    public enum ModelType: String, Codable, CaseIterable {
        case logs = "logs"
    }
    /** The index of the output in the outputs array. */
    public var index: Int
    /** Always `logs`. */
    public var type: ModelType
    /** The text output from the Code Interpreter tool call. */
    public var logs: String?

    public init(index: Int, type: ModelType, logs: String? = nil) {
        self.index = index
        self.type = type
        self.logs = logs
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case index
        case type
        case logs
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(index, forKey: .index)
        try container.encode(type, forKey: .type)
        try container.encodeIfPresent(logs, forKey: .logs)
    }
}

