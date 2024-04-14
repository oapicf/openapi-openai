<?php
/**
 * CreateTranscriptionResponseVerboseJson
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
 * Class representing the CreateTranscriptionResponseVerboseJson model.
 *
 * Represents a verbose json transcription response returned by model, based on the provided input.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateTranscriptionResponseVerboseJson 
{
        /**
     * The language of the input audio.
     *
     * @var string|null
     * @SerializedName("language")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $language = null;

    /**
     * The duration of the input audio.
     *
     * @var string|null
     * @SerializedName("duration")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $duration = null;

    /**
     * The transcribed text.
     *
     * @var string|null
     * @SerializedName("text")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $text = null;

    /**
     * Extracted words and their corresponding timestamps.
     *
     * @var TranscriptionWord[]|null
     * @SerializedName("words")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\TranscriptionWord")
     * })
     * @Type("array<OpenAPI\Server\Model\TranscriptionWord>")
     */
    protected ?array $words = null;

    /**
     * Segments of the transcribed text and their corresponding details.
     *
     * @var TranscriptionSegment[]|null
     * @SerializedName("segments")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\TranscriptionSegment")
     * })
     * @Type("array<OpenAPI\Server\Model\TranscriptionSegment>")
     */
    protected ?array $segments = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->language = array_key_exists('language', $data) ? $data['language'] : $this->language;
            $this->duration = array_key_exists('duration', $data) ? $data['duration'] : $this->duration;
            $this->text = array_key_exists('text', $data) ? $data['text'] : $this->text;
            $this->words = array_key_exists('words', $data) ? $data['words'] : $this->words;
            $this->segments = array_key_exists('segments', $data) ? $data['segments'] : $this->segments;
        }
    }

    /**
     * Gets language.
     *
     * @return string|null
     */
    public function getLanguage(): ?string
    {
        return $this->language;
    }



    /**
     * Sets language.
     *
     * @param string|null $language  The language of the input audio.
     *
     * @return $this
     */
    public function setLanguage(?string $language): self
    {
        $this->language = $language;

        return $this;
    }

    /**
     * Gets duration.
     *
     * @return string|null
     */
    public function getDuration(): ?string
    {
        return $this->duration;
    }



    /**
     * Sets duration.
     *
     * @param string|null $duration  The duration of the input audio.
     *
     * @return $this
     */
    public function setDuration(?string $duration): self
    {
        $this->duration = $duration;

        return $this;
    }

    /**
     * Gets text.
     *
     * @return string|null
     */
    public function getText(): ?string
    {
        return $this->text;
    }



    /**
     * Sets text.
     *
     * @param string|null $text  The transcribed text.
     *
     * @return $this
     */
    public function setText(?string $text): self
    {
        $this->text = $text;

        return $this;
    }

    /**
     * Gets words.
     *
     * @return TranscriptionWord[]|null
     */
    public function getWords(): ?array
    {
        return $this->words;
    }



    /**
     * Sets words.
     *
     * @param TranscriptionWord[]|null $words  Extracted words and their corresponding timestamps.
     *
     * @return $this
     */
    public function setWords(?array $words = null): self
    {
        $this->words = $words;

        return $this;
    }

    /**
     * Gets segments.
     *
     * @return TranscriptionSegment[]|null
     */
    public function getSegments(): ?array
    {
        return $this->segments;
    }



    /**
     * Sets segments.
     *
     * @param TranscriptionSegment[]|null $segments  Segments of the transcribed text and their corresponding details.
     *
     * @return $this
     */
    public function setSegments(?array $segments = null): self
    {
        $this->segments = $segments;

        return $this;
    }
}


