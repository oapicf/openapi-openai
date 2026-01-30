<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateThreadRequest
{
    /**
     * A list of [messages](/docs/api-reference/messages) to start the thread with.
     * @DTA\Data(field="messages", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection127::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection127::class})
     * @var \App\DTO\Collection127|null
     */
    public $messages;

    /**
     * @DTA\Data(field="tool_resources", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateThreadRequestToolResources::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateThreadRequestToolResources::class})
     * @var \App\DTO\CreateThreadRequestToolResources|null
     */
    public $tool_resources;

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
     * @DTA\Data(field="metadata", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $metadata;

}
