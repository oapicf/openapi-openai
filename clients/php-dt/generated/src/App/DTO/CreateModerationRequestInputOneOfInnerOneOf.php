<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An object describing an image to classify.
 */
class CreateModerationRequestInputOneOfInnerOneOf
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

}
