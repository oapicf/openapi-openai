/*
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

package org.openapitools.controller;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.convert.format.Format;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import reactor.core.publisher.Mono;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.http.multipart.CompletedFileUpload;
import org.openapitools.model.CreateImageEditRequestModel;
import org.openapitools.model.CreateImageRequest;
import org.openapitools.model.ImagesResponse;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Controller
@Tag(name = "Images", description = "The Images API")
public class ImagesController {
    /**
     * Creates an image given a prompt.
     *
     * @param createImageRequest  (required)
     * @return ImagesResponse
     */
    @Operation(
        operationId = "createImage",
        summary = "Creates an image given a prompt.",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ImagesResponse.class))
            })
        },
        parameters = {
            @Parameter(name = "createImageRequest", required = true)
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @Post(uri="/images/generations")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<ImagesResponse> createImage(
        @Body @NotNull @Valid CreateImageRequest createImageRequest
    ) {
        // TODO implement createImage();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Creates an edited or extended image given an original image and a prompt.
     *
     * @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. (required)
     * @param prompt A text description of the desired image(s). The maximum length is 1000 characters. (required)
     * @param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. (optional)
     * @param model  (optional, default to dall-e-2)
     * @param n The number of images to generate. Must be between 1 and 10. (optional, default to 1)
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to 1024x1024)
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. (optional, default to url)
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
     * @return ImagesResponse
     */
    @Operation(
        operationId = "createImageEdit",
        summary = "Creates an edited or extended image given an original image and a prompt.",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ImagesResponse.class))
            })
        },
        parameters = {
            @Parameter(name = "image", description = "The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.", required = true),
            @Parameter(name = "prompt", description = "A text description of the desired image(s). The maximum length is 1000 characters.", required = true),
            @Parameter(name = "mask", description = "An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`."),
            @Parameter(name = "model"),
            @Parameter(name = "n", description = "The number of images to generate. Must be between 1 and 10."),
            @Parameter(name = "size", description = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`."),
            @Parameter(name = "responseFormat", description = "The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated."),
            @Parameter(name = "user", description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @Post(uri="/images/edits")
    @Produces(value = {"application/json"})
    @Consumes(value = {"multipart/form-data"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<ImagesResponse> createImageEdit(
        @NotNull CompletedFileUpload image, 
        @NotNull String prompt, 
        @Nullable CompletedFileUpload mask, 
        @Nullable @Valid CreateImageEditRequestModel model, 
        @Nullable @Min(1) @Max(10) Integer n, 
        @Nullable String size, 
        @Nullable String responseFormat, 
        @Nullable String user
    ) {
        // TODO implement createImageEdit();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Creates a variation of a given image.
     *
     * @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. (required)
     * @param model  (optional, default to dall-e-2)
     * @param n The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. (optional, default to 1)
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. (optional, default to url)
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to 1024x1024)
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
     * @return ImagesResponse
     */
    @Operation(
        operationId = "createImageVariation",
        summary = "Creates a variation of a given image.",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ImagesResponse.class))
            })
        },
        parameters = {
            @Parameter(name = "image", description = "The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.", required = true),
            @Parameter(name = "model"),
            @Parameter(name = "n", description = "The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported."),
            @Parameter(name = "responseFormat", description = "The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated."),
            @Parameter(name = "size", description = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`."),
            @Parameter(name = "user", description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @Post(uri="/images/variations")
    @Produces(value = {"application/json"})
    @Consumes(value = {"multipart/form-data"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<ImagesResponse> createImageVariation(
        @NotNull CompletedFileUpload image, 
        @Nullable @Valid CreateImageEditRequestModel model, 
        @Nullable @Min(1) @Max(10) Integer n, 
        @Nullable String responseFormat, 
        @Nullable String size, 
        @Nullable String user
    ) {
        // TODO implement createImageVariation();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}
