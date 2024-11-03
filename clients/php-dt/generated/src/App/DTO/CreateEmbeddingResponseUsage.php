<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The usage information for the request.
 */
class CreateEmbeddingResponseUsage
{
    /**
     * The number of tokens used by the prompt.
     * @DTA\Data(field="prompt_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $prompt_tokens = null;

    /**
     * The total number of tokens used by the request.
     * @DTA\Data(field="total_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $total_tokens = null;

}
