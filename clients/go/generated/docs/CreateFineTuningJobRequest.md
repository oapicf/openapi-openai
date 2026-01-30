# CreateFineTuningJobRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Model** | [**CreateFineTuningJobRequestModel**](CreateFineTuningJobRequestModel.md) |  | 
**TrainingFile** | **string** | The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.  | 
**Hyperparameters** | Pointer to [**CreateFineTuningJobRequestHyperparameters**](CreateFineTuningJobRequestHyperparameters.md) |  | [optional] 
**Suffix** | Pointer to **NullableString** | A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ft:gpt-4o-mini:openai:custom-model-name:7p4lURel&#x60;.  | [optional] 
**ValidationFile** | Pointer to **NullableString** | The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.  | [optional] 
**Integrations** | Pointer to [**[]CreateFineTuningJobRequestIntegrationsInner**](CreateFineTuningJobRequestIntegrationsInner.md) | A list of integrations to enable for your fine-tuning job. | [optional] 
**Seed** | Pointer to **NullableInt32** | The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you.  | [optional] 
**Method** | Pointer to [**FineTuneMethod**](FineTuneMethod.md) |  | [optional] 

## Methods

### NewCreateFineTuningJobRequest

`func NewCreateFineTuningJobRequest(model CreateFineTuningJobRequestModel, trainingFile string, ) *CreateFineTuningJobRequest`

NewCreateFineTuningJobRequest instantiates a new CreateFineTuningJobRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateFineTuningJobRequestWithDefaults

`func NewCreateFineTuningJobRequestWithDefaults() *CreateFineTuningJobRequest`

NewCreateFineTuningJobRequestWithDefaults instantiates a new CreateFineTuningJobRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetModel

`func (o *CreateFineTuningJobRequest) GetModel() CreateFineTuningJobRequestModel`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *CreateFineTuningJobRequest) GetModelOk() (*CreateFineTuningJobRequestModel, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *CreateFineTuningJobRequest) SetModel(v CreateFineTuningJobRequestModel)`

SetModel sets Model field to given value.


### GetTrainingFile

`func (o *CreateFineTuningJobRequest) GetTrainingFile() string`

GetTrainingFile returns the TrainingFile field if non-nil, zero value otherwise.

### GetTrainingFileOk

`func (o *CreateFineTuningJobRequest) GetTrainingFileOk() (*string, bool)`

GetTrainingFileOk returns a tuple with the TrainingFile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrainingFile

`func (o *CreateFineTuningJobRequest) SetTrainingFile(v string)`

SetTrainingFile sets TrainingFile field to given value.


### GetHyperparameters

`func (o *CreateFineTuningJobRequest) GetHyperparameters() CreateFineTuningJobRequestHyperparameters`

GetHyperparameters returns the Hyperparameters field if non-nil, zero value otherwise.

### GetHyperparametersOk

`func (o *CreateFineTuningJobRequest) GetHyperparametersOk() (*CreateFineTuningJobRequestHyperparameters, bool)`

GetHyperparametersOk returns a tuple with the Hyperparameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHyperparameters

`func (o *CreateFineTuningJobRequest) SetHyperparameters(v CreateFineTuningJobRequestHyperparameters)`

SetHyperparameters sets Hyperparameters field to given value.

### HasHyperparameters

`func (o *CreateFineTuningJobRequest) HasHyperparameters() bool`

HasHyperparameters returns a boolean if a field has been set.

### GetSuffix

`func (o *CreateFineTuningJobRequest) GetSuffix() string`

GetSuffix returns the Suffix field if non-nil, zero value otherwise.

### GetSuffixOk

`func (o *CreateFineTuningJobRequest) GetSuffixOk() (*string, bool)`

GetSuffixOk returns a tuple with the Suffix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuffix

`func (o *CreateFineTuningJobRequest) SetSuffix(v string)`

SetSuffix sets Suffix field to given value.

### HasSuffix

`func (o *CreateFineTuningJobRequest) HasSuffix() bool`

HasSuffix returns a boolean if a field has been set.

### SetSuffixNil

`func (o *CreateFineTuningJobRequest) SetSuffixNil(b bool)`

 SetSuffixNil sets the value for Suffix to be an explicit nil

### UnsetSuffix
`func (o *CreateFineTuningJobRequest) UnsetSuffix()`

UnsetSuffix ensures that no value is present for Suffix, not even an explicit nil
### GetValidationFile

`func (o *CreateFineTuningJobRequest) GetValidationFile() string`

GetValidationFile returns the ValidationFile field if non-nil, zero value otherwise.

### GetValidationFileOk

`func (o *CreateFineTuningJobRequest) GetValidationFileOk() (*string, bool)`

GetValidationFileOk returns a tuple with the ValidationFile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidationFile

`func (o *CreateFineTuningJobRequest) SetValidationFile(v string)`

SetValidationFile sets ValidationFile field to given value.

### HasValidationFile

`func (o *CreateFineTuningJobRequest) HasValidationFile() bool`

HasValidationFile returns a boolean if a field has been set.

### SetValidationFileNil

`func (o *CreateFineTuningJobRequest) SetValidationFileNil(b bool)`

 SetValidationFileNil sets the value for ValidationFile to be an explicit nil

### UnsetValidationFile
`func (o *CreateFineTuningJobRequest) UnsetValidationFile()`

UnsetValidationFile ensures that no value is present for ValidationFile, not even an explicit nil
### GetIntegrations

`func (o *CreateFineTuningJobRequest) GetIntegrations() []CreateFineTuningJobRequestIntegrationsInner`

GetIntegrations returns the Integrations field if non-nil, zero value otherwise.

### GetIntegrationsOk

`func (o *CreateFineTuningJobRequest) GetIntegrationsOk() (*[]CreateFineTuningJobRequestIntegrationsInner, bool)`

GetIntegrationsOk returns a tuple with the Integrations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntegrations

`func (o *CreateFineTuningJobRequest) SetIntegrations(v []CreateFineTuningJobRequestIntegrationsInner)`

SetIntegrations sets Integrations field to given value.

### HasIntegrations

`func (o *CreateFineTuningJobRequest) HasIntegrations() bool`

HasIntegrations returns a boolean if a field has been set.

### SetIntegrationsNil

`func (o *CreateFineTuningJobRequest) SetIntegrationsNil(b bool)`

 SetIntegrationsNil sets the value for Integrations to be an explicit nil

### UnsetIntegrations
`func (o *CreateFineTuningJobRequest) UnsetIntegrations()`

UnsetIntegrations ensures that no value is present for Integrations, not even an explicit nil
### GetSeed

`func (o *CreateFineTuningJobRequest) GetSeed() int32`

GetSeed returns the Seed field if non-nil, zero value otherwise.

### GetSeedOk

`func (o *CreateFineTuningJobRequest) GetSeedOk() (*int32, bool)`

GetSeedOk returns a tuple with the Seed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSeed

`func (o *CreateFineTuningJobRequest) SetSeed(v int32)`

SetSeed sets Seed field to given value.

### HasSeed

`func (o *CreateFineTuningJobRequest) HasSeed() bool`

HasSeed returns a boolean if a field has been set.

### SetSeedNil

`func (o *CreateFineTuningJobRequest) SetSeedNil(b bool)`

 SetSeedNil sets the value for Seed to be an explicit nil

### UnsetSeed
`func (o *CreateFineTuningJobRequest) UnsetSeed()`

UnsetSeed ensures that no value is present for Seed, not even an explicit nil
### GetMethod

`func (o *CreateFineTuningJobRequest) GetMethod() FineTuneMethod`

GetMethod returns the Method field if non-nil, zero value otherwise.

### GetMethodOk

`func (o *CreateFineTuningJobRequest) GetMethodOk() (*FineTuneMethod, bool)`

GetMethodOk returns a tuple with the Method field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMethod

`func (o *CreateFineTuningJobRequest) SetMethod(v FineTuneMethod)`

SetMethod sets Method field to given value.

### HasMethod

`func (o *CreateFineTuningJobRequest) HasMethod() bool`

HasMethod returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


