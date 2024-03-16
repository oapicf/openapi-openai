# CreateFineTuneRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TrainingFile** | **string** | The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \&quot;prompt\&quot; and \&quot;completion\&quot;. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.  | 
**ValidationFile** | Pointer to **NullableString** | The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \&quot;prompt\&quot; and \&quot;completion\&quot;. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.  | [optional] 
**Model** | Pointer to [**NullableCreateFineTuneRequestModel**](CreateFineTuneRequestModel.md) |  | [optional] [default to curie]
**NEpochs** | Pointer to **NullableInt32** | The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset.  | [optional] [default to 4]
**BatchSize** | Pointer to **NullableInt32** | The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we&#39;ve found that larger batch sizes tend to work better for larger datasets.  | [optional] 
**LearningRateMultiplier** | Pointer to **NullableFloat32** | The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final &#x60;batch_size&#x60; (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results.  | [optional] 
**PromptLossWeight** | Pointer to **NullableFloat32** | The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt.  | [optional] [default to 0.01]
**ComputeClassificationMetrics** | Pointer to **NullableBool** | If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a &#x60;validation_file&#x60;. Additionally, you must specify &#x60;classification_n_classes&#x60; for multiclass classification or &#x60;classification_positive_class&#x60; for binary classification.  | [optional] [default to false]
**ClassificationNClasses** | Pointer to **NullableInt32** | The number of classes in a classification task.  This parameter is required for multiclass classification.  | [optional] 
**ClassificationPositiveClass** | Pointer to **NullableString** | The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification.  | [optional] 
**ClassificationBetas** | Pointer to **[]float32** | If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall.  | [optional] 
**Suffix** | Pointer to **NullableString** | A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ada:ft-your-org:custom-model-name-2022-02-15-04-21-04&#x60;.  | [optional] 

## Methods

### NewCreateFineTuneRequest

`func NewCreateFineTuneRequest(trainingFile string, ) *CreateFineTuneRequest`

NewCreateFineTuneRequest instantiates a new CreateFineTuneRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateFineTuneRequestWithDefaults

`func NewCreateFineTuneRequestWithDefaults() *CreateFineTuneRequest`

NewCreateFineTuneRequestWithDefaults instantiates a new CreateFineTuneRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTrainingFile

`func (o *CreateFineTuneRequest) GetTrainingFile() string`

GetTrainingFile returns the TrainingFile field if non-nil, zero value otherwise.

### GetTrainingFileOk

`func (o *CreateFineTuneRequest) GetTrainingFileOk() (*string, bool)`

GetTrainingFileOk returns a tuple with the TrainingFile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrainingFile

`func (o *CreateFineTuneRequest) SetTrainingFile(v string)`

SetTrainingFile sets TrainingFile field to given value.


### GetValidationFile

`func (o *CreateFineTuneRequest) GetValidationFile() string`

GetValidationFile returns the ValidationFile field if non-nil, zero value otherwise.

### GetValidationFileOk

`func (o *CreateFineTuneRequest) GetValidationFileOk() (*string, bool)`

GetValidationFileOk returns a tuple with the ValidationFile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidationFile

`func (o *CreateFineTuneRequest) SetValidationFile(v string)`

SetValidationFile sets ValidationFile field to given value.

### HasValidationFile

`func (o *CreateFineTuneRequest) HasValidationFile() bool`

HasValidationFile returns a boolean if a field has been set.

### SetValidationFileNil

`func (o *CreateFineTuneRequest) SetValidationFileNil(b bool)`

 SetValidationFileNil sets the value for ValidationFile to be an explicit nil

### UnsetValidationFile
`func (o *CreateFineTuneRequest) UnsetValidationFile()`

UnsetValidationFile ensures that no value is present for ValidationFile, not even an explicit nil
### GetModel

`func (o *CreateFineTuneRequest) GetModel() CreateFineTuneRequestModel`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *CreateFineTuneRequest) GetModelOk() (*CreateFineTuneRequestModel, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *CreateFineTuneRequest) SetModel(v CreateFineTuneRequestModel)`

SetModel sets Model field to given value.

### HasModel

`func (o *CreateFineTuneRequest) HasModel() bool`

HasModel returns a boolean if a field has been set.

### SetModelNil

`func (o *CreateFineTuneRequest) SetModelNil(b bool)`

 SetModelNil sets the value for Model to be an explicit nil

### UnsetModel
`func (o *CreateFineTuneRequest) UnsetModel()`

UnsetModel ensures that no value is present for Model, not even an explicit nil
### GetNEpochs

`func (o *CreateFineTuneRequest) GetNEpochs() int32`

GetNEpochs returns the NEpochs field if non-nil, zero value otherwise.

### GetNEpochsOk

`func (o *CreateFineTuneRequest) GetNEpochsOk() (*int32, bool)`

GetNEpochsOk returns a tuple with the NEpochs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNEpochs

`func (o *CreateFineTuneRequest) SetNEpochs(v int32)`

SetNEpochs sets NEpochs field to given value.

### HasNEpochs

`func (o *CreateFineTuneRequest) HasNEpochs() bool`

HasNEpochs returns a boolean if a field has been set.

### SetNEpochsNil

`func (o *CreateFineTuneRequest) SetNEpochsNil(b bool)`

 SetNEpochsNil sets the value for NEpochs to be an explicit nil

### UnsetNEpochs
`func (o *CreateFineTuneRequest) UnsetNEpochs()`

UnsetNEpochs ensures that no value is present for NEpochs, not even an explicit nil
### GetBatchSize

`func (o *CreateFineTuneRequest) GetBatchSize() int32`

GetBatchSize returns the BatchSize field if non-nil, zero value otherwise.

### GetBatchSizeOk

`func (o *CreateFineTuneRequest) GetBatchSizeOk() (*int32, bool)`

GetBatchSizeOk returns a tuple with the BatchSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBatchSize

`func (o *CreateFineTuneRequest) SetBatchSize(v int32)`

SetBatchSize sets BatchSize field to given value.

### HasBatchSize

`func (o *CreateFineTuneRequest) HasBatchSize() bool`

HasBatchSize returns a boolean if a field has been set.

### SetBatchSizeNil

`func (o *CreateFineTuneRequest) SetBatchSizeNil(b bool)`

 SetBatchSizeNil sets the value for BatchSize to be an explicit nil

### UnsetBatchSize
`func (o *CreateFineTuneRequest) UnsetBatchSize()`

UnsetBatchSize ensures that no value is present for BatchSize, not even an explicit nil
### GetLearningRateMultiplier

`func (o *CreateFineTuneRequest) GetLearningRateMultiplier() float32`

GetLearningRateMultiplier returns the LearningRateMultiplier field if non-nil, zero value otherwise.

### GetLearningRateMultiplierOk

`func (o *CreateFineTuneRequest) GetLearningRateMultiplierOk() (*float32, bool)`

GetLearningRateMultiplierOk returns a tuple with the LearningRateMultiplier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLearningRateMultiplier

`func (o *CreateFineTuneRequest) SetLearningRateMultiplier(v float32)`

SetLearningRateMultiplier sets LearningRateMultiplier field to given value.

### HasLearningRateMultiplier

`func (o *CreateFineTuneRequest) HasLearningRateMultiplier() bool`

HasLearningRateMultiplier returns a boolean if a field has been set.

### SetLearningRateMultiplierNil

`func (o *CreateFineTuneRequest) SetLearningRateMultiplierNil(b bool)`

 SetLearningRateMultiplierNil sets the value for LearningRateMultiplier to be an explicit nil

### UnsetLearningRateMultiplier
`func (o *CreateFineTuneRequest) UnsetLearningRateMultiplier()`

UnsetLearningRateMultiplier ensures that no value is present for LearningRateMultiplier, not even an explicit nil
### GetPromptLossWeight

`func (o *CreateFineTuneRequest) GetPromptLossWeight() float32`

GetPromptLossWeight returns the PromptLossWeight field if non-nil, zero value otherwise.

### GetPromptLossWeightOk

`func (o *CreateFineTuneRequest) GetPromptLossWeightOk() (*float32, bool)`

GetPromptLossWeightOk returns a tuple with the PromptLossWeight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromptLossWeight

`func (o *CreateFineTuneRequest) SetPromptLossWeight(v float32)`

SetPromptLossWeight sets PromptLossWeight field to given value.

### HasPromptLossWeight

`func (o *CreateFineTuneRequest) HasPromptLossWeight() bool`

HasPromptLossWeight returns a boolean if a field has been set.

### SetPromptLossWeightNil

`func (o *CreateFineTuneRequest) SetPromptLossWeightNil(b bool)`

 SetPromptLossWeightNil sets the value for PromptLossWeight to be an explicit nil

### UnsetPromptLossWeight
`func (o *CreateFineTuneRequest) UnsetPromptLossWeight()`

UnsetPromptLossWeight ensures that no value is present for PromptLossWeight, not even an explicit nil
### GetComputeClassificationMetrics

`func (o *CreateFineTuneRequest) GetComputeClassificationMetrics() bool`

GetComputeClassificationMetrics returns the ComputeClassificationMetrics field if non-nil, zero value otherwise.

### GetComputeClassificationMetricsOk

`func (o *CreateFineTuneRequest) GetComputeClassificationMetricsOk() (*bool, bool)`

GetComputeClassificationMetricsOk returns a tuple with the ComputeClassificationMetrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComputeClassificationMetrics

`func (o *CreateFineTuneRequest) SetComputeClassificationMetrics(v bool)`

SetComputeClassificationMetrics sets ComputeClassificationMetrics field to given value.

### HasComputeClassificationMetrics

`func (o *CreateFineTuneRequest) HasComputeClassificationMetrics() bool`

HasComputeClassificationMetrics returns a boolean if a field has been set.

### SetComputeClassificationMetricsNil

`func (o *CreateFineTuneRequest) SetComputeClassificationMetricsNil(b bool)`

 SetComputeClassificationMetricsNil sets the value for ComputeClassificationMetrics to be an explicit nil

### UnsetComputeClassificationMetrics
`func (o *CreateFineTuneRequest) UnsetComputeClassificationMetrics()`

UnsetComputeClassificationMetrics ensures that no value is present for ComputeClassificationMetrics, not even an explicit nil
### GetClassificationNClasses

`func (o *CreateFineTuneRequest) GetClassificationNClasses() int32`

GetClassificationNClasses returns the ClassificationNClasses field if non-nil, zero value otherwise.

### GetClassificationNClassesOk

`func (o *CreateFineTuneRequest) GetClassificationNClassesOk() (*int32, bool)`

GetClassificationNClassesOk returns a tuple with the ClassificationNClasses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClassificationNClasses

`func (o *CreateFineTuneRequest) SetClassificationNClasses(v int32)`

SetClassificationNClasses sets ClassificationNClasses field to given value.

### HasClassificationNClasses

`func (o *CreateFineTuneRequest) HasClassificationNClasses() bool`

HasClassificationNClasses returns a boolean if a field has been set.

### SetClassificationNClassesNil

`func (o *CreateFineTuneRequest) SetClassificationNClassesNil(b bool)`

 SetClassificationNClassesNil sets the value for ClassificationNClasses to be an explicit nil

### UnsetClassificationNClasses
`func (o *CreateFineTuneRequest) UnsetClassificationNClasses()`

UnsetClassificationNClasses ensures that no value is present for ClassificationNClasses, not even an explicit nil
### GetClassificationPositiveClass

`func (o *CreateFineTuneRequest) GetClassificationPositiveClass() string`

GetClassificationPositiveClass returns the ClassificationPositiveClass field if non-nil, zero value otherwise.

### GetClassificationPositiveClassOk

`func (o *CreateFineTuneRequest) GetClassificationPositiveClassOk() (*string, bool)`

GetClassificationPositiveClassOk returns a tuple with the ClassificationPositiveClass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClassificationPositiveClass

`func (o *CreateFineTuneRequest) SetClassificationPositiveClass(v string)`

SetClassificationPositiveClass sets ClassificationPositiveClass field to given value.

### HasClassificationPositiveClass

`func (o *CreateFineTuneRequest) HasClassificationPositiveClass() bool`

HasClassificationPositiveClass returns a boolean if a field has been set.

### SetClassificationPositiveClassNil

`func (o *CreateFineTuneRequest) SetClassificationPositiveClassNil(b bool)`

 SetClassificationPositiveClassNil sets the value for ClassificationPositiveClass to be an explicit nil

### UnsetClassificationPositiveClass
`func (o *CreateFineTuneRequest) UnsetClassificationPositiveClass()`

UnsetClassificationPositiveClass ensures that no value is present for ClassificationPositiveClass, not even an explicit nil
### GetClassificationBetas

`func (o *CreateFineTuneRequest) GetClassificationBetas() []float32`

GetClassificationBetas returns the ClassificationBetas field if non-nil, zero value otherwise.

### GetClassificationBetasOk

`func (o *CreateFineTuneRequest) GetClassificationBetasOk() (*[]float32, bool)`

GetClassificationBetasOk returns a tuple with the ClassificationBetas field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClassificationBetas

`func (o *CreateFineTuneRequest) SetClassificationBetas(v []float32)`

SetClassificationBetas sets ClassificationBetas field to given value.

### HasClassificationBetas

`func (o *CreateFineTuneRequest) HasClassificationBetas() bool`

HasClassificationBetas returns a boolean if a field has been set.

### SetClassificationBetasNil

`func (o *CreateFineTuneRequest) SetClassificationBetasNil(b bool)`

 SetClassificationBetasNil sets the value for ClassificationBetas to be an explicit nil

### UnsetClassificationBetas
`func (o *CreateFineTuneRequest) UnsetClassificationBetas()`

UnsetClassificationBetas ensures that no value is present for ClassificationBetas, not even an explicit nil
### GetSuffix

`func (o *CreateFineTuneRequest) GetSuffix() string`

GetSuffix returns the Suffix field if non-nil, zero value otherwise.

### GetSuffixOk

`func (o *CreateFineTuneRequest) GetSuffixOk() (*string, bool)`

GetSuffixOk returns a tuple with the Suffix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuffix

`func (o *CreateFineTuneRequest) SetSuffix(v string)`

SetSuffix sets Suffix field to given value.

### HasSuffix

`func (o *CreateFineTuneRequest) HasSuffix() bool`

HasSuffix returns a boolean if a field has been set.

### SetSuffixNil

`func (o *CreateFineTuneRequest) SetSuffixNil(b bool)`

 SetSuffixNil sets the value for Suffix to be an explicit nil

### UnsetSuffix
`func (o *CreateFineTuneRequest) UnsetSuffix()`

UnsetSuffix ensures that no value is present for Suffix, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


