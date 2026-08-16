

#include "FineTuningJob.h"

using namespace Tiny;

FineTuningJob::FineTuningJob()
{
	id = std::string();
	created_at = int(0);
	error = FineTuningJob_error();
	fine_tuned_model = std::string();
	finished_at = int(0);
	hyperparameters = FineTuningJob_hyperparameters();
	model = std::string();
	object = std::string();
	organization_id = std::string();
	result_files = std::list<std::string>();
	status = std::string();
	trained_tokens = int(0);
	training_file = std::string();
	validation_file = std::string();
	integrations = std::list<FineTuningJob_integrations_inner>();
	seed = int(0);
	estimated_finish = int(0);
	method = FineTuneMethod();
}

FineTuningJob::FineTuningJob(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuningJob::~FineTuningJob()
{

}

void
FineTuningJob::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "int");


    }

    const char *errorKey = "error";

    if(object.has_key(errorKey))
    {
        bourne::json value = object[errorKey];




        FineTuningJob_error* obj = &error;
		obj->fromJson(value.dump());

    }

    const char *fine_tuned_modelKey = "fine_tuned_model";

    if(object.has_key(fine_tuned_modelKey))
    {
        bourne::json value = object[fine_tuned_modelKey];



        jsonToValue(&fine_tuned_model, value, "std::string");


    }

    const char *finished_atKey = "finished_at";

    if(object.has_key(finished_atKey))
    {
        bourne::json value = object[finished_atKey];



        jsonToValue(&finished_at, value, "int");


    }

    const char *hyperparametersKey = "hyperparameters";

    if(object.has_key(hyperparametersKey))
    {
        bourne::json value = object[hyperparametersKey];




        FineTuningJob_hyperparameters* obj = &hyperparameters;
		obj->fromJson(value.dump());

    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];



        jsonToValue(&model, value, "std::string");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *organization_idKey = "organization_id";

    if(object.has_key(organization_idKey))
    {
        bourne::json value = object[organization_idKey];



        jsonToValue(&organization_id, value, "std::string");


    }

    const char *result_filesKey = "result_files";

    if(object.has_key(result_filesKey))
    {
        bourne::json value = object[result_filesKey];


        std::list<std::string> result_files_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            result_files_list.push_back(element);
        }
        result_files = result_files_list;


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }

    const char *trained_tokensKey = "trained_tokens";

    if(object.has_key(trained_tokensKey))
    {
        bourne::json value = object[trained_tokensKey];



        jsonToValue(&trained_tokens, value, "int");


    }

    const char *training_fileKey = "training_file";

    if(object.has_key(training_fileKey))
    {
        bourne::json value = object[training_fileKey];



        jsonToValue(&training_file, value, "std::string");


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


        std::list<FineTuningJob_integrations_inner> integrations_list;
        FineTuningJob_integrations_inner element;
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

    const char *estimated_finishKey = "estimated_finish";

    if(object.has_key(estimated_finishKey))
    {
        bourne::json value = object[estimated_finishKey];



        jsonToValue(&estimated_finish, value, "int");


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
FineTuningJob::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["created_at"] = getCreatedAt();







	object["error"] = getError().toJson();





    object["fine_tuned_model"] = getFineTunedModel();






    object["finished_at"] = getFinishedAt();







	object["hyperparameters"] = getHyperparameters().toJson();





    object["model"] = getModel();






    object["object"] = getObject();






    object["organization_id"] = getOrganizationId();





    std::list<std::string> result_files_list = getResultFiles();
    bourne::json result_files_arr = bourne::json::array();

    for(auto& var : result_files_list)
    {
        result_files_arr.append(var);
    }
    object["result_files"] = result_files_arr;









    object["status"] = getStatus();






    object["trained_tokens"] = getTrainedTokens();






    object["training_file"] = getTrainingFile();






    object["validation_file"] = getValidationFile();





    std::list<FineTuningJob_integrations_inner> integrations_list = getIntegrations();
    bourne::json integrations_arr = bourne::json::array();

    for(auto& var : integrations_list)
    {
        FineTuningJob_integrations_inner obj = var;
        integrations_arr.append(obj.toJson());
    }
    object["integrations"] = integrations_arr;







    object["seed"] = getSeed();






    object["estimated_finish"] = getEstimatedFinish();







	object["method"] = getMethod().toJson();


    return object;

}

std::string
FineTuningJob::getId()
{
	return id;
}

void
FineTuningJob::setId(std::string  id)
{
	this->id = id;
}

int
FineTuningJob::getCreatedAt()
{
	return created_at;
}

void
FineTuningJob::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

FineTuningJob_error
FineTuningJob::getError()
{
	return error;
}

void
FineTuningJob::setError(FineTuningJob_error  error)
{
	this->error = error;
}

std::string
FineTuningJob::getFineTunedModel()
{
	return fine_tuned_model;
}

void
FineTuningJob::setFineTunedModel(std::string  fine_tuned_model)
{
	this->fine_tuned_model = fine_tuned_model;
}

int
FineTuningJob::getFinishedAt()
{
	return finished_at;
}

void
FineTuningJob::setFinishedAt(int  finished_at)
{
	this->finished_at = finished_at;
}

FineTuningJob_hyperparameters
FineTuningJob::getHyperparameters()
{
	return hyperparameters;
}

void
FineTuningJob::setHyperparameters(FineTuningJob_hyperparameters  hyperparameters)
{
	this->hyperparameters = hyperparameters;
}

std::string
FineTuningJob::getModel()
{
	return model;
}

void
FineTuningJob::setModel(std::string  model)
{
	this->model = model;
}

std::string
FineTuningJob::getObject()
{
	return object;
}

void
FineTuningJob::setObject(std::string  object)
{
	this->object = object;
}

std::string
FineTuningJob::getOrganizationId()
{
	return organization_id;
}

void
FineTuningJob::setOrganizationId(std::string  organization_id)
{
	this->organization_id = organization_id;
}

std::list<std::string>
FineTuningJob::getResultFiles()
{
	return result_files;
}

void
FineTuningJob::setResultFiles(std::list <std::string> result_files)
{
	this->result_files = result_files;
}

std::string
FineTuningJob::getStatus()
{
	return status;
}

void
FineTuningJob::setStatus(std::string  status)
{
	this->status = status;
}

int
FineTuningJob::getTrainedTokens()
{
	return trained_tokens;
}

void
FineTuningJob::setTrainedTokens(int  trained_tokens)
{
	this->trained_tokens = trained_tokens;
}

std::string
FineTuningJob::getTrainingFile()
{
	return training_file;
}

void
FineTuningJob::setTrainingFile(std::string  training_file)
{
	this->training_file = training_file;
}

std::string
FineTuningJob::getValidationFile()
{
	return validation_file;
}

void
FineTuningJob::setValidationFile(std::string  validation_file)
{
	this->validation_file = validation_file;
}

std::list<FineTuningJob_integrations_inner>
FineTuningJob::getIntegrations()
{
	return integrations;
}

void
FineTuningJob::setIntegrations(std::list <FineTuningJob_integrations_inner> integrations)
{
	this->integrations = integrations;
}

int
FineTuningJob::getSeed()
{
	return seed;
}

void
FineTuningJob::setSeed(int  seed)
{
	this->seed = seed;
}

int
FineTuningJob::getEstimatedFinish()
{
	return estimated_finish;
}

void
FineTuningJob::setEstimatedFinish(int  estimated_finish)
{
	this->estimated_finish = estimated_finish;
}

FineTuneMethod
FineTuningJob::getMethod()
{
	return method;
}

void
FineTuningJob::setMethod(FineTuneMethod  method)
{
	this->method = method;
}



