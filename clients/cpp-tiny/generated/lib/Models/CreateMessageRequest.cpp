

#include "CreateMessageRequest.h"

using namespace Tiny;

CreateMessageRequest::CreateMessageRequest()
{
	role = std::string();
	content = CreateMessageRequest_content();
	attachments = std::list<CreateMessageRequest_attachments_inner>();
	metadata = null;
}

CreateMessageRequest::CreateMessageRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateMessageRequest::~CreateMessageRequest()
{

}

void
CreateMessageRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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




        CreateMessageRequest_content* obj = &content;
		obj->fromJson(value.dump());

    }

    const char *attachmentsKey = "attachments";

    if(object.has_key(attachmentsKey))
    {
        bourne::json value = object[attachmentsKey];


        std::list<CreateMessageRequest_attachments_inner> attachments_list;
        CreateMessageRequest_attachments_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            attachments_list.push_back(element);
        }
        attachments = attachments_list;


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
CreateMessageRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["role"] = getRole();







	object["content"] = getContent().toJson();




    std::list<CreateMessageRequest_attachments_inner> attachments_list = getAttachments();
    bourne::json attachments_arr = bourne::json::array();

    for(auto& var : attachments_list)
    {
        CreateMessageRequest_attachments_inner obj = var;
        attachments_arr.append(obj.toJson());
    }
    object["attachments"] = attachments_arr;








	object["metadata"] = getMetadata().toJson();


    return object;

}

std::string
CreateMessageRequest::getRole()
{
	return role;
}

void
CreateMessageRequest::setRole(std::string  role)
{
	this->role = role;
}

CreateMessageRequest_content
CreateMessageRequest::getContent()
{
	return content;
}

void
CreateMessageRequest::setContent(CreateMessageRequest_content  content)
{
	this->content = content;
}

std::list<CreateMessageRequest_attachments_inner>
CreateMessageRequest::getAttachments()
{
	return attachments;
}

void
CreateMessageRequest::setAttachments(std::list <CreateMessageRequest_attachments_inner> attachments)
{
	this->attachments = attachments;
}

Object
CreateMessageRequest::getMetadata()
{
	return metadata;
}

void
CreateMessageRequest::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}



