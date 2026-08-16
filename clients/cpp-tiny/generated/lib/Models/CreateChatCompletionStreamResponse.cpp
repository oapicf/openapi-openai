

#include "CreateChatCompletionStreamResponse.h"

using namespace Tiny;

CreateChatCompletionStreamResponse::CreateChatCompletionStreamResponse()
{
	id = std::string();
	choices = std::list<CreateChatCompletionStreamResponse_choices_inner>();
	created = int(0);
	model = std::string();
	service_tier = std::string();
	system_fingerprint = std::string();
	object = std::string();
	usage = CreateChatCompletionStreamResponse_usage();
}

CreateChatCompletionStreamResponse::CreateChatCompletionStreamResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatCompletionStreamResponse::~CreateChatCompletionStreamResponse()
{

}

void
CreateChatCompletionStreamResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *choicesKey = "choices";

    if(object.has_key(choicesKey))
    {
        bourne::json value = object[choicesKey];


        std::list<CreateChatCompletionStreamResponse_choices_inner> choices_list;
        CreateChatCompletionStreamResponse_choices_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            choices_list.push_back(element);
        }
        choices = choices_list;


    }

    const char *createdKey = "created";

    if(object.has_key(createdKey))
    {
        bourne::json value = object[createdKey];



        jsonToValue(&created, value, "int");


    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];



        jsonToValue(&model, value, "std::string");


    }

    const char *service_tierKey = "service_tier";

    if(object.has_key(service_tierKey))
    {
        bourne::json value = object[service_tierKey];



        jsonToValue(&service_tier, value, "std::string");


    }

    const char *system_fingerprintKey = "system_fingerprint";

    if(object.has_key(system_fingerprintKey))
    {
        bourne::json value = object[system_fingerprintKey];



        jsonToValue(&system_fingerprint, value, "std::string");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *usageKey = "usage";

    if(object.has_key(usageKey))
    {
        bourne::json value = object[usageKey];




        CreateChatCompletionStreamResponse_usage* obj = &usage;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateChatCompletionStreamResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();





    std::list<CreateChatCompletionStreamResponse_choices_inner> choices_list = getChoices();
    bourne::json choices_arr = bourne::json::array();

    for(auto& var : choices_list)
    {
        CreateChatCompletionStreamResponse_choices_inner obj = var;
        choices_arr.append(obj.toJson());
    }
    object["choices"] = choices_arr;







    object["created"] = getCreated();






    object["model"] = getModel();






    object["service_tier"] = getServiceTier();






    object["system_fingerprint"] = getSystemFingerprint();






    object["object"] = getObject();







	object["usage"] = getUsage().toJson();


    return object;

}

std::string
CreateChatCompletionStreamResponse::getId()
{
	return id;
}

void
CreateChatCompletionStreamResponse::setId(std::string  id)
{
	this->id = id;
}

std::list<CreateChatCompletionStreamResponse_choices_inner>
CreateChatCompletionStreamResponse::getChoices()
{
	return choices;
}

void
CreateChatCompletionStreamResponse::setChoices(std::list <CreateChatCompletionStreamResponse_choices_inner> choices)
{
	this->choices = choices;
}

int
CreateChatCompletionStreamResponse::getCreated()
{
	return created;
}

void
CreateChatCompletionStreamResponse::setCreated(int  created)
{
	this->created = created;
}

std::string
CreateChatCompletionStreamResponse::getModel()
{
	return model;
}

void
CreateChatCompletionStreamResponse::setModel(std::string  model)
{
	this->model = model;
}

std::string
CreateChatCompletionStreamResponse::getServiceTier()
{
	return service_tier;
}

void
CreateChatCompletionStreamResponse::setServiceTier(std::string  service_tier)
{
	this->service_tier = service_tier;
}

std::string
CreateChatCompletionStreamResponse::getSystemFingerprint()
{
	return system_fingerprint;
}

void
CreateChatCompletionStreamResponse::setSystemFingerprint(std::string  system_fingerprint)
{
	this->system_fingerprint = system_fingerprint;
}

std::string
CreateChatCompletionStreamResponse::getObject()
{
	return object;
}

void
CreateChatCompletionStreamResponse::setObject(std::string  object)
{
	this->object = object;
}

CreateChatCompletionStreamResponse_usage
CreateChatCompletionStreamResponse::getUsage()
{
	return usage;
}

void
CreateChatCompletionStreamResponse::setUsage(CreateChatCompletionStreamResponse_usage  usage)
{
	this->usage = usage;
}



