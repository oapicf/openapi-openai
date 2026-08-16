

#include "RealtimeSession_model.h"

using namespace Tiny;

RealtimeSession_model::RealtimeSession_model()
{
}

RealtimeSession_model::RealtimeSession_model(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeSession_model::~RealtimeSession_model()
{

}

void
RealtimeSession_model::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
RealtimeSession_model::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



