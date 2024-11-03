package controllers;

import apimodels.DeleteModelResponse;
import apimodels.ListModelsResponse;
import apimodels.Model;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-03T11:07:27.411323426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ModelsApiControllerImp extends ModelsApiControllerImpInterface {
    @Override
    public DeleteModelResponse deleteModel(Http.Request request, String model) throws Exception {
        //Do your magic!!!
        return new DeleteModelResponse();
    }

    @Override
    public ListModelsResponse listModels(Http.Request request) throws Exception {
        //Do your magic!!!
        return new ListModelsResponse();
    }

    @Override
    public Model retrieveModel(Http.Request request, String model) throws Exception {
        //Do your magic!!!
        return new Model();
    }

}
