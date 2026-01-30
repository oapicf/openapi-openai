<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateBatchRequest
{
    /**
     * The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose &#x60;batch&#x60;. The file can contain up to 50,000 requests, and can be up to 200 MB in size.
     * @DTA\Data(field="input_file_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $input_file_id = null;

    /**
     * The endpoint to be used for all requests in the batch. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported. Note that &#x60;/v1/embeddings&#x60; batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
     * @DTA\Data(field="endpoint")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $endpoint = null;

    /**
     * The time frame within which the batch should be processed. Currently only &#x60;24h&#x60; is supported.
     * @DTA\Data(field="completion_window")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $completion_window = null;

    /**
     * Optional custom metadata for the batch.
     * @DTA\Data(field="metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection15::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection15::class})
     */
    public ?\App\DTO\Collection15 $metadata = null;

}
