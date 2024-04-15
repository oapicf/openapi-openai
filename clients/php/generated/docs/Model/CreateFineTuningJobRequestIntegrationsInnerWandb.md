# # CreateFineTuningJobRequestIntegrationsInnerWandb

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**project** | **string** | The name of the project that the new run will be created under. |
**name** | **string** | A display name to set for the run. If not set, we will use the Job ID as the name. | [optional]
**entity** | **string** | The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used. | [optional]
**tags** | **string[]** | A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \&quot;openai/finetune\&quot;, \&quot;openai/{base-model}\&quot;, \&quot;openai/{ftjob-abcdef}\&quot;. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)