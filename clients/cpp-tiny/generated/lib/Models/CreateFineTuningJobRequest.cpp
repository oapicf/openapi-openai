

#include "CreateFineTuningJobRequest.h"

using namespace Tiny;

CreateFineTuningJobRequest::CreateFineTuningJobRequest()
{
	model = CreateFineTuningJobRequest_model();
	training_file = std::string();
	hyperparameters = CreateFineTuningJobRequest_hyperparameters();
	suffix = std::string();
	validation_file = std::string();
	integrations = std::list<CreateFineTuningJobRequest_integrations_inner>();
	seed = int(0);
	method = FineTuneMethod();
}

CreateFineTuningJobRequest::CreateFineTuningJobRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateFineTuningJobRequest::~CreateFineTuningJobRequest()
{

}

void
CreateFineTuningJobRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];




        CreateFineTuningJobRequest_model* obj = &model;
		obj->fromJson(value.dump());

    }

    const char *training_fileKey = "training_file";

    if(object.has_key(training_fileKey))
    {
        bourne::json value = object[training_fileKey];



        jsonToValue(&training_file, value, "std::string");


    }

    const char *hyperparametersKey = "hyperparameters";

    if(object.has_key(hyperparametersKey))
    {
        bourne::json value = object[hyperparametersKey];




        CreateFineTuningJobRequest_hyperparameters* obj = &hyperparameters;
		obj->fromJson(value.dump());

    }

    const char *suffixKey = "suffix";

    if(object.has_key(suffixKey))
    {
        bourne::json value = object[suffixKey];



        jsonToValue(&suffix, value, "std::string");


    }

    const char *validation_fileKey = "validation_file";

    if(object.has_key(validation_fileKey))
    {
        bourne::json value = object[validation_fileKey];



        jsonToValue(&validation_file, value, "std::string");


    }

    const char *integrationsKey = "integrations";

    if(object.has_key(integrationsKey))
    {
        bourne::json value = object[integrationsKey];


        std::list<CreateFineTuningJobRequest_integrations_inner> integrations_list;
        CreateFineTuningJobRequest_integrations_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            integrations_list.push_back(element);
        }
        integrations = integrations_list;


    }

    const char *seedKey = "seed";

    if(object.has_key(seedKey))
    {
        bourne::json value = object[seedKey];



        jsonToValue(&seed, value, "int");


    }

    const char *methodKey = "method";

    if(object.has_key(methodKey))
    {
        bourne::json value = object[methodKey];




        FineTuneMethod* obj = &method;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateFineTuningJobRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["model"] = getModel().toJson();





    object["training_file"] = getTrainingFile();







	object["hyperparameters"] = getHyperparameters().toJson();





    object["suffix"] = getSuffix();






    object["validation_file"] = getValidationFile();





    std::list<CreateFineTuningJobRequest_integrations_inner> integrations_list = getIntegrations();
    bourne::json integrations_arr = bourne::json::array();

    for(auto& var : integrations_list)
    {
        CreateFineTuningJobRequest_integrations_inner obj = var;
        integrations_arr.append(obj.toJson());
    }
    object["integrations"] = integrations_arr;







    object["seed"] = getSeed();







	object["method"] = getMethod().toJson();


    return object;

}

CreateFineTuningJobRequest_model
CreateFineTuningJobRequest::getModel()
{
	return model;
}

void
CreateFineTuningJobRequest::setModel(CreateFineTuningJobRequest_model  model)
{
	this->model = model;
}

std::string
CreateFineTuningJobRequest::getTrainingFile()
{
	return training_file;
}

void
CreateFineTuningJobRequest::setTrainingFile(std::string  training_file)
{
	this->training_file = training_file;
}

CreateFineTuningJobRequest_hyperparameters
CreateFineTuningJobRequest::getHyperparameters()
{
	return hyperparameters;
}

void
CreateFineTuningJobRequest::setHyperparameters(CreateFineTuningJobRequest_hyperparameters  hyperparameters)
{
	this->hyperparameters = hyperparameters;
}

std::string
CreateFineTuningJobRequest::getSuffix()
{
	return suffix;
}

void
CreateFineTuningJobRequest::setSuffix(std::string  suffix)
{
	this->suffix = suffix;
}

std::string
CreateFineTuningJobRequest::getValidationFile()
{
	return validation_file;
}

void
CreateFineTuningJobRequest::setValidationFile(std::string  validation_file)
{
	this->validation_file = validation_file;
}

std::list<CreateFineTuningJobRequest_integrations_inner>
CreateFineTuningJobRequest::getIntegrations()
{
	return integrations;
}

void
CreateFineTuningJobRequest::setIntegrations(std::list <CreateFineTuningJobRequest_integrations_inner> integrations)
{
	this->integrations = integrations;
}

int
CreateFineTuningJobRequest::getSeed()
{
	return seed;
}

void
CreateFineTuningJobRequest::setSeed(int  seed)
{
	this->seed = seed;
}

FineTuneMethod
CreateFineTuningJobRequest::getMethod()
{
	return method;
}

void
CreateFineTuningJobRequest::setMethod(FineTuneMethod  method)
{
	this->method = method;
}



