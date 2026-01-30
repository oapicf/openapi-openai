<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Additional details about the status.
 */
class RealtimeResponseStatusDetails
{
    /**
     * The type of error that caused the response to fail, corresponding  with the &#x60;status&#x60; field (&#x60;completed&#x60;, &#x60;cancelled&#x60;, &#x60;incomplete&#x60;,  &#x60;failed&#x60;).
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The reason the Response did not complete. For a &#x60;cancelled&#x60; Response,  one of &#x60;turn_detected&#x60; (the server VAD detected a new start of speech)  or &#x60;client_cancelled&#x60; (the client sent a cancel event). For an  &#x60;incomplete&#x60; Response, one of &#x60;max_output_tokens&#x60; or &#x60;content_filter&#x60;  (the server-side safety filter activated and cut off the response).
     * @DTA\Data(field="reason", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $reason = null;

    /**
     * @DTA\Data(field="error", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeResponseStatusDetailsError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeResponseStatusDetailsError::class})
     */
    public ?\App\DTO\RealtimeResponseStatusDetailsError $error = null;

}
