//
// FineTuningJob.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API.  */
public struct FineTuningJob: Codable, JSONEncodable, Hashable {

    public enum Object: String, Codable, CaseIterable {
        case fineTuningPeriodJob = "fine_tuning.job"
    }
    public enum Status: String, Codable, CaseIterable {
        case validatingFiles = "validating_files"
        case queued = "queued"
        case running = "running"
        case succeeded = "succeeded"
        case failed = "failed"
        case cancelled = "cancelled"
    }
    static let integrationsRule = ArrayRule(minItems: nil, maxItems: 5, uniqueItems: false)
    /** The object identifier, which can be referenced in the API endpoints. */
    public var id: String
    /** The Unix timestamp (in seconds) for when the fine-tuning job was created. */
    public var createdAt: Int
    public var error: FineTuningJobError?
    /** The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. */
    public var fineTunedModel: String?
    /** The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. */
    public var finishedAt: Int?
    public var hyperparameters: FineTuningJobHyperparameters
    /** The base model that is being fine-tuned. */
    public var model: String
    /** The object type, which is always \"fine_tuning.job\". */
    public var object: Object
    /** The organization that owns the fine-tuning job. */
    public var organizationId: String
    /** The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). */
    public var resultFiles: [String]
    /** The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`. */
    public var status: Status
    /** The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. */
    public var trainedTokens: Int?
    /** The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). */
    public var trainingFile: String
    /** The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). */
    public var validationFile: String?
    /** A list of integrations to enable for this fine-tuning job. */
    public var integrations: [FineTuningJobIntegrationsInner]?
    /** The seed used for the fine-tuning job. */
    public var seed: Int

    public init(id: String, createdAt: Int, error: FineTuningJobError?, fineTunedModel: String?, finishedAt: Int?, hyperparameters: FineTuningJobHyperparameters, model: String, object: Object, organizationId: String, resultFiles: [String], status: Status, trainedTokens: Int?, trainingFile: String, validationFile: String?, integrations: [FineTuningJobIntegrationsInner]? = nil, seed: Int) {
        self.id = id
        self.createdAt = createdAt
        self.error = error
        self.fineTunedModel = fineTunedModel
        self.finishedAt = finishedAt
        self.hyperparameters = hyperparameters
        self.model = model
        self.object = object
        self.organizationId = organizationId
        self.resultFiles = resultFiles
        self.status = status
        self.trainedTokens = trainedTokens
        self.trainingFile = trainingFile
        self.validationFile = validationFile
        self.integrations = integrations
        self.seed = seed
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case createdAt = "created_at"
        case error
        case fineTunedModel = "fine_tuned_model"
        case finishedAt = "finished_at"
        case hyperparameters
        case model
        case object
        case organizationId = "organization_id"
        case resultFiles = "result_files"
        case status
        case trainedTokens = "trained_tokens"
        case trainingFile = "training_file"
        case validationFile = "validation_file"
        case integrations
        case seed
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(id, forKey: .id)
        try container.encode(createdAt, forKey: .createdAt)
        try container.encode(error, forKey: .error)
        try container.encode(fineTunedModel, forKey: .fineTunedModel)
        try container.encode(finishedAt, forKey: .finishedAt)
        try container.encode(hyperparameters, forKey: .hyperparameters)
        try container.encode(model, forKey: .model)
        try container.encode(object, forKey: .object)
        try container.encode(organizationId, forKey: .organizationId)
        try container.encode(resultFiles, forKey: .resultFiles)
        try container.encode(status, forKey: .status)
        try container.encode(trainedTokens, forKey: .trainedTokens)
        try container.encode(trainingFile, forKey: .trainingFile)
        try container.encode(validationFile, forKey: .validationFile)
        try container.encodeIfPresent(integrations, forKey: .integrations)
        try container.encode(seed, forKey: .seed)
    }
}

