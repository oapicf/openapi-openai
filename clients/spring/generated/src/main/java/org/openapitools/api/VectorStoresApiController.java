package org.openapitools.api;

import org.openapitools.model.CreateVectorStoreFileBatchRequest;
import org.openapitools.model.CreateVectorStoreFileRequest;
import org.openapitools.model.CreateVectorStoreRequest;
import org.openapitools.model.DeleteVectorStoreFileResponse;
import org.openapitools.model.DeleteVectorStoreResponse;
import org.openapitools.model.ListVectorStoreFilesResponse;
import org.openapitools.model.ListVectorStoresResponse;
import org.springframework.lang.Nullable;
import org.openapitools.model.UpdateVectorStoreRequest;
import org.openapitools.model.VectorStoreFileBatchObject;
import org.openapitools.model.VectorStoreFileObject;
import org.openapitools.model.VectorStoreObject;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Controller
@RequestMapping("${openapi.openAI.base-path:/v1}")
public class VectorStoresApiController implements VectorStoresApi {

    private final NativeWebRequest request;

    @Autowired
    public VectorStoresApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
