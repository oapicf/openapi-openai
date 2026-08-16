

#include "CreateMessageRequest_attachments_inner_tools_inner.h"

using namespace Tiny;

CreateMessageRequest_attachments_inner_tools_inner::CreateMessageRequest_attachments_inner_tools_inner()
{
	type = std::string();
}

CreateMessageRequest_attachments_inner_tools_inner::CreateMessageRequest_attachments_inner_tools_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateMessageRequest_attachments_inner_tools_inner::~CreateMessageRequest_attachments_inner_tools_inner()
{

}

void
CreateMessageRequest_attachments_inner_tools_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }


}

bourne::json
CreateMessageRequest_attachments_inner_tools_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();



    return object;

}

std::string
CreateMessageRequest_attachments_inner_tools_inner::getType()
{
	return type;
}

void
CreateMessageRequest_attachments_inner_tools_inner::setType(std::string  type)
{
	this->type = type;
}



