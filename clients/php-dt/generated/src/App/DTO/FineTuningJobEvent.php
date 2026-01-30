<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Fine-tuning job event object
 */
class FineTuningJobEvent
{
    /**
     * The object type, which is always \&quot;fine_tuning.job.event\&quot;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * The object identifier.
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
     * The log level of the event.
     * @DTA\Data(field="level")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $level = null;

    /**
     * The message of the event.
     * @DTA\Data(field="message")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $message = null;

    /**
     * The type of event.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The data associated with the event.
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $data = null;

}
