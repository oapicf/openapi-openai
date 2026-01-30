<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The payload used to update the API key.
 */
class AuditLogApiKeyUpdatedChangesRequested
{
    /**
     * A list of scopes allowed for the API key, e.g. &#x60;[\&quot;api.model.request\&quot;]&#x60;
     * @DTA\Data(field="scopes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection70::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection70::class})
     */
    public ?\App\DTO\Collection70 $scopes = null;

}
