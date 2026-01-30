<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute.
 */
class RealtimeSessionCreateResponse
{
    /**
     * @DTA\Data(field="client_secret", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeSessionCreateResponseClientSecret::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeSessionCreateResponseClientSecret::class})
     * @var \App\DTO\RealtimeSessionCreateResponseClientSecret|null
     */
    public $client_secret;

    /**
     * The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;].
     * @DTA\Data(field="modalities", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection123::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection123::class})
     * @var \App\DTO\Collection123|null
     */
    public $modalities;

    /**
     * The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good  responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion  into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session.
     * @DTA\Data(field="instructions", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $instructions;

    /**
     * The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;.
     * @DTA\Data(field="voice", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $voice;

    /**
     * The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.
     * @DTA\Data(field="input_audio_format", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $input_audio_format;

    /**
     * The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.
     * @DTA\Data(field="output_audio_format", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $output_audio_format;

    /**
     * @DTA\Data(field="input_audio_transcription", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeSessionInputAudioTranscription::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeSessionInputAudioTranscription::class})
     * @var \App\DTO\RealtimeSessionInputAudioTranscription|null
     */
    public $input_audio_transcription;

    /**
     * @DTA\Data(field="turn_detection", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeSessionCreateResponseTurnDetection::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeSessionCreateResponseTurnDetection::class})
     * @var \App\DTO\RealtimeSessionCreateResponseTurnDetection|null
     */
    public $turn_detection;

    /**
     * Tools (functions) available to the model.
     * @DTA\Data(field="tools", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection124::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection124::class})
     * @var \App\DTO\Collection124|null
     */
    public $tools;

    /**
     * How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function.
     * @DTA\Data(field="tool_choice", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $tool_choice;

    /**
     * Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.
     * @DTA\Data(field="temperature", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $temperature;

    /**
     * @DTA\Data(field="max_response_output_tokens", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeResponseCreateParamsMaxResponseOutputTokens::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeResponseCreateParamsMaxResponseOutputTokens::class})
     * @var \App\DTO\RealtimeResponseCreateParamsMaxResponseOutputTokens|null
     */
    public $max_response_output_tokens;

}
