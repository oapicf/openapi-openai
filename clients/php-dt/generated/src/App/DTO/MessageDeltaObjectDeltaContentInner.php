<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MessageDeltaObjectDeltaContentInner
{
    /**
     * The index of the content part in the message.
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $index = null;

    /**
     * Always &#x60;image_file&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="image_file", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageDeltaContentImageFileObjectImageFile::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageDeltaContentImageFileObjectImageFile::class})
     */
    public ?\App\DTO\MessageDeltaContentImageFileObjectImageFile $image_file = null;

    /**
     * @DTA\Data(field="text", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageDeltaContentTextObjectText::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageDeltaContentTextObjectText::class})
     */
    public ?\App\DTO\MessageDeltaContentTextObjectText $text = null;

    /**
     * @DTA\Data(field="refusal", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $refusal = null;

    /**
     * @DTA\Data(field="image_url", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageDeltaContentImageUrlObjectImageUrl::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageDeltaContentImageUrlObjectImageUrl::class})
     */
    public ?\App\DTO\MessageDeltaContentImageUrlObjectImageUrl $image_url = null;

}
