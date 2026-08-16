

#include "RunStepDetailsToolCallsFileSearchResultObject_content_inner.h"

using namespace Tiny;

RunStepDetailsToolCallsFileSearchResultObject_content_inner::RunStepDetailsToolCallsFileSearchResultObject_content_inner()
{
	type = std::string();
	text = std::string();
}

RunStepDetailsToolCallsFileSearchResultObject_content_inner::RunStepDetailsToolCallsFileSearchResultObject_content_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDetailsToolCallsFileSearchResultObject_content_inner::~RunStepDetailsToolCallsFileSearchResultObject_content_inner()
{

}

void
RunStepDetailsToolCallsFileSearchResultObject_content_inner::fromJson(std::string jsonObj)
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
RunStepDetailsToolCallsFileSearchResultObject_content_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["text"] = getText();



    return object;

}

std::string
RunStepDetailsToolCallsFileSearchResultObject_content_inner::getType()
{
	return type;
}

void
RunStepDetailsToolCallsFileSearchResultObject_content_inner::setType(std::string  type)
{
	this->type = type;
}

std::string
RunStepDetailsToolCallsFileSearchResultObject_content_inner::getText()
{
	return text;
}

void
RunStepDetailsToolCallsFileSearchResultObject_content_inner::setText(std::string  text)
{
	this->text = text;
}



