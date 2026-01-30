/*
 * AuditLog_rate_limit_updated_changes_requested.h
 *
 * The payload used to update the rate limits.
 */

#ifndef _AuditLog_rate_limit_updated_changes_requested_H_
#define _AuditLog_rate_limit_updated_changes_requested_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The payload used to update the rate limits.
 *
 *  \ingroup Models
 *
 */

class AuditLog_rate_limit_updated_changes_requested : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_rate_limit_updated_changes_requested();
	AuditLog_rate_limit_updated_changes_requested(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_rate_limit_updated_changes_requested();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	int max_requests_per_1_minute;
	int max_tokens_per_1_minute;
	int max_images_per_1_minute;
	int max_audio_megabytes_per_1_minute;
	int max_requests_per_1_day;
	int batch_1_day_max_input_tokens;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_rate_limit_updated_changes_requested_H_ */
