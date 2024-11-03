<?php
/**
 * CreateEmbeddingRequest
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
 * Class representing the CreateEmbeddingRequest model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateEmbeddingRequest 
{
        /**
     * @var CreateEmbeddingRequestInput|null
     * @SerializedName("input")
     * @Type("OpenAPI\Server\Model\CreateEmbeddingRequestInput")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\CreateEmbeddingRequestInput")]
    protected ?CreateEmbeddingRequestInput $input = null;

    /**
     * @var CreateEmbeddingRequestModel|null
     * @SerializedName("model")
     * @Type("OpenAPI\Server\Model\CreateEmbeddingRequestModel")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\CreateEmbeddingRequestModel")]
    protected ?CreateEmbeddingRequestModel $model = null;

    /**
     * The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/).
     *
     * @var string|null
     * @SerializedName("encoding_format")
     * @Type("string")
    */
    #[Assert\Choice(["float", "base64"])]
    #[Assert\Type("string")]
    protected ?string $encodingFormat = 'float';

    /**
     * The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models.
     *
     * @var int|null
     * @SerializedName("dimensions")
     * @Type("int")
    */
    #[Assert\Type("int")]
    #[Assert\GreaterThanOrEqual(1)]
    protected ?int $dimensions = null;

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     *
     * @var string|null
     * @SerializedName("user")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $user = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->input = array_key_exists('input', $data) ? $data['input'] : $this->input;
            $this->model = array_key_exists('model', $data) ? $data['model'] : $this->model;
            $this->encodingFormat = array_key_exists('encodingFormat', $data) ? $data['encodingFormat'] : $this->encodingFormat;
            $this->dimensions = array_key_exists('dimensions', $data) ? $data['dimensions'] : $this->dimensions;
            $this->user = array_key_exists('user', $data) ? $data['user'] : $this->user;
        }
    }

    /**
     * Gets input.
     *
     * @return CreateEmbeddingRequestInput|null
     */
    public function getInput(): ?CreateEmbeddingRequestInput
    {
        return $this->input;
    }

    /**
    * Sets input.
    *
    * @param CreateEmbeddingRequestInput|null $input
    *
    * @return $this
    */
    public function setInput(?CreateEmbeddingRequestInput $input): self
    {
        $this->input = $input;

        return $this;
    }




    /**
     * Gets model.
     *
     * @return CreateEmbeddingRequestModel|null
     */
    public function getModel(): ?CreateEmbeddingRequestModel
    {
        return $this->model;
    }

    /**
    * Sets model.
    *
    * @param CreateEmbeddingRequestModel|null $model
    *
    * @return $this
    */
    public function setModel(?CreateEmbeddingRequestModel $model): self
    {
        $this->model = $model;

        return $this;
    }




    /**
     * Gets encodingFormat.
     *
     * @return string|null
     */
    public function getEncodingFormat(): ?string
    {
        return $this->encodingFormat;
    }

    /**
    * Sets encodingFormat.
    *
    * @param string|null $encodingFormat  The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
    *
    * @return $this
    */
    public function setEncodingFormat(?string $encodingFormat = null): self
    {
        $this->encodingFormat = $encodingFormat;

        return $this;
    }




    /**
     * Gets dimensions.
     *
     * @return int|null
     */
    public function getDimensions(): ?int
    {
        return $this->dimensions;
    }

    /**
    * Sets dimensions.
    *
    * @param int|null $dimensions  The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.
    *
    * @return $this
    */
    public function setDimensions(?int $dimensions = null): self
    {
        $this->dimensions = $dimensions;

        return $this;
    }




    /**
     * Gets user.
     *
     * @return string|null
     */
    public function getUser(): ?string
    {
        return $this->user;
    }

    /**
    * Sets user.
    *
    * @param string|null $user  A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
    *
    * @return $this
    */
    public function setUser(?string $user = null): self
    {
        $this->user = $user;

        return $this;
    }



}


