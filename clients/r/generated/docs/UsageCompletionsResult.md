# openapi::UsageCompletionsResult

The aggregated completions usage details of the specific time bucket.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **character** |  | [Enum: [organization.usage.completions.result]] 
**input_tokens** | **integer** | The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. | 
**input_cached_tokens** | **integer** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] 
**output_tokens** | **integer** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | 
**input_audio_tokens** | **integer** | The aggregated number of audio input tokens used, including cached tokens. | [optional] 
**output_audio_tokens** | **integer** | The aggregated number of audio output tokens used. | [optional] 
**num_model_requests** | **integer** | The count of requests made to the model. | 
**project_id** | **character** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 
**user_id** | **character** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**api_key_id** | **character** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**model** | **character** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 
**batch** | **character** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] 


