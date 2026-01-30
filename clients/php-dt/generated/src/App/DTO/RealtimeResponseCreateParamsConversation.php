<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Controls which conversation the response is added to. Currently supports &#x60;auto&#x60; and &#x60;none&#x60;, with &#x60;auto&#x60; as the default value. The &#x60;auto&#x60; value means that the contents of the response will be added to the default conversation. Set this to &#x60;none&#x60; to create an out-of-band response which  will not add items to default conversation.
 */
class RealtimeResponseCreateParamsConversation
{
}
