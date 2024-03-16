<?php
/**
 * CreateFineTuneRequest
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the CreateFineTuneRequest model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateFineTuneRequest 
{
        /**
     * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \&quot;prompt\&quot; and \&quot;completion\&quot;. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.
     *
     * @var string|null
     * @SerializedName("training_file")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $trainingFile = null;

    /**
     * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \&quot;prompt\&quot; and \&quot;completion\&quot;. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.
     *
     * @var string|null
     * @SerializedName("validation_file")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $validationFile = null;

    /**
     * @var CreateFineTuneRequestModel|null
     * @SerializedName("model")
     * @Assert\Type("OpenAPI\Server\Model\CreateFineTuneRequestModel")
     * @Type("OpenAPI\Server\Model\CreateFineTuneRequestModel")
     */
    protected ?CreateFineTuneRequestModel $model = null;

    /**
     * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset.
     *
     * @var int|null
     * @SerializedName("n_epochs")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $nEpochs = 4;

    /**
     * The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we&#39;ve found that larger batch sizes tend to work better for larger datasets.
     *
     * @var int|null
     * @SerializedName("batch_size")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $batchSize = null;

    /**
     * The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final &#x60;batch_size&#x60; (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results.
     *
     * @var float|null
     * @SerializedName("learning_rate_multiplier")
     * @Assert\Type("float")
     * @Type("float")
     */
    protected ?float $learningRateMultiplier = null;

    /**
     * The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt.
     *
     * @var float|null
     * @SerializedName("prompt_loss_weight")
     * @Assert\Type("float")
     * @Type("float")
     */
    protected ?float $promptLossWeight = 0.01;

    /**
     * If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a &#x60;validation_file&#x60;. Additionally, you must specify &#x60;classification_n_classes&#x60; for multiclass classification or &#x60;classification_positive_class&#x60; for binary classification.
     *
     * @var bool|null
     * @SerializedName("compute_classification_metrics")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected ?bool $computeClassificationMetrics = false;

    /**
     * The number of classes in a classification task.  This parameter is required for multiclass classification.
     *
     * @var int|null
     * @SerializedName("classification_n_classes")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $classificationNClasses = null;

    /**
     * The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification.
     *
     * @var string|null
     * @SerializedName("classification_positive_class")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $classificationPositiveClass = null;

    /**
     * If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall.
     *
     * @var float[]|null
     * @SerializedName("classification_betas")
     * @Assert\All({
     *   @Assert\Type("float")
     * })
     * @Type("array<float>")
     */
    protected ?array $classificationBetas = null;

    /**
     * A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ada:ft-your-org:custom-model-name-2022-02-15-04-21-04&#x60;.
     *
     * @var string|null
     * @SerializedName("suffix")
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Length(
     *   max = 40
     * )
     * @Assert\Length(
     *   min = 1
     * )
     */
    protected ?string $suffix = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->trainingFile = array_key_exists('trainingFile', $data) ? $data['trainingFile'] : $this->trainingFile;
            $this->validationFile = array_key_exists('validationFile', $data) ? $data['validationFile'] : $this->validationFile;
            $this->model = array_key_exists('model', $data) ? $data['model'] : $this->model;
            $this->nEpochs = array_key_exists('nEpochs', $data) ? $data['nEpochs'] : $this->nEpochs;
            $this->batchSize = array_key_exists('batchSize', $data) ? $data['batchSize'] : $this->batchSize;
            $this->learningRateMultiplier = array_key_exists('learningRateMultiplier', $data) ? $data['learningRateMultiplier'] : $this->learningRateMultiplier;
            $this->promptLossWeight = array_key_exists('promptLossWeight', $data) ? $data['promptLossWeight'] : $this->promptLossWeight;
            $this->computeClassificationMetrics = array_key_exists('computeClassificationMetrics', $data) ? $data['computeClassificationMetrics'] : $this->computeClassificationMetrics;
            $this->classificationNClasses = array_key_exists('classificationNClasses', $data) ? $data['classificationNClasses'] : $this->classificationNClasses;
            $this->classificationPositiveClass = array_key_exists('classificationPositiveClass', $data) ? $data['classificationPositiveClass'] : $this->classificationPositiveClass;
            $this->classificationBetas = array_key_exists('classificationBetas', $data) ? $data['classificationBetas'] : $this->classificationBetas;
            $this->suffix = array_key_exists('suffix', $data) ? $data['suffix'] : $this->suffix;
        }
    }

    /**
     * Gets trainingFile.
     *
     * @return string|null
     */
    public function getTrainingFile(): ?string
    {
        return $this->trainingFile;
    }



    /**
     * Sets trainingFile.
     *
     * @param string|null $trainingFile  The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.
     *
     * @return $this
     */
    public function setTrainingFile(?string $trainingFile): self
    {
        $this->trainingFile = $trainingFile;

        return $this;
    }

    /**
     * Gets validationFile.
     *
     * @return string|null
     */
    public function getValidationFile(): ?string
    {
        return $this->validationFile;
    }



    /**
     * Sets validationFile.
     *
     * @param string|null $validationFile  The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.
     *
     * @return $this
     */
    public function setValidationFile(?string $validationFile = null): self
    {
        $this->validationFile = $validationFile;

        return $this;
    }

    /**
     * Gets model.
     *
     * @return CreateFineTuneRequestModel|null
     */
    public function getModel(): ?CreateFineTuneRequestModel
    {
        return $this->model;
    }



    /**
     * Sets model.
     *
     * @param CreateFineTuneRequestModel|null $model
     *
     * @return $this
     */
    public function setModel(?CreateFineTuneRequestModel $model = null): self
    {
        $this->model = $model;

        return $this;
    }

    /**
     * Gets nEpochs.
     *
     * @return int|null
     */
    public function getNEpochs(): ?int
    {
        return $this->nEpochs;
    }



    /**
     * Sets nEpochs.
     *
     * @param int|null $nEpochs  The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset.
     *
     * @return $this
     */
    public function setNEpochs(?int $nEpochs = null): self
    {
        $this->nEpochs = $nEpochs;

        return $this;
    }

    /**
     * Gets batchSize.
     *
     * @return int|null
     */
    public function getBatchSize(): ?int
    {
        return $this->batchSize;
    }



    /**
     * Sets batchSize.
     *
     * @param int|null $batchSize  The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets.
     *
     * @return $this
     */
    public function setBatchSize(?int $batchSize = null): self
    {
        $this->batchSize = $batchSize;

        return $this;
    }

    /**
     * Gets learningRateMultiplier.
     *
     * @return float|null
     */
    public function getLearningRateMultiplier(): ?float
    {
        return $this->learningRateMultiplier;
    }



    /**
     * Sets learningRateMultiplier.
     *
     * @param float|null $learningRateMultiplier  The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results.
     *
     * @return $this
     */
    public function setLearningRateMultiplier(?float $learningRateMultiplier = null): self
    {
        $this->learningRateMultiplier = $learningRateMultiplier;

        return $this;
    }

    /**
     * Gets promptLossWeight.
     *
     * @return float|null
     */
    public function getPromptLossWeight(): ?float
    {
        return $this->promptLossWeight;
    }



    /**
     * Sets promptLossWeight.
     *
     * @param float|null $promptLossWeight  The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt.
     *
     * @return $this
     */
    public function setPromptLossWeight(?float $promptLossWeight = null): self
    {
        $this->promptLossWeight = $promptLossWeight;

        return $this;
    }

    /**
     * Gets computeClassificationMetrics.
     *
     * @return bool|null
     */
    public function isComputeClassificationMetrics(): ?bool
    {
        return $this->computeClassificationMetrics;
    }



    /**
     * Sets computeClassificationMetrics.
     *
     * @param bool|null $computeClassificationMetrics  If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification.
     *
     * @return $this
     */
    public function setComputeClassificationMetrics(?bool $computeClassificationMetrics = null): self
    {
        $this->computeClassificationMetrics = $computeClassificationMetrics;

        return $this;
    }

    /**
     * Gets classificationNClasses.
     *
     * @return int|null
     */
    public function getClassificationNClasses(): ?int
    {
        return $this->classificationNClasses;
    }



    /**
     * Sets classificationNClasses.
     *
     * @param int|null $classificationNClasses  The number of classes in a classification task.  This parameter is required for multiclass classification.
     *
     * @return $this
     */
    public function setClassificationNClasses(?int $classificationNClasses = null): self
    {
        $this->classificationNClasses = $classificationNClasses;

        return $this;
    }

    /**
     * Gets classificationPositiveClass.
     *
     * @return string|null
     */
    public function getClassificationPositiveClass(): ?string
    {
        return $this->classificationPositiveClass;
    }



    /**
     * Sets classificationPositiveClass.
     *
     * @param string|null $classificationPositiveClass  The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification.
     *
     * @return $this
     */
    public function setClassificationPositiveClass(?string $classificationPositiveClass = null): self
    {
        $this->classificationPositiveClass = $classificationPositiveClass;

        return $this;
    }

    /**
     * Gets classificationBetas.
     *
     * @return float[]|null
     */
    public function getClassificationBetas(): ?array
    {
        return $this->classificationBetas;
    }



    /**
     * Sets classificationBetas.
     *
     * @param float[]|null $classificationBetas  If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall.
     *
     * @return $this
     */
    public function setClassificationBetas(?array $classificationBetas = null): self
    {
        $this->classificationBetas = $classificationBetas;

        return $this;
    }

    /**
     * Gets suffix.
     *
     * @return string|null
     */
    public function getSuffix(): ?string
    {
        return $this->suffix;
    }



    /**
     * Sets suffix.
     *
     * @param string|null $suffix  A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`.
     *
     * @return $this
     */
    public function setSuffix(?string $suffix = null): self
    {
        $this->suffix = $suffix;

        return $this;
    }
}

