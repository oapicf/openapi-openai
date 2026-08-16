

#include "UsageTimeBucket_result_inner.h"

using namespace Tiny;

UsageTimeBucket_result_inner::UsageTimeBucket_result_inner()
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
	images = int(0);
	source = std::string();
	size = std::string();
	characters = int(0);
	seconds = int(0);
	usage_bytes = int(0);
	sessions = int(0);
	amount = CostsResult_amount();
	line_item = std::string();
}

UsageTimeBucket_result_inner::UsageTimeBucket_result_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

UsageTimeBucket_result_inner::~UsageTimeBucket_result_inner()
{

}

void
UsageTimeBucket_result_inner::fromJson(std::string jsonObj)
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

    const char *imagesKey = "images";

    if(object.has_key(imagesKey))
    {
        bourne::json value = object[imagesKey];



        jsonToValue(&images, value, "int");


    }

    const char *sourceKey = "source";

    if(object.has_key(sourceKey))
    {
        bourne::json value = object[sourceKey];



        jsonToValue(&source, value, "std::string");


    }

    const char *sizeKey = "size";

    if(object.has_key(sizeKey))
    {
        bourne::json value = object[sizeKey];



        jsonToValue(&size, value, "std::string");


    }

    const char *charactersKey = "characters";

    if(object.has_key(charactersKey))
    {
        bourne::json value = object[charactersKey];



        jsonToValue(&characters, value, "int");


    }

    const char *secondsKey = "seconds";

    if(object.has_key(secondsKey))
    {
        bourne::json value = object[secondsKey];



        jsonToValue(&seconds, value, "int");


    }

    const char *usage_bytesKey = "usage_bytes";

    if(object.has_key(usage_bytesKey))
    {
        bourne::json value = object[usage_bytesKey];



        jsonToValue(&usage_bytes, value, "int");


    }

    const char *sessionsKey = "sessions";

    if(object.has_key(sessionsKey))
    {
        bourne::json value = object[sessionsKey];



        jsonToValue(&sessions, value, "int");


    }

    const char *amountKey = "amount";

    if(object.has_key(amountKey))
    {
        bourne::json value = object[amountKey];




        CostsResult_amount* obj = &amount;
		obj->fromJson(value.dump());

    }

    const char *line_itemKey = "line_item";

    if(object.has_key(line_itemKey))
    {
        bourne::json value = object[line_itemKey];



        jsonToValue(&line_item, value, "std::string");


    }


}

bourne::json
UsageTimeBucket_result_inner::toJson()
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






    object["images"] = getImages();






    object["source"] = getSource();






    object["size"] = getSize();






    object["characters"] = getCharacters();






    object["seconds"] = getSeconds();






    object["usage_bytes"] = getUsageBytes();






    object["sessions"] = getSessions();







	object["amount"] = getAmount().toJson();





    object["line_item"] = getLineItem();



    return object;

}

std::string
UsageTimeBucket_result_inner::getObject()
{
	return object;
}

void
UsageTimeBucket_result_inner::setObject(std::string  object)
{
	this->object = object;
}

int
UsageTimeBucket_result_inner::getInputTokens()
{
	return input_tokens;
}

void
UsageTimeBucket_result_inner::setInputTokens(int  input_tokens)
{
	this->input_tokens = input_tokens;
}

int
UsageTimeBucket_result_inner::getInputCachedTokens()
{
	return input_cached_tokens;
}

void
UsageTimeBucket_result_inner::setInputCachedTokens(int  input_cached_tokens)
{
	this->input_cached_tokens = input_cached_tokens;
}

int
UsageTimeBucket_result_inner::getOutputTokens()
{
	return output_tokens;
}

void
UsageTimeBucket_result_inner::setOutputTokens(int  output_tokens)
{
	this->output_tokens = output_tokens;
}

int
UsageTimeBucket_result_inner::getInputAudioTokens()
{
	return input_audio_tokens;
}

void
UsageTimeBucket_result_inner::setInputAudioTokens(int  input_audio_tokens)
{
	this->input_audio_tokens = input_audio_tokens;
}

int
UsageTimeBucket_result_inner::getOutputAudioTokens()
{
	return output_audio_tokens;
}

void
UsageTimeBucket_result_inner::setOutputAudioTokens(int  output_audio_tokens)
{
	this->output_audio_tokens = output_audio_tokens;
}

int
UsageTimeBucket_result_inner::getNumModelRequests()
{
	return num_model_requests;
}

void
UsageTimeBucket_result_inner::setNumModelRequests(int  num_model_requests)
{
	this->num_model_requests = num_model_requests;
}

std::string
UsageTimeBucket_result_inner::getProjectId()
{
	return project_id;
}

void
UsageTimeBucket_result_inner::setProjectId(std::string  project_id)
{
	this->project_id = project_id;
}

std::string
UsageTimeBucket_result_inner::getUserId()
{
	return user_id;
}

void
UsageTimeBucket_result_inner::setUserId(std::string  user_id)
{
	this->user_id = user_id;
}

std::string
UsageTimeBucket_result_inner::getApiKeyId()
{
	return api_key_id;
}

void
UsageTimeBucket_result_inner::setApiKeyId(std::string  api_key_id)
{
	this->api_key_id = api_key_id;
}

std::string
UsageTimeBucket_result_inner::getModel()
{
	return model;
}

void
UsageTimeBucket_result_inner::setModel(std::string  model)
{
	this->model = model;
}

bool
UsageTimeBucket_result_inner::isBatch()
{
	return batch;
}

void
UsageTimeBucket_result_inner::setBatch(bool  batch)
{
	this->batch = batch;
}

int
UsageTimeBucket_result_inner::getImages()
{
	return images;
}

void
UsageTimeBucket_result_inner::setImages(int  images)
{
	this->images = images;
}

std::string
UsageTimeBucket_result_inner::getSource()
{
	return source;
}

void
UsageTimeBucket_result_inner::setSource(std::string  source)
{
	this->source = source;
}

std::string
UsageTimeBucket_result_inner::getSize()
{
	return size;
}

void
UsageTimeBucket_result_inner::setSize(std::string  size)
{
	this->size = size;
}

int
UsageTimeBucket_result_inner::getCharacters()
{
	return characters;
}

void
UsageTimeBucket_result_inner::setCharacters(int  characters)
{
	this->characters = characters;
}

int
UsageTimeBucket_result_inner::getSeconds()
{
	return seconds;
}

void
UsageTimeBucket_result_inner::setSeconds(int  seconds)
{
	this->seconds = seconds;
}

int
UsageTimeBucket_result_inner::getUsageBytes()
{
	return usage_bytes;
}

void
UsageTimeBucket_result_inner::setUsageBytes(int  usage_bytes)
{
	this->usage_bytes = usage_bytes;
}

int
UsageTimeBucket_result_inner::getSessions()
{
	return sessions;
}

void
UsageTimeBucket_result_inner::setSessions(int  sessions)
{
	this->sessions = sessions;
}

CostsResult_amount
UsageTimeBucket_result_inner::getAmount()
{
	return amount;
}

void
UsageTimeBucket_result_inner::setAmount(CostsResult_amount  amount)
{
	this->amount = amount;
}

std::string
UsageTimeBucket_result_inner::getLineItem()
{
	return line_item;
}

void
UsageTimeBucket_result_inner::setLineItem(std::string  line_item)
{
	this->line_item = line_item;
}



