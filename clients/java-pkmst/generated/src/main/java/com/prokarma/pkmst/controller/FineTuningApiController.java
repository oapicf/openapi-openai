package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CreateFineTuningJobRequest;
import com.prokarma.pkmst.model.FineTuningJob;
import com.prokarma.pkmst.model.ListFineTuningJobCheckpointsResponse;
import com.prokarma.pkmst.model.ListFineTuningJobEventsResponse;
import com.prokarma.pkmst.model.ListPaginatedFineTuningJobsResponse;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-04-14T13:39:11.640510243Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Controller
public class FineTuningApiController implements FineTuningApi {
    private final ObjectMapper objectMapper;
@Autowired
    public FineTuningApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<FineTuningJob> cancelFineTuningJob(@ApiParam(value = "The ID of the fine-tuning job to cancel. ",required=true ) @PathVariable("fine_tuning_job_id") String fineTuningJobId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FineTuningJob>(objectMapper.readValue("", FineTuningJob.class), HttpStatus.OK);
        }

        return new ResponseEntity<FineTuningJob>(HttpStatus.OK);
    }

    public ResponseEntity<FineTuningJob> createFineTuningJob(@ApiParam(value = "" ,required=true )   @RequestBody CreateFineTuningJobRequest createFineTuningJobRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FineTuningJob>(objectMapper.readValue("", FineTuningJob.class), HttpStatus.OK);
        }

        return new ResponseEntity<FineTuningJob>(HttpStatus.OK);
    }

    public ResponseEntity<ListFineTuningJobEventsResponse> listFineTuningEvents(@ApiParam(value = "The ID of the fine-tuning job to get events for. ",required=true ) @PathVariable("fine_tuning_job_id") String fineTuningJobId,
        @ApiParam(value = "Identifier for the last event from the previous pagination request.")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "Number of events to retrieve.", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListFineTuningJobEventsResponse>(objectMapper.readValue("", ListFineTuningJobEventsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListFineTuningJobEventsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ListFineTuningJobCheckpointsResponse> listFineTuningJobCheckpoints(@ApiParam(value = "The ID of the fine-tuning job to get checkpoints for. ",required=true ) @PathVariable("fine_tuning_job_id") String fineTuningJobId,
        @ApiParam(value = "Identifier for the last checkpoint ID from the previous pagination request.")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "Number of checkpoints to retrieve.", defaultValue = "10")  @RequestParam(value = "limit", required = false, defaultValue="10") Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListFineTuningJobCheckpointsResponse>(objectMapper.readValue("", ListFineTuningJobCheckpointsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListFineTuningJobCheckpointsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ListPaginatedFineTuningJobsResponse> listPaginatedFineTuningJobs(@ApiParam(value = "Identifier for the last job from the previous pagination request.")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "Number of fine-tuning jobs to retrieve.", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListPaginatedFineTuningJobsResponse>(objectMapper.readValue("", ListPaginatedFineTuningJobsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListPaginatedFineTuningJobsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<FineTuningJob> retrieveFineTuningJob(@ApiParam(value = "The ID of the fine-tuning job. ",required=true ) @PathVariable("fine_tuning_job_id") String fineTuningJobId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FineTuningJob>(objectMapper.readValue("", FineTuningJob.class), HttpStatus.OK);
        }

        return new ResponseEntity<FineTuningJob>(HttpStatus.OK);
    }

}
