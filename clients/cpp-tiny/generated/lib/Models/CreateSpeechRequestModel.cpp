

#include "CreateSpeechRequest_model.h"

using namespace Tiny;

CreateSpeechRequest_model::CreateSpeechRequest_model()
{
}

CreateSpeechRequest_model::CreateSpeechRequest_model(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateSpeechRequest_model::~CreateSpeechRequest_model()
{

}

void
CreateSpeechRequest_model::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateSpeechRequest_model::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



