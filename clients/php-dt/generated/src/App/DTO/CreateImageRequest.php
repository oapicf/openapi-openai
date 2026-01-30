<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateImageRequest
{
    /**
     * A text description of the desired image(s). The maximum length is 1000 characters for &#x60;dall-e-2&#x60; and 4000 characters for &#x60;dall-e-3&#x60;.
     * @DTA\Data(field="prompt")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $prompt = null;

    /**
     * @DTA\Data(field="model", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateImageRequestModel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateImageRequestModel::class})
     */
    public ?\App\DTO\CreateImageRequestModel $model = null;

    /**
     * The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.
     * @DTA\Data(field="n", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":1, "max":10})
     */
    public ?int $n = null;

    /**
     * The quality of the image that will be generated. &#x60;hd&#x60; creates images with finer details and greater consistency across the image. This param is only supported for &#x60;dall-e-3&#x60;.
     * @DTA\Data(field="quality", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $quality = null;

    /**
     * The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
     * @DTA\Data(field="response_format", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $response_format = null;

    /**
     * The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60; for &#x60;dall-e-2&#x60;. Must be one of &#x60;1024x1024&#x60;, &#x60;1792x1024&#x60;, or &#x60;1024x1792&#x60; for &#x60;dall-e-3&#x60; models.
     * @DTA\Data(field="size", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $size = null;

    /**
     * The style of the generated images. Must be one of &#x60;vivid&#x60; or &#x60;natural&#x60;. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for &#x60;dall-e-3&#x60;.
     * @DTA\Data(field="style", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $style = null;

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $user = null;

}
