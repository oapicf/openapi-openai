import { MessageContentImageUrlObjectImageUrl } from './message-content-image-url-object-image-url';
import { MessageRequestContentTextObject } from './message-request-content-text-object';
import { MessageContentImageFileObject } from './message-content-image-file-object';
import { MessageContentImageUrlObject } from './message-content-image-url-object';
import { MessageContentImageFileObjectImageFile } from './message-content-image-file-object-image-file';


/**
 * @type ArrayOfContentPartsInner
 * @export
 */
export type ArrayOfContentPartsInner = MessageContentImageFileObject | MessageContentImageUrlObject | MessageRequestContentTextObject;

