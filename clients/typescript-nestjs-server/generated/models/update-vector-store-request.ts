import { VectorStoreExpirationAfter } from './vector-store-expiration-after';


export interface UpdateVectorStoreRequest { 
  /**
   * The name of the vector store.
   */
  name?: string | null;
  expires_after?: VectorStoreExpirationAfter;
  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   */
  metadata?: object | null;
}

