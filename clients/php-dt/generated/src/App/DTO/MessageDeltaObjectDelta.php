<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The delta containing the fields that have changed on the Message.
 */
class MessageDeltaObjectDelta
{
    /**
     * The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;.
     * @DTA\Data(field="role", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $role = null;

    /**
     * The content of the message in array of text and/or images.
     * @DTA\Data(field="content", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $content = null;

}
