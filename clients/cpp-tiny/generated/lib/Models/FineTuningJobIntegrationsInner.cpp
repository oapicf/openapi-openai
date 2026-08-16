

#include "FineTuningJob_integrations_inner.h"

using namespace Tiny;

FineTuningJob_integrations_inner::FineTuningJob_integrations_inner()
{
	type = std::string();
	wandb = CreateFineTuningJobRequest_integrations_inner_wandb();
}

FineTuningJob_integrations_inner::FineTuningJob_integrations_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuningJob_integrations_inner::~FineTuningJob_integrations_inner()
{

}

void
FineTuningJob_integrations_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *wandbKey = "wandb";

    if(object.has_key(wandbKey))
    {
        bourne::json value = object[wandbKey];




        CreateFineTuningJobRequest_integrations_inner_wandb* obj = &wandb;
		obj->fromJson(value.dump());

    }


}

bourne::json
FineTuningJob_integrations_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["wandb"] = getWandb().toJson();


    return object;

}

std::string
FineTuningJob_integrations_inner::getType()
{
	return type;
}

void
FineTuningJob_integrations_inner::setType(std::string  type)
{
	this->type = type;
}

CreateFineTuningJobRequest_integrations_inner_wandb
FineTuningJob_integrations_inner::getWandb()
{
	return wandb;
}

void
FineTuningJob_integrations_inner::setWandb(CreateFineTuningJobRequest_integrations_inner_wandb  wandb)
{
	this->wandb = wandb;
}



