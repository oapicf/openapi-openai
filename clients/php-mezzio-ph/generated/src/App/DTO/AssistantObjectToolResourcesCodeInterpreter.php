<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AssistantObjectToolResourcesCodeInterpreter
{
    /**
     * A list of [file](/docs/api-reference/files) IDs made available to the &#x60;code_interpreter&#x60;&#x60; tool. There can be a maximum of 20 files associated with the tool.
     * @DTA\Data(field="file_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection1::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection1::class})
     * @var \App\DTO\Collection1|null
     */
    public $file_ids;

}
