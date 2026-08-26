import { MessageContentImageFileObjectImageFile } from './message-content-image-file-object-image-file';


/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */
export interface MessageContentImageFileObject { 
  /**
   * Always `image_file`.
   */
  type: MessageContentImageFileObject.TypeEnum;
  image_file: MessageContentImageFileObjectImageFile;
}
export namespace MessageContentImageFileObject {
  export const TypeEnum = {
    ImageFile: 'image_file'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


