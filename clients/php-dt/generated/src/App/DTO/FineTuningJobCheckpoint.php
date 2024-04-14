<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The &#x60;fine_tuning.job.checkpoint&#x60; object represents a model checkpoint for a fine-tuning job that is ready to use.
 */
class FineTuningJobCheckpoint
{
    /**
     * The checkpoint identifier, which can be referenced in the API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The Unix timestamp (in seconds) for when the checkpoint was created.
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * The name of the fine-tuned checkpoint model that is created.
     * @DTA\Data(field="fine_tuned_model_checkpoint")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $fine_tuned_model_checkpoint = null;

    /**
     * The step number that the checkpoint was created at.
     * @DTA\Data(field="step_number")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $step_number = null;

    /**
     * @DTA\Data(field="metrics")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FineTuningJobCheckpointMetrics::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FineTuningJobCheckpointMetrics::class})
     */
    public ?\App\DTO\FineTuningJobCheckpointMetrics $metrics = null;

    /**
     * The name of the fine-tuning job that this checkpoint was created from.
     * @DTA\Data(field="fine_tuning_job_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $fine_tuning_job_id = null;

    /**
     * The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

}
