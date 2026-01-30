<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MessageDeltaObjectDeltaContentInner
{
    /**
     * The index of the content part in the message.
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $index;

    /**
     * Always &#x60;image_file&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="image_file", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageDeltaContentImageFileObjectImageFile::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageDeltaContentImageFileObjectImageFile::class})
     * @var \App\DTO\MessageDeltaContentImageFileObjectImageFile|null
     */
    public $image_file;

    /**
     * @DTA\Data(field="text", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageDeltaContentTextObjectText::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageDeltaContentTextObjectText::class})
     * @var \App\DTO\MessageDeltaContentTextObjectText|null
     */
    public $text;

    /**
     * @DTA\Data(field="refusal", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $refusal;

    /**
     * @DTA\Data(field="image_url", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageDeltaContentImageUrlObjectImageUrl::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageDeltaContentImageUrlObjectImageUrl::class})
     * @var \App\DTO\MessageDeltaContentImageUrlObjectImageUrl|null
     */
    public $image_url;

}
