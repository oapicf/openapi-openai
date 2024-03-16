
# Table `FineTune`
(mapped from: FineTune)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**createdAt** | created_at | int NOT NULL |  | **kotlin.Int** |  | 
**updatedAt** | updated_at | int NOT NULL |  | **kotlin.Int** |  | 
**model** | model | text NOT NULL |  | **kotlin.String** |  | 
**fineTunedModel** | fine_tuned_model | text NOT NULL |  | **kotlin.String** |  | 
**organizationId** | organization_id | text NOT NULL |  | **kotlin.String** |  | 
**status** | status | text NOT NULL |  | **kotlin.String** |  | 
**hyperparams** | hyperparams | blob NOT NULL |  | [**kotlin.Any**](.md) |  | 
**trainingFiles** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OpenAIFile&gt;**](OpenAIFile.md) |  | 
**validationFiles** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OpenAIFile&gt;**](OpenAIFile.md) |  | 
**resultFiles** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OpenAIFile&gt;**](OpenAIFile.md) |  | 
**events** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FineTuneEvent&gt;**](FineTuneEvent.md) |  |  [optional]











# **Table `FineTuneOpenAIFile`**
(mapped from: FineTuneOpenAIFile)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
fineTune | fineTune | long | | kotlin.Long | Primary Key | *one*
openAIFile | openAIFile | long | | kotlin.Long | Foreign Key | *many*



# **Table `FineTuneOpenAIFile`**
(mapped from: FineTuneOpenAIFile)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
fineTune | fineTune | long | | kotlin.Long | Primary Key | *one*
openAIFile | openAIFile | long | | kotlin.Long | Foreign Key | *many*



# **Table `FineTuneOpenAIFile`**
(mapped from: FineTuneOpenAIFile)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
fineTune | fineTune | long | | kotlin.Long | Primary Key | *one*
openAIFile | openAIFile | long | | kotlin.Long | Foreign Key | *many*



# **Table `FineTuneFineTuneEvent`**
(mapped from: FineTuneFineTuneEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
fineTune | fineTune | long | | kotlin.Long | Primary Key | *one*
fineTuneEvent | fineTuneEvent | long | | kotlin.Long | Foreign Key | *many*



