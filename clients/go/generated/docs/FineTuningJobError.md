# FineTuningJobError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | A machine-readable error code. | 
**Message** | **string** | A human-readable error message. | 
**Param** | **NullableString** | The parameter that was invalid, usually &#x60;training_file&#x60; or &#x60;validation_file&#x60;. This field will be null if the failure was not parameter-specific. | 

## Methods

### NewFineTuningJobError

`func NewFineTuningJobError(code string, message string, param NullableString, ) *FineTuningJobError`

NewFineTuningJobError instantiates a new FineTuningJobError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFineTuningJobErrorWithDefaults

`func NewFineTuningJobErrorWithDefaults() *FineTuningJobError`

NewFineTuningJobErrorWithDefaults instantiates a new FineTuningJobError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *FineTuningJobError) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *FineTuningJobError) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *FineTuningJobError) SetCode(v string)`

SetCode sets Code field to given value.


### GetMessage

`func (o *FineTuningJobError) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *FineTuningJobError) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *FineTuningJobError) SetMessage(v string)`

SetMessage sets Message field to given value.


### GetParam

`func (o *FineTuningJobError) GetParam() string`

GetParam returns the Param field if non-nil, zero value otherwise.

### GetParamOk

`func (o *FineTuningJobError) GetParamOk() (*string, bool)`

GetParamOk returns a tuple with the Param field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParam

`func (o *FineTuningJobError) SetParam(v string)`

SetParam sets Param field to given value.


### SetParamNil

`func (o *FineTuningJobError) SetParamNil(b bool)`

 SetParamNil sets the value for Param to be an explicit nil

### UnsetParam
`func (o *FineTuningJobError) UnsetParam()`

UnsetParam ensures that no value is present for Param, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


