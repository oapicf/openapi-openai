package org.openapitools.api.consumer;

import org.openapitools.model.DeleteModelResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.ModelsService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/models")
public class ModelsServiceController {

    @DubboReference
    private ModelsService modelsService;

    @RequestMapping(method = RequestMethod.DELETE, value = "/{model}")
    public DeleteModelResponse deleteModel(
        @RequestParam(name = "model") String model
    ) {
        return modelsService.deleteModel(model);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ListModelsResponse listModels(
    ) {
        return modelsService.listModels();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{model}")
    public Model retrieveModel(
        @RequestParam(name = "model") String model
    ) {
        return modelsService.retrieveModel(model);
    }
}
