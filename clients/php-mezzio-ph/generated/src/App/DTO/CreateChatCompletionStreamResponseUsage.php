<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An optional field that will only be present when you set &#x60;stream_options: {\&quot;include_usage\&quot;: true}&#x60; in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request.
 */
class CreateChatCompletionStreamResponseUsage
{
    /**
     * Number of tokens in the generated completion.
     * @DTA\Data(field="completion_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $completion_tokens;

    /**
     * Number of tokens in the prompt.
     * @DTA\Data(field="prompt_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $prompt_tokens;

    /**
     * Total number of tokens used in the request (prompt + completion).
     * @DTA\Data(field="total_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $total_tokens;

}
