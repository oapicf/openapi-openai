# openapi::CreateImageRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prompt** | **character** | A text description of the desired image(s). The maximum length is 1000 characters. | 
**n** | **integer** | The number of images to generate. Must be between 1 and 10. | [optional] [default to 1] [Max: 10] [Min: 1] 
**size** | **character** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &quot;1024x1024&quot;] [Enum: [256x256, 512x512, 1024x1024]] 
**response_format** | **character** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &quot;url&quot;] [Enum: [url, b64_json]] 
**user** | **character** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 


