/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { CreateModerationResponseResultsInner } from './createModerationResponseResultsInner';


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

