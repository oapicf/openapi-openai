
# Table `ListFilesResponse`
(mapped from: ListFilesResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OpenAIFile&gt;**](OpenAIFile.md) |  | 



# **Table `ListFilesResponseOpenAIFile`**
(mapped from: ListFilesResponseOpenAIFile)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
listFilesResponse | listFilesResponse | long | | kotlin.Long | Primary Key | *one*
openAIFile | openAIFile | long | | kotlin.Long | Foreign Key | *many*



