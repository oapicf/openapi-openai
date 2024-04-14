<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * On an incomplete message, details about why the message is incomplete.
 */
class MessageObjectIncompleteDetails
{
    /**
     * The reason the message is incomplete.
     * @DTA\Data(field="reason")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $reason = null;

}
