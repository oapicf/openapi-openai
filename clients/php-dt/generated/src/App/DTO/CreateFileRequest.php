<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateFileRequest
{
    /**
     * Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \&quot;fine-tune\&quot;, each line is a JSON record with \&quot;prompt\&quot; and \&quot;completion\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).
     * @DTA\Data(field="file")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $file = null;

    /**
     * The intended purpose of the uploaded documents.  Use \&quot;fine-tune\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.
     * @DTA\Data(field="purpose")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $purpose = null;

}
