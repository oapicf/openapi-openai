<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.
 */
class TruncationObject
{
    /**
     * The truncation strategy to use for the thread. The default is &#x60;auto&#x60;. If set to &#x60;last_messages&#x60;, the thread will be truncated to the n most recent messages in the thread. When set to &#x60;auto&#x60;, messages in the middle of the thread will be dropped to fit the context length of the model, &#x60;max_prompt_tokens&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The number of most recent messages from the thread when constructing the context for the run.
     * @DTA\Data(field="last_messages", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":1})
     */
    public ?int $last_messages = null;

}
