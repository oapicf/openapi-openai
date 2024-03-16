<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateImageRequest
{
    /**
     * A text description of the desired image(s). The maximum length is 1000 characters.
     * @DTA\Data(field="prompt")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $prompt = null;

    /**
     * The number of images to generate. Must be between 1 and 10.
     * @DTA\Data(field="n", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":1, "max":10})
     */
    public ?int $n = null;

    /**
     * The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * @DTA\Data(field="size", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $size = null;

    /**
     * The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.
     * @DTA\Data(field="response_format", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $response_format = null;

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $user = null;

}
