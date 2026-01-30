<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The payload used to create the API key.
 */
class AuditLogApiKeyCreatedData
{
    /**
     * A list of scopes allowed for the API key, e.g. &#x60;[\&quot;api.model.request\&quot;]&#x60;
     * @DTA\Data(field="scopes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection69::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection69::class})
     */
    public ?\App\DTO\Collection69 $scopes = null;

}
