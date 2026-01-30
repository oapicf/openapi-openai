package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateImageRequestModel;

@Canonical
class CreateImageRequest {
    /* A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`. */
    String prompt
    
    CreateImageRequestModel model = dall-e-2
    /* The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. */
    Integer n = 1

    enum QualityEnum {
    
        STANDARD("standard"),
        
        HD("hd")
    
        private final String value
    
        QualityEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`. */
    QualityEnum quality = QualityEnum.STANDARD

    enum ResponseFormatEnum {
    
        URL("url"),
        
        B64_JSON("b64_json")
    
        private final String value
    
        ResponseFormatEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. */
    ResponseFormatEnum responseFormat = ResponseFormatEnum.URL

    enum SizeEnum {
    
        _256X256("256x256"),
        
        _512X512("512x512"),
        
        _1024X1024("1024x1024"),
        
        _1792X1024("1792x1024"),
        
        _1024X1792("1024x1792")
    
        private final String value
    
        SizeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models. */
    SizeEnum size = SizeEnum._1024X1024

    enum StyleEnum {
    
        VIVID("vivid"),
        
        NATURAL("natural")
    
        private final String value
    
        StyleEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`. */
    StyleEnum style = StyleEnum.VIVID
    /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  */
    String user
}
