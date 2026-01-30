# VectorStoreExpirationAfter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Anchor** | **string** | Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;. | 
**Days** | **int32** | The number of days after the anchor time that the vector store will expire. | 

## Methods

### NewVectorStoreExpirationAfter

`func NewVectorStoreExpirationAfter(anchor string, days int32, ) *VectorStoreExpirationAfter`

NewVectorStoreExpirationAfter instantiates a new VectorStoreExpirationAfter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVectorStoreExpirationAfterWithDefaults

`func NewVectorStoreExpirationAfterWithDefaults() *VectorStoreExpirationAfter`

NewVectorStoreExpirationAfterWithDefaults instantiates a new VectorStoreExpirationAfter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAnchor

`func (o *VectorStoreExpirationAfter) GetAnchor() string`

GetAnchor returns the Anchor field if non-nil, zero value otherwise.

### GetAnchorOk

`func (o *VectorStoreExpirationAfter) GetAnchorOk() (*string, bool)`

GetAnchorOk returns a tuple with the Anchor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnchor

`func (o *VectorStoreExpirationAfter) SetAnchor(v string)`

SetAnchor sets Anchor field to given value.


### GetDays

`func (o *VectorStoreExpirationAfter) GetDays() int32`

GetDays returns the Days field if non-nil, zero value otherwise.

### GetDaysOk

`func (o *VectorStoreExpirationAfter) GetDaysOk() (*int32, bool)`

GetDaysOk returns a tuple with the Days field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDays

`func (o *VectorStoreExpirationAfter) SetDays(v int32)`

SetDays sets Days field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


