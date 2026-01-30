<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Breakdown of tokens used in the prompt.
 */
class CompletionUsagePromptTokensDetails
{
    /**
     * Audio input tokens present in the prompt.
     * @DTA\Data(field="audio_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $audio_tokens = null;

    /**
     * Cached tokens present in the prompt.
     * @DTA\Data(field="cached_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $cached_tokens = null;

}
