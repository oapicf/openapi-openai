<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents an individual &#x60;invite&#x60; to the organization.
 */
class Invite
{
    /**
     * The object type, which is always &#x60;organization.invite&#x60;
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * The identifier, which can be referenced in API endpoints
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * The email address of the individual to whom the invite was sent
     * @DTA\Data(field="email")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $email;

    /**
     * &#x60;owner&#x60; or &#x60;reader&#x60;
     * @DTA\Data(field="role")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $role;

    /**
     * &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60;
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $status;

    /**
     * The Unix timestamp (in seconds) of when the invite was sent.
     * @DTA\Data(field="invited_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $invited_at;

    /**
     * The Unix timestamp (in seconds) of when the invite expires.
     * @DTA\Data(field="expires_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $expires_at;

    /**
     * The Unix timestamp (in seconds) of when the invite was accepted.
     * @DTA\Data(field="accepted_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $accepted_at;

    /**
     * The projects that were granted membership upon acceptance of the invite.
     * @DTA\Data(field="projects", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection76::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection76::class})
     * @var \App\DTO\Collection76|null
     */
    public $projects;

}
