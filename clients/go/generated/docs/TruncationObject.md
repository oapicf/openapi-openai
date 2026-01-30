# TruncationObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The truncation strategy to use for the thread. The default is &#x60;auto&#x60;. If set to &#x60;last_messages&#x60;, the thread will be truncated to the n most recent messages in the thread. When set to &#x60;auto&#x60;, messages in the middle of the thread will be dropped to fit the context length of the model, &#x60;max_prompt_tokens&#x60;. | 
**LastMessages** | Pointer to **NullableInt32** | The number of most recent messages from the thread when constructing the context for the run. | [optional] 

## Methods

### NewTruncationObject

`func NewTruncationObject(type_ string, ) *TruncationObject`

NewTruncationObject instantiates a new TruncationObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTruncationObjectWithDefaults

`func NewTruncationObjectWithDefaults() *TruncationObject`

NewTruncationObjectWithDefaults instantiates a new TruncationObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *TruncationObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *TruncationObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *TruncationObject) SetType(v string)`

SetType sets Type field to given value.


### GetLastMessages

`func (o *TruncationObject) GetLastMessages() int32`

GetLastMessages returns the LastMessages field if non-nil, zero value otherwise.

### GetLastMessagesOk

`func (o *TruncationObject) GetLastMessagesOk() (*int32, bool)`

GetLastMessagesOk returns a tuple with the LastMessages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastMessages

`func (o *TruncationObject) SetLastMessages(v int32)`

SetLastMessages sets LastMessages field to given value.

### HasLastMessages

`func (o *TruncationObject) HasLastMessages() bool`

HasLastMessages returns a boolean if a field has been set.

### SetLastMessagesNil

`func (o *TruncationObject) SetLastMessagesNil(b bool)`

 SetLastMessagesNil sets the value for LastMessages to be an explicit nil

### UnsetLastMessages
`func (o *TruncationObject) UnsetLastMessages()`

UnsetLastMessages ensures that no value is present for LastMessages, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


