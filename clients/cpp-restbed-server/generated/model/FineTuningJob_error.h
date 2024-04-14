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
 * FineTuningJob_error.h
 *
 * For fine-tuning jobs that have &#x60;failed&#x60;, this will contain more information on the cause of the failure.
 */

#ifndef FineTuningJob_error_H_
#define FineTuningJob_error_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// For fine-tuning jobs that have &#x60;failed&#x60;, this will contain more information on the cause of the failure.
/// </summary>
class  FineTuningJob_error 
{
public:
    FineTuningJob_error() = default;
    explicit FineTuningJob_error(boost::property_tree::ptree const& pt);
    virtual ~FineTuningJob_error() = default;

    FineTuningJob_error(const FineTuningJob_error& other) = default; // copy constructor
    FineTuningJob_error(FineTuningJob_error&& other) noexcept = default; // move constructor

    FineTuningJob_error& operator=(const FineTuningJob_error& other) = default; // copy assignment
    FineTuningJob_error& operator=(FineTuningJob_error&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// FineTuningJob_error members

    /// <summary>
    /// A machine-readable error code.
    /// </summary>
    std::string getCode() const;
    void setCode(std::string value);

    /// <summary>
    /// A human-readable error message.
    /// </summary>
    std::string getMessage() const;
    void setMessage(std::string value);

    /// <summary>
    /// The parameter that was invalid, usually &#x60;training_file&#x60; or &#x60;validation_file&#x60;. This field will be null if the failure was not parameter-specific.
    /// </summary>
    std::string getParam() const;
    void setParam(std::string value);

protected:
    std::string m_Code = "";
    std::string m_Message = "";
    std::string m_Param = "";
};

std::vector<FineTuningJob_error> createFineTuningJob_errorVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<FineTuningJob_error>(const FineTuningJob_error& val) {
    return val.toPropertyTree();
}

template<>
inline FineTuningJob_error fromPt<FineTuningJob_error>(const boost::property_tree::ptree& pt) {
    FineTuningJob_error ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* FineTuningJob_error_H_ */
