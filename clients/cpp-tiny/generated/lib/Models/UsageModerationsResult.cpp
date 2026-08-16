

#include "UsageModerationsResult.h"

using namespace Tiny;

UsageModerationsResult::UsageModerationsResult()
{
	object = std::string();
	input_tokens = int(0);
	num_model_requests = int(0);
	project_id = std::string();
	user_id = std::string();
	api_key_id = std::string();
	model = std::string();
}

UsageModerationsResult::UsageModerationsResult(std::string jsonString)
{
	this->fromJson(jsonString);
}

UsageModerationsResult::~UsageModerationsResult()
{

}

void
UsageModerationsResult::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *input_tokensKey = "input_tokens";

    if(object.has_key(input_tokensKey))
    {
        bourne::json value = object[input_tokensKey];



        jsonToValue(&input_tokens, value, "int");


    }

    const char *num_model_requestsKey = "num_model_requests";

    if(object.has_key(num_model_requestsKey))
    {
        bourne::json value = object[num_model_requestsKey];



        jsonToValue(&num_model_requests, value, "int");


    }

    const char *project_idKey = "project_id";

    if(object.has_key(project_idKey))
    {
        bourne::json value = object[project_idKey];



        jsonToValue(&project_id, value, "std::string");


    }

    const char *user_idKey = "user_id";

    if(object.has_key(user_idKey))
    {
        bourne::json value = object[user_idKey];



        jsonToValue(&user_id, value, "std::string");


    }

    const char *api_key_idKey = "api_key_id";

    if(object.has_key(api_key_idKey))
    {
        bourne::json value = object[api_key_idKey];



        jsonToValue(&api_key_id, value, "std::string");


    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];



        jsonToValue(&model, value, "std::string");


    }


}

bourne::json
UsageModerationsResult::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["input_tokens"] = getInputTokens();






    object["num_model_requests"] = getNumModelRequests();






    object["project_id"] = getProjectId();






    object["user_id"] = getUserId();






    object["api_key_id"] = getApiKeyId();






    object["model"] = getModel();



    return object;

}

std::string
UsageModerationsResult::getObject()
{
	return object;
}

void
UsageModerationsResult::setObject(std::string  object)
{
	this->object = object;
}

int
UsageModerationsResult::getInputTokens()
{
	return input_tokens;
}

void
UsageModerationsResult::setInputTokens(int  input_tokens)
{
	this->input_tokens = input_tokens;
}

int
UsageModerationsResult::getNumModelRequests()
{
	return num_model_requests;
}

void
UsageModerationsResult::setNumModelRequests(int  num_model_requests)
{
	this->num_model_requests = num_model_requests;
}

std::string
UsageModerationsResult::getProjectId()
{
	return project_id;
}

void
UsageModerationsResult::setProjectId(std::string  project_id)
{
	this->project_id = project_id;
}

std::string
UsageModerationsResult::getUserId()
{
	return user_id;
}

void
UsageModerationsResult::setUserId(std::string  user_id)
{
	this->user_id = user_id;
}

std::string
UsageModerationsResult::getApiKeyId()
{
	return api_key_id;
}

void
UsageModerationsResult::setApiKeyId(std::string  api_key_id)
{
	this->api_key_id = api_key_id;
}

std::string
UsageModerationsResult::getModel()
{
	return model;
}

void
UsageModerationsResult::setModel(std::string  model)
{
	this->model = model;
}



