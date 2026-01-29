<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class RunStepDetailsToolCallsCodeOutputImageObject
{
    /**
     * Always &#x60;image&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="image")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDetailsToolCallsCodeOutputImageObjectImage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDetailsToolCallsCodeOutputImageObjectImage::class})
     * @var \App\DTO\RunStepDetailsToolCallsCodeOutputImageObjectImage|null
     */
    public $image;

}
