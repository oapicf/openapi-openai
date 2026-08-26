import { MessageStreamEventOneOf2 } from './message-stream-event-one-of2';
import { MessageStreamEventOneOf3 } from './message-stream-event-one-of3';
import { MessageStreamEventOneOf4 } from './message-stream-event-one-of4';
import { MessageStreamEventOneOf } from './message-stream-event-one-of';
import { MessageObject } from './message-object';
import { MessageStreamEventOneOf1 } from './message-stream-event-one-of1';


/**
 * @type MessageStreamEvent
 * @export
 */
export type MessageStreamEvent = MessageStreamEventOneOf | MessageStreamEventOneOf1 | MessageStreamEventOneOf2 | MessageStreamEventOneOf3 | MessageStreamEventOneOf4;

