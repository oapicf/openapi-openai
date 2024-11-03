<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents a step in execution of a run.
 */
class RunStepObject
{
    /**
     * The identifier of the run step, which can be referenced in API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The object type, which is always &#x60;thread.run.step&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * The Unix timestamp (in seconds) for when the run step was created.
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
     * @DTA\Data(field="assistant_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $assistant_id = null;

    /**
     * The ID of the [thread](/docs/api-reference/threads) that was run.
     * @DTA\Data(field="thread_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $thread_id = null;

    /**
     * The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
     * @DTA\Data(field="run_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $run_id = null;

    /**
     * The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $status = null;

    /**
     * @DTA\Data(field="step_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepObjectStepDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepObjectStepDetails::class})
     */
    public ?\App\DTO\RunStepObjectStepDetails $step_details = null;

    /**
     * @DTA\Data(field="last_error")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepObjectLastError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepObjectLastError::class})
     */
    public ?\App\DTO\RunStepObjectLastError $last_error = null;

    /**
     * The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
     * @DTA\Data(field="expired_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $expired_at = null;

    /**
     * The Unix timestamp (in seconds) for when the run step was cancelled.
     * @DTA\Data(field="cancelled_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $cancelled_at = null;

    /**
     * The Unix timestamp (in seconds) for when the run step failed.
     * @DTA\Data(field="failed_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $failed_at = null;

    /**
     * The Unix timestamp (in seconds) for when the run step completed.
     * @DTA\Data(field="completed_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $completed_at = null;

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @DTA\Data(field="metadata")
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $metadata = null;

    /**
     * @DTA\Data(field="usage")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepCompletionUsage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepCompletionUsage::class})
     */
    public ?\App\DTO\RunStepCompletionUsage $usage = null;

}
