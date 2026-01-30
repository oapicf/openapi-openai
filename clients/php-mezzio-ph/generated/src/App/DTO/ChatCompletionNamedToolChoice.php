<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Specifies a tool the model should use. Use to force the model to call a specific function.
 */
class ChatCompletionNamedToolChoice
{
    /**
     * The type of the tool. Currently, only &#x60;function&#x60; is supported.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="function")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssistantsNamedToolChoiceFunction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssistantsNamedToolChoiceFunction::class})
     * @var \App\DTO\AssistantsNamedToolChoiceFunction|null
     */
    public $function;

}
