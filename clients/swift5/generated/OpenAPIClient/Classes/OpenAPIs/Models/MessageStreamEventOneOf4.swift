//
// MessageStreamEventOneOf4.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed. */
public struct MessageStreamEventOneOf4: Codable, JSONEncodable, Hashable {

    public enum Event: String, Codable, CaseIterable {
        case threadPeriodMessagePeriodIncomplete = "thread.message.incomplete"
    }
    public var event: Event
    public var data: MessageObject

    public init(event: Event, data: MessageObject) {
        self.event = event
        self.data = data
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case event
        case data
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(event, forKey: .event)
        try container.encode(data, forKey: .data)
    }
}

