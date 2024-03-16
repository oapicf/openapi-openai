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



#include "CppRestOpenAPIClient/model/CreateModerationResponse_results_inner.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateModerationResponse_results_inner::CreateModerationResponse_results_inner()
{
    m_Flagged = false;
    m_FlaggedIsSet = false;
    m_CategoriesIsSet = false;
    m_Category_scoresIsSet = false;
}

CreateModerationResponse_results_inner::~CreateModerationResponse_results_inner()
{
}

void CreateModerationResponse_results_inner::validate()
{
    // TODO: implement validation
}

web::json::value CreateModerationResponse_results_inner::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_FlaggedIsSet)
    {
        val[utility::conversions::to_string_t(U("flagged"))] = ModelBase::toJson(m_Flagged);
    }
    if(m_CategoriesIsSet)
    {
        val[utility::conversions::to_string_t(U("categories"))] = ModelBase::toJson(m_Categories);
    }
    if(m_Category_scoresIsSet)
    {
        val[utility::conversions::to_string_t(U("category_scores"))] = ModelBase::toJson(m_Category_scores);
    }

    return val;
}

bool CreateModerationResponse_results_inner::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("flagged"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("flagged")));
        if(!fieldValue.is_null())
        {
            bool refVal_setFlagged;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFlagged);
            setFlagged(refVal_setFlagged);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("categories"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("categories")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<CreateModerationResponse_results_inner_categories> refVal_setCategories;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCategories);
            setCategories(refVal_setCategories);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("category_scores"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("category_scores")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<CreateModerationResponse_results_inner_category_scores> refVal_setCategoryScores;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCategoryScores);
            setCategoryScores(refVal_setCategoryScores);
        }
    }
    return ok;
}

void CreateModerationResponse_results_inner::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_FlaggedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("flagged")), m_Flagged));
    }
    if(m_CategoriesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("categories")), m_Categories));
    }
    if(m_Category_scoresIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("category_scores")), m_Category_scores));
    }
}

bool CreateModerationResponse_results_inner::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("flagged"))))
    {
        bool refVal_setFlagged;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("flagged"))), refVal_setFlagged );
        setFlagged(refVal_setFlagged);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("categories"))))
    {
        std::shared_ptr<CreateModerationResponse_results_inner_categories> refVal_setCategories;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("categories"))), refVal_setCategories );
        setCategories(refVal_setCategories);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("category_scores"))))
    {
        std::shared_ptr<CreateModerationResponse_results_inner_category_scores> refVal_setCategoryScores;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("category_scores"))), refVal_setCategoryScores );
        setCategoryScores(refVal_setCategoryScores);
    }
    return ok;
}

bool CreateModerationResponse_results_inner::isFlagged() const
{
    return m_Flagged;
}

void CreateModerationResponse_results_inner::setFlagged(bool value)
{
    m_Flagged = value;
    m_FlaggedIsSet = true;
}

bool CreateModerationResponse_results_inner::flaggedIsSet() const
{
    return m_FlaggedIsSet;
}

void CreateModerationResponse_results_inner::unsetFlagged()
{
    m_FlaggedIsSet = false;
}
std::shared_ptr<CreateModerationResponse_results_inner_categories> CreateModerationResponse_results_inner::getCategories() const
{
    return m_Categories;
}

void CreateModerationResponse_results_inner::setCategories(const std::shared_ptr<CreateModerationResponse_results_inner_categories>& value)
{
    m_Categories = value;
    m_CategoriesIsSet = true;
}

bool CreateModerationResponse_results_inner::categoriesIsSet() const
{
    return m_CategoriesIsSet;
}

void CreateModerationResponse_results_inner::unsetCategories()
{
    m_CategoriesIsSet = false;
}
std::shared_ptr<CreateModerationResponse_results_inner_category_scores> CreateModerationResponse_results_inner::getCategoryScores() const
{
    return m_Category_scores;
}

void CreateModerationResponse_results_inner::setCategoryScores(const std::shared_ptr<CreateModerationResponse_results_inner_category_scores>& value)
{
    m_Category_scores = value;
    m_Category_scoresIsSet = true;
}

bool CreateModerationResponse_results_inner::categoryScoresIsSet() const
{
    return m_Category_scoresIsSet;
}

void CreateModerationResponse_results_inner::unsetCategory_scores()
{
    m_Category_scoresIsSet = false;
}
}
}
}
}


