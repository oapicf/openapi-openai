

#include "PredictionContent.h"

using namespace Tiny;

PredictionContent::PredictionContent()
{
	type = std::string();
	content = PredictionContent_content();
}

PredictionContent::PredictionContent(std::string jsonString)
{
	this->fromJson(jsonString);
}

PredictionContent::~PredictionContent()
{

}

void
PredictionContent::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *contentKey = "content";

    if(object.has_key(contentKey))
    {
        bourne::json value = object[contentKey];




        PredictionContent_content* obj = &content;
		obj->fromJson(value.dump());

    }


}

bourne::json
PredictionContent::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["content"] = getContent().toJson();


    return object;

}

std::string
PredictionContent::getType()
{
	return type;
}

void
PredictionContent::setType(std::string  type)
{
	this->type = type;
}

PredictionContent_content
PredictionContent::getContent()
{
	return content;
}

void
PredictionContent::setContent(PredictionContent_content  content)
{
	this->content = content;
}



