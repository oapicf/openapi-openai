<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * References an image URL in the content of a message.
 */
class MessageContentImageUrlObject
{
    /**
     * The type of the content part.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="image_url")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageContentImageUrlObjectImageUrl::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageContentImageUrlObjectImageUrl::class})
     */
    public ?\App\DTO\MessageContentImageUrlObjectImageUrl $image_url = null;

}
