<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class InviteRequest
{
    /**
     * Send an email to this address
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
     * An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
     * @DTA\Data(field="projects", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection78::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection78::class})
     */
    public ?\App\DTO\Collection78 $projects = null;

}
