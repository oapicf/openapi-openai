

#include "ProjectRateLimit.h"

using namespace Tiny;

ProjectRateLimit::ProjectRateLimit()
{
	object = std::string();
	id = std::string();
	model = std::string();
	max_requests_per_1_minute = int(0);
	max_tokens_per_1_minute = int(0);
	max_images_per_1_minute = int(0);
	max_audio_megabytes_per_1_minute = int(0);
	max_requests_per_1_day = int(0);
	batch_1_day_max_input_tokens = int(0);
}

ProjectRateLimit::ProjectRateLimit(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectRateLimit::~ProjectRateLimit()
{

}

void
ProjectRateLimit::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];



        jsonToValue(&model, value, "std::string");


    }

    const char *max_requests_per_1_minuteKey = "max_requests_per_1_minute";

    if(object.has_key(max_requests_per_1_minuteKey))
    {
        bourne::json value = object[max_requests_per_1_minuteKey];



        jsonToValue(&max_requests_per_1_minute, value, "int");


    }

    const char *max_tokens_per_1_minuteKey = "max_tokens_per_1_minute";

    if(object.has_key(max_tokens_per_1_minuteKey))
    {
        bourne::json value = object[max_tokens_per_1_minuteKey];



        jsonToValue(&max_tokens_per_1_minute, value, "int");


    }

    const char *max_images_per_1_minuteKey = "max_images_per_1_minute";

    if(object.has_key(max_images_per_1_minuteKey))
    {
        bourne::json value = object[max_images_per_1_minuteKey];



        jsonToValue(&max_images_per_1_minute, value, "int");


    }

    const char *max_audio_megabytes_per_1_minuteKey = "max_audio_megabytes_per_1_minute";

    if(object.has_key(max_audio_megabytes_per_1_minuteKey))
    {
        bourne::json value = object[max_audio_megabytes_per_1_minuteKey];



        jsonToValue(&max_audio_megabytes_per_1_minute, value, "int");


    }

    const char *max_requests_per_1_dayKey = "max_requests_per_1_day";

    if(object.has_key(max_requests_per_1_dayKey))
    {
        bourne::json value = object[max_requests_per_1_dayKey];



        jsonToValue(&max_requests_per_1_day, value, "int");


    }

    const char *batch_1_day_max_input_tokensKey = "batch_1_day_max_input_tokens";

    if(object.has_key(batch_1_day_max_input_tokensKey))
    {
        bourne::json value = object[batch_1_day_max_input_tokensKey];



        jsonToValue(&batch_1_day_max_input_tokens, value, "int");


    }


}

bourne::json
ProjectRateLimit::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["id"] = getId();






    object["model"] = getModel();






    object["max_requests_per_1_minute"] = getMaxRequestsPer1Minute();






    object["max_tokens_per_1_minute"] = getMaxTokensPer1Minute();






    object["max_images_per_1_minute"] = getMaxImagesPer1Minute();






    object["max_audio_megabytes_per_1_minute"] = getMaxAudioMegabytesPer1Minute();






    object["max_requests_per_1_day"] = getMaxRequestsPer1Day();






    object["batch_1_day_max_input_tokens"] = getBatch1DayMaxInputTokens();



    return object;

}

std::string
ProjectRateLimit::getObject()
{
	return object;
}

void
ProjectRateLimit::setObject(std::string  object)
{
	this->object = object;
}

std::string
ProjectRateLimit::getId()
{
	return id;
}

void
ProjectRateLimit::setId(std::string  id)
{
	this->id = id;
}

std::string
ProjectRateLimit::getModel()
{
	return model;
}

void
ProjectRateLimit::setModel(std::string  model)
{
	this->model = model;
}

int
ProjectRateLimit::getMaxRequestsPer1Minute()
{
	return max_requests_per_1_minute;
}

void
ProjectRateLimit::setMaxRequestsPer1Minute(int  max_requests_per_1_minute)
{
	this->max_requests_per_1_minute = max_requests_per_1_minute;
}

int
ProjectRateLimit::getMaxTokensPer1Minute()
{
	return max_tokens_per_1_minute;
}

void
ProjectRateLimit::setMaxTokensPer1Minute(int  max_tokens_per_1_minute)
{
	this->max_tokens_per_1_minute = max_tokens_per_1_minute;
}

int
ProjectRateLimit::getMaxImagesPer1Minute()
{
	return max_images_per_1_minute;
}

void
ProjectRateLimit::setMaxImagesPer1Minute(int  max_images_per_1_minute)
{
	this->max_images_per_1_minute = max_images_per_1_minute;
}

int
ProjectRateLimit::getMaxAudioMegabytesPer1Minute()
{
	return max_audio_megabytes_per_1_minute;
}

void
ProjectRateLimit::setMaxAudioMegabytesPer1Minute(int  max_audio_megabytes_per_1_minute)
{
	this->max_audio_megabytes_per_1_minute = max_audio_megabytes_per_1_minute;
}

int
ProjectRateLimit::getMaxRequestsPer1Day()
{
	return max_requests_per_1_day;
}

void
ProjectRateLimit::setMaxRequestsPer1Day(int  max_requests_per_1_day)
{
	this->max_requests_per_1_day = max_requests_per_1_day;
}

int
ProjectRateLimit::getBatch1DayMaxInputTokens()
{
	return batch_1_day_max_input_tokens;
}

void
ProjectRateLimit::setBatch1DayMaxInputTokens(int  batch_1_day_max_input_tokens)
{
	this->batch_1_day_max_input_tokens = batch_1_day_max_input_tokens;
}



