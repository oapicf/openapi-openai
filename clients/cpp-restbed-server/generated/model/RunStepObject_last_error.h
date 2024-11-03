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
 * RunStepObject_last_error.h
 *
 * The last error associated with this run step. Will be &#x60;null&#x60; if there are no errors.
 */

#ifndef RunStepObject_last_error_H_
#define RunStepObject_last_error_H_



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
/// The last error associated with this run step. Will be &#x60;null&#x60; if there are no errors.
/// </summary>
class  RunStepObject_last_error 
{
public:
    RunStepObject_last_error() = default;
    explicit RunStepObject_last_error(boost::property_tree::ptree const& pt);
    virtual ~RunStepObject_last_error() = default;

    RunStepObject_last_error(const RunStepObject_last_error& other) = default; // copy constructor
    RunStepObject_last_error(RunStepObject_last_error&& other) noexcept = default; // move constructor

    RunStepObject_last_error& operator=(const RunStepObject_last_error& other) = default; // copy assignment
    RunStepObject_last_error& operator=(RunStepObject_last_error&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunStepObject_last_error members

    /// <summary>
    /// One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;.
    /// </summary>
    std::string getCode() const;
    void setCode(std::string value);

    /// <summary>
    /// A human-readable description of the error.
    /// </summary>
    std::string getMessage() const;
    void setMessage(std::string value);

protected:
    std::string m_Code = "";
    std::string m_Message = "";
};

std::vector<RunStepObject_last_error> createRunStepObject_last_errorVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunStepObject_last_error>(const RunStepObject_last_error& val) {
    return val.toPropertyTree();
}

template<>
inline RunStepObject_last_error fromPt<RunStepObject_last_error>(const boost::property_tree::ptree& pt) {
    RunStepObject_last_error ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunStepObject_last_error_H_ */
