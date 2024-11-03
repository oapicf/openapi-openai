

# RunObjectLastError

The last error associated with this run. Will be `null` if there are no errors.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | [**CodeEnum**](#CodeEnum) | One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;. |  |
|**message** | **String** | A human-readable description of the error. |  |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| SERVER_ERROR | &quot;server_error&quot; |
| RATE_LIMIT_EXCEEDED | &quot;rate_limit_exceeded&quot; |
| INVALID_PROMPT | &quot;invalid_prompt&quot; |



