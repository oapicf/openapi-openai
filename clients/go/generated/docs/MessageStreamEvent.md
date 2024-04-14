# MessageStreamEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Event** | **string** |  | 
**Data** | [**MessageObject**](MessageObject.md) |  | 

## Methods

### NewMessageStreamEvent

`func NewMessageStreamEvent(event string, data MessageObject, ) *MessageStreamEvent`

NewMessageStreamEvent instantiates a new MessageStreamEvent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageStreamEventWithDefaults

`func NewMessageStreamEventWithDefaults() *MessageStreamEvent`

NewMessageStreamEventWithDefaults instantiates a new MessageStreamEvent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEvent

`func (o *MessageStreamEvent) GetEvent() string`

GetEvent returns the Event field if non-nil, zero value otherwise.

### GetEventOk

`func (o *MessageStreamEvent) GetEventOk() (*string, bool)`

GetEventOk returns a tuple with the Event field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvent

`func (o *MessageStreamEvent) SetEvent(v string)`

SetEvent sets Event field to given value.


### GetData

`func (o *MessageStreamEvent) GetData() MessageObject`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *MessageStreamEvent) GetDataOk() (*MessageObject, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *MessageStreamEvent) SetData(v MessageObject)`

SetData sets Data field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


