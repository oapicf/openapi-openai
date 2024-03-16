<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for listFineTuneEvents
 */
class ListFineTuneEventsQueryData
{
    /**
     * Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.
     * @DTA\Data(field="stream", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $stream;

}
