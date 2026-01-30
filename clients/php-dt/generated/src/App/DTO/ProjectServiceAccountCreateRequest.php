<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ProjectServiceAccountCreateRequest
{
    /**
     * The name of the service account being created.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

}
