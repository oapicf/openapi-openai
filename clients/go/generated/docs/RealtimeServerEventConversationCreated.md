# RealtimeServerEventConversationCreated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;conversation.created&#x60;. | 
**Conversation** | [**RealtimeServerEventConversationCreatedConversation**](RealtimeServerEventConversationCreatedConversation.md) |  | 

## Methods

### NewRealtimeServerEventConversationCreated

`func NewRealtimeServerEventConversationCreated(eventId string, type_ string, conversation RealtimeServerEventConversationCreatedConversation, ) *RealtimeServerEventConversationCreated`

NewRealtimeServerEventConversationCreated instantiates a new RealtimeServerEventConversationCreated object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventConversationCreatedWithDefaults

`func NewRealtimeServerEventConversationCreatedWithDefaults() *RealtimeServerEventConversationCreated`

NewRealtimeServerEventConversationCreatedWithDefaults instantiates a new RealtimeServerEventConversationCreated object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventConversationCreated) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventConversationCreated) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventConversationCreated) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventConversationCreated) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventConversationCreated) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventConversationCreated) SetType(v string)`

SetType sets Type field to given value.


### GetConversation

`func (o *RealtimeServerEventConversationCreated) GetConversation() RealtimeServerEventConversationCreatedConversation`

GetConversation returns the Conversation field if non-nil, zero value otherwise.

### GetConversationOk

`func (o *RealtimeServerEventConversationCreated) GetConversationOk() (*RealtimeServerEventConversationCreatedConversation, bool)`

GetConversationOk returns a tuple with the Conversation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversation

`func (o *RealtimeServerEventConversationCreated) SetConversation(v RealtimeServerEventConversationCreatedConversation)`

SetConversation sets Conversation field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


