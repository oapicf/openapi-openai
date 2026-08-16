

#include "CreateImageEditRequest_model.h"

using namespace Tiny;

CreateImageEditRequest_model::CreateImageEditRequest_model()
{
}

CreateImageEditRequest_model::CreateImageEditRequest_model(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateImageEditRequest_model::~CreateImageEditRequest_model()
{

}

void
CreateImageEditRequest_model::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateImageEditRequest_model::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



