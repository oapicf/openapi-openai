<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateFineTuneRequest
{
    /**
     * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \&quot;prompt\&quot; and \&quot;completion\&quot;. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.
     * @DTA\Data(field="training_file")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $training_file;

    /**
     * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \&quot;prompt\&quot; and \&quot;completion\&quot;. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.
     * @DTA\Data(field="validation_file", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $validation_file;

    /**
     * @DTA\Data(field="model", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateFineTuneRequestModel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateFineTuneRequestModel::class})
     * @var \App\DTO\CreateFineTuneRequestModel|null
     */
    public $model;

    /**
     * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset.
     * @DTA\Data(field="n_epochs", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $n_epochs;

    /**
     * The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we&#39;ve found that larger batch sizes tend to work better for larger datasets.
     * @DTA\Data(field="batch_size", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $batch_size;

    /**
     * The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final &#x60;batch_size&#x60; (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results.
     * @DTA\Data(field="learning_rate_multiplier", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $learning_rate_multiplier;

    /**
     * The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt.
     * @DTA\Data(field="prompt_loss_weight", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $prompt_loss_weight;

    /**
     * If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a &#x60;validation_file&#x60;. Additionally, you must specify &#x60;classification_n_classes&#x60; for multiclass classification or &#x60;classification_positive_class&#x60; for binary classification.
     * @DTA\Data(field="compute_classification_metrics", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $compute_classification_metrics;

    /**
     * The number of classes in a classification task.  This parameter is required for multiclass classification.
     * @DTA\Data(field="classification_n_classes", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $classification_n_classes;

    /**
     * The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification.
     * @DTA\Data(field="classification_positive_class", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $classification_positive_class;

    /**
     * If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall.
     * @DTA\Data(field="classification_betas", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection19::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection19::class})
     * @var \App\DTO\Collection19|null
     */
    public $classification_betas;

    /**
     * A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ada:ft-your-org:custom-model-name-2022-02-15-04-21-04&#x60;.
     * @DTA\Data(field="suffix", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":1, "max":40})
     * @var string|null
     */
    public $suffix;

}
