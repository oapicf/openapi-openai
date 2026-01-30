<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * References an image URL in the content of a message.
 */
class MessageDeltaContentImageUrlObject
{
    /**
     * The index of the content part in the message.
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $index;

    /**
     * Always &#x60;image_url&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="image_url", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageDeltaContentImageUrlObjectImageUrl::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageDeltaContentImageUrlObjectImageUrl::class})
     * @var \App\DTO\MessageDeltaContentImageUrlObjectImageUrl|null
     */
    public $image_url;

}
