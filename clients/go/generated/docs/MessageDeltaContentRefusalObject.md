# MessageDeltaContentRefusalObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int32** | The index of the refusal part in the message. | 
**Type** | **string** | Always &#x60;refusal&#x60;. | 
**Refusal** | Pointer to **string** |  | [optional] 

## Methods

### NewMessageDeltaContentRefusalObject

`func NewMessageDeltaContentRefusalObject(index int32, type_ string, ) *MessageDeltaContentRefusalObject`

NewMessageDeltaContentRefusalObject instantiates a new MessageDeltaContentRefusalObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageDeltaContentRefusalObjectWithDefaults

`func NewMessageDeltaContentRefusalObjectWithDefaults() *MessageDeltaContentRefusalObject`

NewMessageDeltaContentRefusalObjectWithDefaults instantiates a new MessageDeltaContentRefusalObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIndex

`func (o *MessageDeltaContentRefusalObject) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *MessageDeltaContentRefusalObject) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *MessageDeltaContentRefusalObject) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetType

`func (o *MessageDeltaContentRefusalObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageDeltaContentRefusalObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageDeltaContentRefusalObject) SetType(v string)`

SetType sets Type field to given value.


### GetRefusal

`func (o *MessageDeltaContentRefusalObject) GetRefusal() string`

GetRefusal returns the Refusal field if non-nil, zero value otherwise.

### GetRefusalOk

`func (o *MessageDeltaContentRefusalObject) GetRefusalOk() (*string, bool)`

GetRefusalOk returns a tuple with the Refusal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefusal

`func (o *MessageDeltaContentRefusalObject) SetRefusal(v string)`

SetRefusal sets Refusal field to given value.

### HasRefusal

`func (o *MessageDeltaContentRefusalObject) HasRefusal() bool`

HasRefusal returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


