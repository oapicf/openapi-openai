

/**
 * The payload used to create the API key.
 */
export interface AuditLogApiKeyCreatedData { 
  /**
   * A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
   */
  scopes?: Array<string>;
}

