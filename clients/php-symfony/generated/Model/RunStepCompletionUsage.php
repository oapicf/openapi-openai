<?php
/**
 * RunStepCompletionUsage
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
 * Class representing the RunStepCompletionUsage model.
 *
 * Usage statistics related to the run step. This value will be &#x60;null&#x60; while the run step&#39;s status is &#x60;in_progress&#x60;.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class RunStepCompletionUsage 
{
        /**
     * Number of completion tokens used over the course of the run step.
     *
     * @var int|null
     * @SerializedName("completion_tokens")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $completionTokens = null;

    /**
     * Number of prompt tokens used over the course of the run step.
     *
     * @var int|null
     * @SerializedName("prompt_tokens")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $promptTokens = null;

    /**
     * Total number of tokens used (prompt + completion).
     *
     * @var int|null
     * @SerializedName("total_tokens")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $totalTokens = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->completionTokens = array_key_exists('completionTokens', $data) ? $data['completionTokens'] : $this->completionTokens;
            $this->promptTokens = array_key_exists('promptTokens', $data) ? $data['promptTokens'] : $this->promptTokens;
            $this->totalTokens = array_key_exists('totalTokens', $data) ? $data['totalTokens'] : $this->totalTokens;
        }
    }

    /**
     * Gets completionTokens.
     *
     * @return int|null
     */
    public function getCompletionTokens(): ?int
    {
        return $this->completionTokens;
    }

    /**
    * Sets completionTokens.
    *
    * @param int|null $completionTokens  Number of completion tokens used over the course of the run step.
    *
    * @return $this
    */
    public function setCompletionTokens(?int $completionTokens): self
    {
        $this->completionTokens = $completionTokens;

        return $this;
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
    * @param int|null $promptTokens  Number of prompt tokens used over the course of the run step.
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
    * @param int|null $totalTokens  Total number of tokens used (prompt + completion).
    *
    * @return $this
    */
    public function setTotalTokens(?int $totalTokens): self
    {
        $this->totalTokens = $totalTokens;

        return $this;
    }



}


