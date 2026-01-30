# openapi::UsageTimeBucketResultInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **character** |  | [Enum: [organization.costs.result]] 
**input_tokens** | **integer** | The aggregated number of input tokens used. | 
**input_cached_tokens** | **integer** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] 
**output_tokens** | **integer** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | 
**input_audio_tokens** | **integer** | The aggregated number of audio input tokens used, including cached tokens. | [optional] 
**output_audio_tokens** | **integer** | The aggregated number of audio output tokens used. | [optional] 
**num_model_requests** | **integer** | The count of requests made to the model. | 
**project_id** | **character** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. | [optional] 
**user_id** | **character** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**api_key_id** | **character** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**model** | **character** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 
**batch** | **character** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] 
**images** | **integer** | The number of images processed. | 
**source** | **character** | When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. | [optional] 
**size** | **character** | When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. | [optional] 
**characters** | **integer** | The number of characters processed. | 
**seconds** | **integer** | The number of seconds processed. | 
**usage_bytes** | **integer** | The vector stores usage in bytes. | 
**sessions** | **integer** | The number of code interpreter sessions. | 
**amount** | [**CostsResultAmount**](CostsResult_amount.md) |  | [optional] 
**line_item** | **character** | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. | [optional] 


