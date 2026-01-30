<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The per-line training example of a fine-tuning input file for completions models
 */
class FineTuneCompletionRequestInput
{
    /**
     * The input prompt for this training example.
     * @DTA\Data(field="prompt", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $prompt = null;

    /**
     * The desired completion for this training example.
     * @DTA\Data(field="completion", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $completion = null;

}
