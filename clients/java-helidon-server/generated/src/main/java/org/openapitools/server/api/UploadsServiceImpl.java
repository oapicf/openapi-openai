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
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class UploadsServiceImpl implements UploadsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void addUploadPart(ServerRequest request, ServerResponse response) {
        MultiPart multiPart = request.content().as(MultiPart.class);
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void cancelUpload(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void completeUpload(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void createUpload(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service UploadsService is down. Goodbye!");
    }

}
