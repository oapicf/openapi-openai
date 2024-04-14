//
// CreateModerationResponseResultsInner.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CreateModerationResponseResultsInner: Codable, JSONEncodable, Hashable {

    /** Whether any of the below categories are flagged. */
    public var flagged: Bool
    public var categories: CreateModerationResponseResultsInnerCategories
    public var categoryScores: CreateModerationResponseResultsInnerCategoryScores

    public init(flagged: Bool, categories: CreateModerationResponseResultsInnerCategories, categoryScores: CreateModerationResponseResultsInnerCategoryScores) {
        self.flagged = flagged
        self.categories = categories
        self.categoryScores = categoryScores
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case flagged
        case categories
        case categoryScores = "category_scores"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(flagged, forKey: .flagged)
        try container.encode(categories, forKey: .categories)
        try container.encode(categoryScores, forKey: .categoryScores)
    }
}

