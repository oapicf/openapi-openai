<?php
/**
 * CreateCompletionResponseChoicesInner
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
 * Class representing the CreateCompletionResponseChoicesInner model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateCompletionResponseChoicesInner 
{
        /**
     * @var string|null
     * @SerializedName("text")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $text = null;

    /**
     * @var int|null
     * @SerializedName("index")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $index = null;

    /**
     * @var CreateCompletionResponseChoicesInnerLogprobs|null
     * @SerializedName("logprobs")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\Type("OpenAPI\Server\Model\CreateCompletionResponseChoicesInnerLogprobs")
     * @Type("OpenAPI\Server\Model\CreateCompletionResponseChoicesInnerLogprobs")
     */
    protected ?CreateCompletionResponseChoicesInnerLogprobs $logprobs = null;

    /**
     * @var string|null
     * @SerializedName("finish_reason")
     * @Assert\NotNull()
     * @Assert\Choice({ "stop", "length" })
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
            $this->text = array_key_exists('text', $data) ? $data['text'] : $this->text;
            $this->index = array_key_exists('index', $data) ? $data['index'] : $this->index;
            $this->logprobs = array_key_exists('logprobs', $data) ? $data['logprobs'] : $this->logprobs;
            $this->finishReason = array_key_exists('finishReason', $data) ? $data['finishReason'] : $this->finishReason;
        }
    }

    /**
     * Gets text.
     *
     * @return string|null
     */
    public function getText(): ?string
    {
        return $this->text;
    }



    /**
     * Sets text.
     *
     * @param string|null $text
     *
     * @return $this
     */
    public function setText(?string $text): self
    {
        $this->text = $text;

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
     * @param int|null $index
     *
     * @return $this
     */
    public function setIndex(?int $index): self
    {
        $this->index = $index;

        return $this;
    }

    /**
     * Gets logprobs.
     *
     * @return CreateCompletionResponseChoicesInnerLogprobs|null
     */
    public function getLogprobs(): ?CreateCompletionResponseChoicesInnerLogprobs
    {
        return $this->logprobs;
    }



    /**
     * Sets logprobs.
     *
     * @param CreateCompletionResponseChoicesInnerLogprobs|null $logprobs
     *
     * @return $this
     */
    public function setLogprobs(?CreateCompletionResponseChoicesInnerLogprobs $logprobs): self
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
     * @param string|null $finishReason
     *
     * @return $this
     */
    public function setFinishReason(?string $finishReason): self
    {
        $this->finishReason = $finishReason;

        return $this;
    }
}


