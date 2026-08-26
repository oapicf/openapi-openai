import { ChatCompletionRequestMessageContentPartImageImageUrl } from './chat-completion-request-message-content-part-image-image-url';


/**
 * Learn about [image inputs](/docs/guides/vision). 
 */
export interface ChatCompletionRequestMessageContentPartImage { 
  /**
   * The type of the content part.
   */
  type: ChatCompletionRequestMessageContentPartImage.TypeEnum;
  image_url: ChatCompletionRequestMessageContentPartImageImageUrl;
}
export namespace ChatCompletionRequestMessageContentPartImage {
  export const TypeEnum = {
    ImageUrl: 'image_url'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


