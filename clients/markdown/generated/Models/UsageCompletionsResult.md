# UsageCompletionsResult
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **object** | **String** |  | [default to null] |
| **input\_tokens** | **Integer** | The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. | [default to null] |
| **input\_cached\_tokens** | **Integer** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] [default to null] |
| **output\_tokens** | **Integer** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | [default to null] |
| **input\_audio\_tokens** | **Integer** | The aggregated number of audio input tokens used, including cached tokens. | [optional] [default to null] |
| **output\_audio\_tokens** | **Integer** | The aggregated number of audio output tokens used. | [optional] [default to null] |
| **num\_model\_requests** | **Integer** | The count of requests made to the model. | [default to null] |
| **project\_id** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] [default to null] |
| **user\_id** | **String** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] [default to null] |
| **api\_key\_id** | **String** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] [default to null] |
| **model** | **String** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] [default to null] |
| **batch** | **Boolean** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

