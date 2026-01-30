# BatchRequestOutputError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | Pointer to **string** | A machine-readable error code. | [optional] 
**Message** | Pointer to **string** | A human-readable error message. | [optional] 

## Methods

### NewBatchRequestOutputError

`func NewBatchRequestOutputError() *BatchRequestOutputError`

NewBatchRequestOutputError instantiates a new BatchRequestOutputError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBatchRequestOutputErrorWithDefaults

`func NewBatchRequestOutputErrorWithDefaults() *BatchRequestOutputError`

NewBatchRequestOutputErrorWithDefaults instantiates a new BatchRequestOutputError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *BatchRequestOutputError) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *BatchRequestOutputError) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *BatchRequestOutputError) SetCode(v string)`

SetCode sets Code field to given value.

### HasCode

`func (o *BatchRequestOutputError) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetMessage

`func (o *BatchRequestOutputError) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *BatchRequestOutputError) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *BatchRequestOutputError) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *BatchRequestOutputError) HasMessage() bool`

HasMessage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


