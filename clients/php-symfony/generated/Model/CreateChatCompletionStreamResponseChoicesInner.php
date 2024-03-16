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
 * APIs for sampling from and fine-tuning language models
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
     * @var int|null
     * @SerializedName("index")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $index = null;

    /**
     * @var ChatCompletionStreamResponseDelta|null
     * @SerializedName("delta")
     * @Assert\Type("OpenAPI\Server\Model\ChatCompletionStreamResponseDelta")
     * @Type("OpenAPI\Server\Model\ChatCompletionStreamResponseDelta")
     */
    protected ?ChatCompletionStreamResponseDelta $delta = null;

    /**
     * @var string|null
     * @SerializedName("finish_reason")
     * @Assert\Choice({ "stop", "length", "function_call" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $finishReason = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->index = array_key_exists('index', $data) ? $data['index'] : $this->index;
            $this->delta = array_key_exists('delta', $data) ? $data['delta'] : $this->delta;
            $this->finishReason = array_key_exists('finishReason', $data) ? $data['finishReason'] : $this->finishReason;
        }
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
     * @param int|null $index
     *
     * @return $this
     */
    public function setIndex(?int $index = null): self
    {
        $this->index = $index;

        return $this;
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
    public function setDelta(?ChatCompletionStreamResponseDelta $delta = null): self
    {
        $this->delta = $delta;

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
     * @param string|null $finishReason
     *
     * @return $this
     */
    public function setFinishReason(?string $finishReason = null): self
    {
        $this->finishReason = $finishReason;

        return $this;
    }
}

