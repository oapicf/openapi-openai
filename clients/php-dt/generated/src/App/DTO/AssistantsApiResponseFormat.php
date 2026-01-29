<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An object describing the expected output of the model. If &#x60;json_object&#x60; only &#x60;function&#x60; type &#x60;tools&#x60; are allowed to be passed to the Run. If &#x60;text&#x60; the model can return text or any value needed.
 */
class AssistantsApiResponseFormat
{
    /**
     * Must be one of &#x60;text&#x60; or &#x60;json_object&#x60;.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

}
