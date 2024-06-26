/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASCreateImageRequest
 */
public class OASCreateImageRequest implements OAS.MappedProperties {
    /**
     * A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
     * @return prompt
     */
    public String prompt { get; set; }

    /**
     * Get model
     * @return model
     */
    public OASCreateImageRequestModel model { get; set; }

    /**
     * The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
     * minimum: 1
     * maximum: 10
     * @return n
     */
    public Integer n { get; set; }

    /**
     * The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
     */
    public enum QualityEnum {
        STANDARD,
        HD
    }

    /**
     * The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
     * @return quality
     */
    public QualityEnum quality { get; set; }

    /**
     * The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
     */
    public enum ResponseFormatEnum {
        URL,
        B64_JSON
    }

    /**
     * The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
     * @return responseFormat
     */
    public ResponseFormatEnum responseFormat { get; set; }

    /**
     * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
     */
    public enum SizeEnum {
        _256X256,
        _512X512,
        _1024X1024,
        _1792X1024,
        _1024X1792
    }

    /**
     * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
     * @return size
     */
    public SizeEnum size { get; set; }

    /**
     * The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
     */
    public enum StyleEnum {
        VIVID,
        NATURAL
    }

    /**
     * The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
     * @return style
     */
    public StyleEnum style { get; set; }

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).\n
     * @return user
     */
    public String user { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'response_format' => 'responseFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASCreateImageRequest() {
        n = 1;
        quality = QualityEnum.STANDARD;
        responseFormat = ResponseFormatEnum.URL;
        size = SizeEnum._1024X1024;
        style = StyleEnum.VIVID;
    }

    public static OASCreateImageRequest getExample() {
        OASCreateImageRequest createImageRequest = new OASCreateImageRequest();
          createImageRequest.prompt = 'A cute baby sea otter';
          createImageRequest.model = OASCreateImageRequestModel.getExample();
          createImageRequest.n = 1;
          createImageRequest.quality = QualityEnum.STANDARD;
          createImageRequest.responseFormat = ResponseFormatEnum.URL;
          createImageRequest.size = SizeEnum._1024X1024;
          createImageRequest.style = StyleEnum.VIVID;
          createImageRequest.user = 'user-1234';
        return createImageRequest;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCreateImageRequest) {           
            OASCreateImageRequest createImageRequest = (OASCreateImageRequest) obj;
            return this.prompt == createImageRequest.prompt
                && this.model == createImageRequest.model
                && this.n == createImageRequest.n
                && this.quality == createImageRequest.quality
                && this.responseFormat == createImageRequest.responseFormat
                && this.size == createImageRequest.size
                && this.style == createImageRequest.style
                && this.user == createImageRequest.user;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (prompt == null ? 0 : System.hashCode(prompt));
        hashCode = (17 * hashCode) + (model == null ? 0 : System.hashCode(model));
        hashCode = (17 * hashCode) + (n == null ? 0 : System.hashCode(n));
        hashCode = (17 * hashCode) + (quality == null ? 0 : System.hashCode(quality));
        hashCode = (17 * hashCode) + (responseFormat == null ? 0 : System.hashCode(responseFormat));
        hashCode = (17 * hashCode) + (size == null ? 0 : System.hashCode(size));
        hashCode = (17 * hashCode) + (style == null ? 0 : System.hashCode(style));
        hashCode = (17 * hashCode) + (user == null ? 0 : System.hashCode(user));
        return hashCode;
    }
}

