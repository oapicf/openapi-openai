

#include "MessageDeltaContentImageUrlObject_image_url.h"

using namespace Tiny;

MessageDeltaContentImageUrlObject_image_url::MessageDeltaContentImageUrlObject_image_url()
{
	url = std::string();
	detail = std::string();
}

MessageDeltaContentImageUrlObject_image_url::MessageDeltaContentImageUrlObject_image_url(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageDeltaContentImageUrlObject_image_url::~MessageDeltaContentImageUrlObject_image_url()
{

}

void
MessageDeltaContentImageUrlObject_image_url::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }

    const char *detailKey = "detail";

    if(object.has_key(detailKey))
    {
        bourne::json value = object[detailKey];



        jsonToValue(&detail, value, "std::string");


    }


}

bourne::json
MessageDeltaContentImageUrlObject_image_url::toJson()
{
    bourne::json object = bourne::json::object();





    object["url"] = getUrl();






    object["detail"] = getDetail();



    return object;

}

std::string
MessageDeltaContentImageUrlObject_image_url::getUrl()
{
	return url;
}

void
MessageDeltaContentImageUrlObject_image_url::setUrl(std::string  url)
{
	this->url = url;
}

std::string
MessageDeltaContentImageUrlObject_image_url::getDetail()
{
	return detail;
}

void
MessageDeltaContentImageUrlObject_image_url::setDetail(std::string  detail)
{
	this->detail = detail;
}



