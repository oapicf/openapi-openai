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
 * RunStreamEvent_oneOf_8.h
 *
 * Occurs when a [run](/docs/api-reference/runs/object) expires.
 */

#ifndef RunStreamEvent_oneOf_8_H_
#define RunStreamEvent_oneOf_8_H_



#include <string>
#include "RunObject.h"
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
/// Occurs when a [run](/docs/api-reference/runs/object) expires.
/// </summary>
class  RunStreamEvent_oneOf_8 
{
public:
    RunStreamEvent_oneOf_8() = default;
    explicit RunStreamEvent_oneOf_8(boost::property_tree::ptree const& pt);
    virtual ~RunStreamEvent_oneOf_8() = default;

    RunStreamEvent_oneOf_8(const RunStreamEvent_oneOf_8& other) = default; // copy constructor
    RunStreamEvent_oneOf_8(RunStreamEvent_oneOf_8&& other) noexcept = default; // move constructor

    RunStreamEvent_oneOf_8& operator=(const RunStreamEvent_oneOf_8& other) = default; // copy assignment
    RunStreamEvent_oneOf_8& operator=(RunStreamEvent_oneOf_8&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunStreamEvent_oneOf_8 members

    /// <summary>
    /// 
    /// </summary>
    std::string getEvent() const;
    void setEvent(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RunObject getData() const;
    void setData(RunObject value);

protected:
    std::string m_Event = "";
    RunObject m_Data;
};

std::vector<RunStreamEvent_oneOf_8> createRunStreamEvent_oneOf_8VectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunStreamEvent_oneOf_8>(const RunStreamEvent_oneOf_8& val) {
    return val.toPropertyTree();
}

template<>
inline RunStreamEvent_oneOf_8 fromPt<RunStreamEvent_oneOf_8>(const boost::property_tree::ptree& pt) {
    RunStreamEvent_oneOf_8 ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunStreamEvent_oneOf_8_H_ */
