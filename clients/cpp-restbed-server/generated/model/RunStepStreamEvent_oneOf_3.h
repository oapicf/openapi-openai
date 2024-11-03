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
 * RunStepStreamEvent_oneOf_3.h
 *
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is completed.
 */

#ifndef RunStepStreamEvent_oneOf_3_H_
#define RunStepStreamEvent_oneOf_3_H_



#include "RunStepObject.h"
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
/// Occurs when a [run step](/docs/api-reference/runs/step-object) is completed.
/// </summary>
class  RunStepStreamEvent_oneOf_3 
{
public:
    RunStepStreamEvent_oneOf_3() = default;
    explicit RunStepStreamEvent_oneOf_3(boost::property_tree::ptree const& pt);
    virtual ~RunStepStreamEvent_oneOf_3() = default;

    RunStepStreamEvent_oneOf_3(const RunStepStreamEvent_oneOf_3& other) = default; // copy constructor
    RunStepStreamEvent_oneOf_3(RunStepStreamEvent_oneOf_3&& other) noexcept = default; // move constructor

    RunStepStreamEvent_oneOf_3& operator=(const RunStepStreamEvent_oneOf_3& other) = default; // copy assignment
    RunStepStreamEvent_oneOf_3& operator=(RunStepStreamEvent_oneOf_3&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunStepStreamEvent_oneOf_3 members

    /// <summary>
    /// 
    /// </summary>
    std::string getEvent() const;
    void setEvent(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RunStepObject getData() const;
    void setData(RunStepObject value);

protected:
    std::string m_Event = "";
    RunStepObject m_Data;
};

std::vector<RunStepStreamEvent_oneOf_3> createRunStepStreamEvent_oneOf_3VectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunStepStreamEvent_oneOf_3>(const RunStepStreamEvent_oneOf_3& val) {
    return val.toPropertyTree();
}

template<>
inline RunStepStreamEvent_oneOf_3 fromPt<RunStepStreamEvent_oneOf_3>(const boost::property_tree::ptree& pt) {
    RunStepStreamEvent_oneOf_3 ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunStepStreamEvent_oneOf_3_H_ */
