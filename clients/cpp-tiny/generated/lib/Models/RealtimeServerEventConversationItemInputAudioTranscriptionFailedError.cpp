

#include "RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error.h"

using namespace Tiny;

RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error::RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error()
{
	type = std::string();
	code = std::string();
	message = std::string();
	param = std::string();
}

RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error::RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error::~RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error()
{

}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "std::string");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }

    const char *paramKey = "param";

    if(object.has_key(paramKey))
    {
        bourne::json value = object[paramKey];



        jsonToValue(&param, value, "std::string");


    }


}

bourne::json
RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["code"] = getCode();






    object["message"] = getMessage();






    object["param"] = getParam();



    return object;

}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error::getType()
{
	return type;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error::getCode()
{
	return code;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error::setCode(std::string  code)
{
	this->code = code;
}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error::getMessage()
{
	return message;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error::setMessage(std::string  message)
{
	this->message = message;
}

std::string
RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error::getParam()
{
	return param;
}

void
RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error::setParam(std::string  param)
{
	this->param = param;
}



