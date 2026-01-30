# FileSearchRankingOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ranker** | Pointer to **string** | The ranker to use for the file search. If not specified will use the &#x60;auto&#x60; ranker. | [optional] 
**ScoreThreshold** | **float32** | The score threshold for the file search. All values must be a floating point number between 0 and 1. | 

## Methods

### NewFileSearchRankingOptions

`func NewFileSearchRankingOptions(scoreThreshold float32, ) *FileSearchRankingOptions`

NewFileSearchRankingOptions instantiates a new FileSearchRankingOptions object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFileSearchRankingOptionsWithDefaults

`func NewFileSearchRankingOptionsWithDefaults() *FileSearchRankingOptions`

NewFileSearchRankingOptionsWithDefaults instantiates a new FileSearchRankingOptions object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRanker

`func (o *FileSearchRankingOptions) GetRanker() string`

GetRanker returns the Ranker field if non-nil, zero value otherwise.

### GetRankerOk

`func (o *FileSearchRankingOptions) GetRankerOk() (*string, bool)`

GetRankerOk returns a tuple with the Ranker field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRanker

`func (o *FileSearchRankingOptions) SetRanker(v string)`

SetRanker sets Ranker field to given value.

### HasRanker

`func (o *FileSearchRankingOptions) HasRanker() bool`

HasRanker returns a boolean if a field has been set.

### GetScoreThreshold

`func (o *FileSearchRankingOptions) GetScoreThreshold() float32`

GetScoreThreshold returns the ScoreThreshold field if non-nil, zero value otherwise.

### GetScoreThresholdOk

`func (o *FileSearchRankingOptions) GetScoreThresholdOk() (*float32, bool)`

GetScoreThresholdOk returns a tuple with the ScoreThreshold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScoreThreshold

`func (o *FileSearchRankingOptions) SetScoreThreshold(v float32)`

SetScoreThreshold sets ScoreThreshold field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


