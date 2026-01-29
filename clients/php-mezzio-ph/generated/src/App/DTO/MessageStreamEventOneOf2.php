<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
 */
class MessageStreamEventOneOf2
{
    /**
     * @DTA\Data(field="event")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageDeltaObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageDeltaObject::class})
     * @var \App\DTO\MessageDeltaObject|null
     */
    public $data;

}
