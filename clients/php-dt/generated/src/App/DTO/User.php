<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents an individual &#x60;user&#x60; within an organization.
 */
class User
{
    /**
     * The object type, which is always &#x60;organization.user&#x60;
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * The identifier, which can be referenced in API endpoints
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The name of the user
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * The email address of the user
     * @DTA\Data(field="email")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $email = null;

    /**
     * &#x60;owner&#x60; or &#x60;reader&#x60;
     * @DTA\Data(field="role")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $role = null;

    /**
     * The Unix timestamp (in seconds) of when the user was added.
     * @DTA\Data(field="added_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $added_at = null;

}
