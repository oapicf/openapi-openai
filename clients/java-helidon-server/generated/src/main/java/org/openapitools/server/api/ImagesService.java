package org.openapitools.server.api;

import org.openapitools.server.model.CreateImageEditRequestModel;
import org.openapitools.server.model.CreateImageRequest;
import java.io.File;
import java.util.HexFormat;
import org.openapitools.server.model.ImagesResponse;
import java.util.Map;
import io.helidon.http.media.multipart.MultiPart;
import com.fasterxml.jackson.databind.ObjectMapper;
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
                             trigger = "tag = 'Images'",
                             version = "7.24.0")
public interface ImagesService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/generations", this::createImage);
        rules.post("/edits", this::createImageEdit);
        rules.post("/variations", this::createImageVariation);
    }


    /**
     * POST /images/generations : Creates an image given a prompt..
     *
     * @param request the server request
     * @param response the server response
     */
    void createImage(ServerRequest request, ServerResponse response);
    /**
     * POST /images/edits : Creates an edited or extended image given an original image and a prompt..
     *
     * @param request the server request
     * @param response the server response
     */
    void createImageEdit(ServerRequest request, ServerResponse response);
    /**
     * POST /images/variations : Creates a variation of a given image..
     *
     * @param request the server request
     * @param response the server response
     */
    void createImageVariation(ServerRequest request, ServerResponse response);
}
