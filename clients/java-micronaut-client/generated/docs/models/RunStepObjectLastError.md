

# RunStepObjectLastError

The last error associated with this run step. Will be `null` if there are no errors.

The class is defined in **[RunStepObjectLastError.java](../../src/main/java/org/openapitools/model/RunStepObjectLastError.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) | One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;. | 
**message** | `String` | A human-readable description of the error. | 

## CodeEnum

Name | Value
---- | -----
SERVER_ERROR | `"server_error"`
RATE_LIMIT_EXCEEDED | `"rate_limit_exceeded"`



