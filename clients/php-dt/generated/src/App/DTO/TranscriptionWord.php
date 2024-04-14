<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TranscriptionWord
{
    /**
     * The text content of the word.
     * @DTA\Data(field="word")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $word = null;

    /**
     * Start time of the word in seconds.
     * @DTA\Data(field="start")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $start = null;

    /**
     * End time of the word in seconds.
     * @DTA\Data(field="end")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $end = null;

}
