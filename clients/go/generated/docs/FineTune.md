# FineTune

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**Object** | **string** |  | 
**CreatedAt** | **int32** |  | 
**UpdatedAt** | **int32** |  | 
**Model** | **string** |  | 
**FineTunedModel** | **NullableString** |  | 
**OrganizationId** | **string** |  | 
**Status** | **string** |  | 
**Hyperparams** | **map[string]interface{}** |  | 
**TrainingFiles** | [**[]OpenAIFile**](OpenAIFile.md) |  | 
**ValidationFiles** | [**[]OpenAIFile**](OpenAIFile.md) |  | 
**ResultFiles** | [**[]OpenAIFile**](OpenAIFile.md) |  | 
**Events** | Pointer to [**[]FineTuneEvent**](FineTuneEvent.md) |  | [optional] 

## Methods

### NewFineTune

`func NewFineTune(id string, object string, createdAt int32, updatedAt int32, model string, fineTunedModel NullableString, organizationId string, status string, hyperparams map[string]interface{}, trainingFiles []OpenAIFile, validationFiles []OpenAIFile, resultFiles []OpenAIFile, ) *FineTune`

NewFineTune instantiates a new FineTune object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFineTuneWithDefaults

`func NewFineTuneWithDefaults() *FineTune`

NewFineTuneWithDefaults instantiates a new FineTune object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *FineTune) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *FineTune) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *FineTune) SetId(v string)`

SetId sets Id field to given value.


### GetObject

`func (o *FineTune) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *FineTune) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *FineTune) SetObject(v string)`

SetObject sets Object field to given value.


### GetCreatedAt

`func (o *FineTune) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *FineTune) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *FineTune) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetUpdatedAt

`func (o *FineTune) GetUpdatedAt() int32`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *FineTune) GetUpdatedAtOk() (*int32, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *FineTune) SetUpdatedAt(v int32)`

SetUpdatedAt sets UpdatedAt field to given value.


### GetModel

`func (o *FineTune) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *FineTune) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *FineTune) SetModel(v string)`

SetModel sets Model field to given value.


### GetFineTunedModel

`func (o *FineTune) GetFineTunedModel() string`

GetFineTunedModel returns the FineTunedModel field if non-nil, zero value otherwise.

### GetFineTunedModelOk

`func (o *FineTune) GetFineTunedModelOk() (*string, bool)`

GetFineTunedModelOk returns a tuple with the FineTunedModel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFineTunedModel

`func (o *FineTune) SetFineTunedModel(v string)`

SetFineTunedModel sets FineTunedModel field to given value.


### SetFineTunedModelNil

`func (o *FineTune) SetFineTunedModelNil(b bool)`

 SetFineTunedModelNil sets the value for FineTunedModel to be an explicit nil

### UnsetFineTunedModel
`func (o *FineTune) UnsetFineTunedModel()`

UnsetFineTunedModel ensures that no value is present for FineTunedModel, not even an explicit nil
### GetOrganizationId

`func (o *FineTune) GetOrganizationId() string`

GetOrganizationId returns the OrganizationId field if non-nil, zero value otherwise.

### GetOrganizationIdOk

`func (o *FineTune) GetOrganizationIdOk() (*string, bool)`

GetOrganizationIdOk returns a tuple with the OrganizationId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrganizationId

`func (o *FineTune) SetOrganizationId(v string)`

SetOrganizationId sets OrganizationId field to given value.


### GetStatus

`func (o *FineTune) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *FineTune) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *FineTune) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetHyperparams

`func (o *FineTune) GetHyperparams() map[string]interface{}`

GetHyperparams returns the Hyperparams field if non-nil, zero value otherwise.

### GetHyperparamsOk

`func (o *FineTune) GetHyperparamsOk() (*map[string]interface{}, bool)`

GetHyperparamsOk returns a tuple with the Hyperparams field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHyperparams

`func (o *FineTune) SetHyperparams(v map[string]interface{})`

SetHyperparams sets Hyperparams field to given value.


### GetTrainingFiles

`func (o *FineTune) GetTrainingFiles() []OpenAIFile`

GetTrainingFiles returns the TrainingFiles field if non-nil, zero value otherwise.

### GetTrainingFilesOk

`func (o *FineTune) GetTrainingFilesOk() (*[]OpenAIFile, bool)`

GetTrainingFilesOk returns a tuple with the TrainingFiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrainingFiles

`func (o *FineTune) SetTrainingFiles(v []OpenAIFile)`

SetTrainingFiles sets TrainingFiles field to given value.


### GetValidationFiles

`func (o *FineTune) GetValidationFiles() []OpenAIFile`

GetValidationFiles returns the ValidationFiles field if non-nil, zero value otherwise.

### GetValidationFilesOk

`func (o *FineTune) GetValidationFilesOk() (*[]OpenAIFile, bool)`

GetValidationFilesOk returns a tuple with the ValidationFiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidationFiles

`func (o *FineTune) SetValidationFiles(v []OpenAIFile)`

SetValidationFiles sets ValidationFiles field to given value.


### GetResultFiles

`func (o *FineTune) GetResultFiles() []OpenAIFile`

GetResultFiles returns the ResultFiles field if non-nil, zero value otherwise.

### GetResultFilesOk

`func (o *FineTune) GetResultFilesOk() (*[]OpenAIFile, bool)`

GetResultFilesOk returns a tuple with the ResultFiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResultFiles

`func (o *FineTune) SetResultFiles(v []OpenAIFile)`

SetResultFiles sets ResultFiles field to given value.


### GetEvents

`func (o *FineTune) GetEvents() []FineTuneEvent`

GetEvents returns the Events field if non-nil, zero value otherwise.

### GetEventsOk

`func (o *FineTune) GetEventsOk() (*[]FineTuneEvent, bool)`

GetEventsOk returns a tuple with the Events field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvents

`func (o *FineTune) SetEvents(v []FineTuneEvent)`

SetEvents sets Events field to given value.

### HasEvents

`func (o *FineTune) HasEvents() bool`

HasEvents returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


