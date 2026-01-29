
# Table `FineTuningJob`
(mapped from: FineTuningJob)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The object identifier, which can be referenced in the API endpoints. | 
**createdAt** | created_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**error** | error | long NOT NULL |  | [**FineTuningJobError**](FineTuningJobError.md) |  |  [foreignkey]
**fineTunedModel** | fine_tuned_model | text NOT NULL |  | **kotlin.String** | The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. | 
**finishedAt** | finished_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. | 
**hyperparameters** | hyperparameters | long NOT NULL |  | [**FineTuningJobHyperparameters**](FineTuningJobHyperparameters.md) |  |  [foreignkey]
**model** | model | text NOT NULL |  | **kotlin.String** | The base model that is being fine-tuned. | 
**object** | object | text NOT NULL |  | [**object**](#Object) | The object type, which is always \&quot;fine_tuning.job\&quot;. | 
**organizationId** | organization_id | text NOT NULL |  | **kotlin.String** | The organization that owns the fine-tuning job. | 
**resultFiles** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**status** | status | text NOT NULL |  | [**status**](#Status) | The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;. | 
**trainedTokens** | trained_tokens | int NOT NULL |  | **kotlin.Int** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. | 
**trainingFile** | training_file | text NOT NULL |  | **kotlin.String** | The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**validationFile** | validation_file | text NOT NULL |  | **kotlin.String** | The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). | 
**seed** | seed | int NOT NULL |  | **kotlin.Int** | The seed used for the fine-tuning job. | 
**integrations** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FineTuningJobIntegrationsInner&gt;**](FineTuningJobIntegrationsInner.md) | A list of integrations to enable for this fine-tuning job. |  [optional]











# **Table `FineTuningJobResultFiles`**
(mapped from: FineTuningJobResultFiles)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
fineTuningJob | fineTuningJob | long | | kotlin.Long | Primary Key | *one*
resultFiles | resultFiles | text | | kotlin.String | Foreign Key | *many*








# **Table `FineTuningJobFineTuningJobIntegrationsInner`**
(mapped from: FineTuningJobFineTuningJobIntegrationsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
fineTuningJob | fineTuningJob | long | | kotlin.Long | Primary Key | *one*
fineTuningJobIntegrationsInner | fineTuningJobIntegrationsInner | long | | kotlin.Long | Foreign Key | *many*



