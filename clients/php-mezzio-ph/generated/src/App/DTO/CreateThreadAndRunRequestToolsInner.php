<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateThreadAndRunRequestToolsInner
{
    /**
     * The type of tool being defined: &#x60;code_interpreter&#x60;
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="file_search", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssistantToolsFileSearchFileSearch::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssistantToolsFileSearchFileSearch::class})
     * @var \App\DTO\AssistantToolsFileSearchFileSearch|null
     */
    public $file_search;

    /**
     * @DTA\Data(field="function")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FunctionObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FunctionObject::class})
     * @var \App\DTO\FunctionObject|null
     */
    public $function;

}
