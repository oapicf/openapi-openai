# RunStepDetailsToolCallsRetrievalObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The ID of the tool call object. | 
**Type** | **string** | The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call. | 
**Retrieval** | **map[string]interface{}** | For now, this is always going to be an empty object. | 

## Methods

### NewRunStepDetailsToolCallsRetrievalObject

`func NewRunStepDetailsToolCallsRetrievalObject(id string, type_ string, retrieval map[string]interface{}, ) *RunStepDetailsToolCallsRetrievalObject`

NewRunStepDetailsToolCallsRetrievalObject instantiates a new RunStepDetailsToolCallsRetrievalObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDetailsToolCallsRetrievalObjectWithDefaults

`func NewRunStepDetailsToolCallsRetrievalObjectWithDefaults() *RunStepDetailsToolCallsRetrievalObject`

NewRunStepDetailsToolCallsRetrievalObjectWithDefaults instantiates a new RunStepDetailsToolCallsRetrievalObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *RunStepDetailsToolCallsRetrievalObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RunStepDetailsToolCallsRetrievalObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RunStepDetailsToolCallsRetrievalObject) SetId(v string)`

SetId sets Id field to given value.


### GetType

`func (o *RunStepDetailsToolCallsRetrievalObject) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RunStepDetailsToolCallsRetrievalObject) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RunStepDetailsToolCallsRetrievalObject) SetType(v string)`

SetType sets Type field to given value.


### GetRetrieval

`func (o *RunStepDetailsToolCallsRetrievalObject) GetRetrieval() map[string]interface{}`

GetRetrieval returns the Retrieval field if non-nil, zero value otherwise.

### GetRetrievalOk

`func (o *RunStepDetailsToolCallsRetrievalObject) GetRetrievalOk() (*map[string]interface{}, bool)`

GetRetrievalOk returns a tuple with the Retrieval field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRetrieval

`func (o *RunStepDetailsToolCallsRetrievalObject) SetRetrieval(v map[string]interface{})`

SetRetrieval sets Retrieval field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


