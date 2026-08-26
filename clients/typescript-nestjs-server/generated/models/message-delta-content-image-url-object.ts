import { MessageDeltaContentImageUrlObjectImageUrl } from './message-delta-content-image-url-object-image-url';


/**
 * References an image URL in the content of a message.
 */
export interface MessageDeltaContentImageUrlObject { 
  /**
   * The index of the content part in the message.
   */
  index: number;
  /**
   * Always `image_url`.
   */
  type: MessageDeltaContentImageUrlObject.TypeEnum;
  image_url?: MessageDeltaContentImageUrlObjectImageUrl;
}
export namespace MessageDeltaContentImageUrlObject {
  export const TypeEnum = {
    ImageUrl: 'image_url'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


