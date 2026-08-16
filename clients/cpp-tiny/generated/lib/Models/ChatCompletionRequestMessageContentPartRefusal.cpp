

#include "ChatCompletionRequestMessageContentPartRefusal.h"

using namespace Tiny;

ChatCompletionRequestMessageContentPartRefusal::ChatCompletionRequestMessageContentPartRefusal()
{
	type = std::string();
	refusal = std::string();
}

ChatCompletionRequestMessageContentPartRefusal::ChatCompletionRequestMessageContentPartRefusal(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestMessageContentPartRefusal::~ChatCompletionRequestMessageContentPartRefusal()
{

}

void
ChatCompletionRequestMessageContentPartRefusal::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *refusalKey = "refusal";

    if(object.has_key(refusalKey))
    {
        bourne::json value = object[refusalKey];



        jsonToValue(&refusal, value, "std::string");


    }


}

bourne::json
ChatCompletionRequestMessageContentPartRefusal::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["refusal"] = getRefusal();



    return object;

}

std::string
ChatCompletionRequestMessageContentPartRefusal::getType()
{
	return type;
}

void
ChatCompletionRequestMessageContentPartRefusal::setType(std::string  type)
{
	this->type = type;
}

std::string
ChatCompletionRequestMessageContentPartRefusal::getRefusal()
{
	return refusal;
}

void
ChatCompletionRequestMessageContentPartRefusal::setRefusal(std::string  refusal)
{
	this->refusal = refusal;
}



