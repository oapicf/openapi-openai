# MessageStreamEventOneOf4

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Event** | **string** |  | 
**Data** | [**MessageObject**](MessageObject.md) |  | 

## Methods

### NewMessageStreamEventOneOf4

`func NewMessageStreamEventOneOf4(event string, data MessageObject, ) *MessageStreamEventOneOf4`

NewMessageStreamEventOneOf4 instantiates a new MessageStreamEventOneOf4 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageStreamEventOneOf4WithDefaults

`func NewMessageStreamEventOneOf4WithDefaults() *MessageStreamEventOneOf4`

NewMessageStreamEventOneOf4WithDefaults instantiates a new MessageStreamEventOneOf4 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEvent

`func (o *MessageStreamEventOneOf4) GetEvent() string`

GetEvent returns the Event field if non-nil, zero value otherwise.

### GetEventOk

`func (o *MessageStreamEventOneOf4) GetEventOk() (*string, bool)`

GetEventOk returns a tuple with the Event field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvent

`func (o *MessageStreamEventOneOf4) SetEvent(v string)`

SetEvent sets Event field to given value.


### GetData

`func (o *MessageStreamEventOneOf4) GetData() MessageObject`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *MessageStreamEventOneOf4) GetDataOk() (*MessageObject, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *MessageStreamEventOneOf4) SetData(v MessageObject)`

SetData sets Data field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


