

#include "UsageCompletionsResult.h"

using namespace Tiny;

UsageCompletionsResult::UsageCompletionsResult()
{
	object = std::string();
	input_tokens = int(0);
	input_cached_tokens = int(0);
	output_tokens = int(0);
	input_audio_tokens = int(0);
	output_audio_tokens = int(0);
	num_model_requests = int(0);
	project_id = std::string();
	user_id = std::string();
	api_key_id = std::string();
	model = std::string();
	batch = bool(false);
}

UsageCompletionsResult::UsageCompletionsResult(std::string jsonString)
{
	this->fromJson(jsonString);
}

UsageCompletionsResult::~UsageCompletionsResult()
{

}

void
UsageCompletionsResult::fromJson(std::string jsonObj)
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

    const char *input_cached_tokensKey = "input_cached_tokens";

    if(object.has_key(input_cached_tokensKey))
    {
        bourne::json value = object[input_cached_tokensKey];



        jsonToValue(&input_cached_tokens, value, "int");


    }

    const char *output_tokensKey = "output_tokens";

    if(object.has_key(output_tokensKey))
    {
        bourne::json value = object[output_tokensKey];



        jsonToValue(&output_tokens, value, "int");


    }

    const char *input_audio_tokensKey = "input_audio_tokens";

    if(object.has_key(input_audio_tokensKey))
    {
        bourne::json value = object[input_audio_tokensKey];



        jsonToValue(&input_audio_tokens, value, "int");


    }

    const char *output_audio_tokensKey = "output_audio_tokens";

    if(object.has_key(output_audio_tokensKey))
    {
        bourne::json value = object[output_audio_tokensKey];



        jsonToValue(&output_audio_tokens, value, "int");


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

    const char *batchKey = "batch";

    if(object.has_key(batchKey))
    {
        bourne::json value = object[batchKey];



        jsonToValue(&batch, value, "bool");


    }


}

bourne::json
UsageCompletionsResult::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["input_tokens"] = getInputTokens();






    object["input_cached_tokens"] = getInputCachedTokens();






    object["output_tokens"] = getOutputTokens();






    object["input_audio_tokens"] = getInputAudioTokens();






    object["output_audio_tokens"] = getOutputAudioTokens();






    object["num_model_requests"] = getNumModelRequests();






    object["project_id"] = getProjectId();






    object["user_id"] = getUserId();






    object["api_key_id"] = getApiKeyId();






    object["model"] = getModel();






    object["batch"] = isBatch();



    return object;

}

std::string
UsageCompletionsResult::getObject()
{
	return object;
}

void
UsageCompletionsResult::setObject(std::string  object)
{
	this->object = object;
}

int
UsageCompletionsResult::getInputTokens()
{
	return input_tokens;
}

void
UsageCompletionsResult::setInputTokens(int  input_tokens)
{
	this->input_tokens = input_tokens;
}

int
UsageCompletionsResult::getInputCachedTokens()
{
	return input_cached_tokens;
}

void
UsageCompletionsResult::setInputCachedTokens(int  input_cached_tokens)
{
	this->input_cached_tokens = input_cached_tokens;
}

int
UsageCompletionsResult::getOutputTokens()
{
	return output_tokens;
}

void
UsageCompletionsResult::setOutputTokens(int  output_tokens)
{
	this->output_tokens = output_tokens;
}

int
UsageCompletionsResult::getInputAudioTokens()
{
	return input_audio_tokens;
}

void
UsageCompletionsResult::setInputAudioTokens(int  input_audio_tokens)
{
	this->input_audio_tokens = input_audio_tokens;
}

int
UsageCompletionsResult::getOutputAudioTokens()
{
	return output_audio_tokens;
}

void
UsageCompletionsResult::setOutputAudioTokens(int  output_audio_tokens)
{
	this->output_audio_tokens = output_audio_tokens;
}

int
UsageCompletionsResult::getNumModelRequests()
{
	return num_model_requests;
}

void
UsageCompletionsResult::setNumModelRequests(int  num_model_requests)
{
	this->num_model_requests = num_model_requests;
}

std::string
UsageCompletionsResult::getProjectId()
{
	return project_id;
}

void
UsageCompletionsResult::setProjectId(std::string  project_id)
{
	this->project_id = project_id;
}

std::string
UsageCompletionsResult::getUserId()
{
	return user_id;
}

void
UsageCompletionsResult::setUserId(std::string  user_id)
{
	this->user_id = user_id;
}

std::string
UsageCompletionsResult::getApiKeyId()
{
	return api_key_id;
}

void
UsageCompletionsResult::setApiKeyId(std::string  api_key_id)
{
	this->api_key_id = api_key_id;
}

std::string
UsageCompletionsResult::getModel()
{
	return model;
}

void
UsageCompletionsResult::setModel(std::string  model)
{
	this->model = model;
}

bool
UsageCompletionsResult::isBatch()
{
	return batch;
}

void
UsageCompletionsResult::setBatch(bool  batch)
{
	this->batch = batch;
}



