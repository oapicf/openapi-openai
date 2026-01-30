<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UserRoleUpdateRequest
{
    /**
     * &#x60;owner&#x60; or &#x60;reader&#x60;
     * @DTA\Data(field="role")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $role;

}
