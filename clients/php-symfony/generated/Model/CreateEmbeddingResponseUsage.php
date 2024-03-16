<?php
/**
 * CreateEmbeddingResponseUsage
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
 * Class representing the CreateEmbeddingResponseUsage model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateEmbeddingResponseUsage 
{
        /**
     * @var int|null
     * @SerializedName("prompt_tokens")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $promptTokens = null;

    /**
     * @var int|null
     * @SerializedName("total_tokens")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $totalTokens = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->promptTokens = array_key_exists('promptTokens', $data) ? $data['promptTokens'] : $this->promptTokens;
            $this->totalTokens = array_key_exists('totalTokens', $data) ? $data['totalTokens'] : $this->totalTokens;
        }
    }

    /**
     * Gets promptTokens.
     *
     * @return int|null
     */
    public function getPromptTokens(): ?int
    {
        return $this->promptTokens;
    }



    /**
     * Sets promptTokens.
     *
     * @param int|null $promptTokens
     *
     * @return $this
     */
    public function setPromptTokens(?int $promptTokens): self
    {
        $this->promptTokens = $promptTokens;

        return $this;
    }

    /**
     * Gets totalTokens.
     *
     * @return int|null
     */
    public function getTotalTokens(): ?int
    {
        return $this->totalTokens;
    }



    /**
     * Sets totalTokens.
     *
     * @param int|null $totalTokens
     *
     * @return $this
     */
    public function setTotalTokens(?int $totalTokens): self
    {
        $this->totalTokens = $totalTokens;

        return $this;
    }
}

