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
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class AudioServiceImpl implements AudioService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void createSpeech(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void createTranscription(ServerRequest request, ServerResponse response) {
        MultiPart multiPart = request.content().as(MultiPart.class);
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void createTranslation(ServerRequest request, ServerResponse response) {
        MultiPart multiPart = request.content().as(MultiPart.class);
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service AudioService is down. Goodbye!");
    }

}
