

# VectorStoreFileObjectLastError

The last error associated with this vector store file. Will be `null` if there are no errors.

The class is defined in **[VectorStoreFileObjectLastError.java](../../src/main/java/org/openapitools/model/VectorStoreFileObjectLastError.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) | One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;. | 
**message** | `String` | A human-readable description of the error. | 

## CodeEnum

Name | Value
---- | -----
SERVER_ERROR | `"server_error"`
UNSUPPORTED_FILE | `"unsupported_file"`
INVALID_FILE | `"invalid_file"`



