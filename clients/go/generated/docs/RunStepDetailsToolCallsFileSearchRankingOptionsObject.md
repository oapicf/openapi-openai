# RunStepDetailsToolCallsFileSearchRankingOptionsObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ranker** | **string** | The ranker used for the file search. | 
**ScoreThreshold** | **float32** | The score threshold for the file search. All values must be a floating point number between 0 and 1. | 

## Methods

### NewRunStepDetailsToolCallsFileSearchRankingOptionsObject

`func NewRunStepDetailsToolCallsFileSearchRankingOptionsObject(ranker string, scoreThreshold float32, ) *RunStepDetailsToolCallsFileSearchRankingOptionsObject`

NewRunStepDetailsToolCallsFileSearchRankingOptionsObject instantiates a new RunStepDetailsToolCallsFileSearchRankingOptionsObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDetailsToolCallsFileSearchRankingOptionsObjectWithDefaults

`func NewRunStepDetailsToolCallsFileSearchRankingOptionsObjectWithDefaults() *RunStepDetailsToolCallsFileSearchRankingOptionsObject`

NewRunStepDetailsToolCallsFileSearchRankingOptionsObjectWithDefaults instantiates a new RunStepDetailsToolCallsFileSearchRankingOptionsObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRanker

`func (o *RunStepDetailsToolCallsFileSearchRankingOptionsObject) GetRanker() string`

GetRanker returns the Ranker field if non-nil, zero value otherwise.

### GetRankerOk

`func (o *RunStepDetailsToolCallsFileSearchRankingOptionsObject) GetRankerOk() (*string, bool)`

GetRankerOk returns a tuple with the Ranker field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRanker

`func (o *RunStepDetailsToolCallsFileSearchRankingOptionsObject) SetRanker(v string)`

SetRanker sets Ranker field to given value.


### GetScoreThreshold

`func (o *RunStepDetailsToolCallsFileSearchRankingOptionsObject) GetScoreThreshold() float32`

GetScoreThreshold returns the ScoreThreshold field if non-nil, zero value otherwise.

### GetScoreThresholdOk

`func (o *RunStepDetailsToolCallsFileSearchRankingOptionsObject) GetScoreThresholdOk() (*float32, bool)`

GetScoreThresholdOk returns a tuple with the ScoreThreshold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScoreThreshold

`func (o *RunStepDetailsToolCallsFileSearchRankingOptionsObject) SetScoreThreshold(v float32)`

SetScoreThreshold sets ScoreThreshold field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


