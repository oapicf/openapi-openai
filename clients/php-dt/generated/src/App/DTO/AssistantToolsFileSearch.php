<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AssistantToolsFileSearch
{
    /**
     * The type of tool being defined: &#x60;file_search&#x60;
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="file_search", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssistantToolsFileSearchFileSearch::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssistantToolsFileSearchFileSearch::class})
     */
    public ?\App\DTO\AssistantToolsFileSearchFileSearch $file_search = null;

}
