<?php
/**
 * RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
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
 * Class representing the RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner 
{
        /**
     * Always &#x60;logs&#x60;.
     *
     * @var string|null
     * @SerializedName("type")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["logs", "image"])]
    #[Assert\Type("string")]
    protected ?string $type = null;

    /**
     * The text output from the Code Interpreter tool call.
     *
     * @var string|null
     * @SerializedName("logs")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $logs = null;

    /**
     * @var RunStepDetailsToolCallsCodeOutputImageObjectImage|null
     * @SerializedName("image")
     * @Type("OpenAPI\Server\Model\RunStepDetailsToolCallsCodeOutputImageObjectImage")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\RunStepDetailsToolCallsCodeOutputImageObjectImage")]
    protected ?RunStepDetailsToolCallsCodeOutputImageObjectImage $image = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
            $this->logs = array_key_exists('logs', $data) ? $data['logs'] : $this->logs;
            $this->image = array_key_exists('image', $data) ? $data['image'] : $this->image;
        }
    }

    /**
     * Gets type.
     *
     * @return string|null
     */
    public function getType(): ?string
    {
        return $this->type;
    }

    /**
    * Sets type.
    *
    * @param string|null $type  Always `logs`.
    *
    * @return $this
    */
    public function setType(?string $type): self
    {
        $this->type = $type;

        return $this;
    }




    /**
     * Gets logs.
     *
     * @return string|null
     */
    public function getLogs(): ?string
    {
        return $this->logs;
    }

    /**
    * Sets logs.
    *
    * @param string|null $logs  The text output from the Code Interpreter tool call.
    *
    * @return $this
    */
    public function setLogs(?string $logs): self
    {
        $this->logs = $logs;

        return $this;
    }




    /**
     * Gets image.
     *
     * @return RunStepDetailsToolCallsCodeOutputImageObjectImage|null
     */
    public function getImage(): ?RunStepDetailsToolCallsCodeOutputImageObjectImage
    {
        return $this->image;
    }

    /**
    * Sets image.
    *
    * @param RunStepDetailsToolCallsCodeOutputImageObjectImage|null $image
    *
    * @return $this
    */
    public function setImage(?RunStepDetailsToolCallsCodeOutputImageObjectImage $image): self
    {
        $this->image = $image;

        return $this;
    }



}


