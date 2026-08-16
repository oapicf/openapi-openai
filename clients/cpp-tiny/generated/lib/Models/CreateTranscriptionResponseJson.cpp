

#include "CreateTranscriptionResponseJson.h"

using namespace Tiny;

CreateTranscriptionResponseJson::CreateTranscriptionResponseJson()
{
	text = std::string();
}

CreateTranscriptionResponseJson::CreateTranscriptionResponseJson(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateTranscriptionResponseJson::~CreateTranscriptionResponseJson()
{

}

void
CreateTranscriptionResponseJson::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }


}

bourne::json
CreateTranscriptionResponseJson::toJson()
{
    bourne::json object = bourne::json::object();





    object["text"] = getText();



    return object;

}

std::string
CreateTranscriptionResponseJson::getText()
{
	return text;
}

void
CreateTranscriptionResponseJson::setText(std::string  text)
{
	this->text = text;
}



