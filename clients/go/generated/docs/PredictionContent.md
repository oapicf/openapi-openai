# PredictionContent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of the predicted content you want to provide. This type is currently always &#x60;content&#x60;.  | 
**Content** | [**PredictionContentContent**](PredictionContentContent.md) |  | 

## Methods

### NewPredictionContent

`func NewPredictionContent(type_ string, content PredictionContentContent, ) *PredictionContent`

NewPredictionContent instantiates a new PredictionContent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPredictionContentWithDefaults

`func NewPredictionContentWithDefaults() *PredictionContent`

NewPredictionContentWithDefaults instantiates a new PredictionContent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *PredictionContent) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *PredictionContent) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *PredictionContent) SetType(v string)`

SetType sets Type field to given value.


### GetContent

`func (o *PredictionContent) GetContent() PredictionContentContent`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *PredictionContent) GetContentOk() (*PredictionContentContent, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *PredictionContent) SetContent(v PredictionContentContent)`

SetContent sets Content field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


