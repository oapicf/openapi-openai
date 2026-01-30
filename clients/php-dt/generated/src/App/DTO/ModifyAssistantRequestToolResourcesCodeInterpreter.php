<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ModifyAssistantRequestToolResourcesCodeInterpreter
{
    /**
     * Overrides the list of [file](/docs/api-reference/files) IDs made available to the &#x60;code_interpreter&#x60; tool. There can be a maximum of 20 files associated with the tool.
     * @DTA\Data(field="file_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection10::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection10::class})
     */
    public ?\App\DTO\Collection10 $file_ids = null;

}
