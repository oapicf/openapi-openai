

#include "ProjectRateLimitUpdateRequest.h"

using namespace Tiny;

ProjectRateLimitUpdateRequest::ProjectRateLimitUpdateRequest()
{
	max_requests_per_1_minute = int(0);
	max_tokens_per_1_minute = int(0);
	max_images_per_1_minute = int(0);
	max_audio_megabytes_per_1_minute = int(0);
	max_requests_per_1_day = int(0);
	batch_1_day_max_input_tokens = int(0);
}

ProjectRateLimitUpdateRequest::ProjectRateLimitUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProjectRateLimitUpdateRequest::~ProjectRateLimitUpdateRequest()
{

}

void
ProjectRateLimitUpdateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
ProjectRateLimitUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["max_requests_per_1_minute"] = getMaxRequestsPer1Minute();






    object["max_tokens_per_1_minute"] = getMaxTokensPer1Minute();






    object["max_images_per_1_minute"] = getMaxImagesPer1Minute();






    object["max_audio_megabytes_per_1_minute"] = getMaxAudioMegabytesPer1Minute();






    object["max_requests_per_1_day"] = getMaxRequestsPer1Day();






    object["batch_1_day_max_input_tokens"] = getBatch1DayMaxInputTokens();



    return object;

}

int
ProjectRateLimitUpdateRequest::getMaxRequestsPer1Minute()
{
	return max_requests_per_1_minute;
}

void
ProjectRateLimitUpdateRequest::setMaxRequestsPer1Minute(int  max_requests_per_1_minute)
{
	this->max_requests_per_1_minute = max_requests_per_1_minute;
}

int
ProjectRateLimitUpdateRequest::getMaxTokensPer1Minute()
{
	return max_tokens_per_1_minute;
}

void
ProjectRateLimitUpdateRequest::setMaxTokensPer1Minute(int  max_tokens_per_1_minute)
{
	this->max_tokens_per_1_minute = max_tokens_per_1_minute;
}

int
ProjectRateLimitUpdateRequest::getMaxImagesPer1Minute()
{
	return max_images_per_1_minute;
}

void
ProjectRateLimitUpdateRequest::setMaxImagesPer1Minute(int  max_images_per_1_minute)
{
	this->max_images_per_1_minute = max_images_per_1_minute;
}

int
ProjectRateLimitUpdateRequest::getMaxAudioMegabytesPer1Minute()
{
	return max_audio_megabytes_per_1_minute;
}

void
ProjectRateLimitUpdateRequest::setMaxAudioMegabytesPer1Minute(int  max_audio_megabytes_per_1_minute)
{
	this->max_audio_megabytes_per_1_minute = max_audio_megabytes_per_1_minute;
}

int
ProjectRateLimitUpdateRequest::getMaxRequestsPer1Day()
{
	return max_requests_per_1_day;
}

void
ProjectRateLimitUpdateRequest::setMaxRequestsPer1Day(int  max_requests_per_1_day)
{
	this->max_requests_per_1_day = max_requests_per_1_day;
}

int
ProjectRateLimitUpdateRequest::getBatch1DayMaxInputTokens()
{
	return batch_1_day_max_input_tokens;
}

void
ProjectRateLimitUpdateRequest::setBatch1DayMaxInputTokens(int  batch_1_day_max_input_tokens)
{
	this->batch_1_day_max_input_tokens = batch_1_day_max_input_tokens;
}



