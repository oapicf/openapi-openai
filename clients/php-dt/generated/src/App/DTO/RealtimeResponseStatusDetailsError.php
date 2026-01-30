<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A description of the error that caused the response to fail,  populated when the &#x60;status&#x60; is &#x60;failed&#x60;.
 */
class RealtimeResponseStatusDetailsError
{
    /**
     * The type of error.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * Error code, if any.
     * @DTA\Data(field="code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $code = null;

}
