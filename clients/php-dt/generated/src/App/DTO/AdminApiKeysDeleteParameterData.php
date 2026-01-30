<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for adminApiKeysDelete
 */
class AdminApiKeysDeleteParameterData
{
    /**
     * @DTA\Data(subset="path", field="key_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $key_id = null;

}
