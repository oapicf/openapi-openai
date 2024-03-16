

# ChatCompletionStreamResponseDelta


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**role** | [**RoleEnum**](#RoleEnum) | The role of the author of this message. |  [optional] |
|**content** | **String** | The contents of the chunk message. |  [optional] |
|**functionCall** | [**ChatCompletionRequestMessageFunctionCall**](ChatCompletionRequestMessageFunctionCall.md) |  |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| SYSTEM | &quot;system&quot; |
| USER | &quot;user&quot; |
| ASSISTANT | &quot;assistant&quot; |
| FUNCTION | &quot;function&quot; |



