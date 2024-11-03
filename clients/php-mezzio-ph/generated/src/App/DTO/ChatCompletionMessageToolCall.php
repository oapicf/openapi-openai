<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ChatCompletionMessageToolCall
{
    /**
     * The ID of the tool call.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * The type of the tool. Currently, only &#x60;function&#x60; is supported.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="function")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionMessageToolCallFunction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionMessageToolCallFunction::class})
     * @var \App\DTO\ChatCompletionMessageToolCallFunction|null
     */
    public $function;

}
