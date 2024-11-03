<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The text content that is part of a message.
 */
class MessageContentTextObject
{
    /**
     * Always &#x60;text&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="text")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageContentTextObjectText::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageContentTextObjectText::class})
     */
    public ?\App\DTO\MessageContentTextObjectText $text = null;

}
