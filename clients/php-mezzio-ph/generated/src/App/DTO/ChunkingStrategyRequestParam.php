<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy.
 */
class ChunkingStrategyRequestParam
{
    /**
     * Always &#x60;auto&#x60;.
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
