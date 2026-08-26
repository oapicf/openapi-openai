package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Contains either an image URL or a data URL for a base64 encoded image.
 */
public class CreateModerationRequestInputOneOfInnerOneOfImageUrl   {

    private URI url;

    /**
     * Default constructor.
     */
    public CreateModerationRequestInputOneOfInnerOneOfImageUrl() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateModerationRequestInputOneOfInnerOneOfImageUrl.
     *
     * @param url Either a URL of the image or the base64 encoded image data.
     */
    public CreateModerationRequestInputOneOfInnerOneOfImageUrl(
        URI url
    ) {
        this.url = url;
    }



    /**
     * Either a URL of the image or the base64 encoded image data.
     * @return url
     */
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModerationRequestInputOneOfInnerOneOfImageUrl {\n");
        
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

