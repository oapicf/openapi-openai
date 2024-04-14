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

/** A list of the categories, and whether they are flagged or not. */
public struct CreateModerationResponseResultsInnerCategories: Codable, JSONEncodable, Hashable {

    /** Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment. */
    public var hate: Bool
    /** Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. */
    public var hateThreatening: Bool
    /** Content that expresses, incites, or promotes harassing language towards any target. */
    public var harassment: Bool
    /** Harassment content that also includes violence or serious harm towards any target. */
    public var harassmentThreatening: Bool
    /** Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders. */
    public var selfHarm: Bool
    /** Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders. */
    public var selfHarmIntent: Bool
    /** Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts. */
    public var selfHarmInstructions: Bool
    /** Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness). */
    public var sexual: Bool
    /** Sexual content that includes an individual who is under 18 years old. */
    public var sexualMinors: Bool
    /** Content that depicts death, violence, or physical injury. */
    public var violence: Bool
    /** Content that depicts death, violence, or physical injury in graphic detail. */
    public var violenceGraphic: Bool

    public init(hate: Bool, hateThreatening: Bool, harassment: Bool, harassmentThreatening: Bool, selfHarm: Bool, selfHarmIntent: Bool, selfHarmInstructions: Bool, sexual: Bool, sexualMinors: Bool, violence: Bool, violenceGraphic: Bool) {
        self.hate = hate
        self.hateThreatening = hateThreatening
        self.harassment = harassment
        self.harassmentThreatening = harassmentThreatening
        self.selfHarm = selfHarm
        self.selfHarmIntent = selfHarmIntent
        self.selfHarmInstructions = selfHarmInstructions
        self.sexual = sexual
        self.sexualMinors = sexualMinors
        self.violence = violence
        self.violenceGraphic = violenceGraphic
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case hate
        case hateThreatening = "hate/threatening"
        case harassment
        case harassmentThreatening = "harassment/threatening"
        case selfHarm = "self-harm"
        case selfHarmIntent = "self-harm/intent"
        case selfHarmInstructions = "self-harm/instructions"
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
        try container.encode(harassment, forKey: .harassment)
        try container.encode(harassmentThreatening, forKey: .harassmentThreatening)
        try container.encode(selfHarm, forKey: .selfHarm)
        try container.encode(selfHarmIntent, forKey: .selfHarmIntent)
        try container.encode(selfHarmInstructions, forKey: .selfHarmInstructions)
        try container.encode(sexual, forKey: .sexual)
        try container.encode(sexualMinors, forKey: .sexualMinors)
        try container.encode(violence, forKey: .violence)
        try container.encode(violenceGraphic, forKey: .violenceGraphic)
    }
}

