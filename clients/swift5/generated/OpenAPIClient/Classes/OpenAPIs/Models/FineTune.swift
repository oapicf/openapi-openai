//
// FineTune.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct FineTune: Codable, JSONEncodable, Hashable {

    public var id: String
    public var object: String
    public var createdAt: Int
    public var updatedAt: Int
    public var model: String
    public var fineTunedModel: String?
    public var organizationId: String
    public var status: String
    public var hyperparams: AnyCodable
    public var trainingFiles: [OpenAIFile]
    public var validationFiles: [OpenAIFile]
    public var resultFiles: [OpenAIFile]
    public var events: [FineTuneEvent]?

    public init(id: String, object: String, createdAt: Int, updatedAt: Int, model: String, fineTunedModel: String?, organizationId: String, status: String, hyperparams: AnyCodable, trainingFiles: [OpenAIFile], validationFiles: [OpenAIFile], resultFiles: [OpenAIFile], events: [FineTuneEvent]? = nil) {
        self.id = id
        self.object = object
        self.createdAt = createdAt
        self.updatedAt = updatedAt
        self.model = model
        self.fineTunedModel = fineTunedModel
        self.organizationId = organizationId
        self.status = status
        self.hyperparams = hyperparams
        self.trainingFiles = trainingFiles
        self.validationFiles = validationFiles
        self.resultFiles = resultFiles
        self.events = events
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case object
        case createdAt = "created_at"
        case updatedAt = "updated_at"
        case model
        case fineTunedModel = "fine_tuned_model"
        case organizationId = "organization_id"
        case status
        case hyperparams
        case trainingFiles = "training_files"
        case validationFiles = "validation_files"
        case resultFiles = "result_files"
        case events
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(id, forKey: .id)
        try container.encode(object, forKey: .object)
        try container.encode(createdAt, forKey: .createdAt)
        try container.encode(updatedAt, forKey: .updatedAt)
        try container.encode(model, forKey: .model)
        try container.encode(fineTunedModel, forKey: .fineTunedModel)
        try container.encode(organizationId, forKey: .organizationId)
        try container.encode(status, forKey: .status)
        try container.encode(hyperparams, forKey: .hyperparams)
        try container.encode(trainingFiles, forKey: .trainingFiles)
        try container.encode(validationFiles, forKey: .validationFiles)
        try container.encode(resultFiles, forKey: .resultFiles)
        try container.encodeIfPresent(events, forKey: .events)
    }
}
