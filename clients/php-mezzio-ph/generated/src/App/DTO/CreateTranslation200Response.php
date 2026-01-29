<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateTranslation200Response
{
    /**
     * The translated text.
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $text;

    /**
     * The language of the output translation (always &#x60;english&#x60;).
     * @DTA\Data(field="language")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $language;

    /**
     * The duration of the input audio.
     * @DTA\Data(field="duration")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $duration;

    /**
     * Segments of the translated text and their corresponding details.
     * @DTA\Data(field="segments", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\TranscriptionSegment[]|null
     */
    public $segments;

}
