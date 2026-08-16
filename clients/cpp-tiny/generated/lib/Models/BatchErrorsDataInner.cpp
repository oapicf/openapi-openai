

#include "Batch_errors_data_inner.h"

using namespace Tiny;

Batch_errors_data_inner::Batch_errors_data_inner()
{
	code = std::string();
	message = std::string();
	param = std::string();
	line = int(0);
}

Batch_errors_data_inner::Batch_errors_data_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

Batch_errors_data_inner::~Batch_errors_data_inner()
{

}

void
Batch_errors_data_inner::fromJson(std::string jsonObj)
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

    const char *lineKey = "line";

    if(object.has_key(lineKey))
    {
        bourne::json value = object[lineKey];



        jsonToValue(&line, value, "int");


    }


}

bourne::json
Batch_errors_data_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();






    object["message"] = getMessage();






    object["param"] = getParam();






    object["line"] = getLine();



    return object;

}

std::string
Batch_errors_data_inner::getCode()
{
	return code;
}

void
Batch_errors_data_inner::setCode(std::string  code)
{
	this->code = code;
}

std::string
Batch_errors_data_inner::getMessage()
{
	return message;
}

void
Batch_errors_data_inner::setMessage(std::string  message)
{
	this->message = message;
}

std::string
Batch_errors_data_inner::getParam()
{
	return param;
}

void
Batch_errors_data_inner::setParam(std::string  param)
{
	this->param = param;
}

int
Batch_errors_data_inner::getLine()
{
	return line;
}

void
Batch_errors_data_inner::setLine(int  line)
{
	this->line = line;
}



