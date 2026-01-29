# FineTuningIntegration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of the integration being enabled for the fine-tuning job | 
**Wandb** | [**CreateFineTuningJobRequestIntegrationsInnerWandb**](CreateFineTuningJobRequestIntegrationsInnerWandb.md) |  | 

## Methods

### NewFineTuningIntegration

`func NewFineTuningIntegration(type_ string, wandb CreateFineTuningJobRequestIntegrationsInnerWandb, ) *FineTuningIntegration`

NewFineTuningIntegration instantiates a new FineTuningIntegration object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFineTuningIntegrationWithDefaults

`func NewFineTuningIntegrationWithDefaults() *FineTuningIntegration`

NewFineTuningIntegrationWithDefaults instantiates a new FineTuningIntegration object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *FineTuningIntegration) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *FineTuningIntegration) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *FineTuningIntegration) SetType(v string)`

SetType sets Type field to given value.


### GetWandb

`func (o *FineTuningIntegration) GetWandb() CreateFineTuningJobRequestIntegrationsInnerWandb`

GetWandb returns the Wandb field if non-nil, zero value otherwise.

### GetWandbOk

`func (o *FineTuningIntegration) GetWandbOk() (*CreateFineTuningJobRequestIntegrationsInnerWandb, bool)`

GetWandbOk returns a tuple with the Wandb field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWandb

`func (o *FineTuningIntegration) SetWandb(v CreateFineTuningJobRequestIntegrationsInnerWandb)`

SetWandb sets Wandb field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


