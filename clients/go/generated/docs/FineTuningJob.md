# FineTuningJob

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The object identifier, which can be referenced in the API endpoints. | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**Error** | [**NullableFineTuningJobError**](FineTuningJobError.md) |  | 
**FineTunedModel** | **NullableString** | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. | 
**FinishedAt** | **NullableInt32** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. | 
**Hyperparameters** | [**FineTuningJobHyperparameters**](FineTuningJobHyperparameters.md) |  | 
**Model** | **string** | The base model that is being fine-tuned. | 
**Object** | **string** | The object type, which is always \&quot;fine_tuning.job\&quot;. | 
**OrganizationId** | **string** | The organization that owns the fine-tuning job. | 
**ResultFiles** | **[]string** | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**Status** | **string** | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. | 
**TrainedTokens** | **NullableInt32** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. | 
**TrainingFile** | **string** | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**ValidationFile** | **NullableString** | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**Integrations** | Pointer to [**[]FineTuningJobIntegrationsInner**](FineTuningJobIntegrationsInner.md) | A list of integrations to enable for this fine-tuning job. | [optional] 
**Seed** | **int32** | The seed used for the fine-tuning job. | 
**EstimatedFinish** | Pointer to **NullableInt32** | The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running. | [optional] 
**Method** | Pointer to [**FineTuneMethod**](FineTuneMethod.md) |  | [optional] 

## Methods

### NewFineTuningJob

`func NewFineTuningJob(id string, createdAt int32, error_ NullableFineTuningJobError, fineTunedModel NullableString, finishedAt NullableInt32, hyperparameters FineTuningJobHyperparameters, model string, object string, organizationId string, resultFiles []string, status string, trainedTokens NullableInt32, trainingFile string, validationFile NullableString, seed int32, ) *FineTuningJob`

NewFineTuningJob instantiates a new FineTuningJob object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFineTuningJobWithDefaults

`func NewFineTuningJobWithDefaults() *FineTuningJob`

NewFineTuningJobWithDefaults instantiates a new FineTuningJob object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *FineTuningJob) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *FineTuningJob) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *FineTuningJob) SetId(v string)`

SetId sets Id field to given value.


### GetCreatedAt

`func (o *FineTuningJob) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *FineTuningJob) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *FineTuningJob) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetError

`func (o *FineTuningJob) GetError() FineTuningJobError`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *FineTuningJob) GetErrorOk() (*FineTuningJobError, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *FineTuningJob) SetError(v FineTuningJobError)`

SetError sets Error field to given value.


### SetErrorNil

`func (o *FineTuningJob) SetErrorNil(b bool)`

 SetErrorNil sets the value for Error to be an explicit nil

### UnsetError
`func (o *FineTuningJob) UnsetError()`

UnsetError ensures that no value is present for Error, not even an explicit nil
### GetFineTunedModel

`func (o *FineTuningJob) GetFineTunedModel() string`

GetFineTunedModel returns the FineTunedModel field if non-nil, zero value otherwise.

### GetFineTunedModelOk

`func (o *FineTuningJob) GetFineTunedModelOk() (*string, bool)`

GetFineTunedModelOk returns a tuple with the FineTunedModel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFineTunedModel

`func (o *FineTuningJob) SetFineTunedModel(v string)`

SetFineTunedModel sets FineTunedModel field to given value.


### SetFineTunedModelNil

`func (o *FineTuningJob) SetFineTunedModelNil(b bool)`

 SetFineTunedModelNil sets the value for FineTunedModel to be an explicit nil

### UnsetFineTunedModel
`func (o *FineTuningJob) UnsetFineTunedModel()`

UnsetFineTunedModel ensures that no value is present for FineTunedModel, not even an explicit nil
### GetFinishedAt

`func (o *FineTuningJob) GetFinishedAt() int32`

GetFinishedAt returns the FinishedAt field if non-nil, zero value otherwise.

### GetFinishedAtOk

`func (o *FineTuningJob) GetFinishedAtOk() (*int32, bool)`

GetFinishedAtOk returns a tuple with the FinishedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFinishedAt

`func (o *FineTuningJob) SetFinishedAt(v int32)`

SetFinishedAt sets FinishedAt field to given value.


### SetFinishedAtNil

`func (o *FineTuningJob) SetFinishedAtNil(b bool)`

 SetFinishedAtNil sets the value for FinishedAt to be an explicit nil

### UnsetFinishedAt
`func (o *FineTuningJob) UnsetFinishedAt()`

UnsetFinishedAt ensures that no value is present for FinishedAt, not even an explicit nil
### GetHyperparameters

`func (o *FineTuningJob) GetHyperparameters() FineTuningJobHyperparameters`

GetHyperparameters returns the Hyperparameters field if non-nil, zero value otherwise.

### GetHyperparametersOk

`func (o *FineTuningJob) GetHyperparametersOk() (*FineTuningJobHyperparameters, bool)`

GetHyperparametersOk returns a tuple with the Hyperparameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHyperparameters

`func (o *FineTuningJob) SetHyperparameters(v FineTuningJobHyperparameters)`

SetHyperparameters sets Hyperparameters field to given value.


### GetModel

`func (o *FineTuningJob) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *FineTuningJob) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *FineTuningJob) SetModel(v string)`

SetModel sets Model field to given value.


### GetObject

`func (o *FineTuningJob) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *FineTuningJob) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *FineTuningJob) SetObject(v string)`

SetObject sets Object field to given value.


### GetOrganizationId

`func (o *FineTuningJob) GetOrganizationId() string`

GetOrganizationId returns the OrganizationId field if non-nil, zero value otherwise.

### GetOrganizationIdOk

`func (o *FineTuningJob) GetOrganizationIdOk() (*string, bool)`

GetOrganizationIdOk returns a tuple with the OrganizationId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrganizationId

`func (o *FineTuningJob) SetOrganizationId(v string)`

SetOrganizationId sets OrganizationId field to given value.


### GetResultFiles

`func (o *FineTuningJob) GetResultFiles() []string`

GetResultFiles returns the ResultFiles field if non-nil, zero value otherwise.

### GetResultFilesOk

`func (o *FineTuningJob) GetResultFilesOk() (*[]string, bool)`

GetResultFilesOk returns a tuple with the ResultFiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResultFiles

`func (o *FineTuningJob) SetResultFiles(v []string)`

SetResultFiles sets ResultFiles field to given value.


### GetStatus

`func (o *FineTuningJob) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *FineTuningJob) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *FineTuningJob) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetTrainedTokens

`func (o *FineTuningJob) GetTrainedTokens() int32`

GetTrainedTokens returns the TrainedTokens field if non-nil, zero value otherwise.

### GetTrainedTokensOk

`func (o *FineTuningJob) GetTrainedTokensOk() (*int32, bool)`

GetTrainedTokensOk returns a tuple with the TrainedTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrainedTokens

`func (o *FineTuningJob) SetTrainedTokens(v int32)`

SetTrainedTokens sets TrainedTokens field to given value.


### SetTrainedTokensNil

`func (o *FineTuningJob) SetTrainedTokensNil(b bool)`

 SetTrainedTokensNil sets the value for TrainedTokens to be an explicit nil

### UnsetTrainedTokens
`func (o *FineTuningJob) UnsetTrainedTokens()`

UnsetTrainedTokens ensures that no value is present for TrainedTokens, not even an explicit nil
### GetTrainingFile

`func (o *FineTuningJob) GetTrainingFile() string`

GetTrainingFile returns the TrainingFile field if non-nil, zero value otherwise.

### GetTrainingFileOk

`func (o *FineTuningJob) GetTrainingFileOk() (*string, bool)`

GetTrainingFileOk returns a tuple with the TrainingFile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrainingFile

`func (o *FineTuningJob) SetTrainingFile(v string)`

SetTrainingFile sets TrainingFile field to given value.


### GetValidationFile

`func (o *FineTuningJob) GetValidationFile() string`

GetValidationFile returns the ValidationFile field if non-nil, zero value otherwise.

### GetValidationFileOk

`func (o *FineTuningJob) GetValidationFileOk() (*string, bool)`

GetValidationFileOk returns a tuple with the ValidationFile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidationFile

`func (o *FineTuningJob) SetValidationFile(v string)`

SetValidationFile sets ValidationFile field to given value.


### SetValidationFileNil

`func (o *FineTuningJob) SetValidationFileNil(b bool)`

 SetValidationFileNil sets the value for ValidationFile to be an explicit nil

### UnsetValidationFile
`func (o *FineTuningJob) UnsetValidationFile()`

UnsetValidationFile ensures that no value is present for ValidationFile, not even an explicit nil
### GetIntegrations

`func (o *FineTuningJob) GetIntegrations() []FineTuningJobIntegrationsInner`

GetIntegrations returns the Integrations field if non-nil, zero value otherwise.

### GetIntegrationsOk

`func (o *FineTuningJob) GetIntegrationsOk() (*[]FineTuningJobIntegrationsInner, bool)`

GetIntegrationsOk returns a tuple with the Integrations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntegrations

`func (o *FineTuningJob) SetIntegrations(v []FineTuningJobIntegrationsInner)`

SetIntegrations sets Integrations field to given value.

### HasIntegrations

`func (o *FineTuningJob) HasIntegrations() bool`

HasIntegrations returns a boolean if a field has been set.

### SetIntegrationsNil

`func (o *FineTuningJob) SetIntegrationsNil(b bool)`

 SetIntegrationsNil sets the value for Integrations to be an explicit nil

### UnsetIntegrations
`func (o *FineTuningJob) UnsetIntegrations()`

UnsetIntegrations ensures that no value is present for Integrations, not even an explicit nil
### GetSeed

`func (o *FineTuningJob) GetSeed() int32`

GetSeed returns the Seed field if non-nil, zero value otherwise.

### GetSeedOk

`func (o *FineTuningJob) GetSeedOk() (*int32, bool)`

GetSeedOk returns a tuple with the Seed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSeed

`func (o *FineTuningJob) SetSeed(v int32)`

SetSeed sets Seed field to given value.


### GetEstimatedFinish

`func (o *FineTuningJob) GetEstimatedFinish() int32`

GetEstimatedFinish returns the EstimatedFinish field if non-nil, zero value otherwise.

### GetEstimatedFinishOk

`func (o *FineTuningJob) GetEstimatedFinishOk() (*int32, bool)`

GetEstimatedFinishOk returns a tuple with the EstimatedFinish field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEstimatedFinish

`func (o *FineTuningJob) SetEstimatedFinish(v int32)`

SetEstimatedFinish sets EstimatedFinish field to given value.

### HasEstimatedFinish

`func (o *FineTuningJob) HasEstimatedFinish() bool`

HasEstimatedFinish returns a boolean if a field has been set.

### SetEstimatedFinishNil

`func (o *FineTuningJob) SetEstimatedFinishNil(b bool)`

 SetEstimatedFinishNil sets the value for EstimatedFinish to be an explicit nil

### UnsetEstimatedFinish
`func (o *FineTuningJob) UnsetEstimatedFinish()`

UnsetEstimatedFinish ensures that no value is present for EstimatedFinish, not even an explicit nil
### GetMethod

`func (o *FineTuningJob) GetMethod() FineTuneMethod`

GetMethod returns the Method field if non-nil, zero value otherwise.

### GetMethodOk

`func (o *FineTuningJob) GetMethodOk() (*FineTuneMethod, bool)`

GetMethodOk returns a tuple with the Method field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMethod

`func (o *FineTuningJob) SetMethod(v FineTuneMethod)`

SetMethod sets Method field to given value.

### HasMethod

`func (o *FineTuningJob) HasMethod() bool`

HasMethod returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


