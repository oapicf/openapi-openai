<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateModerationRequestInputOneOfInner
{
    /**
     * Always &#x60;image_url&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="image_url")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateModerationRequestInputOneOfInnerOneOfImageUrl::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateModerationRequestInputOneOfInnerOneOfImageUrl::class})
     */
    public ?\App\DTO\CreateModerationRequestInputOneOfInnerOneOfImageUrl $image_url = null;

    /**
     * A string of text to classify.
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $text = null;

}
