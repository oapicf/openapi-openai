<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs.
 */
class ModifyAssistantRequestToolResources
{
    /**
     * @DTA\Data(field="code_interpreter", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ModifyAssistantRequestToolResourcesCodeInterpreter::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ModifyAssistantRequestToolResourcesCodeInterpreter::class})
     */
    public ?\App\DTO\ModifyAssistantRequestToolResourcesCodeInterpreter $code_interpreter = null;

    /**
     * @DTA\Data(field="file_search", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ModifyAssistantRequestToolResourcesFileSearch::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ModifyAssistantRequestToolResourcesFileSearch::class})
     */
    public ?\App\DTO\ModifyAssistantRequestToolResourcesFileSearch $file_search = null;

}
