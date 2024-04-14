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
 * FineTuningIntegration.h
 *
 * 
 */

#ifndef FineTuningIntegration_H_
#define FineTuningIntegration_H_



#include "CreateFineTuningJobRequest_integrations_inner_wandb.h"
#include <string>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  FineTuningIntegration 
{
public:
    FineTuningIntegration() = default;
    explicit FineTuningIntegration(boost::property_tree::ptree const& pt);
    virtual ~FineTuningIntegration() = default;

    FineTuningIntegration(const FineTuningIntegration& other) = default; // copy constructor
    FineTuningIntegration(FineTuningIntegration&& other) noexcept = default; // move constructor

    FineTuningIntegration& operator=(const FineTuningIntegration& other) = default; // copy assignment
    FineTuningIntegration& operator=(FineTuningIntegration&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// FineTuningIntegration members

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

std::vector<FineTuningIntegration> createFineTuningIntegrationVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<FineTuningIntegration>(const FineTuningIntegration& val) {
    return val.toPropertyTree();
}

template<>
inline FineTuningIntegration fromPt<FineTuningIntegration>(const boost::property_tree::ptree& pt) {
    FineTuningIntegration ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* FineTuningIntegration_H_ */
