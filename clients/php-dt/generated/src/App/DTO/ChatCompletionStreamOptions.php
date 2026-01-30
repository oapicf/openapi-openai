<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Options for streaming response. Only set this when you set &#x60;stream: true&#x60;.
 */
class ChatCompletionStreamOptions
{
    /**
     * If set, an additional chunk will be streamed before the &#x60;data: [DONE]&#x60; message. The &#x60;usage&#x60; field on this chunk shows the token usage statistics for the entire request, and the &#x60;choices&#x60; field will always be an empty array. All other chunks will also include a &#x60;usage&#x60; field, but with a null value.
     * @DTA\Data(field="include_usage", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $include_usage = null;

}
