

#include "FineTuningJob_error.h"

using namespace Tiny;

FineTuningJob_error::FineTuningJob_error()
{
	code = std::string();
	message = std::string();
	param = std::string();
}

FineTuningJob_error::FineTuningJob_error(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuningJob_error::~FineTuningJob_error()
{

}

void
FineTuningJob_error::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
FineTuningJob_error::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();






    object["message"] = getMessage();






    object["param"] = getParam();



    return object;

}

std::string
FineTuningJob_error::getCode()
{
	return code;
}

void
FineTuningJob_error::setCode(std::string  code)
{
	this->code = code;
}

std::string
FineTuningJob_error::getMessage()
{
	return message;
}

void
FineTuningJob_error::setMessage(std::string  message)
{
	this->message = message;
}

std::string
FineTuningJob_error::getParam()
{
	return param;
}

void
FineTuningJob_error::setParam(std::string  param)
{
	this->param = param;
}



