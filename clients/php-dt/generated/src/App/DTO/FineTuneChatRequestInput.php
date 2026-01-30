<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The per-line training example of a fine-tuning input file for chat models using the supervised method.
 */
class FineTuneChatRequestInput
{
    /**
     * @DTA\Data(field="messages", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $messages = null;

    /**
     * A list of tools the model may generate JSON inputs for.
     * @DTA\Data(field="tools", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $tools = null;

    /**
     * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
     * @DTA\Data(field="parallel_tool_calls", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $parallel_tool_calls = null;

    /**
     * A list of functions the model may generate JSON inputs for.
     * @DTA\Data(field="functions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $functions = null;

}
