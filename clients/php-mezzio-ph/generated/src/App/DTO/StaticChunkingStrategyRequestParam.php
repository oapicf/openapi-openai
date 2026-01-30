<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class StaticChunkingStrategyRequestParam
{
    /**
     * Always &#x60;static&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="static")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StaticChunkingStrategy::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StaticChunkingStrategy::class})
     * @var \App\DTO\StaticChunkingStrategy|null
     */
    public $static;

}
