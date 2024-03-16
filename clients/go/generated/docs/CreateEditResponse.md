# CreateEditResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**Created** | **int32** |  | 
**Choices** | [**[]CreateEditResponseChoicesInner**](CreateEditResponseChoicesInner.md) |  | 
**Usage** | [**CreateCompletionResponseUsage**](CreateCompletionResponseUsage.md) |  | 

## Methods

### NewCreateEditResponse

`func NewCreateEditResponse(object string, created int32, choices []CreateEditResponseChoicesInner, usage CreateCompletionResponseUsage, ) *CreateEditResponse`

NewCreateEditResponse instantiates a new CreateEditResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateEditResponseWithDefaults

`func NewCreateEditResponseWithDefaults() *CreateEditResponse`

NewCreateEditResponseWithDefaults instantiates a new CreateEditResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *CreateEditResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *CreateEditResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *CreateEditResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetCreated

`func (o *CreateEditResponse) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *CreateEditResponse) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *CreateEditResponse) SetCreated(v int32)`

SetCreated sets Created field to given value.


### GetChoices

`func (o *CreateEditResponse) GetChoices() []CreateEditResponseChoicesInner`

GetChoices returns the Choices field if non-nil, zero value otherwise.

### GetChoicesOk

`func (o *CreateEditResponse) GetChoicesOk() (*[]CreateEditResponseChoicesInner, bool)`

GetChoicesOk returns a tuple with the Choices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChoices

`func (o *CreateEditResponse) SetChoices(v []CreateEditResponseChoicesInner)`

SetChoices sets Choices field to given value.


### GetUsage

`func (o *CreateEditResponse) GetUsage() CreateCompletionResponseUsage`

GetUsage returns the Usage field if non-nil, zero value otherwise.

### GetUsageOk

`func (o *CreateEditResponse) GetUsageOk() (*CreateCompletionResponseUsage, bool)`

GetUsageOk returns a tuple with the Usage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsage

`func (o *CreateEditResponse) SetUsage(v CreateCompletionResponseUsage)`

SetUsage sets Usage field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


