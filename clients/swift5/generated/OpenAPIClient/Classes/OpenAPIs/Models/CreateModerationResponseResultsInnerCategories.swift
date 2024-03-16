//
// CreateModerationResponseResultsInnerCategories.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CreateModerationResponseResultsInnerCategories: Codable, JSONEncodable, Hashable {

    public var hate: Bool
    public var hateThreatening: Bool
    public var selfHarm: Bool
    public var sexual: Bool
    public var sexualMinors: Bool
    public var violence: Bool
    public var violenceGraphic: Bool

    public init(hate: Bool, hateThreatening: Bool, selfHarm: Bool, sexual: Bool, sexualMinors: Bool, violence: Bool, violenceGraphic: Bool) {
        self.hate = hate
        self.hateThreatening = hateThreatening
        self.selfHarm = selfHarm
        self.sexual = sexual
        self.sexualMinors = sexualMinors
        self.violence = violence
        self.violenceGraphic = violenceGraphic
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case hate
        case hateThreatening = "hate/threatening"
        case selfHarm = "self-harm"
        case sexual
        case sexualMinors = "sexual/minors"
        case violence
        case violenceGraphic = "violence/graphic"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(hate, forKey: .hate)
        try container.encode(hateThreatening, forKey: .hateThreatening)
        try container.encode(selfHarm, forKey: .selfHarm)
        try container.encode(sexual, forKey: .sexual)
        try container.encode(sexualMinors, forKey: .sexualMinors)
        try container.encode(violence, forKey: .violence)
        try container.encode(violenceGraphic, forKey: .violenceGraphic)
    }
}

