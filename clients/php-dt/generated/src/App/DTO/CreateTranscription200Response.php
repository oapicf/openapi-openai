<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateTranscription200Response
{
    /**
     * The transcribed text.
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $text = null;

    /**
     * The language of the input audio.
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
     * Extracted words and their corresponding timestamps.
     * @DTA\Data(field="words", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $words = null;

    /**
     * Segments of the transcribed text and their corresponding details.
     * @DTA\Data(field="segments", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $segments = null;

}
