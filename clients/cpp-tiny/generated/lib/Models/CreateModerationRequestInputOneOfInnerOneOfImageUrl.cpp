

#include "CreateModerationRequest_input_oneOf_inner_oneOf_image_url.h"

using namespace Tiny;

CreateModerationRequest_input_oneOf_inner_oneOf_image_url::CreateModerationRequest_input_oneOf_inner_oneOf_image_url()
{
	url = std::string();
}

CreateModerationRequest_input_oneOf_inner_oneOf_image_url::CreateModerationRequest_input_oneOf_inner_oneOf_image_url(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateModerationRequest_input_oneOf_inner_oneOf_image_url::~CreateModerationRequest_input_oneOf_inner_oneOf_image_url()
{

}

void
CreateModerationRequest_input_oneOf_inner_oneOf_image_url::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }


}

bourne::json
CreateModerationRequest_input_oneOf_inner_oneOf_image_url::toJson()
{
    bourne::json object = bourne::json::object();





    object["url"] = getUrl();



    return object;

}

std::string
CreateModerationRequest_input_oneOf_inner_oneOf_image_url::getUrl()
{
	return url;
}

void
CreateModerationRequest_input_oneOf_inner_oneOf_image_url::setUrl(std::string  url)
{
	this->url = url;
}



