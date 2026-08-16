

#include "ChatCompletionRequestMessageContentPartText.h"

using namespace Tiny;

ChatCompletionRequestMessageContentPartText::ChatCompletionRequestMessageContentPartText()
{
	type = std::string();
	text = std::string();
}

ChatCompletionRequestMessageContentPartText::ChatCompletionRequestMessageContentPartText(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestMessageContentPartText::~ChatCompletionRequestMessageContentPartText()
{

}

void
ChatCompletionRequestMessageContentPartText::fromJson(std::string jsonObj)
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


}

bourne::json
ChatCompletionRequestMessageContentPartText::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["text"] = getText();



    return object;

}

std::string
ChatCompletionRequestMessageContentPartText::getType()
{
	return type;
}

void
ChatCompletionRequestMessageContentPartText::setType(std::string  type)
{
	this->type = type;
}

std::string
ChatCompletionRequestMessageContentPartText::getText()
{
	return text;
}

void
ChatCompletionRequestMessageContentPartText::setText(std::string  text)
{
	this->text = text;
}



