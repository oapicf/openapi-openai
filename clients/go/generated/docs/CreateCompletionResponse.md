# CreateCompletionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**Object** | **string** |  | 
**Created** | **int32** |  | 
**Model** | **string** |  | 
**Choices** | [**[]CreateCompletionResponseChoicesInner**](CreateCompletionResponseChoicesInner.md) |  | 
**Usage** | Pointer to [**CreateCompletionResponseUsage**](CreateCompletionResponseUsage.md) |  | [optional] 

## Methods

### NewCreateCompletionResponse

`func NewCreateCompletionResponse(id string, object string, created int32, model string, choices []CreateCompletionResponseChoicesInner, ) *CreateCompletionResponse`

NewCreateCompletionResponse instantiates a new CreateCompletionResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateCompletionResponseWithDefaults

`func NewCreateCompletionResponseWithDefaults() *CreateCompletionResponse`

NewCreateCompletionResponseWithDefaults instantiates a new CreateCompletionResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CreateCompletionResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CreateCompletionResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CreateCompletionResponse) SetId(v string)`

SetId sets Id field to given value.


### GetObject

`func (o *CreateCompletionResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *CreateCompletionResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *CreateCompletionResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetCreated

`func (o *CreateCompletionResponse) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *CreateCompletionResponse) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *CreateCompletionResponse) SetCreated(v int32)`

SetCreated sets Created field to given value.


### GetModel

`func (o *CreateCompletionResponse) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *CreateCompletionResponse) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *CreateCompletionResponse) SetModel(v string)`

SetModel sets Model field to given value.


### GetChoices

`func (o *CreateCompletionResponse) GetChoices() []CreateCompletionResponseChoicesInner`

GetChoices returns the Choices field if non-nil, zero value otherwise.

### GetChoicesOk

`func (o *CreateCompletionResponse) GetChoicesOk() (*[]CreateCompletionResponseChoicesInner, bool)`

GetChoicesOk returns a tuple with the Choices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChoices

`func (o *CreateCompletionResponse) SetChoices(v []CreateCompletionResponseChoicesInner)`

SetChoices sets Choices field to given value.


### GetUsage

`func (o *CreateCompletionResponse) GetUsage() CreateCompletionResponseUsage`

GetUsage returns the Usage field if non-nil, zero value otherwise.

### GetUsageOk

`func (o *CreateCompletionResponse) GetUsageOk() (*CreateCompletionResponseUsage, bool)`

GetUsageOk returns a tuple with the Usage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsage

`func (o *CreateCompletionResponse) SetUsage(v CreateCompletionResponseUsage)`

SetUsage sets Usage field to given value.

### HasUsage

`func (o *CreateCompletionResponse) HasUsage() bool`

HasUsage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


