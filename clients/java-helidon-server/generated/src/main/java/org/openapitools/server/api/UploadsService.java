package org.openapitools.server.api;

import org.openapitools.server.model.CompleteUploadRequest;
import org.openapitools.server.model.CreateUploadRequest;
import java.io.File;
import java.util.HexFormat;
import java.util.Map;
import io.helidon.http.media.multipart.MultiPart;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.helidon.common.parameters.Parameters;
import io.helidon.http.media.multipart.ReadablePart;
import io.helidon.http.Status;
import org.openapitools.server.model.Upload;
import org.openapitools.server.model.UploadPart;
import io.helidon.common.mapper.Value;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Uploads'",
                             version = "7.24.0")
public interface UploadsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/{upload_id}/parts", this::addUploadPart);
        rules.post("/{upload_id}/cancel", this::cancelUpload);
        rules.post("/{upload_id}/complete", this::completeUpload);
        rules.post("/", this::createUpload);
    }


    /**
     * POST /uploads/{upload_id}/parts : Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). .
     *
     * @param request the server request
     * @param response the server response
     */
    void addUploadPart(ServerRequest request, ServerResponse response);
    /**
     * POST /uploads/{upload_id}/cancel : Cancels the Upload. No Parts may be added after an Upload is cancelled. .
     *
     * @param request the server request
     * @param response the server response
     */
    void cancelUpload(ServerRequest request, ServerResponse response);
    /**
     * POST /uploads/{upload_id}/complete : Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. .
     *
     * @param request the server request
     * @param response the server response
     */
    void completeUpload(ServerRequest request, ServerResponse response);
    /**
     * POST /uploads : Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). .
     *
     * @param request the server request
     * @param response the server response
     */
    void createUpload(ServerRequest request, ServerResponse response);
}
