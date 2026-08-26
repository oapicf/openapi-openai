import { MessageContentTextObjectTextAnnotationsInner } from './message-content-text-object-text-annotations-inner';


export interface MessageContentTextObjectText { 
  /**
   * The data that makes up the text.
   */
  value: string;
  annotations: Array<MessageContentTextObjectTextAnnotationsInner>;
}

