package org.openapitools.api.interfaces;

import org.openapitools.model.CreateImageEditRequestModel;
import org.openapitools.model.CreateImageRequest;
import org.openapitools.model.ImagesResponse;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface ImagesService {

    /**
     * Creates an image given a prompt.
     * 
     *
     * @param createImageRequest  (required)
     * @return ImagesResponse
     */
    ImagesResponse createImage(
        CreateImageRequest createImageRequest
    );

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * 
     *
     * @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. (required)
     * @param prompt A text description of the desired image(s). The maximum length is 1000 characters. (required)
     * @param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. (optional)
     * @param model  (optional, default to dall-e-2)
     * @param n The number of images to generate. Must be between 1 and 10. (optional, default to 1)
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to 1024x1024)
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. (optional, default to url)
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  (optional)
     * @return ImagesResponse
     */
    ImagesResponse createImageEdit(
        org.springframework.web.multipart.MultipartFile image,
        String prompt,
        org.springframework.web.multipart.MultipartFile mask,
        CreateImageEditRequestModel model,
        Integer n,
        String size,
        String responseFormat,
        String user
    );

    /**
     * Creates a variation of a given image.
     * 
     *
     * @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. (required)
     * @param model  (optional, default to dall-e-2)
     * @param n The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. (optional, default to 1)
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. (optional, default to url)
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to 1024x1024)
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  (optional)
     * @return ImagesResponse
     */
    ImagesResponse createImageVariation(
        org.springframework.web.multipart.MultipartFile image,
        CreateImageEditRequestModel model,
        Integer n,
        String responseFormat,
        String size,
        String user
    );
}
