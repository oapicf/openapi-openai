

#include "ChatCompletionRequestAssistantMessageContentPart.h"

using namespace Tiny;

ChatCompletionRequestAssistantMessageContentPart::ChatCompletionRequestAssistantMessageContentPart()
{
	type = std::string();
	text = std::string();
	refusal = std::string();
}

ChatCompletionRequestAssistantMessageContentPart::ChatCompletionRequestAssistantMessageContentPart(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestAssistantMessageContentPart::~ChatCompletionRequestAssistantMessageContentPart()
{

}

void
ChatCompletionRequestAssistantMessageContentPart::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }

    const char *refusalKey = "refusal";

    if(object.has_key(refusalKey))
    {
        bourne::json value = object[refusalKey];



        jsonToValue(&refusal, value, "std::string");


    }


}

bourne::json
ChatCompletionRequestAssistantMessageContentPart::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["text"] = getText();






    object["refusal"] = getRefusal();



    return object;

}

std::string
ChatCompletionRequestAssistantMessageContentPart::getType()
{
	return type;
}

void
ChatCompletionRequestAssistantMessageContentPart::setType(std::string  type)
{
	this->type = type;
}

std::string
ChatCompletionRequestAssistantMessageContentPart::getText()
{
	return text;
}

void
ChatCompletionRequestAssistantMessageContentPart::setText(std::string  text)
{
	this->text = text;
}

std::string
ChatCompletionRequestAssistantMessageContentPart::getRefusal()
{
	return refusal;
}

void
ChatCompletionRequestAssistantMessageContentPart::setRefusal(std::string  refusal)
{
	this->refusal = refusal;
}



