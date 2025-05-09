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

package org.openapitools.api;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
import org.openapitools.model.DeleteFileResponse;
import java.io.File;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.OpenAIFile;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-03T11:06:40.431829781Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Client("${openapi-micronaut-client-base-path}")
public interface FilesApi {
    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     *
     * @param _file The File object (not file name) to be uploaded.  (required)
     * @param purpose The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning.  (required)
     * @return OpenAIFile
     */
    @Post(uri="/files")
    @Consumes({"application/json"})
    @Produces({"multipart/form-data"})
    Mono<OpenAIFile> createFile(
        @NotNull File _file, 
        @NotNull String purpose
    );

    /**
     * Delete a file.
     *
     * @param fileId The ID of the file to use for this request. (required)
     * @return DeleteFileResponse
     */
    @Delete(uri="/files/{file_id}")
    @Consumes({"application/json"})
    Mono<DeleteFileResponse> deleteFile(
        @PathVariable(name="file_id") @NotNull String fileId
    );

    /**
     * Returns the contents of the specified file.
     *
     * @param fileId The ID of the file to use for this request. (required)
     * @return String
     */
    @Get(uri="/files/{file_id}/content")
    @Consumes({"application/json"})
    Mono<String> downloadFile(
        @PathVariable(name="file_id") @NotNull String fileId
    );

    /**
     * Returns a list of files that belong to the user&#39;s organization.
     *
     * @param purpose Only return files with the given purpose. (optional)
     * @return ListFilesResponse
     */
    @Get(uri="/files")
    @Consumes({"application/json"})
    Mono<ListFilesResponse> listFiles(
        @QueryValue(value="purpose") @Nullable String purpose
    );

    /**
     * Returns information about a specific file.
     *
     * @param fileId The ID of the file to use for this request. (required)
     * @return OpenAIFile
     */
    @Get(uri="/files/{file_id}")
    @Consumes({"application/json"})
    Mono<OpenAIFile> retrieveFile(
        @PathVariable(name="file_id") @NotNull String fileId
    );

}
