/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CreateModerationRequest.h
 *
 * 
 */

#ifndef CreateModerationRequest_H_
#define CreateModerationRequest_H_



#include "CreateModerationRequest_model.h"
#include "CreateModerationRequest_input.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  CreateModerationRequest 
{
public:
    CreateModerationRequest() = default;
    explicit CreateModerationRequest(boost::property_tree::ptree const& pt);
    virtual ~CreateModerationRequest() = default;

    CreateModerationRequest(const CreateModerationRequest& other) = default; // copy constructor
    CreateModerationRequest(CreateModerationRequest&& other) noexcept = default; // move constructor

    CreateModerationRequest& operator=(const CreateModerationRequest& other) = default; // copy assignment
    CreateModerationRequest& operator=(CreateModerationRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateModerationRequest members

    /// <summary>
    /// 
    /// </summary>
    CreateModerationRequest_input getInput() const;
    void setInput(CreateModerationRequest_input value);

    /// <summary>
    /// 
    /// </summary>
    CreateModerationRequest_model getModel() const;
    void setModel(CreateModerationRequest_model value);

protected:
    CreateModerationRequest_input m_Input;
    CreateModerationRequest_model m_Model;
};

std::vector<CreateModerationRequest> createCreateModerationRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateModerationRequest>(const CreateModerationRequest& val) {
    return val.toPropertyTree();
}

template<>
inline CreateModerationRequest fromPt<CreateModerationRequest>(const boost::property_tree::ptree& pt) {
    CreateModerationRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateModerationRequest_H_ */
