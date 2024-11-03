<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ChatCompletionMessageToolCallChunk
{
    /**
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $index = null;

    /**
     * The ID of the tool call.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The type of the tool. Currently, only &#x60;function&#x60; is supported.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="function", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionMessageToolCallChunkFunction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionMessageToolCallChunkFunction::class})
     */
    public ?\App\DTO\ChatCompletionMessageToolCallChunkFunction $function = null;

}
