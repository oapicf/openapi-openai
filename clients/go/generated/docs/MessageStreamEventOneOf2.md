# MessageStreamEventOneOf2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Event** | **string** |  | 
**Data** | [**MessageDeltaObject**](MessageDeltaObject.md) |  | 

## Methods

### NewMessageStreamEventOneOf2

`func NewMessageStreamEventOneOf2(event string, data MessageDeltaObject, ) *MessageStreamEventOneOf2`

NewMessageStreamEventOneOf2 instantiates a new MessageStreamEventOneOf2 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageStreamEventOneOf2WithDefaults

`func NewMessageStreamEventOneOf2WithDefaults() *MessageStreamEventOneOf2`

NewMessageStreamEventOneOf2WithDefaults instantiates a new MessageStreamEventOneOf2 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEvent

`func (o *MessageStreamEventOneOf2) GetEvent() string`

GetEvent returns the Event field if non-nil, zero value otherwise.

### GetEventOk

`func (o *MessageStreamEventOneOf2) GetEventOk() (*string, bool)`

GetEventOk returns a tuple with the Event field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvent

`func (o *MessageStreamEventOneOf2) SetEvent(v string)`

SetEvent sets Event field to given value.


### GetData

`func (o *MessageStreamEventOneOf2) GetData() MessageDeltaObject`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *MessageStreamEventOneOf2) GetDataOk() (*MessageDeltaObject, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *MessageStreamEventOneOf2) SetData(v MessageDeltaObject)`

SetData sets Data field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


