package org.openapitools.server.api;

import org.openapitools.server.model.CreateFineTuningJobRequest;
import org.openapitools.server.model.FineTuningJob;
import java.util.HexFormat;
import org.openapitools.server.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.server.model.ListFineTuningJobEventsResponse;
import org.openapitools.server.model.ListPaginatedFineTuningJobsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class FineTuningServiceImpl implements FineTuningService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void cancelFineTuningJob(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void createFineTuningJob(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void listFineTuningEvents(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void listFineTuningJobCheckpoints(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void listPaginatedFineTuningJobs(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void retrieveFineTuningJob(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service FineTuningService is down. Goodbye!");
    }

}
