<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the &#x60;chunking_strategy&#x60; concept was introduced in the API.
 */
class OtherChunkingStrategyResponseParam
{
    /**
     * Always &#x60;other&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

}
