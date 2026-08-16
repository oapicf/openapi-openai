

#include "CreateChatCompletionFunctionResponse.h"

using namespace Tiny;

CreateChatCompletionFunctionResponse::CreateChatCompletionFunctionResponse()
{
	id = std::string();
	choices = std::list<CreateChatCompletionFunctionResponse_choices_inner>();
	created = int(0);
	model = std::string();
	system_fingerprint = std::string();
	object = std::string();
	usage = CompletionUsage();
}

CreateChatCompletionFunctionResponse::CreateChatCompletionFunctionResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatCompletionFunctionResponse::~CreateChatCompletionFunctionResponse()
{

}

void
CreateChatCompletionFunctionResponse::fromJson(std::string jsonObj)
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


        std::list<CreateChatCompletionFunctionResponse_choices_inner> choices_list;
        CreateChatCompletionFunctionResponse_choices_inner element;
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
CreateChatCompletionFunctionResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();





    std::list<CreateChatCompletionFunctionResponse_choices_inner> choices_list = getChoices();
    bourne::json choices_arr = bourne::json::array();

    for(auto& var : choices_list)
    {
        CreateChatCompletionFunctionResponse_choices_inner obj = var;
        choices_arr.append(obj.toJson());
    }
    object["choices"] = choices_arr;







    object["created"] = getCreated();






    object["model"] = getModel();






    object["system_fingerprint"] = getSystemFingerprint();






    object["object"] = getObject();







	object["usage"] = getUsage().toJson();


    return object;

}

std::string
CreateChatCompletionFunctionResponse::getId()
{
	return id;
}

void
CreateChatCompletionFunctionResponse::setId(std::string  id)
{
	this->id = id;
}

std::list<CreateChatCompletionFunctionResponse_choices_inner>
CreateChatCompletionFunctionResponse::getChoices()
{
	return choices;
}

void
CreateChatCompletionFunctionResponse::setChoices(std::list <CreateChatCompletionFunctionResponse_choices_inner> choices)
{
	this->choices = choices;
}

int
CreateChatCompletionFunctionResponse::getCreated()
{
	return created;
}

void
CreateChatCompletionFunctionResponse::setCreated(int  created)
{
	this->created = created;
}

std::string
CreateChatCompletionFunctionResponse::getModel()
{
	return model;
}

void
CreateChatCompletionFunctionResponse::setModel(std::string  model)
{
	this->model = model;
}

std::string
CreateChatCompletionFunctionResponse::getSystemFingerprint()
{
	return system_fingerprint;
}

void
CreateChatCompletionFunctionResponse::setSystemFingerprint(std::string  system_fingerprint)
{
	this->system_fingerprint = system_fingerprint;
}

std::string
CreateChatCompletionFunctionResponse::getObject()
{
	return object;
}

void
CreateChatCompletionFunctionResponse::setObject(std::string  object)
{
	this->object = object;
}

CompletionUsage
CreateChatCompletionFunctionResponse::getUsage()
{
	return usage;
}

void
CreateChatCompletionFunctionResponse::setUsage(CompletionUsage  usage)
{
	this->usage = usage;
}



