<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A set of resources that are made available to the assistant&#39;s tools in this thread. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs.
 */
class ModifyThreadRequestToolResources
{
    /**
     * @DTA\Data(field="code_interpreter", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateAssistantRequestToolResourcesCodeInterpreter::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateAssistantRequestToolResourcesCodeInterpreter::class})
     * @var \App\DTO\CreateAssistantRequestToolResourcesCodeInterpreter|null
     */
    public $code_interpreter;

    /**
     * @DTA\Data(field="file_search", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ModifyThreadRequestToolResourcesFileSearch::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ModifyThreadRequestToolResourcesFileSearch::class})
     * @var \App\DTO\ModifyThreadRequestToolResourcesFileSearch|null
     */
    public $file_search;

}
