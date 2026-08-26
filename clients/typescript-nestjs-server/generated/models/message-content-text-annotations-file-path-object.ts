import { MessageContentTextAnnotationsFilePathObjectFilePath } from './message-content-text-annotations-file-path-object-file-path';


/**
 * A URL for the file that\'s generated when the assistant used the `code_interpreter` tool to generate a file.
 */
export interface MessageContentTextAnnotationsFilePathObject { 
  /**
   * Always `file_path`.
   */
  type: MessageContentTextAnnotationsFilePathObject.TypeEnum;
  /**
   * The text in the message content that needs to be replaced.
   */
  text: string;
  file_path: MessageContentTextAnnotationsFilePathObjectFilePath;
  start_index: number;
  end_index: number;
}
export namespace MessageContentTextAnnotationsFilePathObject {
  export const TypeEnum = {
    FilePath: 'file_path'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


