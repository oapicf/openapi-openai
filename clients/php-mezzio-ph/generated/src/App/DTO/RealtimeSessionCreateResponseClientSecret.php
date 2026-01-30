<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ephemeral key returned by the API.
 */
class RealtimeSessionCreateResponseClientSecret
{
    /**
     * Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side.
     * @DTA\Data(field="value", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $value;

    /**
     * Timestamp for when the token expires. Currently, all tokens expire after one minute.
     * @DTA\Data(field="expires_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $expires_at;

}
