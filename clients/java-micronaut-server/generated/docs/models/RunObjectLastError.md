

# RunObjectLastError

The last error associated with this run. Will be `null` if there are no errors.

The class is defined in **[RunObjectLastError.java](../../src/main/java/org/openapitools/model/RunObjectLastError.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) | One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;. | 
**message** | `String` | A human-readable description of the error. | 

## CodeEnum

Name | Value
---- | -----
SERVER_ERROR | `"server_error"`
RATE_LIMIT_EXCEEDED | `"rate_limit_exceeded"`
INVALID_PROMPT | `"invalid_prompt"`



