<?php
/**
 * CreateChatCompletionStreamResponseChoicesInner
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the CreateChatCompletionStreamResponseChoicesInner model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateChatCompletionStreamResponseChoicesInner 
{
        /**
     * @var ChatCompletionStreamResponseDelta|null
     * @SerializedName("delta")
     * @Type("OpenAPI\Server\Model\ChatCompletionStreamResponseDelta")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\ChatCompletionStreamResponseDelta")]
    protected ?ChatCompletionStreamResponseDelta $delta = null;

    /**
     * @var CreateChatCompletionResponseChoicesInnerLogprobs|null
     * @SerializedName("logprobs")
     * @Type("OpenAPI\Server\Model\CreateChatCompletionResponseChoicesInnerLogprobs")
    */
    #[Assert\Type("OpenAPI\Server\Model\CreateChatCompletionResponseChoicesInnerLogprobs")]
    protected ?CreateChatCompletionResponseChoicesInnerLogprobs $logprobs = null;

    /**
     * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function.
     *
     * @var string|null
     * @SerializedName("finish_reason")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["stop", "length", "tool_calls", "content_filter", "function_call"])]
    #[Assert\Type("string")]
    protected ?string $finishReason = null;

    /**
     * The index of the choice in the list of choices.
     *
     * @var int|null
     * @SerializedName("index")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $index = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->delta = array_key_exists('delta', $data) ? $data['delta'] : $this->delta;
            $this->logprobs = array_key_exists('logprobs', $data) ? $data['logprobs'] : $this->logprobs;
            $this->finishReason = array_key_exists('finishReason', $data) ? $data['finishReason'] : $this->finishReason;
            $this->index = array_key_exists('index', $data) ? $data['index'] : $this->index;
        }
    }

    /**
     * Gets delta.
     *
     * @return ChatCompletionStreamResponseDelta|null
     */
    public function getDelta(): ?ChatCompletionStreamResponseDelta
    {
        return $this->delta;
    }

    /**
    * Sets delta.
    *
    * @param ChatCompletionStreamResponseDelta|null $delta
    *
    * @return $this
    */
    public function setDelta(?ChatCompletionStreamResponseDelta $delta): self
    {
        $this->delta = $delta;

        return $this;
    }




    /**
     * Gets logprobs.
     *
     * @return CreateChatCompletionResponseChoicesInnerLogprobs|null
     */
    public function getLogprobs(): ?CreateChatCompletionResponseChoicesInnerLogprobs
    {
        return $this->logprobs;
    }

    /**
    * Sets logprobs.
    *
    * @param CreateChatCompletionResponseChoicesInnerLogprobs|null $logprobs
    *
    * @return $this
    */
    public function setLogprobs(?CreateChatCompletionResponseChoicesInnerLogprobs $logprobs = null): self
    {
        $this->logprobs = $logprobs;

        return $this;
    }




    /**
     * Gets finishReason.
     *
     * @return string|null
     */
    public function getFinishReason(): ?string
    {
        return $this->finishReason;
    }

    /**
    * Sets finishReason.
    *
    * @param string|null $finishReason  The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.
    *
    * @return $this
    */
    public function setFinishReason(?string $finishReason): self
    {
        $this->finishReason = $finishReason;

        return $this;
    }




    /**
     * Gets index.
     *
     * @return int|null
     */
    public function getIndex(): ?int
    {
        return $this->index;
    }

    /**
    * Sets index.
    *
    * @param int|null $index  The index of the choice in the list of choices.
    *
    * @return $this
    */
    public function setIndex(?int $index): self
    {
        $this->index = $index;

        return $this;
    }



}


