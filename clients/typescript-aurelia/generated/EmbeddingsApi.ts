/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  CreateEmbeddingRequest,
  CreateEmbeddingResponse,
} from './models';

/**
 * createEmbedding - parameters interface
 */
export interface ICreateEmbeddingParams {
  createEmbeddingRequest: CreateEmbeddingRequest;
}

/**
 * EmbeddingsApi - API class
 */
@autoinject()
export class EmbeddingsApi extends Api {

  /**
   * Creates a new EmbeddingsApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Creates an embedding vector representing the input text.
   * @param params.createEmbeddingRequest 
   */
  async createEmbedding(params: ICreateEmbeddingParams): Promise<CreateEmbeddingResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('createEmbedding', params, 'createEmbeddingRequest');

    // Create URL to call
    const url = `${this.basePath}/embeddings`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['createEmbeddingRequest'] || {}))

      // Authentication 'ApiKeyAuth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}

