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
  CreateImageEditRequestModel,
  CreateImageRequest,
  ImagesResponse,
} from './models';

/**
 * createImage - parameters interface
 */
export interface ICreateImageParams {
  createImageRequest: CreateImageRequest;
}

/**
 * createImageEdit - parameters interface
 */
export interface ICreateImageEditParams {
  image: File;
  prompt: string;
  mask?: File;
  model?: CreateImageEditRequestModel;
  n?: number;
  size?: string;
  responseFormat?: string;
  user?: string;
}

/**
 * createImageVariation - parameters interface
 */
export interface ICreateImageVariationParams {
  image: File;
  model?: CreateImageEditRequestModel;
  n?: number;
  responseFormat?: string;
  size?: string;
  user?: string;
}

/**
 * ImagesApi - API class
 */
@autoinject()
export class ImagesApi extends Api {

  /**
   * Creates a new ImagesApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Creates an image given a prompt.
   * @param params.createImageRequest 
   */
  async createImage(params: ICreateImageParams): Promise<ImagesResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('createImage', params, 'createImageRequest');

    // Create URL to call
    const url = `${this.basePath}/images/generations`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['createImageRequest'] || {}))

      // Authentication 'ApiKeyAuth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Creates an edited or extended image given an original image and a prompt.
   * @param params.image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
   * @param params.prompt A text description of the desired image(s). The maximum length is 1000 characters.
   * @param params.mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
   * @param params.model 
   * @param params.n The number of images to generate. Must be between 1 and 10.
   * @param params.size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
   * @param params.responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
   * @param params.user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   */
  async createImageEdit(params: ICreateImageEditParams): Promise<ImagesResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('createImageEdit', params, 'image');
    this.ensureParamIsSet('createImageEdit', params, 'prompt');

    // Create URL to call
    const url = `${this.basePath}/images/edits`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode form parameters
      .withHeader('content-type', 'application/x-www-form-urlencoded')
      .withContent(this.queryString({ 
        'image': params['image'],
        'prompt': params['prompt'],
        'mask': params['mask'],
        'model': params['model'],
        'n': params['n'],
        'size': params['size'],
        'response_format': params['responseFormat'],
        'user': params['user'],
      }))

      // Authentication 'ApiKeyAuth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Creates a variation of a given image.
   * @param params.image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
   * @param params.model 
   * @param params.n The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.
   * @param params.responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
   * @param params.size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
   * @param params.user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   */
  async createImageVariation(params: ICreateImageVariationParams): Promise<ImagesResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('createImageVariation', params, 'image');

    // Create URL to call
    const url = `${this.basePath}/images/variations`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode form parameters
      .withHeader('content-type', 'application/x-www-form-urlencoded')
      .withContent(this.queryString({ 
        'image': params['image'],
        'model': params['model'],
        'n': params['n'],
        'response_format': params['responseFormat'],
        'size': params['size'],
        'user': params['user'],
      }))

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

