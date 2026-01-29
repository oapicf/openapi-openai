
# Table `ThreadObject`
(mapped from: ThreadObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The identifier, which can be referenced in API endpoints. | 
**object** | object | text NOT NULL |  | [**object**](#Object) | The object type, which is always &#x60;thread&#x60;. | 
**createdAt** | created_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the thread was created. | 
**metadata** | metadata | blob NOT NULL |  | [**kotlin.Any**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 






