<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 */
class AssistantsApiNamedToolChoice
{
    /**
     * The type of the tool. If type is &#x60;function&#x60;, the function name must be set
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="function", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionNamedToolChoiceFunction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionNamedToolChoiceFunction::class})
     */
    public ?\App\DTO\ChatCompletionNamedToolChoiceFunction $function = null;

}
