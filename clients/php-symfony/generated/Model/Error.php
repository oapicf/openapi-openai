<?php
/**
 * Error
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
 * Class representing the Error model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class Error 
{
        /**
     * @var string|null
     * @SerializedName("code")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $code = null;

    /**
     * @var string|null
     * @SerializedName("message")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $message = null;

    /**
     * @var string|null
     * @SerializedName("param")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $param = null;

    /**
     * @var string|null
     * @SerializedName("type")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $type = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->code = array_key_exists('code', $data) ? $data['code'] : $this->code;
            $this->message = array_key_exists('message', $data) ? $data['message'] : $this->message;
            $this->param = array_key_exists('param', $data) ? $data['param'] : $this->param;
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
        }
    }

    /**
     * Gets code.
     *
     * @return string|null
     */
    public function getCode(): ?string
    {
        return $this->code;
    }

    /**
    * Sets code.
    *
    * @param string|null $code
    *
    * @return $this
    */
    public function setCode(?string $code): self
    {
        $this->code = $code;

        return $this;
    }




    /**
     * Gets message.
     *
     * @return string|null
     */
    public function getMessage(): ?string
    {
        return $this->message;
    }

    /**
    * Sets message.
    *
    * @param string|null $message
    *
    * @return $this
    */
    public function setMessage(?string $message): self
    {
        $this->message = $message;

        return $this;
    }




    /**
     * Gets param.
     *
     * @return string|null
     */
    public function getParam(): ?string
    {
        return $this->param;
    }

    /**
    * Sets param.
    *
    * @param string|null $param
    *
    * @return $this
    */
    public function setParam(?string $param): self
    {
        $this->param = $param;

        return $this;
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
    * @param string|null $type
    *
    * @return $this
    */
    public function setType(?string $type): self
    {
        $this->type = $type;

        return $this;
    }



}


