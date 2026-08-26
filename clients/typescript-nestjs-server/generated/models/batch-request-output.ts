import { BatchRequestOutputResponse } from './batch-request-output-response';
import { BatchRequestOutputError } from './batch-request-output-error';


/**
 * The per-line object of the batch output and error files
 */
export interface BatchRequestOutput { 
  id?: string;
  /**
   * A developer-provided per-request id that will be used to match outputs to inputs.
   */
  custom_id?: string;
  response?: BatchRequestOutputResponse | null;
  error?: BatchRequestOutputError | null;
}

