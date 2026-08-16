

#include "AuditLog_rate_limit_updated_changes_requested.h"

using namespace Tiny;

AuditLog_rate_limit_updated_changes_requested::AuditLog_rate_limit_updated_changes_requested()
{
	max_requests_per_1_minute = int(0);
	max_tokens_per_1_minute = int(0);
	max_images_per_1_minute = int(0);
	max_audio_megabytes_per_1_minute = int(0);
	max_requests_per_1_day = int(0);
	batch_1_day_max_input_tokens = int(0);
}

AuditLog_rate_limit_updated_changes_requested::AuditLog_rate_limit_updated_changes_requested(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_rate_limit_updated_changes_requested::~AuditLog_rate_limit_updated_changes_requested()
{

}

void
AuditLog_rate_limit_updated_changes_requested::fromJson(std::string jsonObj)
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
AuditLog_rate_limit_updated_changes_requested::toJson()
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
AuditLog_rate_limit_updated_changes_requested::getMaxRequestsPer1Minute()
{
	return max_requests_per_1_minute;
}

void
AuditLog_rate_limit_updated_changes_requested::setMaxRequestsPer1Minute(int  max_requests_per_1_minute)
{
	this->max_requests_per_1_minute = max_requests_per_1_minute;
}

int
AuditLog_rate_limit_updated_changes_requested::getMaxTokensPer1Minute()
{
	return max_tokens_per_1_minute;
}

void
AuditLog_rate_limit_updated_changes_requested::setMaxTokensPer1Minute(int  max_tokens_per_1_minute)
{
	this->max_tokens_per_1_minute = max_tokens_per_1_minute;
}

int
AuditLog_rate_limit_updated_changes_requested::getMaxImagesPer1Minute()
{
	return max_images_per_1_minute;
}

void
AuditLog_rate_limit_updated_changes_requested::setMaxImagesPer1Minute(int  max_images_per_1_minute)
{
	this->max_images_per_1_minute = max_images_per_1_minute;
}

int
AuditLog_rate_limit_updated_changes_requested::getMaxAudioMegabytesPer1Minute()
{
	return max_audio_megabytes_per_1_minute;
}

void
AuditLog_rate_limit_updated_changes_requested::setMaxAudioMegabytesPer1Minute(int  max_audio_megabytes_per_1_minute)
{
	this->max_audio_megabytes_per_1_minute = max_audio_megabytes_per_1_minute;
}

int
AuditLog_rate_limit_updated_changes_requested::getMaxRequestsPer1Day()
{
	return max_requests_per_1_day;
}

void
AuditLog_rate_limit_updated_changes_requested::setMaxRequestsPer1Day(int  max_requests_per_1_day)
{
	this->max_requests_per_1_day = max_requests_per_1_day;
}

int
AuditLog_rate_limit_updated_changes_requested::getBatch1DayMaxInputTokens()
{
	return batch_1_day_max_input_tokens;
}

void
AuditLog_rate_limit_updated_changes_requested::setBatch1DayMaxInputTokens(int  batch_1_day_max_input_tokens)
{
	this->batch_1_day_max_input_tokens = batch_1_day_max_input_tokens;
}



