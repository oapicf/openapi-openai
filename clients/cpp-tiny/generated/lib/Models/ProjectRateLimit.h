
/*
 * ProjectRateLimit.h
 *
 * Represents a project rate limit config.
 */

#ifndef TINY_CPP_CLIENT_ProjectRateLimit_H_
#define TINY_CPP_CLIENT_ProjectRateLimit_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Represents a project rate limit config.
 *
 *  \ingroup Models
 *
 */

class ProjectRateLimit{
public:

    /*! \brief Constructor.
	 */
    ProjectRateLimit();
    ProjectRateLimit(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProjectRateLimit();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The object type, which is always `project.rate_limit`
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `project.rate_limit`
	 */
	void setObject(std::string  object);
	/*! \brief Get The identifier, which can be referenced in API endpoints.
	 */
	std::string getId();

	/*! \brief Set The identifier, which can be referenced in API endpoints.
	 */
	void setId(std::string  id);
	/*! \brief Get The model this rate limit applies to.
	 */
	std::string getModel();

	/*! \brief Set The model this rate limit applies to.
	 */
	void setModel(std::string  model);
	/*! \brief Get The maximum requests per minute.
	 */
	int getMaxRequestsPer1Minute();

	/*! \brief Set The maximum requests per minute.
	 */
	void setMaxRequestsPer1Minute(int  max_requests_per_1_minute);
	/*! \brief Get The maximum tokens per minute.
	 */
	int getMaxTokensPer1Minute();

	/*! \brief Set The maximum tokens per minute.
	 */
	void setMaxTokensPer1Minute(int  max_tokens_per_1_minute);
	/*! \brief Get The maximum images per minute. Only present for relevant models.
	 */
	int getMaxImagesPer1Minute();

	/*! \brief Set The maximum images per minute. Only present for relevant models.
	 */
	void setMaxImagesPer1Minute(int  max_images_per_1_minute);
	/*! \brief Get The maximum audio megabytes per minute. Only present for relevant models.
	 */
	int getMaxAudioMegabytesPer1Minute();

	/*! \brief Set The maximum audio megabytes per minute. Only present for relevant models.
	 */
	void setMaxAudioMegabytesPer1Minute(int  max_audio_megabytes_per_1_minute);
	/*! \brief Get The maximum requests per day. Only present for relevant models.
	 */
	int getMaxRequestsPer1Day();

	/*! \brief Set The maximum requests per day. Only present for relevant models.
	 */
	void setMaxRequestsPer1Day(int  max_requests_per_1_day);
	/*! \brief Get The maximum batch input tokens per day. Only present for relevant models.
	 */
	int getBatch1DayMaxInputTokens();

	/*! \brief Set The maximum batch input tokens per day. Only present for relevant models.
	 */
	void setBatch1DayMaxInputTokens(int  batch_1_day_max_input_tokens);


    private:
    std::string object{};
    std::string id{};
    std::string model{};
    int max_requests_per_1_minute{};
    int max_tokens_per_1_minute{};
    int max_images_per_1_minute{};
    int max_audio_megabytes_per_1_minute{};
    int max_requests_per_1_day{};
    int batch_1_day_max_input_tokens{};
};
}

#endif /* TINY_CPP_CLIENT_ProjectRateLimit_H_ */
