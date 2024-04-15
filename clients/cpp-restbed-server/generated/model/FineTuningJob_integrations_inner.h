/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * FineTuningJob_integrations_inner.h
 *
 * 
 */

#ifndef FineTuningJob_integrations_inner_H_
#define FineTuningJob_integrations_inner_H_



#include "CreateFineTuningJobRequest_integrations_inner_wandb.h"
#include <string>
#include "FineTuningIntegration.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "FineTuningIntegration.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  FineTuningJob_integrations_inner : public FineTuningIntegration
{
public:
    FineTuningJob_integrations_inner() = default;
    explicit FineTuningJob_integrations_inner(boost::property_tree::ptree const& pt);
    virtual ~FineTuningJob_integrations_inner() = default;

    FineTuningJob_integrations_inner(const FineTuningJob_integrations_inner& other) = default; // copy constructor
    FineTuningJob_integrations_inner(FineTuningJob_integrations_inner&& other) noexcept = default; // move constructor

    FineTuningJob_integrations_inner& operator=(const FineTuningJob_integrations_inner& other) = default; // copy assignment
    FineTuningJob_integrations_inner& operator=(FineTuningJob_integrations_inner&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// FineTuningJob_integrations_inner members

    /// <summary>
    /// The type of the integration being enabled for the fine-tuning job
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    CreateFineTuningJobRequest_integrations_inner_wandb getWandb() const;
    void setWandb(CreateFineTuningJobRequest_integrations_inner_wandb value);

protected:
    std::string m_Type = "";
    CreateFineTuningJobRequest_integrations_inner_wandb m_Wandb;
};

std::vector<FineTuningJob_integrations_inner> createFineTuningJob_integrations_innerVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<FineTuningJob_integrations_inner>(const FineTuningJob_integrations_inner& val) {
    return val.toPropertyTree();
}

template<>
inline FineTuningJob_integrations_inner fromPt<FineTuningJob_integrations_inner>(const boost::property_tree::ptree& pt) {
    FineTuningJob_integrations_inner ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* FineTuningJob_integrations_inner_H_ */