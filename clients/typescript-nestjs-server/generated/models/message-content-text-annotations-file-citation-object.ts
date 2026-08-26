import { MessageContentTextAnnotationsFileCitationObjectFileCitation } from './message-content-text-annotations-file-citation-object-file-citation';


/**
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.
 */
export interface MessageContentTextAnnotationsFileCitationObject { 
  /**
   * Always `file_citation`.
   */
  type: MessageContentTextAnnotationsFileCitationObject.TypeEnum;
  /**
   * The text in the message content that needs to be replaced.
   */
  text: string;
  file_citation: MessageContentTextAnnotationsFileCitationObjectFileCitation;
  start_index: number;
  end_index: number;
}
export namespace MessageContentTextAnnotationsFileCitationObject {
  export const TypeEnum = {
    FileCitation: 'file_citation'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


