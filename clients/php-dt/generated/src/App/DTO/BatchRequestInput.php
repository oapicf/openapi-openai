<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The per-line object of the batch input file
 */
class BatchRequestInput
{
    /**
     * A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
     * @DTA\Data(field="custom_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $custom_id = null;

    /**
     * The HTTP method to be used for the request. Currently only &#x60;POST&#x60; is supported.
     * @DTA\Data(field="method", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $method = null;

    /**
     * The OpenAI API relative URL to be used for the request. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported.
     * @DTA\Data(field="url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $url = null;

}
