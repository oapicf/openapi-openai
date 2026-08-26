import { CreateModerationRequestInputOneOfInnerOneOfImageUrl } from './create-moderation-request-input-one-of-inner-one-of-image-url';


/**
 * An object describing an image to classify.
 */
export interface CreateModerationRequestInputOneOfInnerOneOf { 
  /**
   * Always `image_url`.
   */
  type: CreateModerationRequestInputOneOfInnerOneOf.TypeEnum;
  image_url: CreateModerationRequestInputOneOfInnerOneOfImageUrl;
}
export namespace CreateModerationRequestInputOneOfInnerOneOf {
  export const TypeEnum = {
    ImageUrl: 'image_url'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


