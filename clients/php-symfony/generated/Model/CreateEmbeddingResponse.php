<?php
/**
 * CreateEmbeddingResponse
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
 * Class representing the CreateEmbeddingResponse model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateEmbeddingResponse 
{
        /**
     * @var string|null
     * @SerializedName("object")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $object = null;

    /**
     * @var string|null
     * @SerializedName("model")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $model = null;

    /**
     * @var CreateEmbeddingResponseDataInner[]|null
     * @SerializedName("data")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\CreateEmbeddingResponseDataInner")
     * })
     * @Type("array<OpenAPI\Server\Model\CreateEmbeddingResponseDataInner>")
     */
    protected ?array $data = null;

    /**
     * @var CreateEmbeddingResponseUsage|null
     * @SerializedName("usage")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\Type("OpenAPI\Server\Model\CreateEmbeddingResponseUsage")
     * @Type("OpenAPI\Server\Model\CreateEmbeddingResponseUsage")
     */
    protected ?CreateEmbeddingResponseUsage $usage = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->object = array_key_exists('object', $data) ? $data['object'] : $this->object;
            $this->model = array_key_exists('model', $data) ? $data['model'] : $this->model;
            $this->data = array_key_exists('data', $data) ? $data['data'] : $this->data;
            $this->usage = array_key_exists('usage', $data) ? $data['usage'] : $this->usage;
        }
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
     * @param string|null $object
     *
     * @return $this
     */
    public function setObject(?string $object): self
    {
        $this->object = $object;

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
     * @param string|null $model
     *
     * @return $this
     */
    public function setModel(?string $model): self
    {
        $this->model = $model;

        return $this;
    }

    /**
     * Gets data.
     *
     * @return CreateEmbeddingResponseDataInner[]|null
     */
    public function getData(): ?array
    {
        return $this->data;
    }



    /**
     * Sets data.
     *
     * @param CreateEmbeddingResponseDataInner[]|null $data
     *
     * @return $this
     */
    public function setData(?array $data): self
    {
        $this->data = $data;

        return $this;
    }

    /**
     * Gets usage.
     *
     * @return CreateEmbeddingResponseUsage|null
     */
    public function getUsage(): ?CreateEmbeddingResponseUsage
    {
        return $this->usage;
    }



    /**
     * Sets usage.
     *
     * @param CreateEmbeddingResponseUsage|null $usage
     *
     * @return $this
     */
    public function setUsage(?CreateEmbeddingResponseUsage $usage): self
    {
        $this->usage = $usage;

        return $this;
    }
}

