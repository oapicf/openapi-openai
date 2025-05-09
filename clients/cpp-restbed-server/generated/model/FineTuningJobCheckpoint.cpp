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



#include "FineTuningJobCheckpoint.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <algorithm>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

FineTuningJobCheckpoint::FineTuningJobCheckpoint(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string FineTuningJobCheckpoint::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void FineTuningJobCheckpoint::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree FineTuningJobCheckpoint::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("created_at", m_Created_at);
	pt.put("fine_tuned_model_checkpoint", m_Fine_tuned_model_checkpoint);
	pt.put("step_number", m_Step_number);
	pt.add_child("metrics", m_Metrics.toPropertyTree());
	pt.put("fine_tuning_job_id", m_Fine_tuning_job_id);
	pt.put("object", m_object);
	return pt;
}

void FineTuningJobCheckpoint::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", "");
	m_Created_at = pt.get("created_at", 0);
	m_Fine_tuned_model_checkpoint = pt.get("fine_tuned_model_checkpoint", "");
	m_Step_number = pt.get("step_number", 0);
	if (pt.get_child_optional("metrics")) {
        m_Metrics = fromPt<FineTuningJobCheckpoint_metrics>(pt.get_child("metrics"));
	}
	m_Fine_tuning_job_id = pt.get("fine_tuning_job_id", "");
	setObject(pt.get("object", ""));
}

std::string FineTuningJobCheckpoint::getId() const
{
    return m_Id;
}

void FineTuningJobCheckpoint::setId(std::string value)
{
    m_Id = value;
}


int32_t FineTuningJobCheckpoint::getCreatedAt() const
{
    return m_Created_at;
}

void FineTuningJobCheckpoint::setCreatedAt(int32_t value)
{
    m_Created_at = value;
}


std::string FineTuningJobCheckpoint::getFineTunedModelCheckpoint() const
{
    return m_Fine_tuned_model_checkpoint;
}

void FineTuningJobCheckpoint::setFineTunedModelCheckpoint(std::string value)
{
    m_Fine_tuned_model_checkpoint = value;
}


int32_t FineTuningJobCheckpoint::getStepNumber() const
{
    return m_Step_number;
}

void FineTuningJobCheckpoint::setStepNumber(int32_t value)
{
    m_Step_number = value;
}


FineTuningJobCheckpoint_metrics FineTuningJobCheckpoint::getMetrics() const
{
    return m_Metrics;
}

void FineTuningJobCheckpoint::setMetrics(FineTuningJobCheckpoint_metrics value)
{
    m_Metrics = value;
}


std::string FineTuningJobCheckpoint::getFineTuningJobId() const
{
    return m_Fine_tuning_job_id;
}

void FineTuningJobCheckpoint::setFineTuningJobId(std::string value)
{
    m_Fine_tuning_job_id = value;
}


std::string FineTuningJobCheckpoint::getObject() const
{
    return m_object;
}

void FineTuningJobCheckpoint::setObject(std::string value)
{
    static const std::array<std::string, 1> allowedValues = {
        "fine_tuning.job.checkpoint"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_object = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}



std::vector<FineTuningJobCheckpoint> createFineTuningJobCheckpointVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<FineTuningJobCheckpoint>();
    for (const auto& child: pt) {
        vec.emplace_back(FineTuningJobCheckpoint(child.second));
    }

    return vec;
}

}
}
}
}

