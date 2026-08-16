

#include "RealtimeConversationItem.h"

using namespace Tiny;

RealtimeConversationItem::RealtimeConversationItem()
{
	id = std::string();
	type = std::string();
	object = std::string();
	status = std::string();
	role = std::string();
	content = std::list<RealtimeConversationItem_content_inner>();
	call_id = std::string();
	name = std::string();
	arguments = std::string();
	output = std::string();
}

RealtimeConversationItem::RealtimeConversationItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeConversationItem::~RealtimeConversationItem()
{

}

void
RealtimeConversationItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];



        jsonToValue(&role, value, "std::string");


    }

    const char *contentKey = "content";

    if(object.has_key(contentKey))
    {
        bourne::json value = object[contentKey];


        std::list<RealtimeConversationItem_content_inner> content_list;
        RealtimeConversationItem_content_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            content_list.push_back(element);
        }
        content = content_list;


    }

    const char *call_idKey = "call_id";

    if(object.has_key(call_idKey))
    {
        bourne::json value = object[call_idKey];



        jsonToValue(&call_id, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *argumentsKey = "arguments";

    if(object.has_key(argumentsKey))
    {
        bourne::json value = object[argumentsKey];



        jsonToValue(&arguments, value, "std::string");


    }

    const char *outputKey = "output";

    if(object.has_key(outputKey))
    {
        bourne::json value = object[outputKey];



        jsonToValue(&output, value, "std::string");


    }


}

bourne::json
RealtimeConversationItem::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["type"] = getType();






    object["object"] = getObject();






    object["status"] = getStatus();






    object["role"] = getRole();





    std::list<RealtimeConversationItem_content_inner> content_list = getContent();
    bourne::json content_arr = bourne::json::array();

    for(auto& var : content_list)
    {
        RealtimeConversationItem_content_inner obj = var;
        content_arr.append(obj.toJson());
    }
    object["content"] = content_arr;







    object["call_id"] = getCallId();






    object["name"] = getName();






    object["arguments"] = getArguments();






    object["output"] = getOutput();



    return object;

}

std::string
RealtimeConversationItem::getId()
{
	return id;
}

void
RealtimeConversationItem::setId(std::string  id)
{
	this->id = id;
}

std::string
RealtimeConversationItem::getType()
{
	return type;
}

void
RealtimeConversationItem::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeConversationItem::getObject()
{
	return object;
}

void
RealtimeConversationItem::setObject(std::string  object)
{
	this->object = object;
}

std::string
RealtimeConversationItem::getStatus()
{
	return status;
}

void
RealtimeConversationItem::setStatus(std::string  status)
{
	this->status = status;
}

std::string
RealtimeConversationItem::getRole()
{
	return role;
}

void
RealtimeConversationItem::setRole(std::string  role)
{
	this->role = role;
}

std::list<RealtimeConversationItem_content_inner>
RealtimeConversationItem::getContent()
{
	return content;
}

void
RealtimeConversationItem::setContent(std::list <RealtimeConversationItem_content_inner> content)
{
	this->content = content;
}

std::string
RealtimeConversationItem::getCallId()
{
	return call_id;
}

void
RealtimeConversationItem::setCallId(std::string  call_id)
{
	this->call_id = call_id;
}

std::string
RealtimeConversationItem::getName()
{
	return name;
}

void
RealtimeConversationItem::setName(std::string  name)
{
	this->name = name;
}

std::string
RealtimeConversationItem::getArguments()
{
	return arguments;
}

void
RealtimeConversationItem::setArguments(std::string  arguments)
{
	this->arguments = arguments;
}

std::string
RealtimeConversationItem::getOutput()
{
	return output;
}

void
RealtimeConversationItem::setOutput(std::string  output)
{
	this->output = output;
}



