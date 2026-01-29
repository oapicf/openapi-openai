# RunStepDeltaStepDetailsToolCallsRetrievalObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int32** | The index of the tool call in the tool calls array. | 
**Id** | Pointer to **string** | The ID of the tool call object. | [optional] 
**Type** | **string** | The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call. | 
**Retrieval** | Pointer to **map[string]interface{}** | For now, this is always going to be an empty object. | [optional] 

## Methods

### NewRunStepDeltaStepDetailsToolCallsRetrievalObject

`func NewRunStepDeltaStepDetailsToolCallsRetrievalObject(index int32, type_ string, ) *RunStepDeltaStepDetailsToolCallsRetrievalObject`

NewRunStepDeltaStepDetailsToolCallsRetrievalObject instantiates a new RunStepDeltaStepDetailsToolCallsRetrievalObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDeltaStepDetailsToolCallsRetrievalObjectWithDefaults

`func NewRunStepDeltaStepDetailsToolCallsRetrievalObjectWithDefaults() *RunStepDeltaStepDetailsToolCallsRetrievalObject`

NewRunStepDeltaStepDetailsToolCallsRetrievalObjectWithDefaults instantiates a new RunStepDeltaStepDetailsToolCallsRetrievalObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIndex

`func (o *RunStepDeltaStepDetailsToolCallsRetrievalObject) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *RunStepDeltaStepDetailsToolCallsRetrievalObject) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *RunStepDeltaStepDetailsToolCallsRetrievalObject) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetId

`func (o *RunStepDeltaStepDetailsToolCallsRetrievalObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RunStepDeltaStepDetailsToolCallsRetrievalObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RunStepDeltaStepDetailsToolCallsRetrievalObject) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *RunStepDeltaStepDetailsToolCallsRetrievalObject) HasId() bool`

HasId returns a boolean if a field has been set.

### GetType

`func (o *RunStepDeltaStepDetailsToolCallsRetrievalObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunStepDeltaStepDetailsToolCallsRetrievalObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunStepDeltaStepDetailsToolCallsRetrievalObject) SetType(v string)`

SetType sets Type field to given value.


### GetRetrieval

`func (o *RunStepDeltaStepDetailsToolCallsRetrievalObject) GetRetrieval() map[string]interface{}`

GetRetrieval returns the Retrieval field if non-nil, zero value otherwise.

### GetRetrievalOk

`func (o *RunStepDeltaStepDetailsToolCallsRetrievalObject) GetRetrievalOk() (*map[string]interface{}, bool)`

GetRetrievalOk returns a tuple with the Retrieval field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRetrieval

`func (o *RunStepDeltaStepDetailsToolCallsRetrievalObject) SetRetrieval(v map[string]interface{})`

SetRetrieval sets Retrieval field to given value.

### HasRetrieval

`func (o *RunStepDeltaStepDetailsToolCallsRetrievalObject) HasRetrieval() bool`

HasRetrieval returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


