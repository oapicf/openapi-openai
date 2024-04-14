//
// CreateFineTuneRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct CreateFineTuneRequest: Codable, JSONEncodable, Hashable {

    static let suffixRule = StringRule(minLength: 1, maxLength: 40, pattern: nil)
    /** The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.  */
    public var trainingFile: String
    /** The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.  */
    public var validationFile: String?
    public var model: CreateFineTuneRequestModel?
    /** The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset.  */
    public var nEpochs: Int? = 4
    /** The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets.  */
    public var batchSize: Int?
    /** The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results.  */
    public var learningRateMultiplier: Double?
    /** The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt.  */
    public var promptLossWeight: Double? = 0.01
    /** If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification.  */
    public var computeClassificationMetrics: Bool? = false
    /** The number of classes in a classification task.  This parameter is required for multiclass classification.  */
    public var classificationNClasses: Int?
    /** The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification.  */
    public var classificationPositiveClass: String?
    /** If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall.  */
    public var classificationBetas: [Double]?
    /** A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`.  */
    public var suffix: String?

    public init(trainingFile: String, validationFile: String? = nil, model: CreateFineTuneRequestModel? = nil, nEpochs: Int? = 4, batchSize: Int? = nil, learningRateMultiplier: Double? = nil, promptLossWeight: Double? = 0.01, computeClassificationMetrics: Bool? = false, classificationNClasses: Int? = nil, classificationPositiveClass: String? = nil, classificationBetas: [Double]? = nil, suffix: String? = nil) {
        self.trainingFile = trainingFile
        self.validationFile = validationFile
        self.model = model
        self.nEpochs = nEpochs
        self.batchSize = batchSize
        self.learningRateMultiplier = learningRateMultiplier
        self.promptLossWeight = promptLossWeight
        self.computeClassificationMetrics = computeClassificationMetrics
        self.classificationNClasses = classificationNClasses
        self.classificationPositiveClass = classificationPositiveClass
        self.classificationBetas = classificationBetas
        self.suffix = suffix
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case trainingFile = "training_file"
        case validationFile = "validation_file"
        case model
        case nEpochs = "n_epochs"
        case batchSize = "batch_size"
        case learningRateMultiplier = "learning_rate_multiplier"
        case promptLossWeight = "prompt_loss_weight"
        case computeClassificationMetrics = "compute_classification_metrics"
        case classificationNClasses = "classification_n_classes"
        case classificationPositiveClass = "classification_positive_class"
        case classificationBetas = "classification_betas"
        case suffix
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(trainingFile, forKey: .trainingFile)
        try container.encodeIfPresent(validationFile, forKey: .validationFile)
        try container.encodeIfPresent(model, forKey: .model)
        try container.encodeIfPresent(nEpochs, forKey: .nEpochs)
        try container.encodeIfPresent(batchSize, forKey: .batchSize)
        try container.encodeIfPresent(learningRateMultiplier, forKey: .learningRateMultiplier)
        try container.encodeIfPresent(promptLossWeight, forKey: .promptLossWeight)
        try container.encodeIfPresent(computeClassificationMetrics, forKey: .computeClassificationMetrics)
        try container.encodeIfPresent(classificationNClasses, forKey: .classificationNClasses)
        try container.encodeIfPresent(classificationPositiveClass, forKey: .classificationPositiveClass)
        try container.encodeIfPresent(classificationBetas, forKey: .classificationBetas)
        try container.encodeIfPresent(suffix, forKey: .suffix)
    }
}
