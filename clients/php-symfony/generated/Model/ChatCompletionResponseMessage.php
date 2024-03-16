<?php
/**
 * ChatCompletionResponseMessage
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
 * Class representing the ChatCompletionResponseMessage model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class ChatCompletionResponseMessage 
{
        /**
     * The role of the author of this message.
     *
     * @var string|null
     * @SerializedName("role")
     * @Assert\NotNull()
     * @Assert\Choice({ "system", "user", "assistant", "function" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $role = null;

    /**
     * The contents of the message.
     *
     * @var string|null
     * @SerializedName("content")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $content = null;

    /**
     * @var ChatCompletionRequestMessageFunctionCall|null
     * @SerializedName("function_call")
     * @Assert\Type("OpenAPI\Server\Model\ChatCompletionRequestMessageFunctionCall")
     * @Type("OpenAPI\Server\Model\ChatCompletionRequestMessageFunctionCall")
     */
    protected ?ChatCompletionRequestMessageFunctionCall $functionCall = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->role = array_key_exists('role', $data) ? $data['role'] : $this->role;
            $this->content = array_key_exists('content', $data) ? $data['content'] : $this->content;
            $this->functionCall = array_key_exists('functionCall', $data) ? $data['functionCall'] : $this->functionCall;
        }
    }

    /**
     * Gets role.
     *
     * @return string|null
     */
    public function getRole(): ?string
    {
        return $this->role;
    }



    /**
     * Sets role.
     *
     * @param string|null $role  The role of the author of this message.
     *
     * @return $this
     */
    public function setRole(?string $role): self
    {
        $this->role = $role;

        return $this;
    }

    /**
     * Gets content.
     *
     * @return string|null
     */
    public function getContent(): ?string
    {
        return $this->content;
    }



    /**
     * Sets content.
     *
     * @param string|null $content  The contents of the message.
     *
     * @return $this
     */
    public function setContent(?string $content = null): self
    {
        $this->content = $content;

        return $this;
    }

    /**
     * Gets functionCall.
     *
     * @return ChatCompletionRequestMessageFunctionCall|null
     */
    public function getFunctionCall(): ?ChatCompletionRequestMessageFunctionCall
    {
        return $this->functionCall;
    }



    /**
     * Sets functionCall.
     *
     * @param ChatCompletionRequestMessageFunctionCall|null $functionCall
     *
     * @return $this
     */
    public function setFunctionCall(?ChatCompletionRequestMessageFunctionCall $functionCall = null): self
    {
        $this->functionCall = $functionCall;

        return $this;
    }
}


