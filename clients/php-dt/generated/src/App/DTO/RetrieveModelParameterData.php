<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for retrieveModel
 */
class RetrieveModelParameterData
{
    /**
     * The ID of the model to use for this request
     * @DTA\Data(subset="path", field="model")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $model = null;

}
