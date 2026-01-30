<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateModerationRequestInputOneOfInner
{
    /**
     * Always &#x60;image_url&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="image_url")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateModerationRequestInputOneOfInnerOneOfImageUrl::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateModerationRequestInputOneOfInnerOneOfImageUrl::class})
     * @var \App\DTO\CreateModerationRequestInputOneOfInnerOneOfImageUrl|null
     */
    public $image_url;

    /**
     * A string of text to classify.
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $text;

}
