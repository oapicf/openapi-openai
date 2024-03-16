<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateEmbeddingResponseUsage
{
    /**
     * @DTA\Data(field="prompt_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $prompt_tokens;

    /**
     * @DTA\Data(field="total_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $total_tokens;

}
