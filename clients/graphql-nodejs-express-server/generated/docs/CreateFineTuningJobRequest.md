# CreateFineTuningJobRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [***CreateFineTuningJobRequestModel**](CreateFineTuningJobRequest_model.md) |  | [default to null]
**trainingFile** | **String!** | The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.  | [default to null]
**hyperparameters** | [***CreateFineTuningJobRequestHyperparameters**](CreateFineTuningJobRequest_hyperparameters.md) |  | [optional] [default to null]
**suffix** | **String** | A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel&#x60;.  | [optional] [default to null]
**validationFile** | **String** | The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.  | [optional] [default to null]
**integrations** | [**CreateFineTuningJobRequestIntegrationsInner**](CreateFineTuningJobRequest_integrations_inner.md) | A list of integrations to enable for your fine-tuning job. | [optional] [default to null]
**seed** | **Int** | The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


