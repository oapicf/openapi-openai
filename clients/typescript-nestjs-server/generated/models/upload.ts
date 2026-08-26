import { OpenAIFile } from './open-ai-file';


/**
 * The Upload object can accept byte chunks in the form of Parts. 
 */
export interface Upload { 
  /**
   * The Upload unique identifier, which can be referenced in API endpoints.
   */
  id: string;
  /**
   * The Unix timestamp (in seconds) for when the Upload was created.
   */
  created_at: number;
  /**
   * The name of the file to be uploaded.
   */
  filename: string;
  /**
   * The intended number of bytes to be uploaded.
   */
  bytes: number;
  /**
   * The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
   */
  purpose: string;
  /**
   * The status of the Upload.
   */
  status: Upload.StatusEnum;
  /**
   * The Unix timestamp (in seconds) for when the Upload was created.
   */
  expires_at: number;
  /**
   * The object type, which is always \"upload\".
   */
  object?: Upload.ObjectEnum;
  file?: OpenAIFile;
}
export namespace Upload {
  export const StatusEnum = {
    Pending: 'pending',
    Completed: 'completed',
    Cancelled: 'cancelled',
    Expired: 'expired'
  } as const;
  export type StatusEnum = typeof StatusEnum[keyof typeof StatusEnum];
  export const ObjectEnum = {
    Upload: 'upload'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


