<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Configuration for turn detection. Can be set to &#x60;null&#x60; to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech.
 */
class RealtimeSessionCreateRequestTurnDetection
{
    /**
     * Type of turn detection, only &#x60;server_vad&#x60; is currently supported.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.
     * @DTA\Data(field="threshold", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $threshold;

    /**
     * Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.
     * @DTA\Data(field="prefix_padding_ms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $prefix_padding_ms;

    /**
     * Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.
     * @DTA\Data(field="silence_duration_ms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $silence_duration_ms;

    /**
     * Whether or not to automatically generate a response when VAD is enabled. &#x60;true&#x60; by default.
     * @DTA\Data(field="create_response", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $create_response;

}
