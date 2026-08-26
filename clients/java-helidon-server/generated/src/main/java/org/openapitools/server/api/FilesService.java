package org.openapitools.server.api;

import org.openapitools.server.model.DeleteFileResponse;
import java.io.File;
import java.util.HexFormat;
import org.openapitools.server.model.ListFilesResponse;
import java.util.Map;
import io.helidon.http.media.multipart.MultiPart;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openapitools.server.model.OpenAIFile;
import java.util.Optional;
import io.helidon.common.parameters.Parameters;
import io.helidon.http.media.multipart.ReadablePart;
import io.helidon.http.Status;
import io.helidon.common.mapper.Value;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Files'",
                             version = "7.24.0")
public interface FilesService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/", this::createFile);
        rules.delete("/{file_id}", this::deleteFile);
        rules.get("/{file_id}/content", this::downloadFile);
        rules.get("/", this::listFiles);
        rules.get("/{file_id}", this::retrieveFile);
    }


    /**
     * POST /files : Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. .
     *
     * @param request the server request
     * @param response the server response
     */
    void createFile(ServerRequest request, ServerResponse response);
    /**
     * DELETE /files/{file_id} : Delete a file..
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteFile(ServerRequest request, ServerResponse response);
    /**
     * GET /files/{file_id}/content : Returns the contents of the specified file..
     *
     * @param request the server request
     * @param response the server response
     */
    void downloadFile(ServerRequest request, ServerResponse response);
    /**
     * GET /files : Returns a list of files..
     *
     * @param request the server request
     * @param response the server response
     */
    void listFiles(ServerRequest request, ServerResponse response);
    /**
     * GET /files/{file_id} : Returns information about a specific file..
     *
     * @param request the server request
     * @param response the server response
     */
    void retrieveFile(ServerRequest request, ServerResponse response);
}
