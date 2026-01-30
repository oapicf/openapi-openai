<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class InviteListResponse
{
    /**
     * The object type, which is always &#x60;list&#x60;
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection77::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection77::class})
     */
    public ?\App\DTO\Collection77 $data = null;

    /**
     * The first &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60;
     * @DTA\Data(field="first_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $first_id = null;

    /**
     * The last &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60;
     * @DTA\Data(field="last_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $last_id = null;

    /**
     * The &#x60;has_more&#x60; property is used for pagination to indicate there are additional results.
     * @DTA\Data(field="has_more", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $has_more = null;

}
