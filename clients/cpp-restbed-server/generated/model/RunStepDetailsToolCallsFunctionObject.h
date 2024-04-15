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
 * RunStepDetailsToolCallsFunctionObject.h
 *
 * 
 */

#ifndef RunStepDetailsToolCallsFunctionObject_H_
#define RunStepDetailsToolCallsFunctionObject_H_



#include <string>
#include "RunStepDetailsToolCallsFunctionObject_function.h"
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
class  RunStepDetailsToolCallsFunctionObject 
{
public:
    RunStepDetailsToolCallsFunctionObject() = default;
    explicit RunStepDetailsToolCallsFunctionObject(boost::property_tree::ptree const& pt);
    virtual ~RunStepDetailsToolCallsFunctionObject() = default;

    RunStepDetailsToolCallsFunctionObject(const RunStepDetailsToolCallsFunctionObject& other) = default; // copy constructor
    RunStepDetailsToolCallsFunctionObject(RunStepDetailsToolCallsFunctionObject&& other) noexcept = default; // move constructor

    RunStepDetailsToolCallsFunctionObject& operator=(const RunStepDetailsToolCallsFunctionObject& other) = default; // copy assignment
    RunStepDetailsToolCallsFunctionObject& operator=(RunStepDetailsToolCallsFunctionObject&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunStepDetailsToolCallsFunctionObject members

    /// <summary>
    /// The ID of the tool call object.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call.
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RunStepDetailsToolCallsFunctionObject_function getFunction() const;
    void setFunction(RunStepDetailsToolCallsFunctionObject_function value);

protected:
    std::string m_Id = "";
    std::string m_Type = "";
    RunStepDetailsToolCallsFunctionObject_function m_Function;
};

std::vector<RunStepDetailsToolCallsFunctionObject> createRunStepDetailsToolCallsFunctionObjectVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunStepDetailsToolCallsFunctionObject>(const RunStepDetailsToolCallsFunctionObject& val) {
    return val.toPropertyTree();
}

template<>
inline RunStepDetailsToolCallsFunctionObject fromPt<RunStepDetailsToolCallsFunctionObject>(const boost::property_tree::ptree& pt) {
    RunStepDetailsToolCallsFunctionObject ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunStepDetailsToolCallsFunctionObject_H_ */