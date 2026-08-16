

#include "CreateThreadRequest.h"

using namespace Tiny;

CreateThreadRequest::CreateThreadRequest()
{
	messages = std::list<CreateMessageRequest>();
	tool_resources = CreateThreadRequest_tool_resources();
	metadata = null;
}

CreateThreadRequest::CreateThreadRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateThreadRequest::~CreateThreadRequest()
{

}

void
CreateThreadRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *messagesKey = "messages";

    if(object.has_key(messagesKey))
    {
        bourne::json value = object[messagesKey];


        std::list<CreateMessageRequest> messages_list;
        CreateMessageRequest element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            messages_list.push_back(element);
        }
        messages = messages_list;


    }

    const char *tool_resourcesKey = "tool_resources";

    if(object.has_key(tool_resourcesKey))
    {
        bourne::json value = object[tool_resourcesKey];




        CreateThreadRequest_tool_resources* obj = &tool_resources;
		obj->fromJson(value.dump());

    }

    const char *metadataKey = "metadata";

    if(object.has_key(metadataKey))
    {
        bourne::json value = object[metadataKey];




        Object* obj = &metadata;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateThreadRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CreateMessageRequest> messages_list = getMessages();
    bourne::json messages_arr = bourne::json::array();

    for(auto& var : messages_list)
    {
        CreateMessageRequest obj = var;
        messages_arr.append(obj.toJson());
    }
    object["messages"] = messages_arr;








	object["tool_resources"] = getToolResources().toJson();






	object["metadata"] = getMetadata().toJson();


    return object;

}

std::list<CreateMessageRequest>
CreateThreadRequest::getMessages()
{
	return messages;
}

void
CreateThreadRequest::setMessages(std::list <CreateMessageRequest> messages)
{
	this->messages = messages;
}

CreateThreadRequest_tool_resources
CreateThreadRequest::getToolResources()
{
	return tool_resources;
}

void
CreateThreadRequest::setToolResources(CreateThreadRequest_tool_resources  tool_resources)
{
	this->tool_resources = tool_resources;
}

Object
CreateThreadRequest::getMetadata()
{
	return metadata;
}

void
CreateThreadRequest::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}



