<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present.
 */
class ChatCompletionToolChoiceOption
{
    /**
     * The type of the tool. Currently, only &#x60;function&#x60; is supported.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="function")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionNamedToolChoiceFunction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionNamedToolChoiceFunction::class})
     */
    public ?\App\DTO\ChatCompletionNamedToolChoiceFunction $function = null;

}
