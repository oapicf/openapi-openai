<?php
/**
 * RunStepDeltaObject
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
 * Class representing the RunStepDeltaObject model.
 *
 * Represents a run step delta i.e. any changed fields on a run step during streaming.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class RunStepDeltaObject 
{
        /**
     * The identifier of the run step, which can be referenced in API endpoints.
     *
     * @var string|null
     * @SerializedName("id")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $id = null;

    /**
     * The object type, which is always &#x60;thread.run.step.delta&#x60;.
     *
     * @var string|null
     * @SerializedName("object")
     * @Assert\NotNull()
     * @Assert\Choice({ "thread.run.step.delta" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $object = null;

    /**
     * @var RunStepDeltaObjectDelta|null
     * @SerializedName("delta")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\Type("OpenAPI\Server\Model\RunStepDeltaObjectDelta")
     * @Type("OpenAPI\Server\Model\RunStepDeltaObjectDelta")
     */
    protected ?RunStepDeltaObjectDelta $delta = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->object = array_key_exists('object', $data) ? $data['object'] : $this->object;
            $this->delta = array_key_exists('delta', $data) ? $data['delta'] : $this->delta;
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
     * @param string|null $id  The identifier of the run step, which can be referenced in API endpoints.
     *
     * @return $this
     */
    public function setId(?string $id): self
    {
        $this->id = $id;

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
     * @param string|null $object  The object type, which is always `thread.run.step.delta`.
     *
     * @return $this
     */
    public function setObject(?string $object): self
    {
        $this->object = $object;

        return $this;
    }

    /**
     * Gets delta.
     *
     * @return RunStepDeltaObjectDelta|null
     */
    public function getDelta(): ?RunStepDeltaObjectDelta
    {
        return $this->delta;
    }



    /**
     * Sets delta.
     *
     * @param RunStepDeltaObjectDelta|null $delta
     *
     * @return $this
     */
    public function setDelta(?RunStepDeltaObjectDelta $delta): self
    {
        $this->delta = $delta;

        return $this;
    }
}

