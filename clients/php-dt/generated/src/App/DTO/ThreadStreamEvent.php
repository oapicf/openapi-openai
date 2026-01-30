<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 */
class ThreadStreamEvent
{
    /**
     * Whether to enable input audio transcription.
     * @DTA\Data(field="enabled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $enabled = null;

    /**
     * @DTA\Data(field="event")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event = null;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ThreadObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ThreadObject::class})
     */
    public ?\App\DTO\ThreadObject $data = null;

}
