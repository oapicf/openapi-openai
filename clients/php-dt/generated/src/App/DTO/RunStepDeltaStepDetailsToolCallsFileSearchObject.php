<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RunStepDeltaStepDetailsToolCallsFileSearchObject
{
    /**
     * The index of the tool call in the tool calls array.
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $index = null;

    /**
     * The ID of the tool call object.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * For now, this is always going to be an empty object.
     * @DTA\Data(field="file_search")
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $file_search = null;

}
