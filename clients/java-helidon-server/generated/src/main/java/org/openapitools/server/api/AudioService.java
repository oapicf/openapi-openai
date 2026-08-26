package org.openapitools.server.api;

import org.openapitools.server.model.AudioResponseFormat;
import java.math.BigDecimal;
import java.util.stream.Collectors;
import org.openapitools.server.model.CreateSpeechRequest;
import org.openapitools.server.model.CreateTranscription200Response;
import org.openapitools.server.model.CreateTranscriptionRequestModel;
import org.openapitools.server.model.CreateTranslation200Response;
import java.io.File;
import java.util.HexFormat;
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
                             trigger = "tag = 'Audio'",
                             version = "7.24.0")
public interface AudioService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/speech", this::createSpeech);
        rules.post("/transcriptions", this::createTranscription);
        rules.post("/translations", this::createTranslation);
    }


    /**
     * POST /audio/speech : Generates audio from the input text..
     *
     * @param request the server request
     * @param response the server response
     */
    void createSpeech(ServerRequest request, ServerResponse response);
    /**
     * POST /audio/transcriptions : Transcribes audio into the input language..
     *
     * @param request the server request
     * @param response the server response
     */
    void createTranscription(ServerRequest request, ServerResponse response);
    /**
     * POST /audio/translations : Translates audio into English..
     *
     * @param request the server request
     * @param response the server response
     */
    void createTranslation(ServerRequest request, ServerResponse response);
}
