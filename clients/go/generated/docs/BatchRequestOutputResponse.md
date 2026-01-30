# BatchRequestOutputResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StatusCode** | Pointer to **int32** | The HTTP status code of the response | [optional] 
**RequestId** | Pointer to **string** | An unique identifier for the OpenAI API request. Please include this request ID when contacting support. | [optional] 
**Body** | Pointer to **map[string]interface{}** | The JSON body of the response | [optional] 

## Methods

### NewBatchRequestOutputResponse

`func NewBatchRequestOutputResponse() *BatchRequestOutputResponse`

NewBatchRequestOutputResponse instantiates a new BatchRequestOutputResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBatchRequestOutputResponseWithDefaults

`func NewBatchRequestOutputResponseWithDefaults() *BatchRequestOutputResponse`

NewBatchRequestOutputResponseWithDefaults instantiates a new BatchRequestOutputResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatusCode

`func (o *BatchRequestOutputResponse) GetStatusCode() int32`

GetStatusCode returns the StatusCode field if non-nil, zero value otherwise.

### GetStatusCodeOk

`func (o *BatchRequestOutputResponse) GetStatusCodeOk() (*int32, bool)`

GetStatusCodeOk returns a tuple with the StatusCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusCode

`func (o *BatchRequestOutputResponse) SetStatusCode(v int32)`

SetStatusCode sets StatusCode field to given value.

### HasStatusCode

`func (o *BatchRequestOutputResponse) HasStatusCode() bool`

HasStatusCode returns a boolean if a field has been set.

### GetRequestId

`func (o *BatchRequestOutputResponse) GetRequestId() string`

GetRequestId returns the RequestId field if non-nil, zero value otherwise.

### GetRequestIdOk

`func (o *BatchRequestOutputResponse) GetRequestIdOk() (*string, bool)`

GetRequestIdOk returns a tuple with the RequestId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestId

`func (o *BatchRequestOutputResponse) SetRequestId(v string)`

SetRequestId sets RequestId field to given value.

### HasRequestId

`func (o *BatchRequestOutputResponse) HasRequestId() bool`

HasRequestId returns a boolean if a field has been set.

### GetBody

`func (o *BatchRequestOutputResponse) GetBody() map[string]interface{}`

GetBody returns the Body field if non-nil, zero value otherwise.

### GetBodyOk

`func (o *BatchRequestOutputResponse) GetBodyOk() (*map[string]interface{}, bool)`

GetBodyOk returns a tuple with the Body field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBody

`func (o *BatchRequestOutputResponse) SetBody(v map[string]interface{})`

SetBody sets Body field to given value.

### HasBody

`func (o *BatchRequestOutputResponse) HasBody() bool`

HasBody returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


