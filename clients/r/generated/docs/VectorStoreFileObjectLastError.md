# openapi::VectorStoreFileObjectLastError

The last error associated with this vector store file. Will be `null` if there are no errors.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **character** | One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;. | [Enum: [server_error, unsupported_file, invalid_file]] 
**message** | **character** | A human-readable description of the error. | 


