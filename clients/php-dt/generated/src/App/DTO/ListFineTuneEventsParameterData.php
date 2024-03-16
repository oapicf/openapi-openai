<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for listFineTuneEvents
 */
class ListFineTuneEventsParameterData
{
    /**
     * Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.
     * @DTA\Data(subset="query", field="stream", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $stream = null;

    /**
     * The ID of the fine-tune job to get events for.
     * @DTA\Data(subset="path", field="fine_tune_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $fine_tune_id = null;

}
