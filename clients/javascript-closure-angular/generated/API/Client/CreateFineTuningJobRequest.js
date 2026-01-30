goog.provide('API.Client.CreateFineTuningJobRequest');

/**
 * @record
 */
API.Client.CreateFineTuningJobRequest = function() {}

/**
 * @type {!API.Client.CreateFineTuningJobRequest_model}
 * @export
 */
API.Client.CreateFineTuningJobRequest.prototype.model;

/**
 * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
 * @type {!string}
 * @export
 */
API.Client.CreateFineTuningJobRequest.prototype.trainingFile;

/**
 * @type {!API.Client.CreateFineTuningJobRequest_hyperparameters}
 * @export
 */
API.Client.CreateFineTuningJobRequest.prototype.hyperparameters;

/**
 * A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-4o-mini:openai:custom-model-name:7p4lURel`. 
 * @type {!string}
 * @export
 */
API.Client.CreateFineTuningJobRequest.prototype.suffix;

/**
 * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
 * @type {!string}
 * @export
 */
API.Client.CreateFineTuningJobRequest.prototype.validationFile;

/**
 * A list of integrations to enable for your fine-tuning job.
 * @type {!Array<!API.Client.CreateFineTuningJobRequest_integrations_inner>}
 * @export
 */
API.Client.CreateFineTuningJobRequest.prototype.integrations;

/**
 * The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
 * @type {!number}
 * @export
 */
API.Client.CreateFineTuningJobRequest.prototype.seed;

/**
 * @type {!API.Client.FineTuneMethod}
 * @export
 */
API.Client.CreateFineTuningJobRequest.prototype.method;

