<?php
/**
 * TranscriptionWord
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
 * Class representing the TranscriptionWord model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class TranscriptionWord 
{
        /**
     * The text content of the word.
     *
     * @var string|null
     * @SerializedName("word")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $word = null;

    /**
     * Start time of the word in seconds.
     *
     * @var float|null
     * @SerializedName("start")
     * @Assert\NotNull()
     * @Assert\Type("float")
     * @Type("float")
     */
    protected ?float $start = null;

    /**
     * End time of the word in seconds.
     *
     * @var float|null
     * @SerializedName("end")
     * @Assert\NotNull()
     * @Assert\Type("float")
     * @Type("float")
     */
    protected ?float $end = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->word = array_key_exists('word', $data) ? $data['word'] : $this->word;
            $this->start = array_key_exists('start', $data) ? $data['start'] : $this->start;
            $this->end = array_key_exists('end', $data) ? $data['end'] : $this->end;
        }
    }

    /**
     * Gets word.
     *
     * @return string|null
     */
    public function getWord(): ?string
    {
        return $this->word;
    }



    /**
     * Sets word.
     *
     * @param string|null $word  The text content of the word.
     *
     * @return $this
     */
    public function setWord(?string $word): self
    {
        $this->word = $word;

        return $this;
    }

    /**
     * Gets start.
     *
     * @return float|null
     */
    public function getStart(): ?float
    {
        return $this->start;
    }



    /**
     * Sets start.
     *
     * @param float|null $start  Start time of the word in seconds.
     *
     * @return $this
     */
    public function setStart(?float $start): self
    {
        $this->start = $start;

        return $this;
    }

    /**
     * Gets end.
     *
     * @return float|null
     */
    public function getEnd(): ?float
    {
        return $this->end;
    }



    /**
     * Sets end.
     *
     * @param float|null $end  End time of the word in seconds.
     *
     * @return $this
     */
    public function setEnd(?float $end): self
    {
        $this->end = $end;

        return $this;
    }
}


