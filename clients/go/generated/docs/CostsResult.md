# CostsResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**Amount** | Pointer to [**CostsResultAmount**](CostsResultAmount.md) |  | [optional] 
**LineItem** | Pointer to **NullableString** | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. | [optional] 
**ProjectId** | Pointer to **NullableString** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. | [optional] 

## Methods

### NewCostsResult

`func NewCostsResult(object string, ) *CostsResult`

NewCostsResult instantiates a new CostsResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCostsResultWithDefaults

`func NewCostsResultWithDefaults() *CostsResult`

NewCostsResultWithDefaults instantiates a new CostsResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *CostsResult) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *CostsResult) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *CostsResult) SetObject(v string)`

SetObject sets Object field to given value.


### GetAmount

`func (o *CostsResult) GetAmount() CostsResultAmount`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *CostsResult) GetAmountOk() (*CostsResultAmount, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *CostsResult) SetAmount(v CostsResultAmount)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *CostsResult) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetLineItem

`func (o *CostsResult) GetLineItem() string`

GetLineItem returns the LineItem field if non-nil, zero value otherwise.

### GetLineItemOk

`func (o *CostsResult) GetLineItemOk() (*string, bool)`

GetLineItemOk returns a tuple with the LineItem field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLineItem

`func (o *CostsResult) SetLineItem(v string)`

SetLineItem sets LineItem field to given value.

### HasLineItem

`func (o *CostsResult) HasLineItem() bool`

HasLineItem returns a boolean if a field has been set.

### SetLineItemNil

`func (o *CostsResult) SetLineItemNil(b bool)`

 SetLineItemNil sets the value for LineItem to be an explicit nil

### UnsetLineItem
`func (o *CostsResult) UnsetLineItem()`

UnsetLineItem ensures that no value is present for LineItem, not even an explicit nil
### GetProjectId

`func (o *CostsResult) GetProjectId() string`

GetProjectId returns the ProjectId field if non-nil, zero value otherwise.

### GetProjectIdOk

`func (o *CostsResult) GetProjectIdOk() (*string, bool)`

GetProjectIdOk returns a tuple with the ProjectId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProjectId

`func (o *CostsResult) SetProjectId(v string)`

SetProjectId sets ProjectId field to given value.

### HasProjectId

`func (o *CostsResult) HasProjectId() bool`

HasProjectId returns a boolean if a field has been set.

### SetProjectIdNil

`func (o *CostsResult) SetProjectIdNil(b bool)`

 SetProjectIdNil sets the value for ProjectId to be an explicit nil

### UnsetProjectId
`func (o *CostsResult) UnsetProjectId()`

UnsetProjectId ensures that no value is present for ProjectId, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


