package org.openapitools.api.consumer;

import org.openapitools.model.CreateImageEditRequestModel;
import org.openapitools.model.CreateImageRequest;
import org.openapitools.model.ImagesResponse;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.ImagesService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/images")
public class ImagesServiceController {

    @DubboReference
    private ImagesService imagesService;

    @RequestMapping(method = RequestMethod.POST, value = "/generations")
    public ImagesResponse createImage(
        @RequestParam(name = "createImageRequest") CreateImageRequest createImageRequest
    ) {
        return imagesService.createImage(createImageRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/edits")
    public ImagesResponse createImageEdit(
        @RequestParam(name = "image") org.springframework.web.multipart.MultipartFile image,
        @RequestParam(name = "prompt") String prompt,
        @RequestParam(name = "mask") org.springframework.web.multipart.MultipartFile mask,
        @RequestParam(name = "model", defaultValue = "dall-e-2") CreateImageEditRequestModel model,
        @RequestParam(name = "n", defaultValue = "1") Integer n,
        @RequestParam(name = "size", defaultValue = "1024x1024") String size,
        @RequestParam(name = "responseFormat", defaultValue = "url") String responseFormat,
        @RequestParam(name = "user") String user
    ) {
        return imagesService.createImageEdit(image, prompt, mask, model, n, size, responseFormat, user);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/variations")
    public ImagesResponse createImageVariation(
        @RequestParam(name = "image") org.springframework.web.multipart.MultipartFile image,
        @RequestParam(name = "model", defaultValue = "dall-e-2") CreateImageEditRequestModel model,
        @RequestParam(name = "n", defaultValue = "1") Integer n,
        @RequestParam(name = "responseFormat", defaultValue = "url") String responseFormat,
        @RequestParam(name = "size", defaultValue = "1024x1024") String size,
        @RequestParam(name = "user") String user
    ) {
        return imagesService.createImageVariation(image, model, n, responseFormat, size, user);
    }
}
