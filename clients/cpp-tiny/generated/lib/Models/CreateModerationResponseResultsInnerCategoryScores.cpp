

#include "CreateModerationResponse_results_inner_category_scores.h"

using namespace Tiny;

CreateModerationResponse_results_inner_category_scores::CreateModerationResponse_results_inner_category_scores()
{
	hate = float(0);
	hatethreatening = float(0);
	harassment = float(0);
	harassmentthreatening = float(0);
	illicit = float(0);
	illicitviolent = float(0);
	selfharm = float(0);
	selfharmintent = float(0);
	selfharminstructions = float(0);
	sexual = float(0);
	sexualminors = float(0);
	violence = float(0);
	violencegraphic = float(0);
}

CreateModerationResponse_results_inner_category_scores::CreateModerationResponse_results_inner_category_scores(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateModerationResponse_results_inner_category_scores::~CreateModerationResponse_results_inner_category_scores()
{

}

void
CreateModerationResponse_results_inner_category_scores::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hateKey = "hate";

    if(object.has_key(hateKey))
    {
        bourne::json value = object[hateKey];



        jsonToValue(&hate, value, "long");


    }

    const char *hatethreateningKey = "hate/threatening";

    if(object.has_key(hatethreateningKey))
    {
        bourne::json value = object[hatethreateningKey];



        jsonToValue(&hatethreatening, value, "long");


    }

    const char *harassmentKey = "harassment";

    if(object.has_key(harassmentKey))
    {
        bourne::json value = object[harassmentKey];



        jsonToValue(&harassment, value, "long");


    }

    const char *harassmentthreateningKey = "harassment/threatening";

    if(object.has_key(harassmentthreateningKey))
    {
        bourne::json value = object[harassmentthreateningKey];



        jsonToValue(&harassmentthreatening, value, "long");


    }

    const char *illicitKey = "illicit";

    if(object.has_key(illicitKey))
    {
        bourne::json value = object[illicitKey];



        jsonToValue(&illicit, value, "long");


    }

    const char *illicitviolentKey = "illicit/violent";

    if(object.has_key(illicitviolentKey))
    {
        bourne::json value = object[illicitviolentKey];



        jsonToValue(&illicitviolent, value, "long");


    }

    const char *selfharmKey = "self-harm";

    if(object.has_key(selfharmKey))
    {
        bourne::json value = object[selfharmKey];



        jsonToValue(&selfharm, value, "long");


    }

    const char *selfharmintentKey = "self-harm/intent";

    if(object.has_key(selfharmintentKey))
    {
        bourne::json value = object[selfharmintentKey];



        jsonToValue(&selfharmintent, value, "long");


    }

    const char *selfharminstructionsKey = "self-harm/instructions";

    if(object.has_key(selfharminstructionsKey))
    {
        bourne::json value = object[selfharminstructionsKey];



        jsonToValue(&selfharminstructions, value, "long");


    }

    const char *sexualKey = "sexual";

    if(object.has_key(sexualKey))
    {
        bourne::json value = object[sexualKey];



        jsonToValue(&sexual, value, "long");


    }

    const char *sexualminorsKey = "sexual/minors";

    if(object.has_key(sexualminorsKey))
    {
        bourne::json value = object[sexualminorsKey];



        jsonToValue(&sexualminors, value, "long");


    }

    const char *violenceKey = "violence";

    if(object.has_key(violenceKey))
    {
        bourne::json value = object[violenceKey];



        jsonToValue(&violence, value, "long");


    }

    const char *violencegraphicKey = "violence/graphic";

    if(object.has_key(violencegraphicKey))
    {
        bourne::json value = object[violencegraphicKey];



        jsonToValue(&violencegraphic, value, "long");


    }


}

bourne::json
CreateModerationResponse_results_inner_category_scores::toJson()
{
    bourne::json object = bourne::json::object();





    object["hate"] = getHate();






    object["hatethreatening"] = getHatethreatening();






    object["harassment"] = getHarassment();






    object["harassmentthreatening"] = getHarassmentthreatening();






    object["illicit"] = getIllicit();






    object["illicitviolent"] = getIllicitviolent();






    object["selfharm"] = getSelfharm();






    object["selfharmintent"] = getSelfharmintent();






    object["selfharminstructions"] = getSelfharminstructions();






    object["sexual"] = getSexual();






    object["sexualminors"] = getSexualminors();






    object["violence"] = getViolence();






    object["violencegraphic"] = getViolencegraphic();



    return object;

}

long
CreateModerationResponse_results_inner_category_scores::getHate()
{
	return hate;
}

void
CreateModerationResponse_results_inner_category_scores::setHate(long  hate)
{
	this->hate = hate;
}

long
CreateModerationResponse_results_inner_category_scores::getHatethreatening()
{
	return hatethreatening;
}

void
CreateModerationResponse_results_inner_category_scores::setHatethreatening(long  hatethreatening)
{
	this->hatethreatening = hatethreatening;
}

long
CreateModerationResponse_results_inner_category_scores::getHarassment()
{
	return harassment;
}

void
CreateModerationResponse_results_inner_category_scores::setHarassment(long  harassment)
{
	this->harassment = harassment;
}

long
CreateModerationResponse_results_inner_category_scores::getHarassmentthreatening()
{
	return harassmentthreatening;
}

void
CreateModerationResponse_results_inner_category_scores::setHarassmentthreatening(long  harassmentthreatening)
{
	this->harassmentthreatening = harassmentthreatening;
}

long
CreateModerationResponse_results_inner_category_scores::getIllicit()
{
	return illicit;
}

void
CreateModerationResponse_results_inner_category_scores::setIllicit(long  illicit)
{
	this->illicit = illicit;
}

long
CreateModerationResponse_results_inner_category_scores::getIllicitviolent()
{
	return illicitviolent;
}

void
CreateModerationResponse_results_inner_category_scores::setIllicitviolent(long  illicitviolent)
{
	this->illicitviolent = illicitviolent;
}

long
CreateModerationResponse_results_inner_category_scores::getSelfharm()
{
	return selfharm;
}

void
CreateModerationResponse_results_inner_category_scores::setSelfharm(long  selfharm)
{
	this->selfharm = selfharm;
}

long
CreateModerationResponse_results_inner_category_scores::getSelfharmintent()
{
	return selfharmintent;
}

void
CreateModerationResponse_results_inner_category_scores::setSelfharmintent(long  selfharmintent)
{
	this->selfharmintent = selfharmintent;
}

long
CreateModerationResponse_results_inner_category_scores::getSelfharminstructions()
{
	return selfharminstructions;
}

void
CreateModerationResponse_results_inner_category_scores::setSelfharminstructions(long  selfharminstructions)
{
	this->selfharminstructions = selfharminstructions;
}

long
CreateModerationResponse_results_inner_category_scores::getSexual()
{
	return sexual;
}

void
CreateModerationResponse_results_inner_category_scores::setSexual(long  sexual)
{
	this->sexual = sexual;
}

long
CreateModerationResponse_results_inner_category_scores::getSexualminors()
{
	return sexualminors;
}

void
CreateModerationResponse_results_inner_category_scores::setSexualminors(long  sexualminors)
{
	this->sexualminors = sexualminors;
}

long
CreateModerationResponse_results_inner_category_scores::getViolence()
{
	return violence;
}

void
CreateModerationResponse_results_inner_category_scores::setViolence(long  violence)
{
	this->violence = violence;
}

long
CreateModerationResponse_results_inner_category_scores::getViolencegraphic()
{
	return violencegraphic;
}

void
CreateModerationResponse_results_inner_category_scores::setViolencegraphic(long  violencegraphic)
{
	this->violencegraphic = violencegraphic;
}



