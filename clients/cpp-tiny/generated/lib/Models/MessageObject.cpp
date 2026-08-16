

#include "MessageObject.h"

using namespace Tiny;

MessageObject::MessageObject()
{
	id = std::string();
	object = std::string();
	created_at = int(0);
	thread_id = std::string();
	status = std::string();
	incomplete_details = MessageObject_incomplete_details();
	completed_at = int(0);
	incomplete_at = int(0);
	role = std::string();
	content = std::list<MessageObject_content_inner>();
	assistant_id = std::string();
	run_id = std::string();
	attachments = std::list<CreateMessageRequest_attachments_inner>();
	metadata = null;
}

MessageObject::MessageObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageObject::~MessageObject()
{

}

void
MessageObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "int");


    }

    const char *thread_idKey = "thread_id";

    if(object.has_key(thread_idKey))
    {
        bourne::json value = object[thread_idKey];



        jsonToValue(&thread_id, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }

    const char *incomplete_detailsKey = "incomplete_details";

    if(object.has_key(incomplete_detailsKey))
    {
        bourne::json value = object[incomplete_detailsKey];




        MessageObject_incomplete_details* obj = &incomplete_details;
		obj->fromJson(value.dump());

    }

    const char *completed_atKey = "completed_at";

    if(object.has_key(completed_atKey))
    {
        bourne::json value = object[completed_atKey];



        jsonToValue(&completed_at, value, "int");


    }

    const char *incomplete_atKey = "incomplete_at";

    if(object.has_key(incomplete_atKey))
    {
        bourne::json value = object[incomplete_atKey];



        jsonToValue(&incomplete_at, value, "int");


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


        std::list<MessageObject_content_inner> content_list;
        MessageObject_content_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            content_list.push_back(element);
        }
        content = content_list;


    }

    const char *assistant_idKey = "assistant_id";

    if(object.has_key(assistant_idKey))
    {
        bourne::json value = object[assistant_idKey];



        jsonToValue(&assistant_id, value, "std::string");


    }

    const char *run_idKey = "run_id";

    if(object.has_key(run_idKey))
    {
        bourne::json value = object[run_idKey];



        jsonToValue(&run_id, value, "std::string");


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
MessageObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["object"] = getObject();






    object["created_at"] = getCreatedAt();






    object["thread_id"] = getThreadId();






    object["status"] = getStatus();







	object["incomplete_details"] = getIncompleteDetails().toJson();





    object["completed_at"] = getCompletedAt();






    object["incomplete_at"] = getIncompleteAt();






    object["role"] = getRole();





    std::list<MessageObject_content_inner> content_list = getContent();
    bourne::json content_arr = bourne::json::array();

    for(auto& var : content_list)
    {
        MessageObject_content_inner obj = var;
        content_arr.append(obj.toJson());
    }
    object["content"] = content_arr;







    object["assistant_id"] = getAssistantId();






    object["run_id"] = getRunId();





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
MessageObject::getId()
{
	return id;
}

void
MessageObject::setId(std::string  id)
{
	this->id = id;
}

std::string
MessageObject::getObject()
{
	return object;
}

void
MessageObject::setObject(std::string  object)
{
	this->object = object;
}

int
MessageObject::getCreatedAt()
{
	return created_at;
}

void
MessageObject::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
MessageObject::getThreadId()
{
	return thread_id;
}

void
MessageObject::setThreadId(std::string  thread_id)
{
	this->thread_id = thread_id;
}

std::string
MessageObject::getStatus()
{
	return status;
}

void
MessageObject::setStatus(std::string  status)
{
	this->status = status;
}

MessageObject_incomplete_details
MessageObject::getIncompleteDetails()
{
	return incomplete_details;
}

void
MessageObject::setIncompleteDetails(MessageObject_incomplete_details  incomplete_details)
{
	this->incomplete_details = incomplete_details;
}

int
MessageObject::getCompletedAt()
{
	return completed_at;
}

void
MessageObject::setCompletedAt(int  completed_at)
{
	this->completed_at = completed_at;
}

int
MessageObject::getIncompleteAt()
{
	return incomplete_at;
}

void
MessageObject::setIncompleteAt(int  incomplete_at)
{
	this->incomplete_at = incomplete_at;
}

std::string
MessageObject::getRole()
{
	return role;
}

void
MessageObject::setRole(std::string  role)
{
	this->role = role;
}

std::list<MessageObject_content_inner>
MessageObject::getContent()
{
	return content;
}

void
MessageObject::setContent(std::list <MessageObject_content_inner> content)
{
	this->content = content;
}

std::string
MessageObject::getAssistantId()
{
	return assistant_id;
}

void
MessageObject::setAssistantId(std::string  assistant_id)
{
	this->assistant_id = assistant_id;
}

std::string
MessageObject::getRunId()
{
	return run_id;
}

void
MessageObject::setRunId(std::string  run_id)
{
	this->run_id = run_id;
}

std::list<CreateMessageRequest_attachments_inner>
MessageObject::getAttachments()
{
	return attachments;
}

void
MessageObject::setAttachments(std::list <CreateMessageRequest_attachments_inner> attachments)
{
	this->attachments = attachments;
}

Object
MessageObject::getMetadata()
{
	return metadata;
}

void
MessageObject::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}



