
# Table `Model`
(mapped from: Model)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The model identifier, which can be referenced in the API endpoints. | 
**created** | created | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) when the model was created. | 
**object** | object | text NOT NULL |  | [**object**](#Object) | The object type, which is always \&quot;model\&quot;. | 
**ownedBy** | owned_by | text NOT NULL |  | **kotlin.String** | The organization that owns the model. | 






