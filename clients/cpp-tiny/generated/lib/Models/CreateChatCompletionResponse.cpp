

#include "CreateChatCompletionResponse.h"

using namespace Tiny;

CreateChatCompletionResponse::CreateChatCompletionResponse()
{
	id = std::string();
	choices = std::list<CreateChatCompletionResponse_choices_inner>();
	created = int(0);
	model = std::string();
	service_tier = std::string();
	system_fingerprint = std::string();
	object = std::string();
	usage = CompletionUsage();
}

CreateChatCompletionResponse::CreateChatCompletionResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatCompletionResponse::~CreateChatCompletionResponse()
{

}

void
CreateChatCompletionResponse::fromJson(std::string jsonObj)
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


        std::list<CreateChatCompletionResponse_choices_inner> choices_list;
        CreateChatCompletionResponse_choices_inner element;
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




        CompletionUsage* obj = &usage;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateChatCompletionResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();





    std::list<CreateChatCompletionResponse_choices_inner> choices_list = getChoices();
    bourne::json choices_arr = bourne::json::array();

    for(auto& var : choices_list)
    {
        CreateChatCompletionResponse_choices_inner obj = var;
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
CreateChatCompletionResponse::getId()
{
	return id;
}

void
CreateChatCompletionResponse::setId(std::string  id)
{
	this->id = id;
}

std::list<CreateChatCompletionResponse_choices_inner>
CreateChatCompletionResponse::getChoices()
{
	return choices;
}

void
CreateChatCompletionResponse::setChoices(std::list <CreateChatCompletionResponse_choices_inner> choices)
{
	this->choices = choices;
}

int
CreateChatCompletionResponse::getCreated()
{
	return created;
}

void
CreateChatCompletionResponse::setCreated(int  created)
{
	this->created = created;
}

std::string
CreateChatCompletionResponse::getModel()
{
	return model;
}

void
CreateChatCompletionResponse::setModel(std::string  model)
{
	this->model = model;
}

std::string
CreateChatCompletionResponse::getServiceTier()
{
	return service_tier;
}

void
CreateChatCompletionResponse::setServiceTier(std::string  service_tier)
{
	this->service_tier = service_tier;
}

std::string
CreateChatCompletionResponse::getSystemFingerprint()
{
	return system_fingerprint;
}

void
CreateChatCompletionResponse::setSystemFingerprint(std::string  system_fingerprint)
{
	this->system_fingerprint = system_fingerprint;
}

std::string
CreateChatCompletionResponse::getObject()
{
	return object;
}

void
CreateChatCompletionResponse::setObject(std::string  object)
{
	this->object = object;
}

CompletionUsage
CreateChatCompletionResponse::getUsage()
{
	return usage;
}

void
CreateChatCompletionResponse::setUsage(CompletionUsage  usage)
{
	this->usage = usage;
}



