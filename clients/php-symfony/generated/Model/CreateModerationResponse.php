<?php
/**
 * CreateModerationResponse
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
 * Class representing the CreateModerationResponse model.
 *
 * Represents if a given text input is potentially harmful.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateModerationResponse 
{
        /**
     * The unique identifier for the moderation request.
     *
     * @var string|null
     * @SerializedName("id")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $id = null;

    /**
     * The model used to generate the moderation results.
     *
     * @var string|null
     * @SerializedName("model")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $model = null;

    /**
     * A list of moderation objects.
     *
     * @var CreateModerationResponseResultsInner[]|null
     * @SerializedName("results")
     * @Type("array<OpenAPI\Server\Model\CreateModerationResponseResultsInner>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\CreateModerationResponseResultsInner"),
    ])]
    protected ?array $results = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->model = array_key_exists('model', $data) ? $data['model'] : $this->model;
            $this->results = array_key_exists('results', $data) ? $data['results'] : $this->results;
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
    * @param string|null $id  The unique identifier for the moderation request.
    *
    * @return $this
    */
    public function setId(?string $id): self
    {
        $this->id = $id;

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
    * @param string|null $model  The model used to generate the moderation results.
    *
    * @return $this
    */
    public function setModel(?string $model): self
    {
        $this->model = $model;

        return $this;
    }




    /**
     * Gets results.
     *
     * @return CreateModerationResponseResultsInner[]|null
     */
    public function getResults(): ?array
    {
        return $this->results;
    }

    /**
    * Sets results.
    *
    * @param CreateModerationResponseResultsInner[]|null $results  A list of moderation objects.
    *
    * @return $this
    */
    public function setResults(?array $results): self
    {
        $this->results = $results;

        return $this;
    }



}


