# ProjectApiKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** | The object type, which is always &#x60;organization.project.api_key&#x60; | 
**RedactedValue** | **string** | The redacted value of the API key | 
**Name** | **string** | The name of the API key | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) of when the API key was created | 
**Id** | **string** | The identifier, which can be referenced in API endpoints | 
**Owner** | [**ProjectApiKeyOwner**](ProjectApiKeyOwner.md) |  | 

## Methods

### NewProjectApiKey

`func NewProjectApiKey(object string, redactedValue string, name string, createdAt int32, id string, owner ProjectApiKeyOwner, ) *ProjectApiKey`

NewProjectApiKey instantiates a new ProjectApiKey object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProjectApiKeyWithDefaults

`func NewProjectApiKeyWithDefaults() *ProjectApiKey`

NewProjectApiKeyWithDefaults instantiates a new ProjectApiKey object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *ProjectApiKey) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ProjectApiKey) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ProjectApiKey) SetObject(v string)`

SetObject sets Object field to given value.


### GetRedactedValue

`func (o *ProjectApiKey) GetRedactedValue() string`

GetRedactedValue returns the RedactedValue field if non-nil, zero value otherwise.

### GetRedactedValueOk

`func (o *ProjectApiKey) GetRedactedValueOk() (*string, bool)`

GetRedactedValueOk returns a tuple with the RedactedValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRedactedValue

`func (o *ProjectApiKey) SetRedactedValue(v string)`

SetRedactedValue sets RedactedValue field to given value.


### GetName

`func (o *ProjectApiKey) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ProjectApiKey) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ProjectApiKey) SetName(v string)`

SetName sets Name field to given value.


### GetCreatedAt

`func (o *ProjectApiKey) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *ProjectApiKey) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *ProjectApiKey) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetId

`func (o *ProjectApiKey) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ProjectApiKey) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ProjectApiKey) SetId(v string)`

SetId sets Id field to given value.


### GetOwner

`func (o *ProjectApiKey) GetOwner() ProjectApiKeyOwner`

GetOwner returns the Owner field if non-nil, zero value otherwise.

### GetOwnerOk

`func (o *ProjectApiKey) GetOwnerOk() (*ProjectApiKeyOwner, bool)`

GetOwnerOk returns a tuple with the Owner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOwner

`func (o *ProjectApiKey) SetOwner(v ProjectApiKeyOwner)`

SetOwner sets Owner field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


