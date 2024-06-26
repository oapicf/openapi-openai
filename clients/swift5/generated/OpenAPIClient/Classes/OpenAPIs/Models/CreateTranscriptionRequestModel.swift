//
// CreateTranscriptionRequestModel.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** ID of the model to use. Only &#x60;whisper-1&#x60; (which is powered by our open source Whisper V2 model) is currently available.  */
public struct CreateTranscriptionRequestModel: Codable, JSONEncodable, Hashable {


    public enum CodingKeys: CodingKey, CaseIterable {
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
    }
}

