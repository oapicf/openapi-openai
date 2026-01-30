# openapi::BatchRequestInput

The per-line object of the batch input file

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**custom_id** | **character** | A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch. | [optional] 
**method** | **character** | The HTTP method to be used for the request. Currently only &#x60;POST&#x60; is supported. | [optional] [Enum: [POST]] 
**url** | **character** | The OpenAI API relative URL to be used for the request. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported. | [optional] 


