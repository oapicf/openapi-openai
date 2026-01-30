<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tool and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling one or more tools. &#x60;required&#x60; means the model must call one or more tools. Specifying a particular tool via &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool.  &#x60;none&#x60; is the default when no tools are present. &#x60;auto&#x60; is the default if tools are present.
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AssistantsNamedToolChoiceFunction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AssistantsNamedToolChoiceFunction::class})
     */
    public ?\App\DTO\AssistantsNamedToolChoiceFunction $function = null;

}
