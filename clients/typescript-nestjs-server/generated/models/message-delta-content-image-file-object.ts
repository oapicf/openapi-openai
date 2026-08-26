import { MessageDeltaContentImageFileObjectImageFile } from './message-delta-content-image-file-object-image-file';


/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */
export interface MessageDeltaContentImageFileObject { 
  /**
   * The index of the content part in the message.
   */
  index: number;
  /**
   * Always `image_file`.
   */
  type: MessageDeltaContentImageFileObject.TypeEnum;
  image_file?: MessageDeltaContentImageFileObjectImageFile;
}
export namespace MessageDeltaContentImageFileObject {
  export const TypeEnum = {
    ImageFile: 'image_file'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


