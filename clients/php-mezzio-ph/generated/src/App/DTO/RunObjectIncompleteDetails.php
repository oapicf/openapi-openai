<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.
 */
class RunObjectIncompleteDetails
{
    /**
     * The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
     * @DTA\Data(field="reason", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $reason;

}
