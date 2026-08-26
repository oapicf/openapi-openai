import { CreateMessageRequest } from './create-message-request';
import { CreateThreadRequestToolResources } from './create-thread-request-tool-resources';


export interface CreateThreadRequest { 
  /**
   * A list of [messages](/docs/api-reference/messages) to start the thread with.
   */
  messages?: Array<CreateMessageRequest>;
  tool_resources?: CreateThreadRequestToolResources | null;
  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   */
  metadata?: object | null;
}

