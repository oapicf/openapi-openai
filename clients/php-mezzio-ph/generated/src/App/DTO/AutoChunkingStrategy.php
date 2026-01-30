<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The default strategy. This strategy currently uses a &#x60;max_chunk_size_tokens&#x60; of &#x60;800&#x60; and &#x60;chunk_overlap_tokens&#x60; of &#x60;400&#x60;.
 */
class AutoChunkingStrategy
{
    /**
     * Always &#x60;auto&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

}
