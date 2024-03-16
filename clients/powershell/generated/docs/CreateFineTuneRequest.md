# CreateFineTuneRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TrainingFile** | **String** | The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys &quot;&quot;prompt&quot;&quot; and &quot;&quot;completion&quot;&quot;. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.  | 
**ValidationFile** | **String** | The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys &quot;&quot;prompt&quot;&quot; and &quot;&quot;completion&quot;&quot;. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.  | [optional] 
**Model** | [**CreateFineTuneRequestModel**](CreateFineTuneRequestModel.md) |  | [optional] 
**NEpochs** | **Int32** | The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset.  | [optional] [default to 4]
**BatchSize** | **Int32** | The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we&#39;ve found that larger batch sizes tend to work better for larger datasets.  | [optional] 
**LearningRateMultiplier** | **Decimal** | The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final &#x60;batch_size&#x60; (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results.  | [optional] 
**PromptLossWeight** | **Decimal** | The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt.  | [optional] [default to 0.01]
**ComputeClassificationMetrics** | **Boolean** | If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a &#x60;validation_file&#x60;. Additionally, you must specify &#x60;classification_n_classes&#x60; for multiclass classification or &#x60;classification_positive_class&#x60; for binary classification.  | [optional] [default to $false]
**ClassificationNClasses** | **Int32** | The number of classes in a classification task.  This parameter is required for multiclass classification.  | [optional] 
**ClassificationPositiveClass** | **String** | The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification.  | [optional] 
**ClassificationBetas** | **Decimal[]** | If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall.  | [optional] 
**Suffix** | **String** | A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of &quot;&quot;custom-model-name&quot;&quot; would produce a model name like &#x60;ada:ft-your-org:custom-model-name-2022-02-15-04-21-04&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateFineTuneRequest = Initialize-PSOpenAPIToolsCreateFineTuneRequest  -TrainingFile file-ajSREls59WBbvgSzJSVWxMCB `
 -ValidationFile file-XjSREls59WBbvgSzJSVWxMCa `
 -Model null `
 -NEpochs null `
 -BatchSize null `
 -LearningRateMultiplier null `
 -PromptLossWeight null `
 -ComputeClassificationMetrics null `
 -ClassificationNClasses null `
 -ClassificationPositiveClass null `
 -ClassificationBetas [0.6,1,1.5,2] `
 -Suffix null
```

- Convert the resource to JSON
```powershell
$CreateFineTuneRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

