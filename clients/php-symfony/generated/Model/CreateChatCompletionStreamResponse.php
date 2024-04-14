<?php
/**
 * CreateChatCompletionStreamResponse
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
 * Class representing the CreateChatCompletionStreamResponse model.
 *
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateChatCompletionStreamResponse 
{
        /**
     * A unique identifier for the chat completion. Each chunk has the same ID.
     *
     * @var string|null
     * @SerializedName("id")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $id = null;

    /**
     * A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.
     *
     * @var CreateChatCompletionStreamResponseChoicesInner[]|null
     * @SerializedName("choices")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\CreateChatCompletionStreamResponseChoicesInner")
     * })
     * @Type("array<OpenAPI\Server\Model\CreateChatCompletionStreamResponseChoicesInner>")
     */
    protected ?array $choices = null;

    /**
     * The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
     *
     * @var int|null
     * @SerializedName("created")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $created = null;

    /**
     * The model to generate the completion.
     *
     * @var string|null
     * @SerializedName("model")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $model = null;

    /**
     * This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.
     *
     * @var string|null
     * @SerializedName("system_fingerprint")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $systemFingerprint = null;

    /**
     * The object type, which is always &#x60;chat.completion.chunk&#x60;.
     *
     * @var string|null
     * @SerializedName("object")
     * @Assert\NotNull()
     * @Assert\Choice({ "chat.completion.chunk" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $object = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->choices = array_key_exists('choices', $data) ? $data['choices'] : $this->choices;
            $this->created = array_key_exists('created', $data) ? $data['created'] : $this->created;
            $this->model = array_key_exists('model', $data) ? $data['model'] : $this->model;
            $this->systemFingerprint = array_key_exists('systemFingerprint', $data) ? $data['systemFingerprint'] : $this->systemFingerprint;
            $this->object = array_key_exists('object', $data) ? $data['object'] : $this->object;
        }
    }

    /**
     * Gets id.
     *
     * @return string|null
     */
    public function getId(): ?string
    {
        return $this->id;
    }



    /**
     * Sets id.
     *
     * @param string|null $id  A unique identifier for the chat completion. Each chunk has the same ID.
     *
     * @return $this
     */
    public function setId(?string $id): self
    {
        $this->id = $id;

        return $this;
    }

    /**
     * Gets choices.
     *
     * @return CreateChatCompletionStreamResponseChoicesInner[]|null
     */
    public function getChoices(): ?array
    {
        return $this->choices;
    }



    /**
     * Sets choices.
     *
     * @param CreateChatCompletionStreamResponseChoicesInner[]|null $choices  A list of chat completion choices. Can be more than one if `n` is greater than 1.
     *
     * @return $this
     */
    public function setChoices(?array $choices): self
    {
        $this->choices = $choices;

        return $this;
    }

    /**
     * Gets created.
     *
     * @return int|null
     */
    public function getCreated(): ?int
    {
        return $this->created;
    }



    /**
     * Sets created.
     *
     * @param int|null $created  The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
     *
     * @return $this
     */
    public function setCreated(?int $created): self
    {
        $this->created = $created;

        return $this;
    }

    /**
     * Gets model.
     *
     * @return string|null
     */
    public function getModel(): ?string
    {
        return $this->model;
    }



    /**
     * Sets model.
     *
     * @param string|null $model  The model to generate the completion.
     *
     * @return $this
     */
    public function setModel(?string $model): self
    {
        $this->model = $model;

        return $this;
    }

    /**
     * Gets systemFingerprint.
     *
     * @return string|null
     */
    public function getSystemFingerprint(): ?string
    {
        return $this->systemFingerprint;
    }



    /**
     * Sets systemFingerprint.
     *
     * @param string|null $systemFingerprint  This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.
     *
     * @return $this
     */
    public function setSystemFingerprint(?string $systemFingerprint = null): self
    {
        $this->systemFingerprint = $systemFingerprint;

        return $this;
    }

    /**
     * Gets object.
     *
     * @return string|null
     */
    public function getObject(): ?string
    {
        return $this->object;
    }



    /**
     * Sets object.
     *
     * @param string|null $object  The object type, which is always `chat.completion.chunk`.
     *
     * @return $this
     */
    public function setObject(?string $object): self
    {
        $this->object = $object;

        return $this;
    }
}


