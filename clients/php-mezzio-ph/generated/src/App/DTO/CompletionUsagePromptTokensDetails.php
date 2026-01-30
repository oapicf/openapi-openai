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
     * @var int|null
     */
    public $audio_tokens;

    /**
     * Cached tokens present in the prompt.
     * @DTA\Data(field="cached_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $cached_tokens;

}
