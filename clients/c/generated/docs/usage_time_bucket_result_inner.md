# usage_time_bucket_result_inner_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **openai_api_usage_time_bucket_result_inner_OBJECT_e** |  | 
**input_tokens** | **int** | The aggregated number of input tokens used. | 
**input_cached_tokens** | **int** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] 
**output_tokens** | **int** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | 
**input_audio_tokens** | **int** | The aggregated number of audio input tokens used, including cached tokens. | [optional] 
**output_audio_tokens** | **int** | The aggregated number of audio output tokens used. | [optional] 
**num_model_requests** | **int** | The count of requests made to the model. | 
**project_id** | **char \*** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. | [optional] 
**user_id** | **char \*** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**api_key_id** | **char \*** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**model** | **char \*** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 
**batch** | **int** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] 
**images** | **int** | The number of images processed. | 
**source** | **char \*** | When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. | [optional] 
**size** | **char \*** | When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. | [optional] 
**characters** | **int** | The number of characters processed. | 
**seconds** | **int** | The number of seconds processed. | 
**usage_bytes** | **int** | The vector stores usage in bytes. | 
**sessions** | **int** | The number of code interpreter sessions. | 
**amount** | [**costs_result_amount_t**](costs_result_amount.md) \* |  | [optional] 
**line_item** | **char \*** | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


