import { MessageContentImageUrlObjectImageUrl } from './message-content-image-url-object-image-url';
import { MessageContentRefusalObject } from './message-content-refusal-object';
import { MessageContentImageFileObject } from './message-content-image-file-object';
import { MessageContentImageUrlObject } from './message-content-image-url-object';
import { MessageContentTextObjectText } from './message-content-text-object-text';
import { MessageContentImageFileObjectImageFile } from './message-content-image-file-object-image-file';
import { MessageContentTextObject } from './message-content-text-object';


/**
 * @type MessageObjectContentInner
 * @export
 */
export type MessageObjectContentInner = MessageContentImageFileObject | MessageContentImageUrlObject | MessageContentRefusalObject | MessageContentTextObject;

