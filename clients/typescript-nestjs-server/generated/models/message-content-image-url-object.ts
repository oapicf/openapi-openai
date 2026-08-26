import { MessageContentImageUrlObjectImageUrl } from './message-content-image-url-object-image-url';


/**
 * References an image URL in the content of a message.
 */
export interface MessageContentImageUrlObject { 
  /**
   * The type of the content part.
   */
  type: MessageContentImageUrlObject.TypeEnum;
  image_url: MessageContentImageUrlObjectImageUrl;
}
export namespace MessageContentImageUrlObject {
  export const TypeEnum = {
    ImageUrl: 'image_url'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


