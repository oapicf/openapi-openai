
# Table `OpenAIFile`
(mapped from: OpenAIFile)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**bytes** | bytes | int NOT NULL |  | **kotlin.Int** |  | 
**createdAt** | created_at | int NOT NULL |  | **kotlin.Int** |  | 
**filename** | filename | text NOT NULL |  | **kotlin.String** |  | 
**purpose** | purpose | text NOT NULL |  | **kotlin.String** |  | 
**status** | status | text |  | **kotlin.String** |  |  [optional]
**statusDetails** | status_details | blob |  | [**kotlin.Any**](.md) |  |  [optional]










