<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents a message delta i.e. any changed fields on a message during streaming.
 */
class MessageDeltaObject
{
    /**
     * The identifier of the message, which can be referenced in API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The object type, which is always &#x60;thread.message.delta&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="delta")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageDeltaObjectDelta::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageDeltaObjectDelta::class})
     */
    public ?\App\DTO\MessageDeltaObjectDelta $delta = null;

}
