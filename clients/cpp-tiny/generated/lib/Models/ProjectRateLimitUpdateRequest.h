
/*
 * ProjectRateLimitUpdateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProjectRateLimitUpdateRequest_H_
#define TINY_CPP_CLIENT_ProjectRateLimitUpdateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProjectRateLimitUpdateRequest{
public:

    /*! \brief Constructor.
	 */
    ProjectRateLimitUpdateRequest();
    ProjectRateLimitUpdateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProjectRateLimitUpdateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	/*! \brief Get The maximum images per minute. Only relevant for certain models.
	 */
	int getMaxImagesPer1Minute();

	/*! \brief Set The maximum images per minute. Only relevant for certain models.
	 */
	void setMaxImagesPer1Minute(int  max_images_per_1_minute);
	/*! \brief Get The maximum audio megabytes per minute. Only relevant for certain models.
	 */
	int getMaxAudioMegabytesPer1Minute();

	/*! \brief Set The maximum audio megabytes per minute. Only relevant for certain models.
	 */
	void setMaxAudioMegabytesPer1Minute(int  max_audio_megabytes_per_1_minute);
	/*! \brief Get The maximum requests per day. Only relevant for certain models.
	 */
	int getMaxRequestsPer1Day();

	/*! \brief Set The maximum requests per day. Only relevant for certain models.
	 */
	void setMaxRequestsPer1Day(int  max_requests_per_1_day);
	/*! \brief Get The maximum batch input tokens per day. Only relevant for certain models.
	 */
	int getBatch1DayMaxInputTokens();

	/*! \brief Set The maximum batch input tokens per day. Only relevant for certain models.
	 */
	void setBatch1DayMaxInputTokens(int  batch_1_day_max_input_tokens);


    private:
    int max_requests_per_1_minute{};
    int max_tokens_per_1_minute{};
    int max_images_per_1_minute{};
    int max_audio_megabytes_per_1_minute{};
    int max_requests_per_1_day{};
    int batch_1_day_max_input_tokens{};
};
}

#endif /* TINY_CPP_CLIENT_ProjectRateLimitUpdateRequest_H_ */
