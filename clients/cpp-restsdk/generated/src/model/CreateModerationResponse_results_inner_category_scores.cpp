/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/CreateModerationResponse_results_inner_category_scores.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateModerationResponse_results_inner_category_scores::CreateModerationResponse_results_inner_category_scores()
{
    m_Hate = 0.0;
    m_HateIsSet = false;
    m_Hate_threatening = 0.0;
    m_Hate_threateningIsSet = false;
    m_Self_harm = 0.0;
    m_Self_harmIsSet = false;
    m_Sexual = 0.0;
    m_SexualIsSet = false;
    m_Sexual_minors = 0.0;
    m_Sexual_minorsIsSet = false;
    m_Violence = 0.0;
    m_ViolenceIsSet = false;
    m_Violence_graphic = 0.0;
    m_Violence_graphicIsSet = false;
}

CreateModerationResponse_results_inner_category_scores::~CreateModerationResponse_results_inner_category_scores()
{
}

void CreateModerationResponse_results_inner_category_scores::validate()
{
    // TODO: implement validation
}

web::json::value CreateModerationResponse_results_inner_category_scores::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_HateIsSet)
    {
        val[utility::conversions::to_string_t(U("hate"))] = ModelBase::toJson(m_Hate);
    }
    if(m_Hate_threateningIsSet)
    {
        val[utility::conversions::to_string_t(U("hate/threatening"))] = ModelBase::toJson(m_Hate_threatening);
    }
    if(m_Self_harmIsSet)
    {
        val[utility::conversions::to_string_t(U("self-harm"))] = ModelBase::toJson(m_Self_harm);
    }
    if(m_SexualIsSet)
    {
        val[utility::conversions::to_string_t(U("sexual"))] = ModelBase::toJson(m_Sexual);
    }
    if(m_Sexual_minorsIsSet)
    {
        val[utility::conversions::to_string_t(U("sexual/minors"))] = ModelBase::toJson(m_Sexual_minors);
    }
    if(m_ViolenceIsSet)
    {
        val[utility::conversions::to_string_t(U("violence"))] = ModelBase::toJson(m_Violence);
    }
    if(m_Violence_graphicIsSet)
    {
        val[utility::conversions::to_string_t(U("violence/graphic"))] = ModelBase::toJson(m_Violence_graphic);
    }

    return val;
}

bool CreateModerationResponse_results_inner_category_scores::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("hate"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("hate")));
        if(!fieldValue.is_null())
        {
            double refVal_setHate;
            ok &= ModelBase::fromJson(fieldValue, refVal_setHate);
            setHate(refVal_setHate);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("hate/threatening"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("hate/threatening")));
        if(!fieldValue.is_null())
        {
            double refVal_setHateThreatening;
            ok &= ModelBase::fromJson(fieldValue, refVal_setHateThreatening);
            setHateThreatening(refVal_setHateThreatening);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("self-harm"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("self-harm")));
        if(!fieldValue.is_null())
        {
            double refVal_setSelfHarm;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSelfHarm);
            setSelfHarm(refVal_setSelfHarm);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("sexual"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("sexual")));
        if(!fieldValue.is_null())
        {
            double refVal_setSexual;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSexual);
            setSexual(refVal_setSexual);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("sexual/minors"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("sexual/minors")));
        if(!fieldValue.is_null())
        {
            double refVal_setSexualMinors;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSexualMinors);
            setSexualMinors(refVal_setSexualMinors);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("violence"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("violence")));
        if(!fieldValue.is_null())
        {
            double refVal_setViolence;
            ok &= ModelBase::fromJson(fieldValue, refVal_setViolence);
            setViolence(refVal_setViolence);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("violence/graphic"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("violence/graphic")));
        if(!fieldValue.is_null())
        {
            double refVal_setViolenceGraphic;
            ok &= ModelBase::fromJson(fieldValue, refVal_setViolenceGraphic);
            setViolenceGraphic(refVal_setViolenceGraphic);
        }
    }
    return ok;
}

void CreateModerationResponse_results_inner_category_scores::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_HateIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("hate")), m_Hate));
    }
    if(m_Hate_threateningIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("hate/threatening")), m_Hate_threatening));
    }
    if(m_Self_harmIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("self-harm")), m_Self_harm));
    }
    if(m_SexualIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("sexual")), m_Sexual));
    }
    if(m_Sexual_minorsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("sexual/minors")), m_Sexual_minors));
    }
    if(m_ViolenceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("violence")), m_Violence));
    }
    if(m_Violence_graphicIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("violence/graphic")), m_Violence_graphic));
    }
}

bool CreateModerationResponse_results_inner_category_scores::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("hate"))))
    {
        double refVal_setHate;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("hate"))), refVal_setHate );
        setHate(refVal_setHate);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("hate/threatening"))))
    {
        double refVal_setHateThreatening;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("hate/threatening"))), refVal_setHateThreatening );
        setHateThreatening(refVal_setHateThreatening);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("self-harm"))))
    {
        double refVal_setSelfHarm;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("self-harm"))), refVal_setSelfHarm );
        setSelfHarm(refVal_setSelfHarm);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("sexual"))))
    {
        double refVal_setSexual;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("sexual"))), refVal_setSexual );
        setSexual(refVal_setSexual);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("sexual/minors"))))
    {
        double refVal_setSexualMinors;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("sexual/minors"))), refVal_setSexualMinors );
        setSexualMinors(refVal_setSexualMinors);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("violence"))))
    {
        double refVal_setViolence;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("violence"))), refVal_setViolence );
        setViolence(refVal_setViolence);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("violence/graphic"))))
    {
        double refVal_setViolenceGraphic;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("violence/graphic"))), refVal_setViolenceGraphic );
        setViolenceGraphic(refVal_setViolenceGraphic);
    }
    return ok;
}

double CreateModerationResponse_results_inner_category_scores::getHate() const
{
    return m_Hate;
}

void CreateModerationResponse_results_inner_category_scores::setHate(double value)
{
    m_Hate = value;
    m_HateIsSet = true;
}

bool CreateModerationResponse_results_inner_category_scores::hateIsSet() const
{
    return m_HateIsSet;
}

void CreateModerationResponse_results_inner_category_scores::unsetHate()
{
    m_HateIsSet = false;
}
double CreateModerationResponse_results_inner_category_scores::getHateThreatening() const
{
    return m_Hate_threatening;
}

void CreateModerationResponse_results_inner_category_scores::setHateThreatening(double value)
{
    m_Hate_threatening = value;
    m_Hate_threateningIsSet = true;
}

bool CreateModerationResponse_results_inner_category_scores::hateThreateningIsSet() const
{
    return m_Hate_threateningIsSet;
}

void CreateModerationResponse_results_inner_category_scores::unsetHate_threatening()
{
    m_Hate_threateningIsSet = false;
}
double CreateModerationResponse_results_inner_category_scores::getSelfHarm() const
{
    return m_Self_harm;
}

void CreateModerationResponse_results_inner_category_scores::setSelfHarm(double value)
{
    m_Self_harm = value;
    m_Self_harmIsSet = true;
}

bool CreateModerationResponse_results_inner_category_scores::selfHarmIsSet() const
{
    return m_Self_harmIsSet;
}

void CreateModerationResponse_results_inner_category_scores::unsetSelf_harm()
{
    m_Self_harmIsSet = false;
}
double CreateModerationResponse_results_inner_category_scores::getSexual() const
{
    return m_Sexual;
}

void CreateModerationResponse_results_inner_category_scores::setSexual(double value)
{
    m_Sexual = value;
    m_SexualIsSet = true;
}

bool CreateModerationResponse_results_inner_category_scores::sexualIsSet() const
{
    return m_SexualIsSet;
}

void CreateModerationResponse_results_inner_category_scores::unsetSexual()
{
    m_SexualIsSet = false;
}
double CreateModerationResponse_results_inner_category_scores::getSexualMinors() const
{
    return m_Sexual_minors;
}

void CreateModerationResponse_results_inner_category_scores::setSexualMinors(double value)
{
    m_Sexual_minors = value;
    m_Sexual_minorsIsSet = true;
}

bool CreateModerationResponse_results_inner_category_scores::sexualMinorsIsSet() const
{
    return m_Sexual_minorsIsSet;
}

void CreateModerationResponse_results_inner_category_scores::unsetSexual_minors()
{
    m_Sexual_minorsIsSet = false;
}
double CreateModerationResponse_results_inner_category_scores::getViolence() const
{
    return m_Violence;
}

void CreateModerationResponse_results_inner_category_scores::setViolence(double value)
{
    m_Violence = value;
    m_ViolenceIsSet = true;
}

bool CreateModerationResponse_results_inner_category_scores::violenceIsSet() const
{
    return m_ViolenceIsSet;
}

void CreateModerationResponse_results_inner_category_scores::unsetViolence()
{
    m_ViolenceIsSet = false;
}
double CreateModerationResponse_results_inner_category_scores::getViolenceGraphic() const
{
    return m_Violence_graphic;
}

void CreateModerationResponse_results_inner_category_scores::setViolenceGraphic(double value)
{
    m_Violence_graphic = value;
    m_Violence_graphicIsSet = true;
}

bool CreateModerationResponse_results_inner_category_scores::violenceGraphicIsSet() const
{
    return m_Violence_graphicIsSet;
}

void CreateModerationResponse_results_inner_category_scores::unsetViolence_graphic()
{
    m_Violence_graphicIsSet = false;
}
}
}
}
}


