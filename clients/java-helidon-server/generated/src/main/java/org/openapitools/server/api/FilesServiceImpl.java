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
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class FilesServiceImpl implements FilesService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void createFile(ServerRequest request, ServerResponse response) {
        MultiPart multiPart = request.content().as(MultiPart.class);
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void deleteFile(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void downloadFile(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void listFiles(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void retrieveFile(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service FilesService is down. Goodbye!");
    }

}
