

#include "CreateTranslationResponseJson.h"

using namespace Tiny;

CreateTranslationResponseJson::CreateTranslationResponseJson()
{
	text = std::string();
}

CreateTranslationResponseJson::CreateTranslationResponseJson(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateTranslationResponseJson::~CreateTranslationResponseJson()
{

}

void
CreateTranslationResponseJson::fromJson(std::string jsonObj)
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
CreateTranslationResponseJson::toJson()
{
    bourne::json object = bourne::json::object();





    object["text"] = getText();



    return object;

}

std::string
CreateTranslationResponseJson::getText()
{
	return text;
}

void
CreateTranslationResponseJson::setText(std::string  text)
{
	this->text = text;
}



