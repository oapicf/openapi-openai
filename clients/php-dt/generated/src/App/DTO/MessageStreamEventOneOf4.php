<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
 */
class MessageStreamEventOneOf4
{
    /**
     * @DTA\Data(field="event")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event = null;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageObject::class})
     */
    public ?\App\DTO\MessageObject $data = null;

}
