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
 * Class representing the ChatCompletionResponseMessage model.
 *
 * A chat completion message generated by the model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class ChatCompletionResponseMessage 
{
        /**
     * The contents of the message.
     *
     * @var string|null
     * @SerializedName("content")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $content = null;

    /**
     * The tool calls generated by the model, such as function calls.
     *
     * @var ChatCompletionMessageToolCall[]|null
     * @SerializedName("tool_calls")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\ChatCompletionMessageToolCall")
     * })
     * @Type("array<OpenAPI\Server\Model\ChatCompletionMessageToolCall>")
     */
    protected ?array $toolCalls = null;

    /**
     * The role of the author of this message.
     *
     * @var string|null
     * @SerializedName("role")
     * @Assert\NotNull()
     * @Assert\Choice({ "assistant" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $role = null;

    /**
     * @var ChatCompletionRequestAssistantMessageFunctionCall|null
     * @SerializedName("function_call")
     * @Assert\Type("OpenAPI\Server\Model\ChatCompletionRequestAssistantMessageFunctionCall")
     * @Type("OpenAPI\Server\Model\ChatCompletionRequestAssistantMessageFunctionCall")
     */
    protected ?ChatCompletionRequestAssistantMessageFunctionCall $functionCall = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->content = array_key_exists('content', $data) ? $data['content'] : $this->content;
            $this->toolCalls = array_key_exists('toolCalls', $data) ? $data['toolCalls'] : $this->toolCalls;
            $this->role = array_key_exists('role', $data) ? $data['role'] : $this->role;
            $this->functionCall = array_key_exists('functionCall', $data) ? $data['functionCall'] : $this->functionCall;
        }
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
    public function setContent(?string $content): self
    {
        $this->content = $content;

        return $this;
    }

    /**
     * Gets toolCalls.
     *
     * @return ChatCompletionMessageToolCall[]|null
     */
    public function getToolCalls(): ?array
    {
        return $this->toolCalls;
    }



    /**
     * Sets toolCalls.
     *
     * @param ChatCompletionMessageToolCall[]|null $toolCalls  The tool calls generated by the model, such as function calls.
     *
     * @return $this
     */
    public function setToolCalls(?array $toolCalls = null): self
    {
        $this->toolCalls = $toolCalls;

        return $this;
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
     * Gets functionCall.
     *
     * @return ChatCompletionRequestAssistantMessageFunctionCall|null
     */
    public function getFunctionCall(): ?ChatCompletionRequestAssistantMessageFunctionCall
    {
        return $this->functionCall;
    }



    /**
     * Sets functionCall.
     *
     * @param ChatCompletionRequestAssistantMessageFunctionCall|null $functionCall
     *
     * @return $this
     */
    public function setFunctionCall(?ChatCompletionRequestAssistantMessageFunctionCall $functionCall = null): self
    {
        $this->functionCall = $functionCall;

        return $this;
    }
}


