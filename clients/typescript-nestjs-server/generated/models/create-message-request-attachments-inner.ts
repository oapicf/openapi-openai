import { CreateMessageRequestAttachmentsInnerToolsInner } from './create-message-request-attachments-inner-tools-inner';


export interface CreateMessageRequestAttachmentsInner { 
  /**
   * The ID of the file to attach to the message.
   */
  file_id?: string;
  /**
   * The tools to add this file to.
   */
  tools?: Array<CreateMessageRequestAttachmentsInnerToolsInner>;
}

