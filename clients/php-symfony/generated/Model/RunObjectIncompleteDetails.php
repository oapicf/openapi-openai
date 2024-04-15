<?php
/**
 * RunObjectIncompleteDetails
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
 * Class representing the RunObjectIncompleteDetails model.
 *
 * Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class RunObjectIncompleteDetails 
{
        /**
     * The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
     *
     * @var string|null
     * @SerializedName("reason")
     * @Assert\Choice({ "max_completion_tokens", "max_prompt_tokens" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $reason = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->reason = array_key_exists('reason', $data) ? $data['reason'] : $this->reason;
        }
    }

    /**
     * Gets reason.
     *
     * @return string|null
     */
    public function getReason(): ?string
    {
        return $this->reason;
    }



    /**
     * Sets reason.
     *
     * @param string|null $reason  The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
     *
     * @return $this
     */
    public function setReason(?string $reason = null): self
    {
        $this->reason = $reason;

        return $this;
    }
}

