# Upload


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`String`** | The Upload unique identifier, which can be referenced in API endpoints. | [default to nothing]
**`created_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the Upload was created. | [default to nothing]
**`filename`** | **`String`** | The name of the file to be uploaded. | [default to nothing]
**`bytes`** | **`Int64`** | The intended number of bytes to be uploaded. | [default to nothing]
**`purpose`** | **`String`** | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. | [default to nothing]
**`status`** | **`String`** | The status of the Upload. | [default to nothing]
**`expires_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the Upload was created. | [default to nothing]
**`object`** | **`String`** | The object type, which is always \&quot;upload\&quot;. | [optional] [default to nothing]
**`file`** | [**`*OpenAIFile`**](OpenAIFile.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


