<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateMessageRequestAttachmentsInner
{
    /**
     * The ID of the file to attach to the message.
     * @DTA\Data(field="file_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $file_id = null;

    /**
     * The tools to add this file to.
     * @DTA\Data(field="tools", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection125::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection125::class})
     */
    public ?\App\DTO\Collection125 $tools = null;

}
