<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateCompletionResponseUsage
{
    /**
     * @DTA\Data(field="prompt_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $prompt_tokens = null;

    /**
     * @DTA\Data(field="completion_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $completion_tokens = null;

    /**
     * @DTA\Data(field="total_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $total_tokens = null;

}
