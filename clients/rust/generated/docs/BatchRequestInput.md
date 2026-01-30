# BatchRequestInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**custom_id** | Option<**String**> | A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch. | [optional]
**method** | Option<**String**> | The HTTP method to be used for the request. Currently only `POST` is supported. | [optional]
**url** | Option<**String**> | The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


