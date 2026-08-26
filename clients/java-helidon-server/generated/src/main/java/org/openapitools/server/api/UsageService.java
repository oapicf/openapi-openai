package org.openapitools.server.api;

import java.util.stream.Collectors;
import java.util.HexFormat;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;
import org.openapitools.server.model.UsageResponse;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Usage'",
                             version = "7.24.0")
public interface UsageService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/usage/audio_speeches", this::usageAudioSpeeches);
        rules.get("/usage/audio_transcriptions", this::usageAudioTranscriptions);
        rules.get("/usage/code_interpreter_sessions", this::usageCodeInterpreterSessions);
        rules.get("/usage/completions", this::usageCompletions);
        rules.get("/costs", this::usageCosts);
        rules.get("/usage/embeddings", this::usageEmbeddings);
        rules.get("/usage/images", this::usageImages);
        rules.get("/usage/moderations", this::usageModerations);
        rules.get("/usage/vector_stores", this::usageVectorStores);
    }


    /**
     * GET /organization/usage/audio_speeches : Get audio speeches usage details for the organization..
     *
     * @param request the server request
     * @param response the server response
     */
    void usageAudioSpeeches(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/usage/audio_transcriptions : Get audio transcriptions usage details for the organization..
     *
     * @param request the server request
     * @param response the server response
     */
    void usageAudioTranscriptions(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/usage/code_interpreter_sessions : Get code interpreter sessions usage details for the organization..
     *
     * @param request the server request
     * @param response the server response
     */
    void usageCodeInterpreterSessions(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/usage/completions : Get completions usage details for the organization..
     *
     * @param request the server request
     * @param response the server response
     */
    void usageCompletions(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/costs : Get costs details for the organization..
     *
     * @param request the server request
     * @param response the server response
     */
    void usageCosts(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/usage/embeddings : Get embeddings usage details for the organization..
     *
     * @param request the server request
     * @param response the server response
     */
    void usageEmbeddings(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/usage/images : Get images usage details for the organization..
     *
     * @param request the server request
     * @param response the server response
     */
    void usageImages(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/usage/moderations : Get moderations usage details for the organization..
     *
     * @param request the server request
     * @param response the server response
     */
    void usageModerations(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/usage/vector_stores : Get vector stores usage details for the organization..
     *
     * @param request the server request
     * @param response the server response
     */
    void usageVectorStores(ServerRequest request, ServerResponse response);
}
