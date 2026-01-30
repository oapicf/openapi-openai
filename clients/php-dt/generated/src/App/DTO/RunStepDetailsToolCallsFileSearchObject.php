<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RunStepDetailsToolCallsFileSearchObject
{
    /**
     * The ID of the tool call object.
     * @DTA\Data(field="id")
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
     * @DTA\Data(field="file_search")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDetailsToolCallsFileSearchObjectFileSearch::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDetailsToolCallsFileSearchObjectFileSearch::class})
     */
    public ?\App\DTO\RunStepDetailsToolCallsFileSearchObjectFileSearch $file_search = null;

}
