<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API.
 */
class FineTuningJob
{
    /**
     * The object identifier, which can be referenced in the API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was created.
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * @DTA\Data(field="error")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FineTuningJobError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FineTuningJobError::class})
     */
    public ?\App\DTO\FineTuningJobError $error = null;

    /**
     * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
     * @DTA\Data(field="fine_tuned_model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $fine_tuned_model = null;

    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
     * @DTA\Data(field="finished_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $finished_at = null;

    /**
     * @DTA\Data(field="hyperparameters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FineTuningJobHyperparameters::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FineTuningJobHyperparameters::class})
     */
    public ?\App\DTO\FineTuningJobHyperparameters $hyperparameters = null;

    /**
     * The base model that is being fine-tuned.
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $model = null;

    /**
     * The object type, which is always \&quot;fine_tuning.job\&quot;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * The organization that owns the fine-tuning job.
     * @DTA\Data(field="organization_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $organization_id = null;

    /**
     * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @DTA\Data(field="result_files")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection23::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection23::class})
     */
    public ?\App\DTO\Collection23 $result_files = null;

    /**
     * The current status of the fine-tuning job, which can be either &#x60;validating_files&#x60;, &#x60;queued&#x60;, &#x60;running&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60;, or &#x60;cancelled&#x60;.
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $status = null;

    /**
     * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
     * @DTA\Data(field="trained_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $trained_tokens = null;

    /**
     * The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @DTA\Data(field="training_file")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $training_file = null;

    /**
     * The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @DTA\Data(field="validation_file")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $validation_file = null;

    /**
     * A list of integrations to enable for this fine-tuning job.
     * @DTA\Data(field="integrations", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection24::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection24::class})
     */
    public ?\App\DTO\Collection24 $integrations = null;

    /**
     * The seed used for the fine-tuning job.
     * @DTA\Data(field="seed")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $seed = null;

}
