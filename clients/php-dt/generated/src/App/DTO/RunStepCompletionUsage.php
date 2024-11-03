<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Usage statistics related to the run step. This value will be &#x60;null&#x60; while the run step&#39;s status is &#x60;in_progress&#x60;.
 */
class RunStepCompletionUsage
{
    /**
     * Number of completion tokens used over the course of the run step.
     * @DTA\Data(field="completion_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $completion_tokens = null;

    /**
     * Number of prompt tokens used over the course of the run step.
     * @DTA\Data(field="prompt_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $prompt_tokens = null;

    /**
     * Total number of tokens used (prompt + completion).
     * @DTA\Data(field="total_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $total_tokens = null;

}
