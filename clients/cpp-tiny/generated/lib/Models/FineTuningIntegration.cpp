

#include "FineTuningIntegration.h"

using namespace Tiny;

FineTuningIntegration::FineTuningIntegration()
{
	type = std::string();
	wandb = CreateFineTuningJobRequest_integrations_inner_wandb();
}

FineTuningIntegration::FineTuningIntegration(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuningIntegration::~FineTuningIntegration()
{

}

void
FineTuningIntegration::fromJson(std::string jsonObj)
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
FineTuningIntegration::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["wandb"] = getWandb().toJson();


    return object;

}

std::string
FineTuningIntegration::getType()
{
	return type;
}

void
FineTuningIntegration::setType(std::string  type)
{
	this->type = type;
}

CreateFineTuningJobRequest_integrations_inner_wandb
FineTuningIntegration::getWandb()
{
	return wandb;
}

void
FineTuningIntegration::setWandb(CreateFineTuningJobRequest_integrations_inner_wandb  wandb)
{
	this->wandb = wandb;
}



