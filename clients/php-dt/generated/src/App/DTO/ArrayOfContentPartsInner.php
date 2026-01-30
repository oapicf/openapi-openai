<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ArrayOfContentPartsInner
{
    /**
     * Always &#x60;image_file&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="image_file")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageContentImageFileObjectImageFile::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageContentImageFileObjectImageFile::class})
     */
    public ?\App\DTO\MessageContentImageFileObjectImageFile $image_file = null;

    /**
     * @DTA\Data(field="image_url")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageContentImageUrlObjectImageUrl::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageContentImageUrlObjectImageUrl::class})
     */
    public ?\App\DTO\MessageContentImageUrlObjectImageUrl $image_url = null;

    /**
     * Text content to be sent to the model
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $text = null;

}
