# BATCH_REQUEST_INPUT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**custom_id** | [**STRING_32**](STRING_32.md) | A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch. | [optional] [default to null]
**method** | [**STRING_32**](STRING_32.md) | The HTTP method to be used for the request. Currently only &#x60;POST&#x60; is supported. | [optional] [default to null]
**url** | [**STRING_32**](STRING_32.md) | The OpenAI API relative URL to be used for the request. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


