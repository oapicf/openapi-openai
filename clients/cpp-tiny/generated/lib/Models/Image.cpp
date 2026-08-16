

#include "Image.h"

using namespace Tiny;

Image::Image()
{
	b64_json = std::string();
	url = std::string();
	revised_prompt = std::string();
}

Image::Image(std::string jsonString)
{
	this->fromJson(jsonString);
}

Image::~Image()
{

}

void
Image::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *b64_jsonKey = "b64_json";

    if(object.has_key(b64_jsonKey))
    {
        bourne::json value = object[b64_jsonKey];



        jsonToValue(&b64_json, value, "std::string");


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }

    const char *revised_promptKey = "revised_prompt";

    if(object.has_key(revised_promptKey))
    {
        bourne::json value = object[revised_promptKey];



        jsonToValue(&revised_prompt, value, "std::string");


    }


}

bourne::json
Image::toJson()
{
    bourne::json object = bourne::json::object();





    object["b64_json"] = getB64Json();






    object["url"] = getUrl();






    object["revised_prompt"] = getRevisedPrompt();



    return object;

}

std::string
Image::getB64Json()
{
	return b64_json;
}

void
Image::setB64Json(std::string  b64_json)
{
	this->b64_json = b64_json;
}

std::string
Image::getUrl()
{
	return url;
}

void
Image::setUrl(std::string  url)
{
	this->url = url;
}

std::string
Image::getRevisedPrompt()
{
	return revised_prompt;
}

void
Image::setRevisedPrompt(std::string  revised_prompt)
{
	this->revised_prompt = revised_prompt;
}



