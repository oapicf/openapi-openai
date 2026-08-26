import { MessageDeltaContentImageFileObjectImageFile } from './message-delta-content-image-file-object-image-file';
import { MessageDeltaContentImageUrlObject } from './message-delta-content-image-url-object';
import { MessageDeltaContentRefusalObject } from './message-delta-content-refusal-object';
import { MessageDeltaContentImageFileObject } from './message-delta-content-image-file-object';
import { MessageDeltaContentImageUrlObjectImageUrl } from './message-delta-content-image-url-object-image-url';
import { MessageDeltaContentTextObjectText } from './message-delta-content-text-object-text';
import { MessageDeltaContentTextObject } from './message-delta-content-text-object';


/**
 * @type MessageDeltaObjectDeltaContentInner
 * @export
 */
export type MessageDeltaObjectDeltaContentInner = MessageDeltaContentImageFileObject | MessageDeltaContentImageUrlObject | MessageDeltaContentRefusalObject | MessageDeltaContentTextObject;

