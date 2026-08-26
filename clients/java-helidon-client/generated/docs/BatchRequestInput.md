

# BatchRequestInput

The per-line object of the batch input file

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customId** | **String** | A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch. |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) | The HTTP method to be used for the request. Currently only &#x60;POST&#x60; is supported. |  [optional] |
|**url** | **String** | The OpenAI API relative URL to be used for the request. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported. |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| POST | &quot;POST&quot; |



