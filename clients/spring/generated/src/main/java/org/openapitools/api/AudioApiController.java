package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranscriptionResponse;
import org.openapitools.model.CreateTranslationResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-16T01:17:43.141820780Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Controller
@RequestMapping("${openapi.openAI.base-path:/v1}")
public class AudioApiController implements AudioApi {

    private final NativeWebRequest request;

    @Autowired
    public AudioApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
