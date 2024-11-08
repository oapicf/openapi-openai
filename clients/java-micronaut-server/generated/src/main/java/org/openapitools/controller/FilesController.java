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
import org.openapitools.model.DeleteFileResponse;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.OpenAIFile;
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
@Tag(name = "Files", description = "The Files API")
public class FilesController {
    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     *
     * @param _file The File object (not file name) to be uploaded.  (required)
     * @param purpose The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning.  (required)
     * @return OpenAIFile
     */
    @Operation(
        operationId = "createFile",
        summary = "Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. ",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OpenAIFile.class))
            })
        },
        parameters = {
            @Parameter(name = "_file", description = "The File object (not file name) to be uploaded. ", required = true),
            @Parameter(name = "purpose", description = "The intended purpose of the uploaded file.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. ", required = true)
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @Post(uri="/files")
    @Produces(value = {"application/json"})
    @Consumes(value = {"multipart/form-data"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<OpenAIFile> createFile(
        @NotNull CompletedFileUpload _file, 
        @NotNull String purpose
    ) {
        // TODO implement createFile();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Delete a file.
     *
     * @param fileId The ID of the file to use for this request. (required)
     * @return DeleteFileResponse
     */
    @Operation(
        operationId = "deleteFile",
        summary = "Delete a file.",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = DeleteFileResponse.class))
            })
        },
        parameters = {
            @Parameter(name = "fileId", description = "The ID of the file to use for this request.", required = true)
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @Delete(uri="/files/{file_id}")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<DeleteFileResponse> deleteFile(
        @PathVariable(value="file_id") @NotNull String fileId
    ) {
        // TODO implement deleteFile();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Returns the contents of the specified file.
     *
     * @param fileId The ID of the file to use for this request. (required)
     * @return String
     */
    @Operation(
        operationId = "downloadFile",
        summary = "Returns the contents of the specified file.",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            })
        },
        parameters = {
            @Parameter(name = "fileId", description = "The ID of the file to use for this request.", required = true)
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @Get(uri="/files/{file_id}/content")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<String> downloadFile(
        @PathVariable(value="file_id") @NotNull String fileId
    ) {
        // TODO implement downloadFile();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Returns a list of files that belong to the user&#39;s organization.
     *
     * @param purpose Only return files with the given purpose. (optional)
     * @return ListFilesResponse
     */
    @Operation(
        operationId = "listFiles",
        summary = "Returns a list of files that belong to the user's organization.",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ListFilesResponse.class))
            })
        },
        parameters = {
            @Parameter(name = "purpose", description = "Only return files with the given purpose.")
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @Get(uri="/files")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<ListFilesResponse> listFiles(
        @QueryValue(value="purpose") @Nullable String purpose
    ) {
        // TODO implement listFiles();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Returns information about a specific file.
     *
     * @param fileId The ID of the file to use for this request. (required)
     * @return OpenAIFile
     */
    @Operation(
        operationId = "retrieveFile",
        summary = "Returns information about a specific file.",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OpenAIFile.class))
            })
        },
        parameters = {
            @Parameter(name = "fileId", description = "The ID of the file to use for this request.", required = true)
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @Get(uri="/files/{file_id}")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<OpenAIFile> retrieveFile(
        @PathVariable(value="file_id") @NotNull String fileId
    ) {
        // TODO implement retrieveFile();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}
