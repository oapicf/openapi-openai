# openapi::RunObjectLastError

The last error associated with this run. Will be `null` if there are no errors.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **character** | One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;. | [Enum: [server_error, rate_limit_exceeded, invalid_prompt]] 
**message** | **character** | A human-readable description of the error. | 


