# BatchRequestOutput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** |  | [optional] 
**CustomId** | Pointer to **string** | A developer-provided per-request id that will be used to match outputs to inputs. | [optional] 
**Response** | Pointer to [**NullableBatchRequestOutputResponse**](BatchRequestOutputResponse.md) |  | [optional] 
**Error** | Pointer to [**NullableBatchRequestOutputError**](BatchRequestOutputError.md) |  | [optional] 

## Methods

### NewBatchRequestOutput

`func NewBatchRequestOutput() *BatchRequestOutput`

NewBatchRequestOutput instantiates a new BatchRequestOutput object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBatchRequestOutputWithDefaults

`func NewBatchRequestOutputWithDefaults() *BatchRequestOutput`

NewBatchRequestOutputWithDefaults instantiates a new BatchRequestOutput object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *BatchRequestOutput) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *BatchRequestOutput) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *BatchRequestOutput) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *BatchRequestOutput) HasId() bool`

HasId returns a boolean if a field has been set.

### GetCustomId

`func (o *BatchRequestOutput) GetCustomId() string`

GetCustomId returns the CustomId field if non-nil, zero value otherwise.

### GetCustomIdOk

`func (o *BatchRequestOutput) GetCustomIdOk() (*string, bool)`

GetCustomIdOk returns a tuple with the CustomId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomId

`func (o *BatchRequestOutput) SetCustomId(v string)`

SetCustomId sets CustomId field to given value.

### HasCustomId

`func (o *BatchRequestOutput) HasCustomId() bool`

HasCustomId returns a boolean if a field has been set.

### GetResponse

`func (o *BatchRequestOutput) GetResponse() BatchRequestOutputResponse`

GetResponse returns the Response field if non-nil, zero value otherwise.

### GetResponseOk

`func (o *BatchRequestOutput) GetResponseOk() (*BatchRequestOutputResponse, bool)`

GetResponseOk returns a tuple with the Response field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponse

`func (o *BatchRequestOutput) SetResponse(v BatchRequestOutputResponse)`

SetResponse sets Response field to given value.

### HasResponse

`func (o *BatchRequestOutput) HasResponse() bool`

HasResponse returns a boolean if a field has been set.

### SetResponseNil

`func (o *BatchRequestOutput) SetResponseNil(b bool)`

 SetResponseNil sets the value for Response to be an explicit nil

### UnsetResponse
`func (o *BatchRequestOutput) UnsetResponse()`

UnsetResponse ensures that no value is present for Response, not even an explicit nil
### GetError

`func (o *BatchRequestOutput) GetError() BatchRequestOutputError`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *BatchRequestOutput) GetErrorOk() (*BatchRequestOutputError, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *BatchRequestOutput) SetError(v BatchRequestOutputError)`

SetError sets Error field to given value.

### HasError

`func (o *BatchRequestOutput) HasError() bool`

HasError returns a boolean if a field has been set.

### SetErrorNil

`func (o *BatchRequestOutput) SetErrorNil(b bool)`

 SetErrorNil sets the value for Error to be an explicit nil

### UnsetError
`func (o *BatchRequestOutput) UnsetError()`

UnsetError ensures that no value is present for Error, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


