# CreateFineTuningJobRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [**CreateFineTuningJobRequestModel**](CreateFineTuningJobRequestModel.md) |  | [default to undefined]
**training_file** | **string** | The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.  | [default to undefined]
**hyperparameters** | [**CreateFineTuningJobRequestHyperparameters**](CreateFineTuningJobRequestHyperparameters.md) |  | [optional] [default to undefined]
**suffix** | **string** | A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ft:gpt-4o-mini:openai:custom-model-name:7p4lURel&#x60;.  | [optional] [default to undefined]
**validation_file** | **string** | The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.  | [optional] [default to undefined]
**integrations** | [**Array&lt;CreateFineTuningJobRequestIntegrationsInner&gt;**](CreateFineTuningJobRequestIntegrationsInner.md) | A list of integrations to enable for your fine-tuning job. | [optional] [default to undefined]
**seed** | **number** | The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you.  | [optional] [default to undefined]
**method** | [**FineTuneMethod**](FineTuneMethod.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CreateFineTuningJobRequest } from './api';

const instance: CreateFineTuningJobRequest = {
    model,
    training_file,
    hyperparameters,
    suffix,
    validation_file,
    integrations,
    seed,
    method,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
