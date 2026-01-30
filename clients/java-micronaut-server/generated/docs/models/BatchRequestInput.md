

# BatchRequestInput

The per-line object of the batch input file

The class is defined in **[BatchRequestInput.java](../../src/main/java/org/openapitools/model/BatchRequestInput.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customId** | `String` | A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch. |  [optional property]
**method** | [**MethodEnum**](#MethodEnum) | The HTTP method to be used for the request. Currently only &#x60;POST&#x60; is supported. |  [optional property]
**url** | `String` | The OpenAI API relative URL to be used for the request. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported. |  [optional property]


## MethodEnum

Name | Value
---- | -----
POST | `"POST"`



