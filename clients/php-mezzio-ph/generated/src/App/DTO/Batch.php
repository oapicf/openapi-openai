<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Batch
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * The object type, which is always &#x60;batch&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * The OpenAI API endpoint used by the batch.
     * @DTA\Data(field="endpoint")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $endpoint;

    /**
     * @DTA\Data(field="errors", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BatchErrors::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BatchErrors::class})
     * @var \App\DTO\BatchErrors|null
     */
    public $errors;

    /**
     * The ID of the input file for the batch.
     * @DTA\Data(field="input_file_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $input_file_id;

    /**
     * The time frame within which the batch should be processed.
     * @DTA\Data(field="completion_window")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $completion_window;

    /**
     * The current status of the batch.
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $status;

    /**
     * The ID of the file containing the outputs of successfully executed requests.
     * @DTA\Data(field="output_file_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $output_file_id;

    /**
     * The ID of the file containing the outputs of requests with errors.
     * @DTA\Data(field="error_file_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $error_file_id;

    /**
     * The Unix timestamp (in seconds) for when the batch was created.
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_at;

    /**
     * The Unix timestamp (in seconds) for when the batch started processing.
     * @DTA\Data(field="in_progress_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $in_progress_at;

    /**
     * The Unix timestamp (in seconds) for when the batch will expire.
     * @DTA\Data(field="expires_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $expires_at;

    /**
     * The Unix timestamp (in seconds) for when the batch started finalizing.
     * @DTA\Data(field="finalizing_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $finalizing_at;

    /**
     * The Unix timestamp (in seconds) for when the batch was completed.
     * @DTA\Data(field="completed_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $completed_at;

    /**
     * The Unix timestamp (in seconds) for when the batch failed.
     * @DTA\Data(field="failed_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $failed_at;

    /**
     * The Unix timestamp (in seconds) for when the batch expired.
     * @DTA\Data(field="expired_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $expired_at;

    /**
     * The Unix timestamp (in seconds) for when the batch started cancelling.
     * @DTA\Data(field="cancelling_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $cancelling_at;

    /**
     * The Unix timestamp (in seconds) for when the batch was cancelled.
     * @DTA\Data(field="cancelled_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $cancelled_at;

    /**
     * @DTA\Data(field="request_counts", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BatchRequestCounts::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BatchRequestCounts::class})
     * @var \App\DTO\BatchRequestCounts|null
     */
    public $request_counts;

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
     * @DTA\Data(field="metadata", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $metadata;

}
