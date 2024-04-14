
# Table `AssistantFileObject`
(mapped from: AssistantFileObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The identifier, which can be referenced in API endpoints. | 
**object** | object | text NOT NULL |  | [**object**](#Object) | The object type, which is always &#x60;assistant.file&#x60;. | 
**createdAt** | created_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the assistant file was created. | 
**assistantId** | assistant_id | text NOT NULL |  | **kotlin.String** | The assistant ID that the file is attached to. | 






