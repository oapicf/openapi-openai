/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { CreateImageRequestModel } from './createImageRequestModel';


export interface CreateImageRequest { 
    /**
     * A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
     */
    prompt: string;
    model?: CreateImageRequestModel | null;
    /**
     * The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
     */
    n?: number | null;
    /**
     * The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
     */
    quality?: CreateImageRequest.QualityEnum;
    /**
     * The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
     */
    response_format?: CreateImageRequest.ResponseFormatEnum | null;
    /**
     * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
     */
    size?: CreateImageRequest.SizeEnum | null;
    /**
     * The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
     */
    style?: CreateImageRequest.StyleEnum | null;
    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     */
    user?: string;
}
export namespace CreateImageRequest {
    export type QualityEnum = 'standard' | 'hd';
    export const QualityEnum = {
        Standard: 'standard' as QualityEnum,
        Hd: 'hd' as QualityEnum
    };
    export type ResponseFormatEnum = 'url' | 'b64_json';
    export const ResponseFormatEnum = {
        Url: 'url' as ResponseFormatEnum,
        B64Json: 'b64_json' as ResponseFormatEnum
    };
    export type SizeEnum = '256x256' | '512x512' | '1024x1024' | '1792x1024' | '1024x1792';
    export const SizeEnum = {
        _256x256: '256x256' as SizeEnum,
        _512x512: '512x512' as SizeEnum,
        _1024x1024: '1024x1024' as SizeEnum,
        _1792x1024: '1792x1024' as SizeEnum,
        _1024x1792: '1024x1792' as SizeEnum
    };
    export type StyleEnum = 'vivid' | 'natural';
    export const StyleEnum = {
        Vivid: 'vivid' as StyleEnum,
        Natural: 'natural' as StyleEnum
    };
}


