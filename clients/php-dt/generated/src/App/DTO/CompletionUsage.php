<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Usage statistics for the completion request.
 */
class CompletionUsage
{
    /**
     * Number of tokens in the generated completion.
     * @DTA\Data(field="completion_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $completion_tokens = null;

    /**
     * Number of tokens in the prompt.
     * @DTA\Data(field="prompt_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $prompt_tokens = null;

    /**
     * Total number of tokens used in the request (prompt + completion).
     * @DTA\Data(field="total_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $total_tokens = null;

}
