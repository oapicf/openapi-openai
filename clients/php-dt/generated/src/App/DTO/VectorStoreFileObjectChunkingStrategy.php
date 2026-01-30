<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The strategy used to chunk the file.
 */
class VectorStoreFileObjectChunkingStrategy
{
    /**
     * Always &#x60;static&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="static")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StaticChunkingStrategy::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StaticChunkingStrategy::class})
     */
    public ?\App\DTO\StaticChunkingStrategy $static = null;

}
