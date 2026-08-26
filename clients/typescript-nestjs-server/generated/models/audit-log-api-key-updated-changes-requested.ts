

/**
 * The payload used to update the API key.
 */
export interface AuditLogApiKeyUpdatedChangesRequested { 
  /**
   * A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
   */
  scopes?: Array<string>;
}

