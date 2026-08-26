import { CreateModerationResponseResultsInner } from './create-moderation-response-results-inner';


/**
 * Represents if a given text input is potentially harmful.
 */
export interface CreateModerationResponse { 
  /**
   * The unique identifier for the moderation request.
   */
  id: string;
  /**
   * The model used to generate the moderation results.
   */
  model: string;
  /**
   * A list of moderation objects.
   */
  results: Array<CreateModerationResponseResultsInner>;
}

