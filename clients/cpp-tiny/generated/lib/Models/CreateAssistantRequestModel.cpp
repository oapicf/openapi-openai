

#include "CreateAssistantRequest_model.h"

using namespace Tiny;

CreateAssistantRequest_model::CreateAssistantRequest_model()
{
}

CreateAssistantRequest_model::CreateAssistantRequest_model(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateAssistantRequest_model::~CreateAssistantRequest_model()
{

}

void
CreateAssistantRequest_model::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateAssistantRequest_model::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



