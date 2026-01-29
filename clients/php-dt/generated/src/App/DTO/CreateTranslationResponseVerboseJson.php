<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateTranslationResponseVerboseJson
{
    /**
     * The language of the output translation (always &#x60;english&#x60;).
     * @DTA\Data(field="language")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $language = null;

    /**
     * The duration of the input audio.
     * @DTA\Data(field="duration")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $duration = null;

    /**
     * The translated text.
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $text = null;

    /**
     * Segments of the translated text and their corresponding details.
     * @DTA\Data(field="segments", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $segments = null;

}
