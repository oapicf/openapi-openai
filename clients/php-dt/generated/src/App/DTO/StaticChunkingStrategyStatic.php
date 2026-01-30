<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class StaticChunkingStrategyStatic
{
    /**
     * The maximum number of tokens in each chunk. The default value is &#x60;800&#x60;. The minimum value is &#x60;100&#x60; and the maximum value is &#x60;4096&#x60;.
     * @DTA\Data(field="max_chunk_size_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":100, "max":4096})
     */
    public ?int $max_chunk_size_tokens = null;

    /**
     * The number of tokens that overlap between chunks. The default value is &#x60;400&#x60;.  Note that the overlap must not exceed half of &#x60;max_chunk_size_tokens&#x60;.
     * @DTA\Data(field="chunk_overlap_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $chunk_overlap_tokens = null;

}
