# openapi::UsageAudioTranscriptionsResult

The aggregated audio transcriptions usage details of the specific time bucket.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **character** |  | [Enum: [organization.usage.audio_transcriptions.result]] 
**seconds** | **integer** | The number of seconds processed. | 
**num_model_requests** | **integer** | The count of requests made to the model. | 
**project_id** | **character** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 
**user_id** | **character** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**api_key_id** | **character** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**model** | **character** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 


