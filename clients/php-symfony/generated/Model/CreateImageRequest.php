<?php
/**
 * CreateImageRequest
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
 * Class representing the CreateImageRequest model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateImageRequest 
{
        /**
     * A text description of the desired image(s). The maximum length is 1000 characters for &#x60;dall-e-2&#x60; and 4000 characters for &#x60;dall-e-3&#x60;.
     *
     * @var string|null
     * @SerializedName("prompt")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $prompt = null;

    /**
     * @var CreateImageRequestModel|null
     * @SerializedName("model")
     * @Assert\Type("OpenAPI\Server\Model\CreateImageRequestModel")
     * @Type("OpenAPI\Server\Model\CreateImageRequestModel")
     */
    protected ?CreateImageRequestModel $model = null;

    /**
     * The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.
     *
     * @var int|null
     * @SerializedName("n")
     * @Assert\Type("int")
     * @Type("int")
     * @Assert\GreaterThanOrEqual(1)
     * @Assert\LessThanOrEqual(10)
     */
    protected ?int $n = 1;

    /**
     * The quality of the image that will be generated. &#x60;hd&#x60; creates images with finer details and greater consistency across the image. This param is only supported for &#x60;dall-e-3&#x60;.
     *
     * @var string|null
     * @SerializedName("quality")
     * @Assert\Choice({ "standard", "hd" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $quality = 'standard';

    /**
     * The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
     *
     * @var string|null
     * @SerializedName("response_format")
     * @Assert\Choice({ "url", "b64_json" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $responseFormat = 'url';

    /**
     * The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60; for &#x60;dall-e-2&#x60;. Must be one of &#x60;1024x1024&#x60;, &#x60;1792x1024&#x60;, or &#x60;1024x1792&#x60; for &#x60;dall-e-3&#x60; models.
     *
     * @var string|null
     * @SerializedName("size")
     * @Assert\Choice({ "256x256", "512x512", "1024x1024", "1792x1024", "1024x1792" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $size = '1024x1024';

    /**
     * The style of the generated images. Must be one of &#x60;vivid&#x60; or &#x60;natural&#x60;. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for &#x60;dall-e-3&#x60;.
     *
     * @var string|null
     * @SerializedName("style")
     * @Assert\Choice({ "vivid", "natural" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $style = 'vivid';

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     *
     * @var string|null
     * @SerializedName("user")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $user = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->prompt = array_key_exists('prompt', $data) ? $data['prompt'] : $this->prompt;
            $this->model = array_key_exists('model', $data) ? $data['model'] : $this->model;
            $this->n = array_key_exists('n', $data) ? $data['n'] : $this->n;
            $this->quality = array_key_exists('quality', $data) ? $data['quality'] : $this->quality;
            $this->responseFormat = array_key_exists('responseFormat', $data) ? $data['responseFormat'] : $this->responseFormat;
            $this->size = array_key_exists('size', $data) ? $data['size'] : $this->size;
            $this->style = array_key_exists('style', $data) ? $data['style'] : $this->style;
            $this->user = array_key_exists('user', $data) ? $data['user'] : $this->user;
        }
    }

    /**
     * Gets prompt.
     *
     * @return string|null
     */
    public function getPrompt(): ?string
    {
        return $this->prompt;
    }



    /**
     * Sets prompt.
     *
     * @param string|null $prompt  A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
     *
     * @return $this
     */
    public function setPrompt(?string $prompt): self
    {
        $this->prompt = $prompt;

        return $this;
    }

    /**
     * Gets model.
     *
     * @return CreateImageRequestModel|null
     */
    public function getModel(): ?CreateImageRequestModel
    {
        return $this->model;
    }



    /**
     * Sets model.
     *
     * @param CreateImageRequestModel|null $model
     *
     * @return $this
     */
    public function setModel(?CreateImageRequestModel $model = null): self
    {
        $this->model = $model;

        return $this;
    }

    /**
     * Gets n.
     *
     * @return int|null
     */
    public function getN(): ?int
    {
        return $this->n;
    }



    /**
     * Sets n.
     *
     * @param int|null $n  The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
     *
     * @return $this
     */
    public function setN(?int $n = null): self
    {
        $this->n = $n;

        return $this;
    }

    /**
     * Gets quality.
     *
     * @return string|null
     */
    public function getQuality(): ?string
    {
        return $this->quality;
    }



    /**
     * Sets quality.
     *
     * @param string|null $quality  The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
     *
     * @return $this
     */
    public function setQuality(?string $quality = null): self
    {
        $this->quality = $quality;

        return $this;
    }

    /**
     * Gets responseFormat.
     *
     * @return string|null
     */
    public function getResponseFormat(): ?string
    {
        return $this->responseFormat;
    }



    /**
     * Sets responseFormat.
     *
     * @param string|null $responseFormat  The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
     *
     * @return $this
     */
    public function setResponseFormat(?string $responseFormat = null): self
    {
        $this->responseFormat = $responseFormat;

        return $this;
    }

    /**
     * Gets size.
     *
     * @return string|null
     */
    public function getSize(): ?string
    {
        return $this->size;
    }



    /**
     * Sets size.
     *
     * @param string|null $size  The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
     *
     * @return $this
     */
    public function setSize(?string $size = null): self
    {
        $this->size = $size;

        return $this;
    }

    /**
     * Gets style.
     *
     * @return string|null
     */
    public function getStyle(): ?string
    {
        return $this->style;
    }



    /**
     * Sets style.
     *
     * @param string|null $style  The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
     *
     * @return $this
     */
    public function setStyle(?string $style = null): self
    {
        $this->style = $style;

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

