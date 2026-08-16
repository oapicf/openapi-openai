

#include "FineTuneMethod.h"

using namespace Tiny;

FineTuneMethod::FineTuneMethod()
{
	type = std::string();
	supervised = FineTuneSupervisedMethod();
	dpo = FineTuneDPOMethod();
}

FineTuneMethod::FineTuneMethod(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuneMethod::~FineTuneMethod()
{

}

void
FineTuneMethod::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *supervisedKey = "supervised";

    if(object.has_key(supervisedKey))
    {
        bourne::json value = object[supervisedKey];




        FineTuneSupervisedMethod* obj = &supervised;
		obj->fromJson(value.dump());

    }

    const char *dpoKey = "dpo";

    if(object.has_key(dpoKey))
    {
        bourne::json value = object[dpoKey];




        FineTuneDPOMethod* obj = &dpo;
		obj->fromJson(value.dump());

    }


}

bourne::json
FineTuneMethod::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();







	object["supervised"] = getSupervised().toJson();






	object["dpo"] = getDpo().toJson();


    return object;

}

std::string
FineTuneMethod::getType()
{
	return type;
}

void
FineTuneMethod::setType(std::string  type)
{
	this->type = type;
}

FineTuneSupervisedMethod
FineTuneMethod::getSupervised()
{
	return supervised;
}

void
FineTuneMethod::setSupervised(FineTuneSupervisedMethod  supervised)
{
	this->supervised = supervised;
}

FineTuneDPOMethod
FineTuneMethod::getDpo()
{
	return dpo;
}

void
FineTuneMethod::setDpo(FineTuneDPOMethod  dpo)
{
	this->dpo = dpo;
}



